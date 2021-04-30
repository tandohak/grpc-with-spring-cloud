package com.tandohak.grpcspringbootclient;

import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.examples.lib.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Slf4j
@GrpcService
public class FileUploadService extends FileServiceGrpc.FileServiceImplBase {

    private static final Path SERVER_BASE_PATH = Paths.get("src/main/resources/output");

    @Override
    public StreamObserver<FileUploadRequest> fileUpload(StreamObserver<FileUploadReply> responseObserver) {
        return new StreamObserver<FileUploadRequest>() {

            OutputStream writer;
            Status status = Status.IN_PROGRESS;
            String tempFileName;

            @Override
            public void onNext(FileUploadRequest request) {
                try {
                    if (request.hasMetadata()) {
                        writer = getFilePath(request);
                        tempFileName = request.getMetadata().getName();
                    } else {
                        writeFile(writer, request.getFile().getContent());
                    }
                } catch (IOException e) {
                    this.onError(e);
                }
            }

            @Override
            public void onError(Throwable t) {
                status = Status.FAILED;
                this.onCompleted();
            }

            @Override
            public void onCompleted() {
                closeFile(writer);

                status = Status.IN_PROGRESS.equals(status) ? Status.SUCCESS : status;
                FileUploadReply response = FileUploadReply.newBuilder()
                        .setStatus(status)
                        .setName(tempFileName)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }


    private OutputStream getFilePath(FileUploadRequest request) throws IOException {
        if (!Files.exists(SERVER_BASE_PATH)) Files.createDirectories(SERVER_BASE_PATH);

        return Files.newOutputStream(SERVER_BASE_PATH.resolve(request.getMetadata().getName()), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private void writeFile(OutputStream writer, ByteString content) throws IOException {
        writer.write(content.toByteArray());
        writer.flush();
    }

    private void closeFile(OutputStream writer){
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

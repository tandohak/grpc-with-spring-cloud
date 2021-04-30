package com.tandohak.grpcspringbootserver;

import com.google.protobuf.ByteString;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Service
public class FileService {

    @GrpcClient("local-grpc-server-two")
    private FileServiceGrpc.FileServiceStub fileServiceStub;

    public void upload(MultipartFile file) {
        try {
            StreamObserver<FileUploadRequest> streamObserver = this.fileServiceStub.fileUpload(new FileUploadObserver());

            FileUploadRequest metadata = FileUploadRequest.newBuilder()
                    .setMetadata(MetaData.newBuilder()
                            .setName(file.getOriginalFilename())
                            .setType(file.getContentType())).build();

            streamObserver.onNext(metadata);

            InputStream inputStream = file.getInputStream();

            byte[] bytes = new byte[4096];
            int size;
            while ((size = inputStream.read(bytes)) > 0){
                FileUploadRequest uploadRequest = FileUploadRequest.newBuilder()
                        .setFile(File.newBuilder().setContent(ByteString.copyFrom(bytes, 0 , size)).build())
                        .build();
                streamObserver.onNext(uploadRequest);
            }

            inputStream.close();
            streamObserver.onCompleted();
        } catch (final StatusRuntimeException | IOException e) {
            e.printStackTrace();
        }

    }
}

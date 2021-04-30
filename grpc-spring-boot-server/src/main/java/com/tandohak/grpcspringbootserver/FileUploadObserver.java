package com.tandohak.grpcspringbootserver;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.examples.lib.FileUploadReply;

public class FileUploadObserver implements StreamObserver<FileUploadReply> {

    @Override
    public void onNext(FileUploadReply fileUploadResponse) {
        System.out.println(
                "File upload status :: " + fileUploadResponse.getStatus()
        );
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {

    }
}

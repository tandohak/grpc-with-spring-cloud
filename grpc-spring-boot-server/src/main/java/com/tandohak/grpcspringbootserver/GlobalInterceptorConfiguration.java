package com.tandohak.grpcspringbootserver;

import com.tandohak.grpcspringbootserver.interceptor.LogGrpcInterceptor;
import com.tandohak.grpcspringbootserver.interceptor.LogGrpcServerInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalServerInterceptor
    LogGrpcServerInterceptor logServerInterceptor() {
        return new LogGrpcServerInterceptor();
    }


    @GrpcGlobalClientInterceptor
    LogGrpcInterceptor logClientInterceptor() {
        return new LogGrpcInterceptor();
    }

}

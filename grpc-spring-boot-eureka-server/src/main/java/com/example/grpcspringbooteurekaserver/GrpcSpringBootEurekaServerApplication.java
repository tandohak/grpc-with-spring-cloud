package com.example.grpcspringbooteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GrpcSpringBootEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringBootEurekaServerApplication.class, args);
    }

}

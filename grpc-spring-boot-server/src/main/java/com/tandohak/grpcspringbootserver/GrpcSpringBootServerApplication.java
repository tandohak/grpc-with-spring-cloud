package com.tandohak.grpcspringbootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class GrpcSpringBootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcSpringBootServerApplication.class, args);
    }

}

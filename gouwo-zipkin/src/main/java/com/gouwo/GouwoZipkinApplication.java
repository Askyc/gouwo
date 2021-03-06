package com.gouwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class GouwoZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouwoZipkinApplication.class, args);
    }

}

package com.itcast.eureka_server_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBackApplication.class, args);
    }

}

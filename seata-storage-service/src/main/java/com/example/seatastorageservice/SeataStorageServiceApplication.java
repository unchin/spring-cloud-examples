package com.example.seatastorageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
@EnableDiscoveryClient
public class SeataStorageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageServiceApplication.class, args);
    }

}

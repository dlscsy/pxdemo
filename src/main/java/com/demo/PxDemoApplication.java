package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.demo.mapper")
public class PxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PxDemoApplication.class, args);
    }

}

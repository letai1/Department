package com.example.ontap2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnTap2Application {

    public static void main(String[] args) {
        SpringApplication.run(OnTap2Application.class, args);
    }

}

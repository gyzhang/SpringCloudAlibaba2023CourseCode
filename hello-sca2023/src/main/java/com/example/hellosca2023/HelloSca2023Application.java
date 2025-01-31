package com.example.hellosca2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringCloud Alibaba的第一个应用
 */
@SpringBootApplication
public class HelloSca2023Application {

    public static void main(String[] args) {
        System.out.println("Spring Cloud Alibaba Version:"+"2023.0.1.0*");
        System.out.println("Spring Cloud Version:"+"Spring Cloud 2023.0.1");
        System.out.println("Spring Boot Version:"+"3.2.4");
        System.out.println("Sentinel Version:"+"1.8.6");
        System.out.println("Nacos Version:"+"2.3.2");
        System.out.println("RocketMQ Version:"+"5.1.4");
        System.out.println("Seata Version:"+"2.0.0");
        System.out.println("SpringCloud Alibaba 版本发布说明："+"https://sca.aliyun.com/docs/2023/overview/version-explain/?spm=7145af80.3bfb50d8.0.0.74e42fa5iHm287");

        SpringApplication.run(HelloSca2023Application.class, args);
    }

}

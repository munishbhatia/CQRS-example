package com.mbhatia.cqrs_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mbhatia.cqrs_example.services.*", "com.mbhatia.cqrs_example.repositories.*",
        "com.mbhatia.cqrs_example.controllers"})
public class CqrsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqrsExampleApplication.class, args);
    }
}

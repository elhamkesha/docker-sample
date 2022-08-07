package com.tosan.docker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Keshavarz
 * @since 8/7/2022
 */
@SpringBootApplication(scanBasePackages = "com.tosan")
public class HelloApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(HelloApplication.class,args);
    }
}

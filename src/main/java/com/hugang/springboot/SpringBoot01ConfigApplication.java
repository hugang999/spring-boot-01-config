package com.hugang.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = "classpath:beans.xml")
@SpringBootApplication
public class SpringBoot01ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01ConfigApplication.class, args);
    }

}

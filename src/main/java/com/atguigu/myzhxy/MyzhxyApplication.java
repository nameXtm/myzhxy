package com.atguigu.myzhxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
public class MyzhxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyzhxyApplication.class, args);
    }

}

package com.example.wyl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.example.wyl.mapper")
public class WylApplication {

    public static void main(String[] args) {
        SpringApplication.run(WylApplication.class, args);
    }
}

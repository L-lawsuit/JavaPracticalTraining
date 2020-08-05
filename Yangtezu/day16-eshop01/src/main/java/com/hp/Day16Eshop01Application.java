package com.hp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hp.mapper")
public class Day16Eshop01Application {

    public static void main(String[] args) {
        SpringApplication.run(Day16Eshop01Application.class, args);
    }

}

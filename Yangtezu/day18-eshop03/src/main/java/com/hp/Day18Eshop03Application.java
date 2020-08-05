package com.hp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hp.mapper")
public class Day18Eshop03Application {

    public static void main(String[] args) {
        SpringApplication.run(Day18Eshop03Application.class, args);
    }

}

package com.li;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.li.mapper")
public class Day14SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day14SpringbootApplication.class, args);
    }

}

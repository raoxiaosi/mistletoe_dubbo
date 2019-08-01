package com.rao.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.rao.java.dao"})
public class MistletoeUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MistletoeUserWebApplication.class, args);
    }

}

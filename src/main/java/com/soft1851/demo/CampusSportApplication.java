package com.soft1851.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Administrator
 */


@SpringBootApplication
@EnableScheduling
@MapperScan("com.soft1851.demo.mapper")
public class CampusSportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusSportApplication.class, args);
    }

}

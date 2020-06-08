package com.soft1851.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */

// 扫描我们的mapper文件夹
@MapperScan("com.soft1851.demo.mapper")
@SpringBootApplication
public class CampusSportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusSportApplication.class, args);
    }

}

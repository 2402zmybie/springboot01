package com.hr.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SpringBootApplication:
 * 声明这是一个配置类
 * 开启扫描
 * 声明扫描的包名
 */
@SpringBootApplication
@MapperScan("com.hr.springboot01.mapper")
public class Springboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}

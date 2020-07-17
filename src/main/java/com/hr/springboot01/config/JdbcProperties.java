package com.hr.springboot01.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {

    private String url;
    private String driverClassName;
    private String username;
    private String password;

    //复杂类型注入(对象 集合)
    User user = new User();

    class User {
        String name;
        int age;
        List<String> language;
    }



}

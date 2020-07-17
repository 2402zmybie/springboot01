package com.hr.springboot01.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//代替xml文件, spring会读取里面的内容
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

    //@Bean标签写在方法上, 将方法返回的Bean对象注入容器中
//    @Bean
//    public DataSource getDataSource(JdbcProperties prop) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(prop.getDriverClassName());
//        dataSource.setUrl(prop.getUrl());
//        dataSource.setUsername(prop.getUsername());
//        dataSource.setPassword(prop.getPassword());
//        return dataSource;
//    }


//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource getDataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }
}

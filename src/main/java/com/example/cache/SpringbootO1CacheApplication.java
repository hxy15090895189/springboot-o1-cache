package com.example.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 搭建基本环境
 *
 */
@SpringBootApplication
@MapperScan(value ="com.example.cache.mapper")
@EnableCaching //开启基于注解的缓存
public class SpringbootO1CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootO1CacheApplication.class, args);
    }

}

package com.fan.fanbox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fan.fanbox.mapper")
public class FanboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FanboxApplication.class, args);
    }

}

package com.fan.fanbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173") // 允许的来源
                .allowedMethods("*") // 允许的请求方式
                .allowedHeaders("*") // 允许的header属性
                .allowCredentials(true) // 是否允许cookie
                .maxAge(3600); // 跨域允许时间
    }
}
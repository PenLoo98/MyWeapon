package com.myweapon.rtc_chatting.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 모든 경로에 대해 모든 메소드를 허용하고, 모든 오리진에 대해 500초간 유효한 CORS 설정을 적용
        registry.addMapping("/**")
                .maxAge(500)
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS");
    }
}

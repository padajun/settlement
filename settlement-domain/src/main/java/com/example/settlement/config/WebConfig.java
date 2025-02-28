package com.example.settlement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  private final long MAX_AGE_SECS = 360000;

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET", "POST","PUT","PATCH","DELETE","OPTIONS")
        .allowedHeaders("*")
        .allowCredentials(false)
        .maxAge(MAX_AGE_SECS);
        ;

  }
}
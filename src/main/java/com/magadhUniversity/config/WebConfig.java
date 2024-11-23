package com.magadhUniversity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve videos from a local directory
        registry.addResourceHandler("/videos/**")
                .addResourceLocations("file:///E:/Internship/Videos/");
    }
}
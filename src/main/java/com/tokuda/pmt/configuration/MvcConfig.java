package com.tokuda.pmt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/403").setViewName("403");
        registry.addRedirectViewController("/", "/index");

    }

    @Bean
    public InternalResourceViewResolver resourceView(){
        InternalResourceViewResolver resourceView = new InternalResourceViewResolver();
        resourceView.setSuffix(".html");
        resourceView.setPrefix("/src/main/resources/templates");
        return resourceView;
    }
}

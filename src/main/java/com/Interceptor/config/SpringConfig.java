package com.Interceptor.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.Interceptor")
@Import({dataConfig.class})
public class SpringConfig { }
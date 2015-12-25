package com.hpe.ovp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.hpe.ovp.component")
@EnableWebMvc
public class AppConfig {

}

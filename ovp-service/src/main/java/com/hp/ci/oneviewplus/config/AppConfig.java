package com.hp.ci.oneviewplus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.hp.ci.oneviewplus")
@EnableWebMvc
public class AppConfig
{

}

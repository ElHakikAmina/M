package com.elasriabdelillah.marjaneconfiguration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan({"com.elasriabdelillah"})
public class WebApplicationContextConfig implements WebMvcConfigurer {

}

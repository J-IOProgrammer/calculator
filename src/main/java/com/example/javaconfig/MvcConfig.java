package com.example.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Warning: “The type WebMvcConfigurerAdapter is deprecated”
 * so we have to use from WebMvcConfigurer interface
 * see = https://www.baeldung.com/web-mvc-configurer-adapter-deprecated
 */
@EnableWebMvc
@ComponentScan
public class MvcConfig implements WebMvcConfigurer {

}

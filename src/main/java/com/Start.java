package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author gousheng
 * @date ${Date}- 10:58
 */
//在外部发布时需要继承extends SpringBootServletInitializer类
@SpringBootApplication
public class Start  {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
 /* *//*  打包在外部Tomcat上部署时加上*//*
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Start.class);
    }*/
}

package com.hugang.springboot.config;

import com.hugang.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器增加了组件,id:" + MyAppConfig.class.getMethods()[0].getName());
        return new HelloService();
    }

}

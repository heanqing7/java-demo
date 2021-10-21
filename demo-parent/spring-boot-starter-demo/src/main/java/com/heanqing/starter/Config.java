package com.heanqing.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//读取application.yml配置文件，将对应的属性读入Properties中
@EnableConfigurationProperties(Properties.class)
public class Config {

    //注入配置文件
    @Autowired
    private Properties properties;

    @Bean("springComponent")
    public SpringComponent springComponentInit() {
        //使用配置文件值
        String str = properties.getTopic();
        SpringComponent s = new SpringComponent();
        return s;
    }


    @ConditionalOnProperty(prefix = "demo.spring-boot-starter-demo.enable", name = "enable", havingValue = "true")
    @Bean("conditionalSpringComponent")
    public ConditionalSpringComponent conditionalSpringComponentInit() {
        ConditionalSpringComponent s = new ConditionalSpringComponent();
        return s;
    }
}

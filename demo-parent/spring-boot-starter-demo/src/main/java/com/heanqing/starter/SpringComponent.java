package com.heanqing.starter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringComponent {
    @PostConstruct
    public void init() {
        System.out.println("spring-boot-starter-demo#SpringComponent 已经初始化加载");
    }

}

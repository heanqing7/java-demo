package com.heanqing.service;

import org.springframework.stereotype.Service;

@Service("userServiceImplB")
public class UserServiceImplB implements IUserService{

    @Override
    public int testExecutionPointcut() {
        System.out.println(this.getClass().getSimpleName()+"testExecutionPointcut");
        return 0;
    }

    @Override
    public int testArgsPointcut() {
        System.out.println(this.getClass().getSimpleName()+"testArgsPointcut");
        return 0;
    }

    @Override
    public int testArgsPointcut(int a, int b) {
        System.out.println(this.getClass().getSimpleName()+"testArgsPointcut with args");
        return 0;
    }

    @Override
    public int testAnnotationPointcut() {
        System.out.println(this.getClass().getSimpleName()+"testAnnotationPointcut");
        return 0;
    }
}

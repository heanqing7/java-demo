package com.heanqing.service;

import com.heanqing.anno.TestAop;
import org.springframework.stereotype.Service;

@Service("userServiceImplA")
public class UserServiceImplA implements IUserService{

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
    @TestAop
    public int testAnnotationPointcut() {
        System.out.println(this.getClass().getSimpleName()+"testAnnotationPointcut");
        return 0;
    }
}

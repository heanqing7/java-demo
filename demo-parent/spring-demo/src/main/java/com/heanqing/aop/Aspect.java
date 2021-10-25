package com.heanqing.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {


    /**
     * 按照execution表达式圈选方法
     */
    @Pointcut("execution (* com.heanqing.service.*.testExecutionPointcut(..))")
    public void selectByExecution() {
    }

    /**
     * 按照注解圈选方法
     */
    @Pointcut("@annotation(com.heanqing.anno.TestAop)")
    public void selectByAnnotation() {
    }

    /**
     * 按照execution表达式圈选方法，处理返回值
     */
    @Pointcut("execution (* com.heanqing.service.*.testArgsPointcut(..))")
    public void selectByArgs() {
    }


    /**
     * around在before前面
     */
    @Around("selectByExecution()")
    public Object testAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--------------testAround--------------");
        Object result = pjp.proceed();
        System.out.println("--------------testAround--------------");
        return 1;
    }


    @Before("selectByExecution()")
    public void testBefore() {
        System.out.println("--------------testBefore--------------");
    }

    /**
     * after也在around前面
     */
    @After("selectByExecution()")
    public void testAfter() {
        System.out.println("--------------testAfter--------------");
    }


//    /**
//     * afterReturnning在最后
//     */
//    @AfterReturning(pointcut = "selectByArgs()", returning="result")
//    public void testAfterReturning(int result) {
//        System.out.println(result);
//        System.out.println("--------------AfterReturning--------------");
//    }

    /**
     * afterReturnning在最后
     */
    @AfterThrowing(pointcut = "selectByExecution()", throwing = "e")
    public void testAfterThrowing(Exception e) {
        System.out.println(e);
        System.out.println("--------------AfterThrowing--------------");
    }



}

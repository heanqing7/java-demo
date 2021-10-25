package com.heanqing;

import com.heanqing.service.IUserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App implements ApplicationContextAware
{
    private static ApplicationContext applicationContext;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        IUserService userService = (IUserService)applicationContext.getBean("userServiceImplA");
        System.out.println(userService.testExecutionPointcut());
        System.out.println(userService.testAnnotationPointcut());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

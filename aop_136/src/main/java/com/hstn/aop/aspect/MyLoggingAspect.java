package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(public void add*())")
    private void pointcutForMethods() {
    }

    @Before("pointcutForMethods()")
    public void beforeAddUserData() {

        System.out.println("1111111111111111111111111\nBefore");
    }

    @Before("pointcutForMethods()")
    public void beforeAdmin() {

        System.out.println("333333333333333333333333\nBefore");
    }


}

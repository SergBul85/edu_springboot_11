package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* com.hstn.aop.dao.*.*(..))")
    private void pointcutForMethods() {
    }

    @Before("pointcutForMethods()")
    public void beforeAddUserData() {

        System.out.println("    1 Before");
    }

    @Before("pointcutForMethods()")
    public void beforeAdmin() {

        System.out.println("    3 Before");
    }


}

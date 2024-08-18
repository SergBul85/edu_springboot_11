package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Before("execution(* add*() )")
    public void beforeAddUserData() {
        System.out.println("1111111111111111111111111\nBefore addUserData");
    }

}

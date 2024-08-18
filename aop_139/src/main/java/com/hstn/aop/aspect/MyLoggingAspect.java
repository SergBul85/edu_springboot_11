package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class MyLoggingAspect {

    @Before("MyPoinycutExpression.pointcutForMethods()")
    public void beforeAddUserData() {
        System.out.println("    1 Before");
    }

}

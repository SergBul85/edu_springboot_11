package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(20)
public class Maneger {
    @Before("MyPoinycutExpression.pointcutForMethods()")
    public void beforeManeger() {
        System.out.println("    2 Before");
    }
}

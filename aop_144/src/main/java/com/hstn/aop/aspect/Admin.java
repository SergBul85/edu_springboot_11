package com.hstn.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Aspect
@Component
@Order(30)
public class Admin {

    @Before("MyPoinycutExpression.pointcutForMethods()")
    public void beforeAdmin() {
        System.out.println("    3 Before");
    }
}

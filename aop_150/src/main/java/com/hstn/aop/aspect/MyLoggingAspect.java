package com.hstn.aop.aspect;

import com.hstn.aop.Admin;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(10)
public class MyLoggingAspect {

    @Around("execution(* getCr*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().getName();
        System.out.println("    Around = " + method);

        long startTime = System.currentTimeMillis();

        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("    " + e.getMessage());
            result = "    Exception. Default value: refuse credit.";
        }


        long duration = System.currentTimeMillis() - startTime;
        System.out.println("    Around duration: " + duration);
        return result;
    }

    @After("execution(* find*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.out.println("    After = " + method);
    }


    @AfterThrowing(pointcut = "execution(* find*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {

        String method = joinPoint.getSignature().getName();
        System.out.println("    AfterThrowing = " + method);
        System.out.println("    AfterThrowing exception = " + exception.getMessage());
    }


    @AfterReturning(pointcut = "execution(* find*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, List<Admin> result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("    After returning methodName = " + methodName);
        System.out.println("    After returning result = " + result);

        changeRusult(result);
    }

    private void changeRusult(List<Admin> result) {
        for (Admin admin : result) {
            admin.setName(admin.getName().toUpperCase());
//            if(admin.getName().equals("BORIS")){
//                admin.setName("HACKER");
//            }
        }
    }


    @Before("MyPoinycutExpression.pointcutForMethods()")
    public void beforeAddUserData(JoinPoint joinPoint) {
        System.out.println("    1 Before");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("        Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("        arg: " + arg.toString());
        }
    }

}

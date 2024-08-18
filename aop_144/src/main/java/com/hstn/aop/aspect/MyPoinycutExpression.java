package com.hstn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyPoinycutExpression {

    @Pointcut("execution(* com.hstn.aop.dao.*.test*(..))")
    public void pointcutForMethods() {
    }

    @Pointcut("execution(* com.hstn.aop.dao.*.get*(..))")
    public void pointCutForGetter() {
    }

    @Pointcut("execution(* com.hstn.aop.dao.*.set*(..))")
    public void pointCutForSetter() {
    }

    @Pointcut("pointCutForSetter() || pointCutForGetter()")
    public void pointCutForSetterAndGetter() {
    }

    @Pointcut("pointcutForMethods() && !(pointCutForSetter() || pointCutForGetter() )")
    public void pointCutNotForSetterAndGetter() {
    }

}

package aspectj.execution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class HelloBeanAspect {

    @Before("execution(* aspectj.execution.HelloBean.findEmployeeById(..))")
    public void beforeFindEmployeeById() {

        System.out.println("Aspect before method is executed");
    }

    @AfterThrowing(value = "execution(* aspectj.execution.HelloBean.getCurrencyCountryName(..))", throwing = "exception")
    public void afterThrowingException(Exception exception) {
        System.out.println("Exception was thrown from getCurrencyCountryName: " + exception.getClass().getSimpleName());
    }

    @After("execution(* aspectj.execution..SubHelloBean.formatData(..))")
    public void afterHelloBean(JoinPoint joinPoint) {
        System.out.println("After formatData ....");
    }

        // any modifier
    // subpackage of package com but starts with beans
    // any className
    // any method accepting with all types
    @Around("execution(* aspectj.execution.*.*(*, ..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("method intercepted..."+proceedingJoinPoint.getSignature());
        return null;
    }

}

package com.spring.professional.module2.myaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspects {

    private Logger logger = Logger.getLogger("performance.logger");


    /*
        @annotation ... is the pointcut expression ( a predicate when matched the advice will be executed)
        The jointpoint is the code that we want to act on it
        @Around is the type of the advice
     */
    @Around("@annotation(com.spring.professional.module2.custom.PerformanceLogger)")
    public Object logStartAndEnd(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // this the advice
        long startTime = System.currentTimeMillis();
        try {
            return proceedingJoinPoint.proceed();
        } finally {
            long finishTime = System.currentTimeMillis();
            Duration duration = Duration.ofMillis(finishTime - startTime);

            logger.info(String.format("Duration of %s execution was %s", proceedingJoinPoint.getSignature(), duration));
        }
    }
}

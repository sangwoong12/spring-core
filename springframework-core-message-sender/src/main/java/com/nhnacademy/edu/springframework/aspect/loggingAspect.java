package com.nhnacademy.edu.springframework.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class loggingAspect {

    @Around("execution(public * *.sendMessage(..))")
    public Object loggingExecutionTIme(ProceedingJoinPoint pjp) {
        long beginTime = System.currentTimeMillis();
        Object rt = null;
        try {
            rt = pjp.proceed();
        } catch (Throwable e) {

        } finally {
            //ProceedingJoinPoint 의 타겟은 SmsMessageSender 이고, 인자로 User 와 String message 가 있는 것을 확인할 수 있다.
            System.out.println("Target : " + pjp.getTarget().getClass().toString());
            Arrays.stream(pjp.getArgs()).forEach(f -> System.out.println("arg : " + f.toString()));
            long elapsedTime = System.currentTimeMillis() - beginTime;
            System.out.println("elapsedTime : " + elapsedTime + "ms");
            return rt;
        }
    }
}

package com.nhnacademy.edu.springframework.aspect;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.annotation.ElapsedTimeLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {

    //args : 인자가 user 를 가지고 있고, .. 추가적인 인자가 있을경우
    //annotation : ElapsedTimeLog 를 달고 있는 경우
    //execution : sendMessage() 의 경우
    //around 에 해당하여 아래코드를 실행한다.
    @Around("execution(public * *.sendMessage(..)) && args(user,..) && @annotation(elapsedTimeLog)")
    public Object loggingExecutionTIme(ProceedingJoinPoint pjp, User user, ElapsedTimeLog elapsedTimeLog) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object rt = null;
        try {
            rt = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        } finally {
            //args 동작 여부 확인.
            System.out.println("Annotation :" + elapsedTimeLog);
            System.out.println("Use Args User: " + user.getEmail() + " : " + user.getPhoneNumber());
            long elapsedTime = System.currentTimeMillis() - beginTime;
            System.out.println("elapsedTime : " + elapsedTime + "ms");
            return rt;
        }
    }
}

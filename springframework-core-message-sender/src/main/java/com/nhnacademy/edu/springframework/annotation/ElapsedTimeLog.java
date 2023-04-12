package com.nhnacademy.edu.springframework.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ElapsedTimeLog {
}

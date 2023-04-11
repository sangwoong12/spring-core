package com.nhnacademy.edu.springframework;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//커스텀 으로 만들수 있지만 작성자가 아닐경우 알아보기 힘들기 때문에 안쓰는 것이 좋다.
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface SMS {
}
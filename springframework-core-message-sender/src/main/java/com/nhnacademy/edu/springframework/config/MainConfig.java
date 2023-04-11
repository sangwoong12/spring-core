package com.nhnacademy.edu.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//JavaConfiguration 에서 XML 설정을 사용할 수 있다. 한번에 수정하기 어려울때 beans.xml 을 참조하여 처리할 수 있다.
@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {

}

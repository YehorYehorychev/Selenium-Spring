package com.yehorychev.spring.spring_selenium.kelvin.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.lang.annotation.*;

@Bean
@Scope("browserScope")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ThreadScopeBean {
}

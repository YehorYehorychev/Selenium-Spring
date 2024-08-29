package com.yehorychev.spring.spring_selenium.kelvin.annotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.*;

@Lazy
@Configuration
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LazyConfiguration {
}

package ru.afanasev.lessonsem2.spring.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
public @interface Validate {
    String[] value();
}

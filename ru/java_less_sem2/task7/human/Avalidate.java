package task7.human;

import task7.annotation.Validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Validate(Tests.class)//test не должно быть
public @interface Avalidate {
    Class value();
}

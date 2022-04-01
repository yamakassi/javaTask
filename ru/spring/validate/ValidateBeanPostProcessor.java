package ru.afanasev.lessonsem2.spring.validate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
public class ValidateBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    ApplicationContext ctx;
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (!bean.getClass().isAnnotationPresent(Validate.class)) {
            // throw new
            return bean;
        }
        //  7.3.5 ?? проверка If есть ли у Avalidate аннотация Validate и если есть то в class еще добавляем Avalidate
        List<String> testsNames = new ArrayList<>();
        String[] classes = bean.getClass().getAnnotation(Validate.class).value();
      /*  if(Avalidate.class.isAnnotationPresent(Validate.class)) {
            classList.add( obj.getClass().getAnnotation(Avalidate.class).value());
        }*/
        testsNames.addAll(Arrays.asList(classes));
        for (String name : testsNames) {

               Predicate beanTest= (Predicate) ctx.getBean(name);

              String  nameTestField = name.substring(4,name.length()).toLowerCase();
            try {
               Field[] fields = bean.getClass().getDeclaredFields();
               for(Field f:fields) {

                   if(f.getName().equals(nameTestField)) {
                        f.setAccessible(true);
                      if(beanTest.test(f.get(bean)) == false) throw new ValidateException("возраст человека не в диапазоне от 1 до 200");

                   }
            }
            } catch (IllegalAccessException  e) {
                e.printStackTrace();
            }

        }


        return bean;
    }
}

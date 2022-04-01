package ru.afanasev.lessonsem2.spring.student;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Афанасьев_ИС
 */

@Component
public class DefaultValueBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    ApplicationContext ctx;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("----");
        System.out.println(beanName);
        Field[] fields = bean.getClass().getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f.getName());
            if (f.getType().isPrimitive()) return bean;



            try {
                if ( f.get(bean) == null && f.isAnnotationPresent(Default.class)) {
                    f.setAccessible(true);

                    ReflectionUtils.setField(f, bean, ctx.getBean(f.getType()));
                }
            } catch (IllegalAccessException e) {

            }
        }

//        Arrays.stream(bean.getClass().getDeclaredFields())
//                .filter(f->!f.getType().isPrimitive()).
//                        && ReflectionUtils.findField(bean.getClass(), f.getName())==null && f.isAnnotationPresent(Default.class))
//                .peek(f->f.setAccessible(true))
//                .peek( f-> ReflectionUtils.setField(f, bean, ctx.getBean(f.getType())));
//
//

        return bean;
    }


}
package ru.afanasev.lessonsem2.spring.cache;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;
import ru.afanasev.lessonsem2.spring.validate.Validate;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CacheBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class clz = bean.getClass();
        List<Method> lst = Arrays.asList(clz.getDeclaredMethods());
        if(!clz.isAnnotationPresent(Cache.class)) return bean;
        System.out.println("------");
        System.out.println(beanName);
        List<String> methodCache = new ArrayList<>();
        for(String s: bean.getClass().getAnnotation(Cache.class).value()){
            methodCache.add(s);
        }
        if(methodCache.size()==0){
            for(Method m: clz.getDeclaredMethods()){
                System.out.println("ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ");
                System.out.println(m.getName());
                if(m.getParameterCount()==0) methodCache.add(m.getName());
            }
        }
        bean = Enhancer.create(bean.getClass(),
                new CacheBeanInvocationHandlerGGLib(bean,methodCache));


        return bean;
    }
}

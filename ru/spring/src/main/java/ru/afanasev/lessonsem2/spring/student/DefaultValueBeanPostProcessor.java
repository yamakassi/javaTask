package spring.student;


import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import static javafx.scene.input.KeyCode.R;
import net.sf.cglib.core.ReflectUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ReflectionUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Афанасьев_ИС
 */
public class DefaultValueBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    ApplicationContext ctx;
    @Override
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        
        Arrays.stream(o.getClass().getDeclaredFields())
                .filter(x->x.getType().isPrimitive() 
                        && ReflectionUtils.findField(o.getClass(), x.getName())==null && x.isAnnotationPresent(Default.class))
                .peek(x->x.setAccessible(true))
                .peek( x->ReflectionUtils.setField(x, o, ctx.getBean(x.getType())));
                
                
       
        return o;
    }

    
}
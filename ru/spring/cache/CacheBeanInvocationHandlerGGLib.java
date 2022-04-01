package ru.afanasev.lessonsem2.spring.cache;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheBeanInvocationHandlerGGLib implements InvocationHandler{
    Object ob;
    List<String> methodNamesCache;
    boolean modific = true;
    Map<String,Object> cacheMethods =new HashMap<>();
    public CacheBeanInvocationHandlerGGLib(Object ob, List<String> methodCache) {
        this.ob = ob;
        this.methodNamesCache=methodCache;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if(methodNamesCache.size()==0)  return  method.invoke(ob,objects);
        for(String s:methodNamesCache){
            if(s.equals(method.getName())) {
                if(modific){
                    Object res= method.invoke(ob,objects);
                    cacheMethods.put(method.getName(),res);
                    modific = false;
                    return res;
                }else{

                    if( cacheMethods.get(method.getName())==null){
                        Object res= method.invoke(ob,objects);
                        cacheMethods.put(method.getName(),res);
                        return res;
                    };
                     return cacheMethods.get(method.getName());


                }
            }
        }
        //проверка на изменение объекта -  классы все должны быть инкапсулированы, отсюда изменить из можем
        // только через setNameMethod и проверяем не начинается ли метод с set
        if( method.getName().substring(0,3).toLowerCase().equals("set")){
            modific = true;
            cacheMethods.clear();
        }
        return method.invoke(ob,objects);
    }

}

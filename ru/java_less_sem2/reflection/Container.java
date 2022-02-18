package reflection;

import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Container {
    private Map<String,Object> objects = new HashMap<>();

    @SneakyThrows
  /*  public void  load(Class c1){
        Method[] meths=c1.getDeclaredMethods();
        for(Method m:meths){
            if(m.isAnnotationPresent(reflection.BeanQ.class))
            
                     String txt= m.getAnnotation(reflection.BeanQ.class).value();
                     if(txt.isEmpty())
            objects.put("",m.invoke(null));
        }
    }
    public Object getBean(String name){
        return ;
    }*/
    public List<Object> listObjects(){
        return new ArrayList<>(objects.values());
    }

}

package task7;

import lombok.SneakyThrows;
import task7.annotation.Default;
import task7.annotation.Invoke;

import task7.annotation.Validate;
import task7.human.Avalidate;
import task7.human.ValidateException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class StatMetods {
    //7.1.1
    public static List<String> fieldCollection(Object obj) {
        List<String> stringFieldNames = new ArrayList<>();

        for (Class cl = obj.getClass(); cl != null; cl = cl.getSuperclass()) {
            for (Field field : cl.getDeclaredFields()) {
                field.setAccessible(true);
                stringFieldNames.add(field.getName());
                //  закрыть ? field.setAccessible(false);
            }
            System.out.println(cl.getFields().length);
        }

        return stringFieldNames;
    }

    //7.1.2
    @SneakyThrows
    public static void lineConnector(Line<?> l1, Line<?> l2) {
        Class<?> lineClass = l1.getClass();

        Field fld1 = lineClass.getDeclaredField("end");
        Field fld2 = lineClass.getDeclaredField("start");

        fld1.setAccessible(true);
        fld2.setAccessible(true);

        Point point = (Point) fld1.get(l1);
        fld2.set(l2, point);

    }

    //7.1.4


    public static void validate(Object obj) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (!obj.getClass().isAnnotationPresent(Validate.class)) {
            // throw new
            return;
        }
      //  7.3.5 ?? проверка If есть ли у Avalidate аннотация Validate и если есть то в class еще добавляем Avalidate
    List<Class> classList = new ArrayList<>();
        Class[] classes = obj.getClass().getAnnotation(Validate.class).value();
        if(Avalidate.class.isAnnotationPresent(Validate.class)) {
            classList.add( obj.getClass().getAnnotation(Avalidate.class).value());
        }
        classList.addAll(Arrays.asList(classes));
        for (Class cl : classList) {
            Method[] methods = cl.getDeclaredMethods();
            Constructor constructor = cl.getConstructor();
            Object obj1 = constructor.newInstance();
            for (Method method : methods) {
                try {
                    method.setAccessible(true);
                    method.invoke(obj1, obj);
                    method.setAccessible(false);
                } catch (ValidateException e) {
                    throw e;
                } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //7.3.1
    public static Map<String, Object> collect(List<Class<?>> classList) {
        Map<String, Object> metInvk = new HashMap<>();
        List<Method> methods = new ArrayList<>();

        for (Class cl : classList) {
            // у каждого класса получаем методы подходящие по условию
            for (Method m : getMethods(cl)) {
                try {
                    m.setAccessible(true);
                    Object object = cl.getConstructor().newInstance();
                    metInvk.put(m.getName(), m.invoke(object));
                } catch (Exception e) {
                    metInvk.put(m.getName(), null);
                }

            }
        }
        //


        return metInvk;
    }

    private static List<Method> getMethods(Class<?> cl) {
        return Arrays.stream(cl.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(Invoke.class))
                .filter(m -> m.getParameters().length == 0)
                .filter(m -> m.getReturnType() != void.class)
                .collect(Collectors.toList());

    }

    //7.3.2 доделать раб с классом
    public static void reset(Object obj) {
        for (Class cl = obj.getClass(); cl != null; cl = cl.getSuperclass()) {
            for (Field field : cl.getDeclaredFields()) {
                if (field.isAnnotationPresent(Default.class)) {

                    try {
                        field.setAccessible(true);
                        field.set(obj, field.getAnnotation(Default.class).value());
                        //  закрыть ? field.setAccessible(false);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }


            }
            System.out.println(cl.getFields().length);
        }
    }


}

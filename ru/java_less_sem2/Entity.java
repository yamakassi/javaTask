package task7;


import task7.annotation.ToString;
import task7.annotation.YesOrNot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    //7.1.3

    @Override
    public String toString() {
        //
        if (isToStringNo()) return "A{}";

        String str = "{";


        for (Class cl = this.getClass(); cl != null; cl = cl.getSuperclass()) {
            for (Field field : cl.getDeclaredFields()) {
                if (field.isAnnotationPresent(ToString.class)
                        && field.getAnnotation(ToString.class).value() == YesOrNot.NO){
                    continue;
                }
                    field.setAccessible(true);
                try {
                    str += field.getName() + "=" + field.get(this) + ", ";
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }
        str = str.substring(0, str.length() - 2);
        str += "}";
        return str;
    }

    private boolean isToStringNo() {
        return this.getClass().isAnnotationPresent(ToString.class)
                && this.getClass().getAnnotation(ToString.class).value() == YesOrNot.NO;
    }
}

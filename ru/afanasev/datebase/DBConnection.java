/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.datebase;

import java.lang.annotation.Annotation;
import java.util.Optional;

/**
 *
 * @author Афанасьев_ИС
 */
/* всего 5 связей для всей программы макс*/
public class DBConnection implements ConnectionI,AutoCloseable,FunctionalInterface {
    private static  final  int size =5;
    private int curr=0;
    public boolean isOpen = true;
   
    private  DBConnection(){
        
    } 
    public static Optional<DBConnection> instance(){
     if(size>0) ;
    else return Optional.empty();
    
    return Optional.of(new DBConnection());
     }
    public String next(){
       
       if(this.isOpen==true) return "Hello";
        return null;
    }

    public void close(){
       if(isOpen==true){
           this.curr++;
           this.isOpen=false;
       }   
        
    }

    /**
     * Returns the annotation interface of this annotation.
     *
     * @return the annotation interface of this annotation
     * @apiNote Implementation-dependent classes are used to provide
     * the implementations of annotations. Therefore, calling {@link
     * Object#getClass getClass} on an annotation will return an
     * implementation-dependent class. In contrast, this method will
     * reliably return the annotation interface of the annotation.
     * @see Enum#getDeclaringClass
     */
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

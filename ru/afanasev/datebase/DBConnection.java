/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.datebase;

import java.util.Optional;

/**
 *
 * @author Афанасьев_ИС
 */
/* всего 5 связей для всей программы макс*/
public class DBConnection implements AutoCloseable,ConnectionI {
    private static  final  int size =5;
    private int curr=0;
    public boolean isOpen = true;
   
    private  DBConnection(){
        
    } 
    public static Optional<DBConnection> produce(){
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
}

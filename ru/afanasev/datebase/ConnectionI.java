/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.datebase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Афанасьев_ИС
 */
public interface ConnectionI extends AutoCloseable {
    public static Map<String,Producer<ConnectionI> mapConnections=new HashMap<>();
    public String next();
    public static Connection of(String name){
       String domain = name.split(".")[1];
      return mapConnections.get(domain).produce();

    }

    public static Optional<ConnectionI> produce() {
        return Optional.empty();
    }
}

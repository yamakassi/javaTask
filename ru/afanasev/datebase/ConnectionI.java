/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.datebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import  static java.util.Map.entry;
/**
 *
 * @author Афанасьев_ИС
 */
public interface ConnectionI extends AutoCloseable {

    final static  Map<String, Function<String,Optional<ConnectionI>>> mapConnections = new HashMap<>(Map.ofEntries(
        entry("db",DBConnection::instance)
    ));
    public String next();
    public static Connection of(String name){
       String domain = name.split(".")[1];//dbc.xml
   //   return mapConnections.get(domain).apply(name);

    }

    public static Optional<ConnectionI> produce() {
        return Optional.empty();
    }
}

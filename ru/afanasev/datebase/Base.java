/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.datebase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Афанасьев_ИС
 */
public class Base {
    private List<String> massList = new ArrayList<>();
    public Base(List<String> strs){
       this.massList = strs;
    }
}

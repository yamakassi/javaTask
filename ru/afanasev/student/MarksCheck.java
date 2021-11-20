/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.student;

/**
 *
 * @author Афанасьев_ИС
 */
public class MarksCheck implements Verifiable {

    @Override
    public boolean check(int x) {
        if(x==10 || x==5 ) return true;
        return false;
    }
    
}

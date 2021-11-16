package ru.afanasev.main;

import java.util.Comparator;

public class ComparatorA implements Comparator<String> {


    @Override
    public int compare(String  o1, String o2) {
       return  countAstring(o1)-countAstring(o2);
    }
    public static int countAstring (String str){
        int countA=0;
        for (char el : str.toCharArray()){
            if (el == 'a' || el=='A') countA++;

        }
        return countA;
    }
}

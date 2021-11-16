package ru.afanasev.main;

import ru.afanasev.charter5_3.Application;

public class SumCharStrings implements Application<String> {


    @Override
    public Integer apply(String o) {
        return  o.length();
    }
}

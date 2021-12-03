package ru.afanasev.charter5_3;

public class SumCharStrings implements Application<String> {


    @Override
    public Integer apply(String o) {
        return  o.length();
    }
}

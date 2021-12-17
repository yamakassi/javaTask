package ru.templateTaskOOP.structural.proxy;

public class Test2 implements Testable{
    @Override
    public boolean test(String ob) {
        return ob.length()>5;
    }
}

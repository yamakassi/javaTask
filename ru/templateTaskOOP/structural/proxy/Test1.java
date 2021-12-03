package ru.templateTaskOOP.structural.proxy;

public class Test1 implements Testable{
    @Override
    public boolean test(String ob) {
        return ob.isEmpty();
    }
}

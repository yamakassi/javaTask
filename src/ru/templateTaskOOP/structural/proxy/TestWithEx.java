package ru.templateTaskOOP.structural.proxy;

public class TestWithEx implements Testable {
    private Testable test;
    TestWithEx(Testable test){
        this.test=test;
    }

    @Override
    public boolean test(String ob) {
       if(!test.test(ob)) throw new IllegalArgumentException("Test is fail");
        return true;
    }
}

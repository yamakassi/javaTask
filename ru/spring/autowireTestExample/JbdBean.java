package ru.afanasev.lessonsem2.spring.autowireTestExample;

public class JbdBean {

    private String uuid;
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @Override
    public String toString() {
        return uuid;
    }
}

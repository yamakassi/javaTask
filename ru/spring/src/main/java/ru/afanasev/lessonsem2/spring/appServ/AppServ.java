package ru.afanasev.lessonsem2.spring.appServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.afanasev.lessonsem2.spring.autowireTestExample.BD;

import java.util.Map;

@Component
public class AppServ implements Run {
    private final Map<String, BD> modServMap;
    @Autowired
    public AppServ(Map<String, BD> modServMap) {
        this.modServMap = modServMap;
    }


    @Override
    public String get(String s) {
        String[] str = s.split("/");
        String nameMetod = str[0];
        String fields[] = str[1].split(",");
        return modServMap.get(nameMetod).getClass().toString();
    }

    @Override
    public String toString() {
        return "AppServ{" +
                "modServMap=" + modServMap.values() +
                '}';
    }
}

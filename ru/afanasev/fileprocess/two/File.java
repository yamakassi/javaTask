package ru.afanasev.fileprocess.two;

public interface File {

    String  action(File s);
    void save(String str,File file);
     void close();
}

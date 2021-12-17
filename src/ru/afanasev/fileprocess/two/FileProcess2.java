package ru.afanasev.fileprocess.two;

public class FileProcess2  {
    public void process(String fileName){
       File f =openFile(fileName);
        String s=f.action(f);
        f.save(s,f);
    }
    File openFile(String fileName){return new FileImg();}
}

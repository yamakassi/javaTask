package ru.afanasev.fileprocess.one;

public abstract class Fileprocess1 {
   protected abstract File openFile(String fileName);
   protected abstract String action(File f);
   protected abstract void save(String s,File f);
    public void process(String fileName){
     File f =openFile(fileName);
     String s=action(f);
     save(s,f);
    }


}

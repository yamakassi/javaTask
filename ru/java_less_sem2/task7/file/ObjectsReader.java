package task7.file;



import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsReader<T> {
    private File file;

    public ObjectsReader(String fileName) {
        this.file = new File(fileName);
    }

    public List<T> read(){
        List<T> readList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            String[] strs = sc.nextLine().split("\\{");
            String nameClass = strs[0];
            String fieldsClass = strs[1].split("}")[0];
            Class cl= Class.forName(nameClass);
            Field[] fields = cl.getDeclaredFields();
            for(Field f:fields){
                f.setAccessible(true);
                /* String[] strFields = fieldsClass.split(", ");

                    for(
                 */
            }

        } catch (FileNotFoundException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }







}
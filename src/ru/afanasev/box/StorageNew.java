package ru.afanasev.box;

public class StorageNew<T> {
    private final T ob;
    public static StorageNew nullStorage=new StorageNew(null);

    private StorageNew(T ob) {
        this.ob = ob;
    }

    public static <T> StorageNew<T> createStorageNull(T ob) {
        if (ob == null) throw new NullPointerException();

        return new StorageNew(ob);

    }

    public static <T> StorageNew<T> create(T ob) {
    if(ob==null) return nullStorage;
    return new StorageNew<>(ob);
    }

    public T getObj() {
        if (ob == null) return (T) "hello";
        return ob;
    }


    @Override
    public String toString() {
        return "ob=" + ob ;
    }
}

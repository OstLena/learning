package module9;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMapMain {

    public static void main(String[] args) {

        MyHashMap<MyKey, String> myHashMap = new MyHashMap<>();

        myHashMap.put(new MyKey(11), "Kyiv");
        myHashMap.put(new MyKey(21), "Dnipro");
        myHashMap.put(new MyKey(10), "Kharkiv");
        myHashMap.put(new MyKey(21), "Dnipro_2");

        System.out.println(myHashMap.get(new MyKey(11)));
        System.out.println(myHashMap.get(new MyKey(21)));
        System.out.println(myHashMap.get(new MyKey(2)));
        System.out.println(myHashMap.size());
        myHashMap.remove(new MyKey(21));
        myHashMap.remove(new MyKey(11));
        System.out.println(myHashMap.size());



    }

}

class MyKey {

    private int key;

    public MyKey(int key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return key % 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyKey myKey = (MyKey) o;
        return key == myKey.key;
    }
}

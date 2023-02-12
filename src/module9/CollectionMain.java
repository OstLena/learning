package module9;

import java.util.Arrays;

public class CollectionMain {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        myArrayList.remove(1);
        myArrayList.remove(7);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        System.out.println();

        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 1; i++) {
            myLinkedList.add(i);
        }

        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i) + " ");
        }

        myLinkedList.remove(0);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i) + " ");
        }


    }
}

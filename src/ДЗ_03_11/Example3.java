package ДЗ_03_11;

import ДЗ_03_11.base.MyList;
import ДЗ_03_11.impl.MyListImpl;

public class Example3 {
    public static void main(String[] args) {
        MyList list = new MyListImpl();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");


        list.remove(2);

        for(int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", element: " + list.get(i));
        }
    }
}

package ДЗ_2021.impl;

import ДЗ_2021.base.MyList;

public class MyListImpl implements MyList {
    private final String[] elements = new String[100];
    private int size = 0;

    @Override
    public void add(String element) {
        elements[size] = element;
        size++;
    }

    @Override
    public void remove(int index) {
        for(int n = index; n < elements.length-1; n++){
            elements[n] = elements[n+1];
        }
        size--;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}
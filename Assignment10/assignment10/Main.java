package com.codewithmurali.assignment10;

public class Main {
    public static void main(String[] args) {
        SList<String> list1 = new SList();
        SListIterator iterator1 = list1.iterator();
        iterator1.insert("murali");
        System.out.println(list1);

    }
}

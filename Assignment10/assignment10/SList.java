package com.codewithmurali.assignment10;


public class SList<T> {
    SListIterator iterator;

    SListIterator<T> iterator(){
        iterator = new SListIterator(null);
        return iterator;

    }

    @Override
    public String toString() {
        Node head = iterator.head;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp =temp.next;
        }
        return "";
    }
}

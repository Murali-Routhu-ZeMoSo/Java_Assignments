package com.codewithmurali.assignment10;

public class SListIterator<T> {
    Node<T> head;
    Node<T> currentNode;
    SListIterator(Node<T> head){
        this.head = head;
    }
    void insert(T data){
        currentNode = new Node<>(data,null);
        // System.out.println((head==null));
        if(head == null){
            head = currentNode;
        }
        else{
            Node<T> temp = head;
            while((temp.next != null)){
                temp = temp.next;
            }
            temp.next = currentNode;
        }
        // System.out.println(head.data);

    }
    void remove(){
        Node temp = head;
        if(head.next == null){
            head = null;
            return ;
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;

    }
}

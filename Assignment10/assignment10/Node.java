package com.codewithmurali.assignment10;

public class Node<T>{
    T data;
    Node<T> next;
    Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
package com.mycompany.foolthief;


public class Node<T> {
    private Node<T> next;
    private Node<T> prev;
    private T data;
    
    Node(T data) {
        next = null;
        prev = null;
        this.data = data;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}

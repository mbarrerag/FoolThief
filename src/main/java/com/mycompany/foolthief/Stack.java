package com.mycompany.foolthief;


public class Stack extends List {
    Stack() {
        super();
    }
    
    public Attempt pop() {
        if (head != null) {
            Node<Attempt> first = head;
            head = head.getNext();
            first.setNext(null);
            length--;
            return first.getData();
        }
        return null;
    }
    
    public void push(Attempt attempt) {
        Node<Attempt> node = new Node<Attempt>(attempt);
        node.setNext(head);
        head = node;
        length++;
    }

    public Attempt peek() {
        if (head != null) {
            return (Attempt) head.getData();
        }
        return null;
    }
    
    public void makeEmptystack(){
        if (head != null){
            head = null;
            tail = null;
        }
    }
}


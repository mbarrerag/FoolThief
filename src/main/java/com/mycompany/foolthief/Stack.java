package com.mycompany.foolthief;


public class Stack extends List {
    Stack() {
        super();
    }
    
    public void pop() {
        if (head != null) {
            Node first = head;
            head = head.getNext();
            first.setNext(null);
            length--;
        }
    }
    
    public void push(String data) {
        Node<String> node = new Node<String>(data);
        node.setNext(head);
        head = node;
        length++;
    }

    public String peek() {
        return (String) head.getData();
    }
    public void makeEmptystack(){
        
            
        }
    }


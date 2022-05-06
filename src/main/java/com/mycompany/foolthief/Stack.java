/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
}

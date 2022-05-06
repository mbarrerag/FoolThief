package com.mycompany.foolthief;


public class List {
    protected Node head;
    protected int length;
    protected Node tail;
    
    List() {
        head = null;
        length = 0;
    }
    
    public boolean itsEmpty() {
        return head == null;
    }
    
    public int size() {
        return length;
    }
}
package com.mycompany.foolthief;


public class List {
    protected Node head;
    protected Node tail;
    protected int length;
    
    public boolean itsEmpty() {
        return head == null;
    }
    
    public int size() {
        return length;
    }
}
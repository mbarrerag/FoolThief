package com.mycompany.foolthief;


public class FoolThief {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Stolen("100"));
        list.add(new Stolen("101"));
        list.add(new Stolen("102"));
        list.add(new Stolen("103"));
        list.add(new Stolen("104"));
        list.add(new Stolen("105"));
        list.add(new Stolen("765"), 6);
        System.out.println("====================");
        list.displayIdElements();
    }
}

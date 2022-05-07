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
        list.displayIdElements();
        System.out.println("====================");
        
        Stolen obj = list.browseById("765");
        obj.setName("Elba");
        obj.setLastname("Lazo");
        System.out.println("Encontrado");
        System.out.println("====================");
        list.displayElements();
        
        
        
    }
}

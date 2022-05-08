package com.mycompany.foolthief;


public class Queue extends List {
    Queue (){
        super();
    }

     /**
     * Retorna el elemento que esta en la parte superior de la lista.
     * @return string
     */
    public String peek() {
        if (head != null) {
            return (String) head.getData();
        }
        return null;
    }

    /**
     * Encola el dato dado al final de la lista.
     * @param string
     */
    public void enqueue(String data) {
        Node<String> node = new Node<String>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
            length++;
        }
    }
    
    /**
     * Desencola los dato al principio de la lista el elemento menos reciente.
     * @return string
     */
    public String dequeue() {
        if (head != null) {
            Node<String> first = head;
            head = head.getNext();
            first.setNext(null);
            length--;
            return first.getData();
        }
        return null;
    }
    

    
    /**
     * Vacia la pila completamente.
     */
    public void makeEmpty() {
        if (head != null) {
            head = null;
            tail = null;
        }  
    }
        
    /*
    public void showInformation() {
        Node journeyStack =  head;
        String inverstQueue = "";
        while (journeyStack != null ) {
            infQueue += journeyStack.getData()+ "\n";
            journeyStack=journeyStack.getNext();
        }

        String chain[] = infQueue.split("\n ");
        for (int i=chain.length-1; i>=0; i--){
            inverstQueue += "\n"+chain[i];
            infQueue = "";
            JOptionPane.showMessageDialog(null, inverstQueue);
        }
    }
    */
}
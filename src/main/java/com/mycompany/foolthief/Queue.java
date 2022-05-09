package com.mycompany.foolthief;

import javax.swing.JOptionPane;

import GUI.MainInter;
import GUI.Text;


public class Queue extends List {
    String infQueue = "";
    
    Queue (){
        super();
    }

    public void makeEmpty() {
        if (!isEmpty()){
            head =  null;
            tail=null;
        }  
    }

    public boolean isEmpty() {
        if (head==null){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Encola el dato dado al final de la lista.
     * @param string
     */
    public void enqueue(String string) {
        Node<String> nodeNew = new Node<String>(string);
        nodeNew.getData();
        nodeNew.setNext(null);
        if (isEmpty()) {
            head=nodeNew;
            tail=nodeNew;
        } else {
            tail.setNext(nodeNew);
            tail = nodeNew;
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
            Text danger = new Text ("- "+inverstQueue+'\n');
            MainInter.addComponent(danger);
        }
    }
}

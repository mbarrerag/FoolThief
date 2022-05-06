package com.mycompany.foolthief;


public class Queue {
    private Node begQueue;
    private Node endQueue;
    String infQueue = "";
    int asdadas;
    
    public Queue (){
        begQueue= null;
        endQueue= null;
    }

    public void showInformation(){
        // Mostrar toda la informacion de la cola     
    }

    public void makeEmpty(){
                
    }

    public boolean isEmpty(){
        return begQueue == null;
    }
    
    public void enqueue(String dataQueue){
        Node nodeNew = new Node();
        nodeNew.dataQueue=nodeNew;
        nodeNew.dataQueue=null;  
    }   
    
    public int dequeue(){
        if (!isEmpty()){
            Stolen stolen =begQueue.st;
        }
    }
}

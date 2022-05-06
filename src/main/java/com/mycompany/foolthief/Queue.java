package com.mycompany.foolthief;


public class Queue extends List  {
    private Node begQueue;
    private Node endQueue;
    String infQueue = "";
  
    
    public Queue (){
        super();
        begQueue= null;
        endQueue= null;
    }

    public void showInformation(){
          Node journey<>=head;
          String InverstQueue="";
         
          while (journey!=null ){
          infQueue=journey.g;
              
          }
          
    }

    public void makeEmpty(Attempt attempt){
    if (!isEmpty()){
       Node fist = head;
       String InverstQueue;
       
      
      
    }
        
        
    }

    public boolean isEmpty(){
    if (begQueue==null){
        return true;
    }    else {
        return false;
    }
    }
    
    public void enqueue(Attempt attempt){
        Node<Attempt> nodeNew = new Node<Attempt>(attempt);
        nodeNew.setData(attempt);
       nodeNew.setNext(null);
       if(isEmpty()){
           head=nodeNew;
           tail=nodeNew;
       }{
        tail.setNext(nodeNew);
        tail=nodeNew;
       }
       
     length++;  
    }   
    
    public int dequeue(){
        if (!isEmpty()){
        
         
    
        }
        return Integer.MAX_VALUE;
    }
    
}

package com.mycompany.foolthief;

import javax.swing.JOptionPane;


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
          Node journey=head;
          String inverstQueue="";
         
          while (journey!=null ){
          infQueue += journey.getData()+ "\n";
          journey.getNext();
              
          }
          String chain[]=infQueue.split("\n ");
          for(int i=chain.length-1; i>=0; i--){
              inverstQueue+="\n"+chain[i];
              infQueue="";
              JOptionPane.showMessageDialog(null, inverstQueue);
          }
          
    }

    public void makeEmpty(){
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
        nodeNew.getData();
       nodeNew.setNext(null);
       if(isEmpty()){
           head=nodeNew;
           tail=nodeNew;
       }else {
        tail.setNext(nodeNew);
        tail=nodeNew;
        length++;  
    
    }
       
    }
 
    
}

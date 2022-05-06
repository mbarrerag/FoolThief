package com.mycompany.foolthief;

import javax.swing.JOptionPane;


public class Queue extends List  {
 
    String infQueue = "";
  
    
    public Queue (){
        super();
        head= null;
        tail= null;
    }

    public void showInformation(){
          Node journeyStack=head;
          String inverstQueue="";
         
          while (journeyStack!=null ){
          infQueue += journeyStack.getData()+ "\n";
          journeyStack.getNext();
              
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
       head=null;
       tail=null;
       
      
      
    }
        
        
    }

    public boolean isEmpty(){
    if (head==null){
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
 
    
}//Como mandar un objeto 

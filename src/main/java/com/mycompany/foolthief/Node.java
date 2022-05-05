/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foolthief;

public class Node {
    
      public Node nextNode;
      public Node previousNode;
      Stolen stolen;
      String  dataQueue;
      int a;

    public String getDataQueue(Stolen stolen) {
        return dataQueue;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
  

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public FoolThief getStolen() {
        return Stolen;
    }

    public void setStolen(FoolThief Stolen) {
        this.Stolen = Stolen;
    }
      



 

}


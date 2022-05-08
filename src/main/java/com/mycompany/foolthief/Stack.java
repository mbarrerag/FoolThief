package com.mycompany.foolthief;




public class Stack extends List {
    Stack() {
        super();
    }
    
    public void pop() {
        if (head != null) {
            Node first = head;
            head = head.getNext();
            first.setNext(null);
            length--;
        }
    }
    
    public void push(Attempt attempt) {
        Node<Attempt> node = new Node<Attempt>(attempt);
        node.setNext(head);
        head = node;
        length++;
    }

    public String peek() {
        return (String) head.getData();
    }
    
    public void makeEmptystack(){
        if (head != null){
            head=null;
            
        }
    }    
     /*
        public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }*/
     
    public void showInformationStack(){
        Node journeyStack = head;
        String inverstQueue = "";
        while(journeyStack != null){
         inverstQueue +=  journeyStack.getData() + "\n";
         journeyStack=journeyStack.getNext();
        }
        //JOptionPane.showMessageDialog(null, inverstQueue);
        inverstQueue = "";
    }     
    
}


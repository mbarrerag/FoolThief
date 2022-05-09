package com.mycompany.foolthief;


public class Stack extends List {
    Stack() {
        super();
    }
    
    /**
     * Elimina el elemento mas núevo de la pila.
     * @return attempt: Instancia de tipo Attempt más reciente.
     */
    public Attempt pop() {
        if (head != null) {
            Node<Attempt> first = head;
            head = head.getNext();
            first.setNext(null);
            length--;
            return first.getData();
        }
        return null;
    }
    
    /**
     * Inserta en la pila un elemento Attempt.
     * @param attempt: Instancia de tipo Attempt
     */
    public void push(Attempt attempt) {
        Node<Attempt> node = new Node<Attempt>(attempt);
        node.setNext(head);
        head = node;
        length++;
    }
    
    /**
     * Vacia la pila completamente.
     */
    public void makeEmpty() {
        if (head != null){
            head = null;
        }
    }
}


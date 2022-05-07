package com.mycompany.foolthief;


public class LinkedList {
    /**
     * Reportes de robo - Lista Doblemente Enlazada
     * Lista que guarda instancias de la clase Stolen (reporte de robo).
     */
    private Node<Stolen> head;
    private Node<Stolen> tail;
    private int length;

    LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }
    /**
     * Retorna el número de elementos contenidos en la lista.
     * @return int: tamaño de la lista
     */
    public int size(){
        return length;
    }
    
    /**
     * Verifica si la lista no tiene elementos.
     * @return boolean:
     *      <ul>
     *          <li>true: la lista esta vacia</li>
     *          <li>false: la lista no esta vacia</li>
     *      </ul>
     */
    public boolean itsEmpty(){
        return (head == null) && (tail == null);
    }

    public void addFirst (Stolen stolen){
        Node<Stolen> node = new Node<Stolen>(stolen);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }
    
    /**
     * Agrega un elemento al final de la lista por defecto.
     * @param stolen: Instancia de tipo Stolen.
     */
    public void add(Stolen stolen){
        Node<Stolen> node = new Node<Stolen>(stolen);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        length++;
    }
    
    /**
     * Recarga del método add(Stolen stolen), ahora recibe un indice
     * y lo inserta en este.Recorre la lista hasta anterior al índice e inserta adelante.
     * @param stolen: Instancia de tipo Stolen.
     * @param index: Índice donde insertará.
     */
    public void add(Stolen stolen, int index ){
        if (index == length) {
            add(stolen);
        } else if (index == 0) {
            addFirst(stolen);
        } else if (index > 0 && index <= (length - 1)) {
            Node<Stolen> node = new Node<Stolen>(stolen);
            if (head == null) {
                head = node;
                tail = head;
            } else {
                Node<Stolen> pointer = head;
                int counter = 0;
                while ((counter < (index - 1)) && (pointer.getNext() != null)) {
                    pointer = pointer.getNext();
                    counter++;
                }
                node.setNext(pointer.getNext());
                pointer.getNext().setPrev(node);
                pointer.setNext(node);
                node.setPrev(pointer);
            }
        }
    }
    
    /**
     * Retorna el objeto Stolen que se encuentra contenido en el primer nodo.
     * @return objeto Stolen
     */
    public Stolen getFirst() {
        if (head != null) {
            return head.getData();
        } else {
            return null;
        }
    }
    
    /**
     * Retorna el objeto Stolen que se encuentra contenido en el i-ésimo nodo.
     * @param index
     * @return objeto Stolen
     */
    public Stolen get(int index) {
        if (index == length) {
            getLast();
        } else if (index >= 0 && index <= (length - 1)) {
            Node<Stolen> pointer = head;
            int counter = 0;
            while ((counter < index) && (pointer.getNext() != null)) {
                pointer = pointer.getNext();
                counter++;
            }
            if (counter == index) {
                return pointer.getData();
            } else {
                return null;
            }
        }
        return null;
    }
    
    /**
     * Retorna el objeto Stolen que se encuentra contenido en el último nodo.
     * @return Objeto Stolen
     */
    public Stolen getLast() {
        if (tail != null) {
            return tail.getData();
        } else {
            return null;
        }
    }
    
    public Stolen browseById(String id) {
        
    }
    
    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst(){
        if (head != null) {
            Node<Stolen> first = head;
            head = head.getNext();
            head.setPrev(null);
            first.setNext(null);
            length--;
        }
    }
    
    /**
     * Elimina el elemento alojado en el i-ésimo nodo de la lista.
     * @param index: Indice del elemento que se borrará.
     */
    public void remove(int index){
        if (head != null) { 
            if (index == 0) {
                removeFirst();
            } else if (index == length - 1) {
                removeLast();
            } else if ((index > 0) && (index < length)) {
                Node<Stolen> pointer = head;
                int counter = 0;
                while ((counter < index - 1) && (pointer.getNext() != null)) {
                    pointer = pointer.getNext();
                    counter++;
                }
                Node<Stolen> temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.getNext().setPrev(pointer);
                temp.setNext(null);
                temp.setPrev(null);
            }
        }
    }
    
    /**
     * Eliminá el último elemento contenido en la lista.
     */
    public void removeLast(){
        if (head != null) {
            Node<Stolen> last = tail;
            tail = tail.getPrev();
            last.setPrev(null);
            length--;
        }
    }
    
    // A continuación métodos para pruebas (impresion en consola)
    public void displayElements() {
        if (head == null) {
            System.out.println("No Elements");
        } else {
            Node<Stolen> pointer = tail;
            while (pointer != null) {
                Stolen actualData = pointer.getData();
                String id = actualData.getId();
                String name = actualData.getName();
                String lastname = actualData.getLastname();
                String date = actualData.getDate();
                String hour = actualData.getHour();
                String object = actualData.getObject();
                String place = actualData.getPlace();
                String neighborhood = actualData.getNeighborhood();
                String description = actualData.getDescription();
                String modusOperandi = actualData.getModusOperandi();
                System.out.println("ID: " + id);
                System.out.println("name: " + name);
                System.out.println("lastname: " + lastname);
                System.out.println("date: " + date);
                System.out.println("hour: " + hour);
                System.out.println("object: " + object);
                System.out.println("place: " + place);
                System.out.println("neighborhood: " + neighborhood);
                System.out.println("description: " + description);
                System.out.println("modus operandi: " + modusOperandi);
                System.out.println("");
                pointer = pointer.getPrev();
            }
        }
    }
    
    public void displayIdElements() {
        if (head == null) {
            System.out.println("No Elements");
        } else {
            Node<Stolen> pointer = head;
            while (pointer != null) {
                Stolen actualData = pointer.getData();
                String id = actualData.getId();
                System.out.println(id);
                pointer = pointer.getNext();
            }
        }
    }
}


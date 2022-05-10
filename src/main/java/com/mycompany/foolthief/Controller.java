package com.mycompany.foolthief;

import GUI.MainInter;
/**
 * Clase la cual permite recibir recibir la informacion de la interfaz
 * 
 */
public class Controller {
    static Stack stack;
    DoubleLinkedList list;
    Queue queue;
    DynamicArray array;
    int u = 0;
    String idFl = "";
    public static int id = 0;
    String v = "";
    /**
     * Crea objetos de las diferentes estructuras de datos 
     */
    public Controller (){
        stack = new Stack();
        list = new DoubleLinkedList();
        queue = new Queue();
        array = new DynamicArray();
    }
     /**
      * Ingresa la informacion hacia la clase Stolen
      * @param name Nombre recbido en la interfaz.
      * @param date Fecha recibida en la interfaz.
      * @param hour Hora recibida en la interfaz.
      * @param object Objeto robado, recibido en la interfaz.
      * @param place  Lugar del robo, recibido en la interfaz.
      * @param neightborhood Localidad, recibida en la interfaz.
      * @param description Descripcion del robo, recibido en la interfaz.
      * @param modusOperandi modusOperandi del robo, recibido en la interfaz.
      */
    public void insertData(String name, String date, String hour, String object, String place, String neightborhood, String description, String modusOperandi) {
        counterId();
        Stolen stolen = new Stolen(idFl);
        stolen.setName(name);
        stolen.setDate(date);
        stolen.setHour(hour);
        stolen.setObject(object);
        stolen.setPlace(place);
        stolen.setNeighborhood(neightborhood);
        stolen.setDescription(description);
        stolen.setModusOperandi(modusOperandi);
        list.add(stolen);
        
        Attempt attempt = new Attempt();
        attempt.setDate(date);
        attempt.setHour(hour);
        attempt.setNeighborhood(neightborhood);
        attempt.setModusOperandi(modusOperandi);
        attempt.setObject(object);
        attempt.setId(idFl);
        stack.push(attempt);
        id++;
    }
        /**
         * Crea un identificador unico con un prefijo F
         * @return Identificador unico de cada usuario 
         */
    public String counterId(){
        u++;
        idFl = "FL#"+id;
        array.addElement(idFl);
        return idFl;
    }
        /**
         * 
         */
    public static void readStack() {
        int n = stack.size();
        int counter = 0;
        while (counter < n) {
            Attempt element = stack.pop();
            MainInter.addLabel(element.getId(), element.getDate(), element.getHour(), element.getNeighborhood(), element.getObject(), element.getModusOperandi());
            counter++;
        }
    }
    /**
     * Permite eliminar el ultimo dato ingresado
     */
    public void deleteData(){
        list.removeLast();
        array.Eliminar();
        id--;
    }
    /**
     * Permite realizar una modificacion de la informacion ingresada
     */
    public void modificarData(){
        deleteData();
    }
}

        
      
    
    


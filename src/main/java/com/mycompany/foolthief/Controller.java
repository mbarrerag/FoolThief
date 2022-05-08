package com.mycompany.foolthief;
    
   
public class Controller {
    Stack stack;
    LinkedList list;
    Queue queue;
    DynamicArray array;
    int idNumber = 0;
    public Controller (){
        stack = new Stack();
        list = new LinkedList();
        queue = new Queue();
        array = new DynamicArray();
    }
     
    public void insertData(String name, String date, String hour, String object, String place, String neightborhood, String description, String modusOperandi) {
        
        String newId;
        newId=generateId();
        Stolen stolen = new Stolen(newId);
        stolen.setName(name);
        stolen.setDate(date);
        stolen.setHour(hour);
        stolen.setObject(object);
        stolen.setPlace(place);
        stolen.setNeighborhood(neightborhood);
        stolen.setDescription(description);
        stolen.setModusOperandi(modusOperandi);
        list.add(stolen);
        System.out.println(stolen.getName());
        System.out.println(stolen.getDate());
        System.out.println(stolen.getHour());
        System.out.println(newId);
        System.out.println(stolen.getDescription());
        System.out.println(stolen.getModusOperandi());
        System.out.println(stolen.getObject());
        System.out.println(stolen.getPlace());
        System.out.println(stolen.getNeighborhood());
        
        
        
        
    }  
    
    public String generateId() {
        idNumber++;
        String location = "Fl";
        String id = location + idNumber;
        array.addElement(id);
        return id;
     }
    
    
}

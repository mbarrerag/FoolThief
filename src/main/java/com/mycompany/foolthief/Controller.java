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
        
        int newId;
        newId=array.generateId();
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
        System.out.println("******************");
        Attempt attempt = new Attempt();
        attempt.setDate(date);
        attempt.setHour(hour);
        attempt.setNeighborhood(neightborhood);
        attempt.setModusOperandi(modusOperandi);
        attempt.setObject(object);
        attempt.setId(idNumber);
        stack.push(attempt);
        System.out.println(attempt.getDate());
        System.out.println(attempt.getHour());
        System.out.println(attempt.getId());
        System.out.println(attempt.getModusOperandi());
        System.out.println(attempt.getNeighborhood());
        System.out.println(attempt.getModusOperandi());
        System.out.println("******************");
        
        
    }  
    
}
        
      
    
    


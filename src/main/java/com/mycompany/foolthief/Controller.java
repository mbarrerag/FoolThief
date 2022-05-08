package com.mycompany.foolthief;


public class Controller {
    Stack stack;
    LinkedList list;
    Queue queue;
    DynamicArray array;
    int u=0;
    String w = "";
    int id = 0;
    String v="";
    public Controller (){
        
        stack = new Stack();
        list = new LinkedList();
        queue = new Queue();
        array = new DynamicArray();
    }
     
    public void insertData(String name, String date, String hour, String object, String place, String neightborhood, String description, String modusOperandi) {
        CounterId();
        Stolen stolen = new Stolen(w);
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
        System.out.println(w);
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
        attempt.setId(w);
        stack.push(attempt);
        System.out.println(attempt.getDate());
        System.out.println(attempt.getHour());
        System.out.println(attempt.getId());
        System.out.println(attempt.getModusOperandi());
        System.out.println(attempt.getNeighborhood());
        System.out.println(attempt.getModusOperandi());
        System.out.println("******************");
        id++;
    }
        
        public String CounterId(){
           u=0;
           u++;
           w = "F"+id;
         
           array.addElement(w);
         
        return w;
       
        }
    }

        
      
    
    


package com.mycompany.foolthief;

import GUI.MainInter;


public class Controller {
    static Stack stack;
    LinkedList list;
    Queue queue;
    DynamicArray array;
    int u = 0;
    String w = "";
    int id = 0;
    String v = "";
    
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
        
        Attempt attempt = new Attempt();
        attempt.setDate(date);
        attempt.setHour(hour);
        attempt.setNeighborhood(neightborhood);
        attempt.setModusOperandi(modusOperandi);
        attempt.setObject(object);
        attempt.setId(w);
        stack.push(attempt);
        id++;
    }
        
    public String CounterId(){
        u=0;
        u++;
        w = "F"+id;
        array.addElement(w);
         return w;
    }
    
    public static void readStack() {
        Stack auxiliar = new Stack();
        int n = stack.size();
        int counter = 0;
        while (counter < n) {
            Attempt element = stack.pop();
            MainInter.addLabel(element.getId(), element.getDate(), element.getHour(), element.getNeighborhood(), element.getObject(), element.getModusOperandi());
            auxiliar.push(element);
            counter++;
        }
        
        if (counter == auxiliar.size()) {
            while (counter > 0) {
                stack.push(auxiliar.pop());
                counter--;
            }
        }
    }
}

        
      
    
    


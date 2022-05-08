package com.mycompany.foolthief;


public class Controller {
    Stack stack;
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
        
        public void readStack() {
            Stack auxiliar = new Stack();
            Attempt element = stack.pop();
            int counter = 0;
            while (element != null) {
                System.out.println(element.getId()); //toma los datos que necesite
                auxiliar.push(element); // Inserta en la nueva pila
                counter++;
            }
            // Rellena la pila principal
            if (counter == auxiliar.size()) {
                while (counter > 0) {
                    stack.push(auxiliar.pop());
                    counter--;
                }
            }
        }
    }

        
      
    
    


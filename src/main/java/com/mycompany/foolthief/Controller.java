/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        
        
        
    }  
    
    public void generateId() {
        idNumber++;
        String location = "Fl";
        String id = location + idNumber;
        array.addElement(id);
    }
    
}

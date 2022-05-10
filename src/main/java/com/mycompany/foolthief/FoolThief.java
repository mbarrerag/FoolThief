package com.mycompany.foolthief;

import GUI.MainInter;
import static GUI.MainInter.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FoolThief {
    public static String[] strng;
    public static String[] lineas;
    public static String newName, newDate, newHour, newObject, newPlaces, newNeightborhood, newDescripcion, newModusOperandi;
    public static int u=0; 
    public static int d = 8;
    public static int w =0;
    public static int y=0; 
    public static String texto = "";
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

   


    }
  
        
     
        
    
    

    public static void loadData () throws FileNotFoundException, IOException{
           
           try{
            
       File doc = new File("C:\\Users\\Stepe\\Downloads\\datospruebas\\Nueva carpeta\\DatosDePrueba.txt");

          BufferedReader obj = new BufferedReader(new FileReader(doc));
            String temp = "";
            String bfRead;
            while((bfRead = obj.readLine()) != null){ 
             
                temp = temp + bfRead; 
            }
            
            texto = temp;
            System.out.println(texto);
        }catch(Exception e){ 
            
        }
        
        

        for (int i = 0; i < 800; i++) {
          lineas  = texto.split(",");
            if (lineas == null) {
                break;
              
            }
            
            
        }
 
      
        
          
     for(int i=0;i<100;i++){  
            
      y++;
         
       for (int c = w; c < y; c++) {
             newName = lineas[c];
           
          
       }
       y++;
       w++;
        for (int c = w; c < y; c++) {
            newDate = lineas[c];
      
 

        }
        y++;
       w++;
        for (int c = w; c < y; c++) {
            newHour = lineas[c];
       
        }
         y++;
       w++;
      for (int c = w; c < y; c++) {
             newObject = lineas[c];
         
       }
       y++;
       w++;
       for (int c = w; c <y; c++) { 
        newPlaces = lineas[c];
  
       }
        y++;
       w++;
       for (int c = w; c < y; c++) {
       newNeightborhood = lineas[c];
     
       }
        y++;
       w++;
       for (int c = w; c < y; c++) { 
       newDescripcion = lineas[c];
    
       }
       
       w++;
       y++;
       for (int c = w; c < y; c++) {
       newModusOperandi = lineas[c];
          
   
       
       }
     
  
     
         System.out.println(w+"w"+y+"c");
     
       
       
         
      
     
      
        
       MainInter.controller.insertData(newName, newDate, newHour, newObject, newPlaces, newNeightborhood, newDescripcion, newModusOperandi);
       MainInter.top.setNeighborhood(newNeightborhood);
       MainInter.top.setObject(newObject);
       MainInter.top.countInTop();
       Controller.readStack();
       u++; 
     }
       
      }
    }

    

    
    
    
    


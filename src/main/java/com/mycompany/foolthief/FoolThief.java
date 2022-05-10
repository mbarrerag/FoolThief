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

       loadData ();


    }
  
        
     
        
    
    

    public static void loadData () throws FileNotFoundException, IOException{
           
           try{
            
       File doc = new File("C:\\Users\\Stepe\\Downloads\\datospruebas\\DatosDePrueba.txt");

          BufferedReader obj = new BufferedReader(new FileReader(doc));
            String temp = "";
            String bfRead;
            while((bfRead = obj.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            texto = temp;
            System.out.println(texto);
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        

        for (int i = 0; i < 12; i++) {
          lineas  = texto.split(",");
            if (lineas == null) {
                break;
              
            }
            
            
        }System.out.println(lineas[10]);
 
      
        
          
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
       for (int c = w; c < y; c++) {
       newModusOperandi = lineas[c];
   
       
       }
      
         System.out.println("y"+y+"W"+w);
       MainInter.controller.insertData(newName, newDate, newHour, newObject, newPlaces, newNeightborhood, newDescripcion, newModusOperandi);
       Controller.readStack();
       u++; 
     }
       
      }
    }

    

    
    
    
    


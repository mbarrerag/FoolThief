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
    public String leerTxt(){ //direccion del archivo
        
     
        
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
        
        return texto;
        
    }

    public static void loadData () throws FileNotFoundException, IOException{
           
       leerText();
        

        for (int i = 0; i < 16; i++) {
          lineas  = texto.split(",");
            if (lineas == null) {
                break;
              
            }
            
            
        }System.out.println(lineas[10]);
 
        /**
         *  int u=0; 
           int d = 8;
           int w =0;
           int y=0;
         */
        
          
     for(int i=0;i<2;i++){  
            
      y++;
         
       for (int c = w; c < y; c++) {
             newName = lineas[c];
             System.out.println("w");
          
       }
       y++;
       w++;
        for (int c = w; c < y; c++) {
            newDate = lineas[c];
        System.out.println("2");
 

        }
        y++;
       w++;
        for (int c = w; c < y; c++) {
            newHour = lineas[c];
            System.out.println("3"); System.out.println("z");
        }
         y++;
       w++;
      for (int c = w; c < y; c++) {
             newObject = lineas[c];
             System.out.println("4");
       }
       y++;
       w++;
       for (int c = w; c <y; c++) { 
        newPlaces = lineas[c];
       System.out.println("5");
       }
        y++;
       w++;
       for (int c = w; c < y; c++) {
       newNeightborhood = lineas[c];
       System.out.println("6");
       }
        y++;
       w++;
       for (int c = w; c < y; c++) { 
       newDescripcion = lineas[c];
       System.out.println("7");
       }
       
       w++;
       for (int c = w; c < y; c++) {
       newModusOperandi = lineas[c];
       System.out.println("8");
       
       }
      
         System.out.println("y"+y+"W"+w);
       MainInter.controller.insertData(newName, newDate, newHour, newObject, newPlaces, newNeightborhood, newDescripcion, newModusOperandi);
       Controller.readStack();
       u++; 
     }
       
      }
    }

    

    
    
    
    


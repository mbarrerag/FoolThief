/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foolthief;

import java.util.ArrayList;

/**
 *
 * @author Stepe
 */
public class DynamicArray {
    String arrayList[];
    int sizeofarray=0;
    private int count;
  
    public DynamicArray(){
    arrayList= new String[1];
    count=0;
    sizeofarray=1;
    }
     public void addElement(String infDynamic){
        if (count == sizeofarray){
        growSize();      
        }
        arrayList[count]=infDynamic;
        count++;
    }
     public void growSize(){  //Metodo para hacer crecer el arreglo 
         String temp[]=null;
         if(count == sizeofarray){ //Si el arreglo se encuentra llego creamos un arreglo con el doble de la capacidad
             temp = new String[sizeofarray * 2];
             {
                 for(int i=0; i<sizeofarray;i++){
                     temp[i]=arrayList[i]; //Copiamos los elementos del viejo array
                 }
             }
         }
         arrayList=temp;
         sizeofarray=sizeofarray*2; //Se pasan los datos que fueron copiados al arreglo y se actualiza la capacidad del mismo 
     }
     public void addElementAt(int index, String infDynamic){ //Clase la cual puede eliminar un elemntos en cualquier index
         if(count== sizeofarray){
             growSize();
             
         }
         for(int i=count-1;i>index;i--){
             
       arrayList[i+1]=arrayList[i];
         }
         arrayList[index]= infDynamic;
         count++;
         //
       
                     
                     
                 }
     public String showElements(){
          String resoult = "";
          for (int i = 0; i < sizeofarray; i++){   
   
 resoult += (arrayList[i] + " ");   

}
          System.out.println(resoult);
          return resoult;    
      }
             }
         
         
     
    
  
        
        
    
    
   


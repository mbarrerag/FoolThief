/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foolthief;

/**
 *
 * @author Stepe
 */
public class Tops {
    private String neighborhood;
    private String object;
    Queue queue = new Queue();
    public int[] topObjecs = new int[6];
    public int[] topPlaces= new int[20];
    public int maxPlaces = 0;
    public int maxObjects = 0;
   
    public void setTopObjecs(int[] topObjecs) {
        this.topObjecs = topObjecs;
    }

    public void setTopPlaces(int[] topPlaces) {
        this.topPlaces = topPlaces;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
    
  
    
  
  public void TopPlaces() {
         
         
         
       switch (neighborhood) {
        
       case "Usme" : topPlaces[0]++;
       break;
       case "Chapinares" : topPlaces[1]++ ;
       break;
       case "Santa Fe" :  topPlaces[2]++;
       break;
       case "San Cristobal" : topPlaces[3]++ ;
       break;
       case "Tunjuelito" :  topPlaces[4]++;
       break;
       case "Bosa" : topPlaces[5]++ ;
       break;
       case "Kennedy" :  topPlaces[6]++;
       break;
       case "Fontibon" : topPlaces[7]++ ;
       break;
       case "Engativa" :  topPlaces[8]++;
       break;
       case "Suba" : topPlaces[9]++ ;
       break;
       case "Barrios Unidos" :  topPlaces[10]++;
       break;
       case "Teusaquillo" : topPlaces[11]++ ;
       break;
       case "Los Martires" :  topPlaces[12]++;
       break;
       case "Antonio Nariño" : topPlaces[13]++ ;
       break;
       case "Puente Aranda" :  topPlaces[14]++;
       break;
       case "La Candelaria" : topPlaces[15]++ ;
       break;
       case "Rafael Uribe Uribe" :  topPlaces[16]++;
       break;
       case "Cuidad Bolivar" : topPlaces[17]++;
       break;
       case "SumaPaz" :  topPlaces[18]++;
       break;
       case "Usaquen" :  topPlaces[19]++;
       break;
         }
  }
    public void countTopPlaces() {
        queue.makeEmpty();
        TopPlaces();
        int u=0;
      while(u<6){
          u++;
      
      for (int i=0;i<20;i++){
        if(maxPlaces<topPlaces[i]){
            maxPlaces = topPlaces[i];
        }
      }
       if(maxPlaces == topPlaces[0]){
         queue.enqueue("Usme");
         topPlaces[0]=0;
       }
       if(maxPlaces == topPlaces[1]){
       queue.enqueue("Chapinero");
       topPlaces[1]=0;
       }
       if(maxPlaces == topPlaces[2]){
       queue.enqueue("Santa Fe");
       topPlaces[2]=0;
       }
       if(maxPlaces == topPlaces[3]){
       queue.enqueue("San Cristobal");
       topPlaces[3]=0;
       }
       if(maxPlaces == topPlaces[4]){
       queue.enqueue("Tunjuelito");
       topPlaces[4]=0;
       }
       if(maxPlaces == topPlaces[5]){
       queue.enqueue("Bosa");
       topPlaces[5]=0;
       }
       if(maxPlaces == topPlaces[6]){
         queue.enqueue("Kennedy");
       topPlaces[6]=0;
       }
       if(maxPlaces == topPlaces[7]){
       queue.enqueue("Fontibon");
       topPlaces[7]=0;
       }
       if(maxPlaces == topPlaces[8]){
       queue.enqueue("Engativa");
       topPlaces[8]=0;
       }
       if(maxPlaces == topPlaces[9]){
       queue.enqueue("Suba");
       topPlaces[9]=0;
       }
       if(maxPlaces == topPlaces[10]){
       queue.enqueue("Barrios Unidos");
       topPlaces[10]=0;
       }
       if(maxPlaces == topPlaces[11]){
       queue.enqueue("Teusaquillo");
       topPlaces[11]=0;
       }
       if(maxPlaces == topPlaces[12]){
         queue.enqueue("Los Martires");
       topPlaces[12]=0;
       }
       if(maxPlaces == topPlaces[13]){
       queue.enqueue("Antonio Nariño");
       topPlaces[13]=0;
       }
       if(maxPlaces == topPlaces[14]){
       queue.enqueue("Puente Aranda");
       topPlaces[14]=0;
       }
       if(maxPlaces == topPlaces[15]){
       queue.enqueue("La Candelaria");
       topPlaces[15]=0;
       }
       if(maxPlaces == topPlaces[16]){
       queue.enqueue("Rafael Uribe");
       topPlaces[16]=0;
       }
       if(maxPlaces == topPlaces[17]){
       queue.enqueue("Ciudad Bolivar");
       topPlaces[17]=0;
       }
       if(maxPlaces == topPlaces[18]){
         queue.enqueue("Sumapaz");
       topPlaces[18]=0;
       }
       if(maxPlaces == topPlaces[19]){
       queue.enqueue("Usaquen");
       topPlaces[19]=0;
       }
    }
       
       
     queue.showInformation();
     }
    
    
     public void TopObjects() {
         
         
         
       switch (object) {
        
       case "Carro" : topObjecs[0]++;
       break;
       case "Moto" : topObjecs[1]++ ;
       break;
       case "Bolso" :  topObjecs[2]++;
       break;
       case "Celular" : topObjecs[3]++ ;
       break;
       case "Computador" :  topObjecs[4]++;
       break;
       case "Bicicleta" : topObjecs[5]++ ;
       break;
        }
  }
    public void countTopObjects() {
        queue.makeEmpty();
        TopObjects();
        int u=0;
        while(u<6){
          u++;
      
      for (int i=0;i<6;i++){
        if(maxObjects<topObjecs[i]){
            maxObjects = topObjecs[i];
        }
      }
       if(maxObjects == topObjecs[0]){
         queue.enqueue("Carro");
        topObjecs[0]=0;
       }
       if(maxObjects == topObjecs[1]){
       queue.enqueue("Moto");
       topObjecs[1]=0;
       }
       if(maxObjects == topObjecs[2]){
       queue.enqueue("Bolso");
       topObjecs[2]=0;
       }
       if(maxObjects == topPlaces[3]){
       queue.enqueue("Celular");
       topObjecs[3]=0;
       }
       if(maxObjects == topPlaces[4]){
       queue.enqueue("Computador");
       topObjecs[4]=0;
       }
       if(maxObjects == topPlaces[5]){
       queue.enqueue("Bicicletas");
       topObjecs[5]=0;
       }
       
    }
       
       
     queue.showInformation();
     }
 
    
     
}   
  

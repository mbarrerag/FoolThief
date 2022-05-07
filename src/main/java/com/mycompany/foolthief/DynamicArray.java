package com.mycompany.foolthief;


public class DynamicArray {
   
    String arrayList[];
    int sizeOfArray = 0 ;
    private int count;
  
    public DynamicArray() {
        arrayList = new String [1];
        count = 0;
        sizeOfArray = 1;
    }
     
    public void addElement(String infDynamic) {
        if (count == sizeOfArray) {
            growSize();      
        }
        arrayList[count] = infDynamic;
        count++;
    }
     
    public void growSize() { //Metodo para hacer crecer el arreglo 
        String temp[] = null;
        if (count == sizeOfArray) { //Si el arreglo se encuentra llego creamos un arreglo con el doble de la capacidad
            temp = new String[sizeOfArray * 2];
        }
        for (int i = 0; i<sizeOfArray;i++) {
            temp[i] = arrayList[i]; //Copiamos los elementos del viejo array
        }
        arrayList = temp;
        sizeOfArray = sizeOfArray*2; //Se pasan los datos que fueron copiados al arreglo y se actualiza la capacidad del mismo 
    }
     
    public void addElementAt(String infDynamic, int index) { //Clase la cual puede eliminar un elemntos en cualquier index
        if (count == sizeOfArray){
            growSize();
        }
        for (int i=count-1; i>index; i--) {
            arrayList[i+1] = arrayList[i];
        }
        arrayList[index] = infDynamic;
        count++;
    }
     
    public String showElements() {
        String result = "";
        for (int i = 0; i < sizeOfArray; i++){   
            result += (arrayList[i] + " ");   
        }
        return result;
    }
    
}
         
         
     
    
  
        
        
    
    
   


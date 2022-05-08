package com.mycompany.foolthief;


public class DynamicArray {
   
    int arrayList[];
    int sizeOfArray = 0 ;
    private int count;
  int id=1;
    public DynamicArray() {
        arrayList = new int [10];
        count = 0;
        sizeOfArray = 10;
    }
    
     
    
    public void addElement(int infDynamic) {
        
        if (count == sizeOfArray) {
            growSize();      
        }
        arrayList[count] = infDynamic+1;
        count++;
    }
     
    public void growSize() { //Metodo para hacer crecer el arreglo 
        int temp[] = null;
        if (count == sizeOfArray) { //Si el arreglo se encuentra llego creamos un arreglo con el doble de la capacidad
            temp = new int[sizeOfArray * 2];
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
        //arrayList[index] = infDynamic;
        count++;
    }
     
    public String showElements() {
        String result = "";
        for (int i = 0; i < sizeOfArray; i++){   
            result += (arrayList[i] + " ");   
        }
        return result;
    }
       public int generateId() {
       
        
         id++;
        System.out.println(id++);
        addElement(id++);
        return id;
     }
    
}
         
         
     
    
  
        
        
    
    
   


package com.mycompany.foolthief;


public class DynamicArray {
    int id=0;
    int u=1;
    String arrayList[];
    int sizeofarray=0;
    private int count;
  
    public DynamicArray () {
        arrayList= new String[2];
        count=0;
        sizeofarray=1;
    }
    
    /**
     * Agrega un elemento al arreglo dinámico.
     * @param infDynamic: Dato de tipo String a insertar.
     */
    public void addElement(String infDynamic) {
        if (count == sizeofarray){
        growSize();      
        }
        arrayList[count]=infDynamic;
        count++;
    }
    
    /**
     * Inserta un elemento en i-ésimo espacio dado.
     * @param infDynamic: dato a insertar
     * @param index: indice del espacio a guardar el dato.
     */
    public void addElementAt(String infDynamic, int index) { //Clase la cual puede eliminar un elemntos en cualquier index
        if (count == sizeofarray) {
            growSize();
        }
        for (int i=count-1; i>index; i--) {
            arrayList[i+1]=arrayList[i];
        }
        //  arrayList[index]= infDynamic;
        count++;
    }
    
    /**
     * Aumenta el tamaño del arreglo a razón de 2.
     */
    public void growSize(){  //Metodo para hacer crecer el arreglo 
        String temp[] = null;
        if(count == sizeofarray){ //Si el arreglo se encuentra llego creamos un arreglo con el doble de la capacidad
            temp = new String[sizeofarray * 2];
            for (int i=0; i<sizeofarray;i++) {
                temp[i]=arrayList[i]; //Copiamos los elementos del viejo array
            }
        }
        arrayList=temp;
        sizeofarray=sizeofarray*2; //Se pasan los datos que fueron copiados al arreglo y se actualiza la capacidad del mismo 
    }
    
    
    public String showElements() {
        String result = "";
        for (int i = 0; i < sizeofarray; i++) {
            result += (arrayList[i] + " ");
        }
        System.out.println(result);
        return result;  
    }
     
    public int increase(){
        u++;
        return u;     
    }
}
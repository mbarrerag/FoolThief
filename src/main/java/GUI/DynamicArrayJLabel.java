package GUI;

import javax.swing.JLabel;


public class DynamicArrayJLabel {
    JLabel arrayList[];
    int sizeOfArray = 0 ;
    private int count;
    int id = 1;
    
    public DynamicArrayJLabel() {
        arrayList = new JLabel [10];
        count = 0;
        sizeOfArray = 10;
    }
    
    public void addElement(JLabel infDynamic) {
        if (count == sizeOfArray) {
            growSize();      
        }
        arrayList[count] = infDynamic;
        count++;
    }
     
    public void growSize() { //Metodo para hacer crecer el arreglo 
        JLabel[] temp = null;
        if (count == sizeOfArray) { //Si el arreglo se encuentra llego creamos un arreglo con el doble de la capacidad
            temp = new JLabel[sizeOfArray * 2];
        }
        for (int i = 0; i<sizeOfArray;i++) {
            temp[i] = arrayList[i]; //Copiamos los elementos del viejo array
        }
        arrayList = temp;
        sizeOfArray = sizeOfArray*2; //Se pasan los datos que fueron copiados al arreglo y se actualiza la capacidad del mismo 
    }
     
    public String showElements() {
        String result = "";
        for (int i = 0; i < sizeOfArray; i++){   
            result += (arrayList[i] + " ");   
        }
        return result;
    }
}
         
         
     
    
  
        
        
    
    
   


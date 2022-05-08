package com.mycompany.foolthief;


public class Tops {
    Queue queue = new Queue();
    private String neighborhood;
    private String object;
    public int[] topObjects = new int[6];
    public int[] topPlaces= new int[20];
   
    public void setTopObjects(int[] topObjects) {
        this.topObjects = topObjects;
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
  
    public void topPlaces() {
        switch (neighborhood) {
            case "Usme" -> topPlaces[0]++;
            case "Chapinares" -> topPlaces[1]++ ;
            case "Santa Fe" -> topPlaces[2]++;
            case "San Cristobal" -> topPlaces[3]++ ;
            case "Tunjuelito" -> topPlaces[4]++;
            case "Bosa" -> topPlaces[5]++ ;
            case "Kennedy" -> topPlaces[6]++;
            case "Fontibon" -> topPlaces[7]++ ;
            case "Engativa" -> topPlaces[8]++;
            case "Suba" -> topPlaces[9]++ ;
            case "Barrios Unidos" -> topPlaces[10]++;
            case "Teusaquillo" -> topPlaces[11]++ ;
            case "Los Martires" -> topPlaces[12]++;
            case "Antonio Nariño" -> topPlaces[13]++ ;
            case "Puente Aranda" -> topPlaces[14]++;
            case "La Candelaria" -> topPlaces[15]++ ;
            case "Rafael Uribe Uribe" -> topPlaces[16]++;
            case "Cuidad Bolivar" -> topPlaces[17]++;
            case "SumaPaz" -> topPlaces[18]++;
            case "Usaquen" -> topPlaces[19]++;
        }
    }
    
    
    public void countTopPlaces() {
        queue.makeEmpty();
        String[] ObjArray = {"Usme","Chapinero","Santa Fe","San Cristobal","Tunjuelito","Bosa","Kennedy","Fontibon","Engativa","Suba","Barrios Unidos","Teusaquillo","Los Martires","Antonio Nariño","Puente Aranda","La Calera","Rafael Uribe","Cuidad Bolivar","Sumapaz","Usaquen"};
        String[] auxiliar = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
        int[] arr = topPlaces;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    String temp2 = auxiliar[j];
                    auxiliar[j] = auxiliar[j + 1];
                    auxiliar[j + 1] = temp2;
                }
            }
        }
        for (int i=19; i>13; i--) {
            int index = Integer.parseInt(auxiliar[i]);
            queue.enqueue(ObjArray[index]);
        }
        queue.showInformation();
    }
    
    
    public void topObjects() {
        switch (object) {
            case "Carro" : topObjects[0]++;
            break;
            case "Moto" : topObjects[1]++ ;
            break;
            case "Bolso" :  topObjects[2]++;
            break;
            case "Celular" : topObjects[3]++ ;
            break;
            case "Computador" :  topObjects[4]++;
            break;
            case "Bicicleta" : topObjects[5]++ ;
            break;
        }
    }
    
    public void countTopObjects() {
        queue.makeEmpty();
        String[] ObjArray = {"Carro", "Moto", "Bolso", "Celular", "Computador", "Bicicleta"};
        String[] auxiliar = {"0", "1", "2", "3", "4", "5"};
        int[] arr = topObjects;
        int n = topObjects.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    String temp2 = auxiliar[j];
                    auxiliar[j] = auxiliar[j + 1];
                    auxiliar[j + 1] = temp2;
                }
            }
        }
        for (int i=19; i>13; i--) {
            int index = Integer.parseInt(auxiliar[i]);
            queue.enqueue(ObjArray[index]);
        }
        queue.showInformation();
    }
}   
  

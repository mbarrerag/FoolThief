package com.mycompany.foolthief;


public class Tops {
    Queue queue = new Queue();
    private String neighborhood;
    private String object;
    
    private int[] topNeighborhoods;
    private int[] topObjects;
    
    private String[] nArray;
    private String[] objArray;
    
    private String[] nAuxiliar;
    private String[] objAuxiliar;
    
    private int[] nCounter;
    private int[] objCounter;
    
    private String state;

    public Tops() {
        this.nArray = new String[]{"Usaquen", "Chapinero", "Santa Fe", "San Cristobal", "Usme", "Tunjuelito", "Bosa", "Kennedy", "Fontibon", "Engativa", "Suba", "Barrios Unidos", "Teusaquillo", "Los Martires", "Antonio Nariño", "Puente Aranda", "La Candelaria", "Rafael Uribe Uribe", "Ciudad Bolivar", "Sumapaz"};
        this.objArray = new String[]{"Billetera", "Celular", "Bolso", "Bicicleta", "Vehiculo", "Computador", "Papeles"};
        this.topNeighborhoods = new int[nArray.length];
        this.topObjects = new int[objArray.length];
        nAuxiliar = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
        objAuxiliar = new String[]{"0", "1", "2", "3", "4", "5", "6"};
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
    
    /**
     * Genera un conteo por localidad y objeto el número de reportes en una lista.
     */
    public void countInTop() {
        switch (neighborhood) {
            case "Usaquen" -> topNeighborhoods[0]++;
            case "Chapinero" -> topNeighborhoods[1]++;
            case "Santa Fe" -> topNeighborhoods[2]++;
            case "San Cristobal" -> topNeighborhoods[3]++;
            case "Usme" -> topNeighborhoods[4]++;
            case "Tunjuelito" -> topNeighborhoods[5]++;
            case "Bosa" -> topNeighborhoods[6]++;
            case "Kennedy" -> topNeighborhoods[7]++;
            case "Fontibon" -> topNeighborhoods[8]++;
            case "Engativa" -> topNeighborhoods[9]++;
            case "Suba" -> topNeighborhoods[10]++;
            case "Barrios Unidos" -> topNeighborhoods[11]++;
            case "Teusaquillo" -> topNeighborhoods[12]++;
            case "Los Martires" -> topNeighborhoods[13]++;
            case "Antonio Nariño" -> topNeighborhoods[14]++;
            case "Puente Aranda" -> topNeighborhoods[15]++;
            case "La Candelaria" -> topNeighborhoods[16]++;
            case "Rafael Uribe Uribe" -> topNeighborhoods[17]++;
            case "Ciudad Bolivar" -> topNeighborhoods[18]++;
            case "Sumapaz" -> topNeighborhoods[19]++;
        }
        switch (object) {
            case "Billetera" -> topObjects[0]++;
            case "Celular" -> topObjects[1]++;
            case "Bolso" -> topObjects[2]++;
            case "Bicicleta" -> topObjects[3]++;
            case "Vehiculo" -> topObjects[4]++;
            case "Computador" -> topObjects[5]++;
            case "Papeles" -> topObjects[6]++;
        }
    }
    
    /**
     * Ordena el número de robos por localidad y de la misma forma el arreglo auxiliar que los relaciona.
     */
    private void orderNeighborhoods() {
        // Bubble Sort
        int n = nCounter.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nCounter[j] > nCounter[j + 1]) {
                    int temp = nCounter[j];
                    nCounter[j] = nCounter[j + 1];
                    nCounter[j + 1] = temp;
                    // A continuación también organiza el array auxiliar para 
                    // conocer a que localidad correponde el número de robos organizado
                    String temp2 = nAuxiliar[j];
                    nAuxiliar[j] = nAuxiliar[j + 1];
                    nAuxiliar[j + 1] = temp2;
                }
            }
        }
    }
    
    /**
     * Este método se encarga de verificar si el arreglo de número de robos esta 
     * ordenado y encola el nombre de las localidades donde hubieron más robos.
     */
    public void countTopNeighborhoods() {
        nCounter = topNeighborhoods;
        nAuxiliar = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
        if (isOrdered(nCounter) == false) {
            // Vacia y rellena de nuevo la cola
            queue.makeEmpty();
            orderNeighborhoods(); // Organiza el arreglo nArray -> cantidad de robos
            int n = nArray.length;
            for (int i=n-1; i>n-7; i--) {
                int index = Integer.parseInt(nAuxiliar[i]);
                queue.enqueue(nArray[index]); // Inserta de acuerdo al número indice tambien organizado en la función orderNeighborhoods
            }
            queue.showInformation();   
        } 
    }
    
    /**
     * Ordena el número de objetos robados y de la misma forma el arreglo auxiliar que los relaciona.
     */
    private void orderObjects() {
        // Bubble Sort
        int n = objCounter.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (objCounter[j] > objCounter[j + 1]) {
                    int temp = objCounter[j];
                    objCounter[j] = objCounter[j + 1];
                    objCounter[j + 1] = temp;
                    // A continuación también organiza el array auxiliar para 
                    // conocer a que localidad correponde el número de objets robados organizado
                    String temp2 = objAuxiliar[j];
                    objAuxiliar[j] = objAuxiliar[j + 1];
                    objAuxiliar[j + 1] = temp2;
                }
            }
        }
    }
    
    /**
    * Este método se encarga de verificar si el arreglo de número de objetos robados 
    * esta ordenada y encola el nombre de las objetos que han sido más robados.
    */
    public void countTopObjects() {
        objCounter = topObjects;
        objAuxiliar = new String[]{"0", "1", "2", "3", "4", "5", "6"};
        for (int i=0; i<objArray.length; i++) {
            objAuxiliar[i] = String.valueOf(i);
        }
        if (isOrdered(objCounter) == false) {
            // Vacia y rellena de nuevo la cola
            queue.makeEmpty();
            orderObjects();
            int n = objArray.length;
            for (int i=n-1; i>n-7; i--) {
                int index = Integer.parseInt(objAuxiliar[i]);
                queue.enqueue(objArray[index]); // Inserta de acuerdo al número indice tambien organizado en la función orderNeighborhoods
            }
            queue.showInformation();  
        }
    }
    
    /**
     * Verifica si una lista esta ordenada.
     * @param array: arreglo a verificar
     * @return boolean: <ul>
     *                      <li>true: el arreglo está ordenado</li>
     *                      <li>false: el arreglo no está ordenado</li>
     *                  </ul>
     */
    private boolean isOrdered(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
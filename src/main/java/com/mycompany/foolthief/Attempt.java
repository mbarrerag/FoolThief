package com.mycompany.foolthief;

/**
 * 
 * 
 */
public class Attempt {
    
    private String id;
    private String neighborhood;
    private String object;
    private String date;
    private String hour;
    private String modusOperandi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setObject(String obcjet) {
        this.object = obcjet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getModusOperandi() {
        return modusOperandi;
    }

    public void setModusOperandi(String modusOperandi) {
        this.modusOperandi = modusOperandi;
    }    
}

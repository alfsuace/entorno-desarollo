package com.alfsuace.pccomponentes;

public class Storage {
    //-id Integer
    //-brand String
    //-capacity Integer
    //-frecuency Integer
    private Integer id;
    private String brand;
    private Integer capacity;
    private Integer frecuency;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setFrecuency(Integer frecuency) {
        this.frecuency = frecuency;
    }

    public Integer getFrecuency() {
        return frecuency;
    }
}

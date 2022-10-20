package com.alfsuace.pccomponentes;

public class Mouse {
    //-id Integer
    //-brand String
    //-dpis Integer
    //-color String

    private Integer id;
    private String brand;
    private Integer dpis;
    private String color;

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

    public void setDpis(Integer dpis) {
        this.dpis = dpis;
    }

    public Integer getDpis() {
        return dpis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

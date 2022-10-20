package com.alfsuace.pccomponentes;

public class Keyboard {
    //-id Integer
    //-brand String
    //-type String
    //-color String

    private Integer id;
    private String brand;
    private String type;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

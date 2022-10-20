package com.alfsuace.pccomponentes;

public class Screen {
    //-id Integer
    //-brand String
    //-type String
    //-inches Integer

    private Integer id;
    private String brand;
    private String type;
    private Integer inches;

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

    public void setInches(Integer inches) {
        this.inches = inches;
    }

    public Integer getInches() {
        return inches;
    }
}

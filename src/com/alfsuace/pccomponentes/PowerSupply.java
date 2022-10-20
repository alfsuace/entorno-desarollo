package com.alfsuace.pccomponentes;

public class PowerSupply {
    //-id Integer
    //-brand String
    //-power Integer
    //-quality String

    private Integer id;
    private String brand;
    private Integer power;
    private String quality;

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

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}

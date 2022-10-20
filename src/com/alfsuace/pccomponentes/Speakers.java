package com.alfsuace.pccomponentes;

public class Speakers {
    //-id Integer
    //-brand String
    //-format String
    //-rgb boolean

    private Integer id;
    private String brand;
    private String format;
    private Boolean rgb;

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

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setRgb(Boolean rgb) {
        this.rgb = rgb;
    }

    public Boolean getRgb() {
        return rgb;
    }
}

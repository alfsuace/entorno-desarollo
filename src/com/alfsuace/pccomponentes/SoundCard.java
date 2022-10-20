package com.alfsuace.pccomponentes;

public class SoundCard {
    //-id Integer
    //-brand String
    //-conectorType String

    private Integer id;
    private String brand;
    private String connectorType;

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

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public String getConnectorType() {
        return connectorType;
    }

}

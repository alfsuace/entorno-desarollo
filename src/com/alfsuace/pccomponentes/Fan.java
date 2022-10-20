package com.alfsuace.pccomponentes;

public class Fan {

    //-id Integer
    //-brand String
    //-sockets String
    //-power Integer

    private Integer id;
    private String brand;
    private String socket;
    private Integer power;

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

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

}

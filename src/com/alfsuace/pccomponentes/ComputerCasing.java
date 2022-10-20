package com.alfsuace.pccomponentes;

public class ComputerCasing {
    //-id: Integer
    //-memoryType: String
    //-memoryCapacity: Integer
    //-brand: String
    private Integer id;
    private String memoryType;
    private Integer memoryCapacity;
    private String brand;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryCapacity(Integer memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

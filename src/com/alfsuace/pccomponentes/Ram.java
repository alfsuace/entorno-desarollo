package com.alfsuace.pccomponentes;

public class Ram {
    //-id: Integer
    //-memoryType: String
    //-memoryCapacity: Integer
    //-brand: String
    private Integer id;
    private String  memoryType;
    private Integer memorycapacity;
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

    public void setMemorycapacity(Integer memorycapacity) {
        this.memorycapacity = memorycapacity;
    }

    public Integer getMemorycapacity() {
        return memorycapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
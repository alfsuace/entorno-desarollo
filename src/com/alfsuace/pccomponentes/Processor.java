package com.alfsuace.pccomponentes;

/**
 * Clase Procesador
 **/

public class Processor {
    /**
     * Atributos, propiedades, variables, estado
     */
    private Integer id;
    private String socket;
    private Integer frequency;
    private Integer cores;
    private String brand;

    /**
     * Métodos, funciones, comportamiento
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

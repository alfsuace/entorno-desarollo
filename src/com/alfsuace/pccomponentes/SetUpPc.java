package com.alfsuace.pccomponentes;

public class SetUpPc {
    private String id;
    private Processor processor;

    private MotherBoard motherBoard;

    public void setId (String id) {
        this.id = id;
    }

    public String getId () {
        return id;
    }

    public void setProcessor (Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor () {
        return processor;
    }

    public void setMotherBoard (MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public MotherBoard getMotherBoard () {
        return motherBoard;
    }
}

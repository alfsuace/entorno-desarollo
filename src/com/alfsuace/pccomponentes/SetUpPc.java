package com.alfsuace.pccomponentes;

import java.util.ArrayList;
import java.util.List;

public class SetUpPc {
    private String id;
    private Processor processor;

    private MotherBoard motherBoard;

    private List<Ram> rams = new ArrayList<>();

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
    public void addRam(Ram ram){
        this.rams.add(ram);
    }
    public List<Ram> getRams(){
        return rams;
    }
}

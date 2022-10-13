package com.alfsuace.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");
// PARTE DEL PROCESADOR
        Processor i5 = new Processor();
        i5.setId(1);
        i5.setCores(4);
        i5.setSocket("LGA1200");

        System.out.println("Tipo de socket del procesador es: " + i5.getSocket());
        System.out.println("El numero de nucleos del procesador:" + i5.getCores());
        System.out.println("-----------------");
        Processor amd = new Processor();
        amd.setId(2);
        amd.setCores(4);
        amd.setSocket("AM5");

        System.out.println("Tipo de socket del procesador es: " + amd.getSocket());
        System.out.println("Numero de nucleos del procesador" + amd.getCores());
        System.out.println("----------------");

// PARTE DE LA PLACA BASE
        MotherBoard asus = new MotherBoard();
        asus.setId(1);
        asus.setBrand("Asus");
        asus.setSocket("tipo de socket para el procesador ");
        asus.setSlotsNumber(4);

        System.out.println("La ID de la placa base es: " + asus.getId());
        System.out.println("La marca de la placa base es: " + asus.getBrand());
        System.out.println("El socket de la placa base es: " + asus.getSocket());
        System.out.println("Los slots de la placa base son: " + asus.getSlotsNumber());


    }
}
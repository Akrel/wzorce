package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        KlasaKwadrat klasaKwadrat = new KlasaKwadrat();
        InterfejsProstokat adapter = new AdapterKwadrat(klasaKwadrat);

        int pole = adapter.obliczPoleProstokata(5, 10);
        System.out.println("Pole prostokąta: " + pole);
    }
}
package org.example.creational.abstractFactory;

public class PlasticTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting things on a plastic table.");
    }
}

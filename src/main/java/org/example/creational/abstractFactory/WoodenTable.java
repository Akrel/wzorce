package org.example.creational.abstractFactory;

public class WoodenTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting things on a wooden table.");
    }
}
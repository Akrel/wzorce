package org.example.creational.abstractFactory;

public class WoodenChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a wooden chair.");
    }
}

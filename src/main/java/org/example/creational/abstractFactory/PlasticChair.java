package org.example.creational.abstractFactory;

public class PlasticChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a plastic chair.");
    }
}

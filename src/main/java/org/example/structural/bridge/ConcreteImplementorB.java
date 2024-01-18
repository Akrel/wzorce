package org.example.structural.bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor B");
    }
}

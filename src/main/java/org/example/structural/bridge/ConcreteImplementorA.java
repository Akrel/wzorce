package org.example.structural.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor A");
    }
}

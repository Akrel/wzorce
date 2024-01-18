package org.example.structural.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.print("Refined Abstraction - ");
        implementor.operationImpl();
    }
}

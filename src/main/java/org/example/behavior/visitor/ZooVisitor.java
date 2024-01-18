package org.example.behavior.visitor;

public class ZooVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Zoo visitor observes a lion.");
    }

    @Override
    public void visitHorse(Horse horse) {
        System.out.println("Zoo visitor observes a horse.");
    }
}

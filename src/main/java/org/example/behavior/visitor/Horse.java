package org.example.behavior.visitor;

public class Horse implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitHorse(this);
    }
}
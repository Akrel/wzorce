package org.example.behavior.visitor;

public interface Animal {
    void accept(Visitor visitor);
}

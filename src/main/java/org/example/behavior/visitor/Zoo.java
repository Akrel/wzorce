package org.example.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void acceptVisitor(Visitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}

package org.example.behavior.visitor;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Horse());

        ZooVisitor zooVisitor = new ZooVisitor();
        zoo.acceptVisitor(zooVisitor);
    }
}
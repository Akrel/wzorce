package org.example.creational.fabricMethod;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        PizzaFactory margheritaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizza = margheritaFactory.createPizza();
        margheritaPizza.prepare();
        margheritaPizza.bake();
        margheritaPizza.cut();
        margheritaPizza.box();

        System.out.println();

        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
        Charset.forName("name");
    }
}
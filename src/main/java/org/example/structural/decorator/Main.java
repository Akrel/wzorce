package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost() + ", Description: " + coffee.description());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.description());
    }
}
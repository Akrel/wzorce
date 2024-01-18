package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu Car za pomocą budowniczego
        Car car = new Car.Builder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Blue")
                .build();

        // Uzyskanie gotowego obiektu Car
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
    }
}
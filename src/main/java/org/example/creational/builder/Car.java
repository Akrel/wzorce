package org.example.creational.builder;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Konstruktor prywatny, aby uniemożliwić bezpośrednie tworzenie obiektu Car
    private Car() {
    }

    // Metody dostępowe do pól

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Statyczna klasa budowniczego
    static class Builder {
        private final Car car;

        // Konstruktor budowniczego, inicjalizacja obiektu Car
        Builder() {
            this.car = new Car();
        }

        // Metody konfiguracyjne dla różnych części samochodu

        Builder setMake(String make) {
            car.make = make;
            return this;
        }

        Builder setModel(String model) {
            car.model = model;
            return this;
        }

        Builder setYear(int year) {
            car.year = year;
            return this;
        }

        Builder setColor(String color) {
            car.color = color;
            return this;
        }

        // Metoda do zbudowania gotowego obiektu Car
        Car build() {
            return car;
        }
    }
}

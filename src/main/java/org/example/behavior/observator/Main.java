package org.example.behavior.observator;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Dodawanie obserwatorów
        Display display1 = new Display();
        Display display2 = new Display();
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Ustawianie nowej temperatury powoduje powiadomienie obserwatorów
        weatherStation.setTemperature(25);

        // Usuwanie obserwatora
        weatherStation.removeObserver(display1);

        // Kolejne ustawienie temperatury
        weatherStation.setTemperature(30);
    }
}
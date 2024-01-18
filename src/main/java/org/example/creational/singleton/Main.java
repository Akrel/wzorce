package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Pobranie instancji singletona
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Sprawdzenie, czy obie zmienne wskazują na tę samą instancję
        System.out.println(singleton1 == singleton2);  // Powinno zwrócić true

        // Wywołanie metody instancji
        singleton1.doSomething();
    }
}
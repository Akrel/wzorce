package org.example.creational.singleton;

public class Singleton { // Prywatne pole przechowujące jedyną instancję klasy
    private static Singleton instance;

    // Prywatny konstruktor, aby uniemożliwić bezpośrednie tworzenie obiektu
    private Singleton() {
    }

    // Metoda dostępu do instancji, tworząca ją tylko w razie potrzeby
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Metody instancji
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}

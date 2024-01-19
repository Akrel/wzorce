package org.example.creational.builder;

/***
 * Wzorzec Budowniczego (ang. Builder) to wzorzec projektowy creational, który pozwala na konstrukcję złożonych obiektów krok po kroku. Wzorzec ten oddziela proces
 * konstrukcji od samego obiektu, umożliwiając tworzenie różnych reprezentacji obiektu poprzez manipulację tym samym procesem konstrukcyjnym.
 *
 * Główne cele wzorca Budowniczego:
 * 1. Uniezależnienie klienta od procesu tworzenia obiektów: Klient może skonfigurować i uzyskać złożony obiekt, nie wiedząc, jak dokładnie jest on konstruowany.
 * 2. Ułatwienie tworzenia różnych reprezentacji tego samego obiektu: Wzorzec ten pozwala na konstrukcję obiektu krok po kroku, co umożliwia uzyskanie różnych reprezentacji tego samego obiektu.
 * 3. Zminimalizowanie liczby konstruktorów w klasie: Zamiast posiadania wielu konstruktorów z różnymi zestawami parametrów, wzorzec Budowniczego oferuje jedną klasę budowniczego z wieloma metodami konfiguracyjnymi.
 *
 * Struktura wzorca Budowniczego:
 * 1. Produkt (Product): Reprezentuje złożony obiekt, który jest konstruowany.
 * 2. Budowniczy (Builder): Interfejs lub abstrakcyjna klasa definiująca metody budowania poszczególnych części obiektu.
 * 3. Konkretny Budowniczy (Concrete Builder): Implementuje interfejs lub dziedziczy po klasie budowniczego, definiując konkretne metody budowy poszczególnych części obiektu.
 * 4. Dyrektor (Director): Klient korzysta z dyrektora do zorganizowania kroków konstrukcyjnych i uzyskania gotowego produktu.
 */
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
package org.example.creational.fabricMethod;

import java.nio.charset.Charset;

/***
 * Wzorzec Metoda Wytwórcza (ang. Factory Method) to wzorzec projektowy creational, który definiuje interfejs do tworzenia obiektu, ale pozostawia wybór konkretnej
 * klasy obiektu do podklas. Innymi słowy, wzorzec ten deleguje odpowiedzialność tworzenia obiektów do klas podrzędnych, zamiast bezpośrednio tworzyć obiekty w klasie bazowej.
 *
 * Główne cele wzorca Metoda Wytwórcza:
 * 1. Uniezależnienie klienta od konkretnej implementacji obiektu: Klient korzysta z interfejsu, a konkretne implementacje są zdelegowane do klas podrzędnych.
 * 2. Rozszerzalność: Wzorzec ten umożliwia dodawanie nowych klas implementujących interfejs, bez modyfikacji kodu klienta.
 * 3. Łatwa wymiana rodzaju obiektu: Klient może korzystać z różnych implementacji obiektu poprzez zastosowanie odpowiedniej klasy wytwórczej.
 *
 * Struktura wzorca Metoda Wytwórcza:
 * 1. Produkt (Product): Interfejs lub abstrakcyjna klasa, która reprezentuje abstrakcyjny obiekt, który ma zostać utworzony.
 * 2. Konkretny Produkt (Concrete Product): Implementacja konkretnej klasy obiektu, który zostanie utworzony.
 * 3. Twórca (Creator): Interfejs lub abstrakcyjna klasa, która deklaruje metodę wytwórczą, służącą do tworzenia obiektu. Może również zawierać metody pomocnicze operujące na obiektach typu Produkt.
 * 4. Konkretny Twórca (Concrete Creator): Implementuje metodę wytwórczą, tworząc i zwracając konkretne instancje obiektów.
 */
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
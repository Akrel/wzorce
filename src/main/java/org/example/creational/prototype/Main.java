package org.example.creational.prototype;

/***
 * Wzorzec Prototypu (ang. Prototype) to wzorzec projektowy creational, który pozwala na tworzenie nowych obiektów poprzez kopiowanie istniejących obiektów, zamiast
 * tworzenia ich od zera. Wzorzec ten umożliwia klonowanie obiektów, co jest szczególnie użyteczne, gdy konstrukcja nowego obiektu jest kosztowna lub złożona.
 *
 * Główne cele wzorca Prototypu:
 * 1. Uniezależnienie klienta od klas konkretnych obiektów: Klient korzysta z interfejsu prototypu do kopiowania obiektów, bez wiedzy o ich konkretnej implementacji.
 * 2. Zminimalizowanie kosztów tworzenia obiektów: Klonowanie istniejącego obiektu jest często bardziej efektywne niż tworzenie go od zera.
 * 3. Dostarczenie alternatywy dla dziedziczenia: Wzorzec ten umożliwia tworzenie nowych obiektów poprzez klonowanie istniejących, bez konieczności dziedziczenia.
 *
 * Struktura wzorca Prototypu:
 * 1. Prototyp (Prototype): Interfejs lub abstrakcyjna klasa definiująca metodę klonowania.
 * 2. Konkretny Prototyp (Concrete Prototype): Implementacja interfejsu prototypu, zawierająca konkretne implementacje metody klonowania.
 * 3. Klient (Client): Korzysta z interfejsu prototypu do klonowania obiektów.
 */
public class Main {
    public static void main(String[] args) {
        BookPrototype paperBookPrototype = new PaperBook();
        paperBookPrototype.setTitle("Design Patterns");

        BookPrototype clonedPaperBook = paperBookPrototype.clone();
        System.out.println(clonedPaperBook.getTitle());

        BookPrototype eBookPrototype = new EBook();
        eBookPrototype.setTitle("Java in Action");

        BookPrototype clonedEBook = eBookPrototype.clone();
        System.out.println(clonedEBook.getTitle());
    }
}
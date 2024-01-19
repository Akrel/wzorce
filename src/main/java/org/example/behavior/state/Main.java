package org.example.behavior.state;

/**
 * Wzorzec Stanu (ang. State) to wzorzec projektowy behawioralny, który umożliwia obiektowi zmianę swojego zachowania, gdy jego wewnętrzny stan się zmienia.
 * Wzorzec ten reprezentuje każdy stan jako oddzielną klasę i umożliwia obiektowi przechodzenie z jednego stanu do drugiego.
 * Pozwala to na elastyczne zarządzanie zachowaniem obiektu w zależności od jego wewnętrznego stanu.
 *
 * Główne cele wzorca Stanu:
 * 1. Uniezależnienie zachowania od stanu: Pozwala na reprezentowanie różnych zachowań jako osobnych klas, co ułatwia dodawanie nowych stanów bez modyfikacji obiektu.
 * 2. Umożliwienie obiektowi zmiany stanu w czasie rzeczywistym: Obiekt może dynamicznie przechodzić z jednego stanu do drugiego, w zależności od warunków działania.
 * 3. Zachowanie porządku w kodzie: Rozdziela kod związany z różnymi stanami, co ułatwia zrozumienie i zarządzanie kodem.
 *
 * Struktura wzorca Stanu:
 * 1. Kontekst (Context): Reprezentuje obiekt, którego stan może się zmieniać. Przechowuje referencję do obiektu Stanu i deleguje do niego zadania związane z zachowaniem.
 * 2. Stan (State): Interfejs lub abstrakcyjna klasa definiująca interfejs dla konkretnych stanów.
 * 3. Konkretny Stan (Concrete State): Implementuje interfejs Stanu i definiuje konkretne zachowanie dla danego stanu.
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Użytkownik próbuje zakupić napój bez wcześniejszego wrzucenia monety
        vendingMachine.dispenseDrink();

        // Użytkownik wrzuca monetę
        vendingMachine.insertCoin();

        // Użytkownik próbuje zwrócić monetę bez wcześniejszego zakupu
        vendingMachine.ejectCoin();

        // Użytkownik wybiera napój
        vendingMachine.dispenseDrink();

        // Automat jest pusty, zmiana stanu na "Brak napojów"
        vendingMachine.setState(new NoStockState());

        // Użytkownik próbuje wrzucić monetę, ale automat jest pusty
        vendingMachine.insertCoin();

        // Użytkownik próbuje wybrać napój, ale automat jest pusty
        vendingMachine.dispenseDrink();
    }
}
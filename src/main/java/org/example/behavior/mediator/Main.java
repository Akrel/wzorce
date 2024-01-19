package org.example.behavior.mediator;

/***
 * Wzorzec Mediator to wzorzec projektowy behawioralny, który definiuje obiekt (zwany mediator) odpowiedzialny za koordynację komunikacji między grupą
 * obiektów (zwanych kolegami). Mediator pozwala na zmniejszenie bezpośrednich połączeń między kolegami, zamiast tego zachowując jedno centralne miejsce do zarządzania komunikacją.
 *
 * Główne cele wzorca Mediator:
 * 1. Uniezależnienie kolegów od siebie: Kolegom nie jest bezpośrednio znane, kto jest ich partnerem w komunikacji, co pomaga uniknąć nadmiernego sprzężenia zwrotnego.
 * 2. Centralizacja zarządzania komunikacją: Wzorzec ten ułatwia centralne zarządzanie komunikacją między obiektami, co może poprawić elastyczność i utrzymanie systemu.
 * 3. Promowanie jednolitego interfejsu: Mediator definiuje jednolity interfejs komunikacyjny dla kolegów, co ułatwia dodawanie nowych kolegów bez wprowadzania zmian w istniejącym kodzie.
 *
 * Struktura wzorca Mediator:
 *  1. Mediator: Interfejs lub abstrakcyjna klasa definiująca operacje do zarządzania komunikacją między kolegami.
 *  2. Konkretny Mediator: Implementuje interfejs Mediatora, zarządzając komunikacją między konkretnymi kolegami.
 *  3. Kolega: Klasa reprezentująca obiekt, który komunikuje się z innymi kolegami poprzez mediator.
 *  4. Konkretny Kolega: Implementuje Kolegę i komunikuje się z innymi kolegami za pośrednictwem Mediatora.
 *
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User user1 = new User("User1", chatMediator);
        User user2 = new User("User2", chatMediator);
        User user3 = new User("User3", chatMediator);

        // Uczestnicy czatu wysyłają wiadomości za pośrednictwem mediatora
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi!");
        user3.sendMessage("Hey there!");

        /*
        Wyjście:
        User1 sends message: Hello, everyone!
        User2 sends message: Hi!
        User3 sends message: Hey there!
        */
    }
}
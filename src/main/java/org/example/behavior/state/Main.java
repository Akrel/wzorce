package org.example.behavior.state;

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
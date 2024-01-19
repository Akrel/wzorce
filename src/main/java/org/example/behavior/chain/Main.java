package org.example.behavior.chain;

/**
 * Wzorzec Chain of Responsibility to wzorzec projektowy behawioralny, który pozwala na przekazywanie żądania przez sekwencję potencjalnych obsługujących,
 * zanim zostanie ono obsłużone. Każdy obsługujący w łańcuchu decyduje, czy jest w stanie obsłużyć dane żądanie, a jeśli nie, przekazuje je dalej w hierarchii.
 *
 * Główne cele wzorca Chain of Responsibility:
 * 1. Uniezależnienie nadawcy od odbiorców: Nadawca nie musi znać bezpośrednio odbiorcy ani hierarchii odbiorców.
 * 2. Obsługa żądania w sposób dynamiczny: Każdy element łańcucha może decydować o tym, czy obsłużyć dane żądanie, a także czy przekazać je dalej.
 * 3. Umożliwienie dodawania i usuwania odbiorców bez zmiany nadawcy: Możliwość elastycznego modyfikowania łańcucha obsługujących.
 *
 * Struktura wzorca Chain of Responsibility:
 * 1. Handler (Obsługujący): Definiuje interfejs obsługujący żądanie. Może być abstrakcyjną klasą lub interfejsem.
 * 2. ConcreteHandler (Konkretny obsługujący): Implementuje interfejs Handlera. Decyduje, czy obsłużyć dane żądanie i może przekazać je dalej w łańcuchu.
 * 3. Client (Nadawca): Inicjuje żądanie, które przemieszcza się wzdłuż łańcucha.
 *
 */
public class Main {
    public static void main(String[] args) {
        PurchaseHandler manager = new Manager(new Director(null));

        PurchaseRequest request1 = new PurchaseRequest(1, 500);
        manager.processRequest(request1);

        PurchaseRequest request2 = new PurchaseRequest(2, 1500);
        manager.processRequest(request2);

        PurchaseRequest request3 = new PurchaseRequest(3, 7000);
        manager.processRequest(request3);
    }
}
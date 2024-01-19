package org.example.structural.bridge;

/***
 * Wzorzec Most to strukturalny wzorzec projektowy, który separuje abstrakcję od implementacji, umożliwiając im zmianę niezależnie od siebie.
 * Pozwala na łączenie różnych klas i hierarchii klas, aby uzyskać większą elastyczność w strukturze systemu.
 *
 * Głównym celem wzorca Most jest uniknięcie utworzenia stale rosnącej hierarchii klas, poprzez oddzielenie abstrakcji od implementacji.
 * W ten sposób, zmiany w jednym z tych aspektów nie muszą wpływać na drugi, co prowadzi do większej elastyczności i łatwości w utrzymaniu kodu.
 *
 * Elementy wzorca Most:
 * 1.Abstrakcja (Abstraction): Definiuje interfejs abstrakcyjny i utrzymuje referencję do obiektu implementacji.
 * 2.Implementacja (Implementation): Określa interfejs implementacji, zazwyczaj korzystając z interfejsu lub klasy bazowej.
 * 3.Refined Abstraction: Rozszerza abstrakcję, dodając dodatkowe funkcje.
 * 4.Concrete Implementation: Dostarcza konkretne implementacje interfejsu implementacji.
 */
public class Main {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new RefinedAbstraction(implementorA);
        abstractionA.operation();

        Abstraction abstractionB = new RefinedAbstraction(implementorB);
        abstractionB.operation();
    }
}
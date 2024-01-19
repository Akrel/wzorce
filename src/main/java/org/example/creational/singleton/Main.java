package org.example.creational.singleton;

/***
 * Wzorzec Singleton to wzorzec projektowy creational, który gwarantuje, że dla danej klasy istnieje tylko jedna instancja, a dostęp do niej jest globalny.
 * Wzorzec ten jest szczególnie przydatny, gdy mamy do czynienia z zasobami, które są współdzielone między różnymi częściami systemu, a jednocześnie chcemy
 * uniknąć nadmiernego tworzenia instancji danej klasy.
 *
 * Główne cele wzorca Singleton:
 * 1. Gwarancja, że istnieje tylko jedna instancja klasy: Zapobiega wielokrotnemu tworzeniu obiektu i zapewnia, że wszyscy klienci korzystają z tej samej instancji.
 * 2. Dostęp do instancji z dowolnego miejsca w systemie: Instancja singletona jest globalnie dostępna, co ułatwia współdzielenie zasobów między różnymi komponentami systemu.
 * 3. Opóźnione tworzenie instancji: Instancja singletona może być tworzona dopiero w momencie, gdy jest to rzeczywiście potrzebne.
 */
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
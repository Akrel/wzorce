package org.example.structural.proxy;

/***
 *  wzorzec Proxy to wzorzec projektowy strukturalny, który wprowadza pośrednika lub substytut dla innych obiektów, kontrolując dostęp do nich.
 *  Wzorzec ten może być używany w celu dodania dodatkowej logiki do operacji wykonywanych na obiekcie, kontroli dostępu, opóźniania tworzenia obiektu lub optymalizacji jego użycia.
 *
 *  Główne cele wzorca Proxy:
 *  1. Kontrola dostępu: Proxy może kontrolować dostęp do obiektu, wprowadzając dodatkową warstwę bezpieczeństwa.
 *  2. Opóźnianie tworzenia: Proxy może opóźnić tworzenie obiektu, szczególnie jeśli jest on kosztowny, a nie jest natychmiast potrzebny.
 *  3. Optymalizacja: Proxy może dodawać dodatkową logikę, optymalizując operacje wykonywane na obiekcie.
 *
 *  Rodzaje Proxy:
 *  1. Proxy wirtualne (Virtual Proxy): Opóźnia tworzenie kosztownego obiektu, aż do chwili, gdy jest on faktycznie potrzebny. Przykładem może być ładowanie obrazu dopiero w momencie, gdy użytkownik chce go zobaczyć.
 *  2. Proxy ochronne (Protection Proxy): Kontroluje dostęp do obiektu, sprawdzając uprawnienia użytkownika przed wykonaniem operacji. Przykładem może być proxy, które wymaga autoryzacji przed dostępem do pewnych zasobów.
 *  3. Proxy zastępcze (Remote Proxy): Reprezentuje obiekt znajdujący się w innym przestrzeni adresowej (na zdalnym serwerze). Przykładem może być proxy, które zarządza zdalnym dostępem do obiektów.
 *  4. Proxy kopiujące (Copy-on-Write Proxy): Kopiuje obiekt tylko wtedy, gdy klient chce dokonać zmiany w obiekcie. Do tego czasu korzysta z współdzielonej kopii. Jest to używane do optymalizacji pamięci.
 *
 */
public class Main {
    public static void main(String[] args) {
        File file = new ProxyFile("example.txt");

        // Plik nie jest jeszcze wczytany z dysku
        file.display();

        // Plik jest wczytany z dysku, bo teraz jest potrzebny
        file.display();
    }
}
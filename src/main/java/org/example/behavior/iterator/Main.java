package org.example.behavior.iterator;

/***
 * Wzorzec Iterator to wzorzec projektowy behawioralny, który definiuje sposób sekwencyjnego dostępu do elementów kolekcji, nie ujawniając jego wewnętrznej struktury.
 * Umożliwia dostęp do elementów obiektu agregującego w sposób jednolity, niezależnie od jego konkretnej implementacji.
 *
 * Główne cele wzorca Iterator:
 * 1. Ujednolicenie dostępu: Iterator dostarcza jednolity interfejs do dostępu do elementów różnych kolekcji, eliminując potrzebę zależności klienta od konkretnej struktury kolekcji.
 * 2. Odseparowanie interfejsu od implementacji: Pozwala na oddzielenie sposobu przechodzenia przez kolekcję od samej kolekcji.
 * 3. Wsparcie dla różnych typów iteracji: Iterator umożliwia przechodzenie przez elementy kolekcji w różny sposób, na przykład od przodu, od tyłu, czy w skokach.
 *
 * Struktura wzorca Iterator:
 * 1. Iterator: Interfejs definiujący operacje do nawigowania po elementach kolekcji.
 * 2. Konkretny Iterator: Implementuje interfejs Iteratora i śledzi bieżącą pozycję w kolekcji.
 * 3. Agregat: Interfejs definiujący operacje do zarządzania kolekcją, takie jak dodawanie i usuwanie elementów, a także dostarczający interfejs do uzyskania Iteratora.
 * 4. Konkretny Agregat: Implementuje interfejs Agregatu, definiując konkretne zachowanie w zakresie zarządzania kolekcją.
 *
 */
public class Main {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        numberList.addNumber(1);
        numberList.addNumber(2);
        numberList.addNumber(3);

        Iterator iterator = numberList.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
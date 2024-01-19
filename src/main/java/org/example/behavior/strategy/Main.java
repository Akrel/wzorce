package org.example.behavior.strategy;

/***
 * Wzorzec Strategia (ang. Strategy) to wzorzec projektowy behawioralny, który definiuje rodzinę algorytmów, pakuje je i sprawia, że są one wzajemnie wymienne.
 * Pozwala na dynamiczną zmianę algorytmu, którego obiekt używa, nie wpływając na jego interfejs.
 *
 * Główne cele wzorca Strategia:
 * 1. Określenie rodziny algorytmów: Wzorzec ten umożliwia definiowanie różnych algorytmów jako oddzielnych klas, które implementują wspólny interfejs.
 * 2. Encapsulacja algorytmów: Algorytmy są enkapsulowane w osobnych klasach, co ułatwia zarządzanie nimi i utrzymanie czystego kodu.
 * 3. Wymienność algorytmów: Algorytmy są wzajemnie wymienne, dzięki czemu obiekt korzystający ze strategii może dynamicznie zmieniać swoje zachowanie w trakcie działania.
 *
 * Struktura wzorca Strategia:
 * 1. Kontekst (Context): Klasa, która używa strategii. Posiada referencję do interfejsu Strategii i może dynamicznie zmieniać używany algorytm.
 * 2. Strategia (Strategy): Interfejs lub abstrakcyjna klasa definiująca wspólny interfejs dla wszystkich algorytmów.
 * 3. Konkretna Strategia (Concrete Strategy): Implementuje interfejs Strategii i zawiera konkretną implementację algorytmu.
 */
public class Main {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext();

        // Wybór strategii - Sortowanie bąbelkowe
        sortingContext.setSortingStrategy(new BubbleSort());
        int[] array1 = {4, 2, 7, 1, 9};
        sortingContext.executeSort(array1);

        // Wybór strategii - Sortowanie szybkie
        sortingContext.setSortingStrategy(new QuickSort());
        int[] array2 = {8, 5, 3, 6, 1};
        sortingContext.executeSort(array2);
    }
}
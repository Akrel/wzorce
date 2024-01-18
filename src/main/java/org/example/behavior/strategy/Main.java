package org.example.behavior.strategy;

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
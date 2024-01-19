package org.example.behavior.templatemethod;

/***
 * Wzorzec Metoda Szablonowa (ang. Template Method) to wzorzec projektowy behawioralny, który definiuje szkielet algorytmu w postaci klasy bazowej, pozostawiając implementację
 * pewnych kroków algorytmu do klas pochodnych. Wzorzec ten umożliwia nadanie struktury algorytmowi, przy jednoczesnym umożliwieniu dostosowania poszczególnych
 * kroków w zależności od konkretnych wymagań.
 *
 * Główne cele wzorca Metoda Szablonowej:
 * 1. Definiowanie ogólnego szkieletu algorytmu: Klasa bazowa zawiera algorytm zdefiniowany na poziomie ogólnym, który jest wspólny dla wszystkich pochodnych klas.
 * 2. Delegowanie konkretnych kroków do klas pochodnych: Niektóre kroki algorytmu są pozostawione do implementacji w klasach pochodnych, co umożliwia dostosowanie zachowania algorytmu w zależności od konkretnego kontekstu.
 * 3. Zapobieganie naruszeniom zasady Hollywood: Klasa bazowa kontroluje ogólny przebieg algorytmu, a konkretne kroki są zaimplementowane przez klasy pochodne. To odwrócenie sterowania pozwala uniknąć naruszania zasady Hollywood ("Nie dzwoń do nas, my dzwonimy do Ciebie").
 *
 * Struktura wzorca Metoda Szablonowej:
 * 1. Klasa bazowa (Abstract Class): Definiuje szkielet algorytmu w postaci metody szablonowej, która składa się z kroków algorytmu, z niektórymi krokami pozostawionymi do implementacji w klasach pochodnych.
 * 2. Klasa pochodna (Concrete Class): Implementuje konkretne kroki algorytmu pozostawione do implementacji przez klasę bazową.
 */
public class Main {
    public static void main(String[] args) {
        BoardGame chessGame = new Chess();
        chessGame.play();

        System.out.println();

        BoardGame checkersGame = new Checkers();
        checkersGame.play();
    }
}
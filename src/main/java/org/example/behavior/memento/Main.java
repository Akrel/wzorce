package org.example.behavior.memento;

/***
 * Wzorzec Pamiątka (ang. Memento) to wzorzec projektowy behawioralny, który umożliwia zapisywanie i przywracanie stanu obiektu bez naruszania jego enkapsulacji.
 * Wzorzec ten oddziela operacje zapisywania i przywracania stanu od samego obiektu, co pozwala na tworzenie punktów kontrolnych
 * w trakcie działania obiektu i przywracanie go do wcześniejszego stanu.
 *
 * Główne cele wzorca Pamiątka:
 *    1. Zachowanie enkapsulacji: Obiekt, którego stan jest zapisywany, nie ujawnia swojej wewnętrznej struktury.
 *    2. Możliwość przywracania stanu: Wzorzec ten umożliwia przywracanie obiektu do poprzedniego stanu.
 *    3. Ułatwienie zarządzania historią stanów: Pamiątka pozwala na tworzenie punktów kontrolnych (snapshotów) w trakcie działania obiektu, co ułatwia zarządzanie historią jego stanów.
 *
 * Struktura wzorca Pamiątka:
 *    1. Memento (Pamiątka): Interfejs lub klasa abstrakcyjna definiująca interfejs do zapisywania i przywracania stanu obiektu.
 *    2. Konkretna Pamiątka: Implementuje interfejs Memento i przechowuje konkretne informacje o stanie obiektu.
 *    3. Opiekun (Caretaker): Odpowiada za przechowywanie i zarządzanie różnymi punktami kontrolnymi (snapshotami) stanu obiektu.
 *    4. Właściciel (Originator): Obiekt, którego stan ma być zapisywany. Właściciel tworzy Memento zawierające informacje o bieżącym stanie obiektu, a także może przywracać swój stan z przekazanego Memento.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        // Tworzenie stanów tekstu
        textEditor.setText("First version");
        history.addMemento(textEditor.save());

        textEditor.setText("Second version");
        history.addMemento(textEditor.save());

        // Przywracanie poprzednich stanów tekstu
        textEditor.restore(history.getMemento(0));
        textEditor.displayText(); // Current text: First version

        textEditor.restore(history.getMemento(1));
        textEditor.displayText(); // Current text: Second version
    }
}
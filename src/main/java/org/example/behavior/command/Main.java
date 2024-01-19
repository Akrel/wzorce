package org.example.behavior.command;

/***
 * Wzorzec projektowy Polecenie (Command) to wzorzec behawioralny, który pozwala zamknąć żądania jako obiekty. Wzorzec ten przekształca żądanie na obiekt,
 * który zawiera wszystkie niezbędne informacje do jego wykonania. Dzięki temu możliwe jest parametryzowanie klientów różnymi żądaniami, opóźnianie ich wykonywania,
 * umieszczanie ich w kolejce, a także wspieranie operacji undo.
 *
 * Główne cele wzorca Polecenie:
 * 1. Zamiana żądań na obiekty: Wzorzec ten zamienia żądania klienta na obiekty reprezentujące te żądania, co umożliwia ich parametryzację, przechowywanie, przekazywanie, a także odwracanie operacji.
 * 2. Odwracanie zależności: Polecenie pozwala odwrócić zależność między obiektem wykonującym operację, a obiektem inicjującym operację. Obiekt inicjujący (klient) wie tylko o interfejsie polecenia, a nie o konkretnej implementacji.
 *
 * Struktura wzorca Polecenie:
 * 1. Polecenie (Command): Definiuje interfejs dla wykonania określonej operacji.
 * 2. Konkretna klasa polecenia (Concrete Command): Implementuje interfejs Polecenia i zawiera instancję odbiorcy, na której wykonuje operację.
 * 3. Odbiorca (Receiver): Zna sposób wykonania operacji.
 * 4. Wywoływacz (Invoker): Odpowiada za wywoływanie konkretnych poleceń.
 * 5. Klient (Client): Tworzy obiekty polecenia i decyduje, które polecenia przypisać do wywoływacza.
 *
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        TextEditor textEditor = new TextEditor();

        // Tworzenie poleceń
        Command insertCommand = new InsertTextCommand(editor, "Hello, ");
        Command deleteCommand = new DeleteTextCommand(editor);

        // Przypisywanie poleceń do wywoływacza
        textEditor.setCommand(insertCommand);
        textEditor.executeCommand();

        textEditor.setCommand(deleteCommand);
        textEditor.executeCommand();

        // Wyświetlanie aktualnego tekstu
        editor.displayText();
    }
}
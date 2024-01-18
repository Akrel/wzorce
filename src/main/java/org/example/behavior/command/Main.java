package org.example.behavior.command;

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
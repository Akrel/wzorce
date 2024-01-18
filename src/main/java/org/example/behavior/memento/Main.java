package org.example.behavior.memento;

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
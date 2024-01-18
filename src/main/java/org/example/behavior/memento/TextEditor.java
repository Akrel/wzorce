package org.example.behavior.memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new TextMemento(text);
    }

    public void restore(Memento memento) {
        if (memento instanceof TextMemento) {
            this.text = ((TextMemento) memento).getState();
        }
    }

    public void displayText() {
        System.out.println("Current text: " + text);
    }
}

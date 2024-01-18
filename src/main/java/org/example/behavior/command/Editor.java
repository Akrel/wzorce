package org.example.behavior.command;

public class Editor {
    private String text = "";

    public void insertText(String text) {
        this.text += text;
        System.out.println("Inserted text: " + text);
    }

    public void deleteSelectedText() {
        // Implementacja usuwania tekstu
        System.out.println("Deleted selected text");
    }

    public void displayText() {
        System.out.println("Current text: " + text);
    }

}

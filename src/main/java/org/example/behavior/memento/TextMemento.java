package org.example.behavior.memento;

public class TextMemento implements Memento {
    private String state;

    public TextMemento(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}

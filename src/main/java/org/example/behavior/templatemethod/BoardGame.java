package org.example.behavior.templatemethod;

public abstract class BoardGame {
    // Metoda szablonowa definiująca ogólny przebieg gry
    public void play() {
        setupBoard();
        startGame();
        takeTurns();
        endGame();
    }

    // Metody pozostawione do implementacji przez klasy pochodne
    protected abstract void setupBoard();

    protected abstract void startGame();

    protected abstract void takeTurns();

    protected abstract void endGame();
}

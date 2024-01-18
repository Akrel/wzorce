package org.example.behavior.templatemethod;

public class Chess extends BoardGame {
    @Override
    protected void setupBoard() {
        System.out.println("Setting up chess board.");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting chess game.");
    }

    @Override
    protected void takeTurns() {
        System.out.println("Taking turns in chess.");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending chess game.");
    }
}

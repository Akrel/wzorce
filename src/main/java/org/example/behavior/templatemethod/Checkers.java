package org.example.behavior.templatemethod;

public class Checkers extends BoardGame {
    @Override
    protected void setupBoard() {
        System.out.println("Setting up checkers board.");
    }

    @Override
    protected void startGame() {
        System.out.println("Starting checkers game.");
    }

    @Override
    protected void takeTurns() {
        System.out.println("Taking turns in checkers.");
    }

    @Override
    protected void endGame() {
        System.out.println("Ending checkers game.");
    }
}

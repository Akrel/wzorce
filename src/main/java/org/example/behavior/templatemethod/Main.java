package org.example.behavior.templatemethod;

public class Main {
    public static void main(String[] args) {
        BoardGame chessGame = new Chess();
        chessGame.play();

        System.out.println();

        BoardGame checkersGame = new Checkers();
        checkersGame.play();
    }
}
package org.example.structural.proxy;

public class Main {
    public static void main(String[] args) {
        File file = new ProxyFile("example.txt");

        // Plik nie jest jeszcze wczytany z dysku
        file.display();

        // Plik jest wczytany z dysku, bo teraz jest potrzebny
        file.display();
    }
}
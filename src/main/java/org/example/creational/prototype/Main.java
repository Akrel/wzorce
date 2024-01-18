package org.example.creational.prototype;

public class Main {
    public static void main(String[] args) {
        BookPrototype paperBookPrototype = new PaperBook();
        paperBookPrototype.setTitle("Design Patterns");

        BookPrototype clonedPaperBook = paperBookPrototype.clone();
        System.out.println(clonedPaperBook.getTitle());

        BookPrototype eBookPrototype = new EBook();
        eBookPrototype.setTitle("Java in Action");

        BookPrototype clonedEBook = eBookPrototype.clone();
        System.out.println(clonedEBook.getTitle());
    }
}
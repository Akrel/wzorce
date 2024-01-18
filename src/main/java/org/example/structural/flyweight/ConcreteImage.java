package org.example.structural.flyweight;

public class ConcreteImage implements Image {
    private String filename; // niezmienne atrybuty (wspólne)
    private int width;       // niezmienne atrybuty (wspólne)
    private int height;      // niezmienne atrybuty (wspólne)

    public ConcreteImage(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying image at coordinates (" + x + ", " + y + ")");
    }
}

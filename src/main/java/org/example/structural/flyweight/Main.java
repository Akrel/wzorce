package org.example.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Image image1 = ImageFactory.getImage("cat.jpg", 800, 600);
        Image image2 = ImageFactory.getImage("cat.jpg", 800, 600); // ten sam pyłek, współdzielony
        Image image3 = ImageFactory.getImage("dog.png", 1200, 900);

        image1.display(100, 50);
        image2.display(300, 200);
        image3.display(500, 350);
    }
}
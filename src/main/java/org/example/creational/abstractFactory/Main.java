package org.example.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        Chair woodenChair = woodenFactory.createChair();
        Table woodenTable = woodenFactory.createTable();

        woodenChair.sitOn();
        woodenTable.putOn();

        System.out.println();

        FurnitureFactory plasticFactory = new PlasticFurnitureFactory();
        Chair plasticChair = plasticFactory.createChair();
        Table plasticTable = plasticFactory.createTable();

        plasticChair.sitOn();
        plasticTable.putOn();
    }
}
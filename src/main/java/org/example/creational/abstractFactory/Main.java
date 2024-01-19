package org.example.creational.abstractFactory;

/***
 * Wzorzec Fabryki Abstrakcyjnej (ang. Abstract Factory) to wzorzec projektowy creational, który dostarcza interfejs do tworzenia rodziny powiązanych ze sobą obiektów,
 * bez specyfikowania ich konkretnej klasy. Wzorzec ten jest rozszerzeniem wzorca Fabryki Metod, gdzie zamiast jednej metody tworzącej obiekty, mamy całe zestawy metod,
 * każda tworząca różne rodzaje obiektów.
 *
 * Główne cele wzorca Fabryki Abstrakcyjnej:
 * 1. Tworzenie rodzin powiązanych ze sobą obiektów: Wzorzec ten pozwala na tworzenie i używanie obiektów, które ze sobą współpracują, niezależnie od ich konkretnej implementacji.
 * 2. Uniezależnienie klienta od konkretnej implementacji obiektów: Klient korzysta z interfejsu fabryki, a nie z konkretnych klas obiektów, co umożliwia łatwą wymianę rodziny obiektów.
 * 3. Zachowanie spójności między obiektami: Wzorzec ten zapewnia, że obiekty utworzone przez jedną fabrykę współpracują ze sobą i tworzą spójny zestaw.
 *
 * Struktura wzorca Fabryki Abstrakcyjnej:
 * 1. Produkt A, Produkt B (Product A, Product B): Interfejsy lub abstrakcyjne klasy reprezentujące różne rodzaje produktów tworzonych przez fabrykę.
 * 2. Konkretny Produkt A1, Produkt A2, Produkt B1, Produkt B2 (Concrete Product A1, Concrete Product A2, Concrete Product B1, Concrete Product B2): Konkretne implementacje produktów.
 * 3. Fabryka Abstrakcyjna (Abstract Factory): Interfejs lub abstrakcyjna klasa definiująca zestaw metod do tworzenia różnych rodzajów produktów. To jest główna fabryka, która deklaruje zestawy metod dla produktów A i B.
 * 4. Konkretna Fabryka (Concrete Factory): Implementacja fabryki abstrakcyjnej, która tworzy konkretne produkty.
 */
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
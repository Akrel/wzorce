package org.example.behavior.visitor;

/***
 * Wzorzec Odwiedzający (ang. Visitor) to wzorzec projektowy behawioralny, który umożliwia definiowanie nowych operacji, nie zmieniając struktury obiektów,
 * na których operacje są wykonywane. Wzorzec ten wprowadza oddzielną klasę (visitor), która zawiera metody do wykonania na elementach struktury obiektów.
 * Dzięki temu, jeżeli chcemy dodać nową operację, nie modyfikujemy klas obiektów, a jedynie dodajemy nową klasę visitor.
 *
 * Główne cele wzorca Odwiedzający:
 * 1. Dodawanie nowych operacji bez modyfikacji struktury obiektów: Wzorzec ten umożliwia rozszerzanie funkcjonalności bez ingerencji w klasę obiektów, które mają być odwiedzane.
 * 2. Separacja algorytmów od struktury obiektów: Wzorzec Odwiedzający oddziela algorytmy od struktury obiektów, co ułatwia zarządzanie kodem i utrzymanie czystego interfejsu.
 * 3. Wsparcie dla różnych typów obiektów: Wzorzec ten pozwala na implementację różnych operacji dla różnych typów obiektów, dzięki zastosowaniu metody dynamicznej wiązania (polimorfizmu).
 *
 * Struktura wzorca Odwiedzający:
 * 1. Element (Element): Definiuje interfejs, który muszą zaimplementować wszystkie elementy struktury, które mogą być odwiedzane.
 * 2. Konkretny Element (Concrete Element): Implementuje interfejs Elementu i reprezentuje konkretne obiekty struktury.
 * 3. Odwiedzający (Visitor): Definiuje interfejs z metodami odwiedzającymi, które są dostosowane do różnych typów elementów.
 * 4. Konkretny Odwiedzający (Concrete Visitor): Implementuje interfejs Odwiedzającego i zawiera konkretne implementacje metod odwiedzających dla różnych typów elementów.
 * 5. Struktura (Structure): Odpowiada za utrzymanie kolekcji elementów i dostarcza interfejsu do odwiedzania przez obiekty visitor.
 */
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Horse());

        ZooVisitor zooVisitor = new ZooVisitor();
        zoo.acceptVisitor(zooVisitor);
    }
}
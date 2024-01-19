package org.example.structural.flyweight;

/***
 * Wzorzec Pyłek (Flyweight pattern) to wzorzec projektowy strukturalny, który ma na celu efektywne współdzielenie wielu małych obiektów, aby zminimalizować użycie zasobów.
 * Wzorzec ten jest szczególnie przydatny w przypadku, gdy duża liczba podobnych obiektów jest używana, a ich większość może być współdzielona, co pozwala na zmniejszenie zużycia pamięci i zasobów.
 *
 * Główne cele wzorca pyłek:
 * 1. Oszczędność pamięci: Współdzielenie obiektów pomaga zminimalizować użycie pamięci poprzez przechowywanie wspólnych danych w jednym miejscu.
 * 2. Optymalizacja zasobów: Wzorzec pyłek pomaga zminimalizować obciążenie systemu poprzez ponowne użycie wspólnych obiektów.
 *
 * Struktura wzorca pyłek:
 * 1. Pyłek (Flyweight): Interfejs lub abstrakcyjna klasa, która definiuje interfejs dla obiektów pyłka.
 * 2. Konkretny pyłek (Concrete Flyweight): Implementuje interfejs pyłka i reprezentuje wspólną część obiektów, które mogą być współdzielone.
 * 3. Fabryka pyłków (Flyweight Factory): Zarządza pyłkami i ich współdzieleniem. Kiedy klient prosi o pyłek, fabryka zwraca istniejący pyłek lub tworzy nowy, jeśli nie istnieje.
 * Niezmienne i zmiennikowe części (Intrinsic and Extrinsic Parts): Wzorzec pyłek często dzieli atrybuty obiektu na dwie części: niezmienne (intrinsic), które można współdzielić, i zmiennikowe (extrinsic), które muszą być dostarczone przy użyciu zewnętrznego kontekstu.
 * To pomaga w optymalizacji, gdy obiekt ma zarówno wspólne, jak i unikalne atrybuty.
 *
 *
 */
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
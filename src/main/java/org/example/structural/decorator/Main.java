package org.example.structural.decorator;

/***
 * wzorzec dekorator (Decorator pattern) to wzorzec projektowy strukturalny, który pozwala dodawać nowe funkcjonalności do istniejących obiektów w czasie wykonania bez
 * modyfikacji ich struktury. Wzorzec ten działa na zasadzie opakowywania obiektu w inne obiekty, które dostarczają dodatkowe funkcjonalności.
 *
 * Główne cele wzorca dekorator:
 *  1. Rozszerzalność: Pozwala na dodawanie nowych funkcji do istniejących obiektów bez konieczności ich modyfikacji.
 *  2. Bezpieczne dziedziczenie: Unika problemów związanym z dziedziczeniem wielokrotnym, co może prowadzić do rosnącej liczby klas w hierarchii.
 *
 * Struktura wzorca dekorator:
 * 1. Component: Definiuje interfejs dla obiektów, do których mogą być dodawane nowe funkcje.
 * 2. ConcreteComponent: Konkretna implementacja interfejsu Component. Jest to podstawowa klasa, do której mogą być dodawane dekoratory.
 * 3. Decorator: Abstrakcyjna klasa lub interfejs, który implementuje interfejs Component i zawiera referencję do obiektu Component. Może dodawać nowe funkcje i przekazywać wywołania do obiektu bazowego.
 * 4. ConcreteDecorator: Konkretna implementacja dekoratora, dodająca nowe funkcje do obiektu Component.
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.cost() + ", Description: " + coffee.description());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.description());
    }
}
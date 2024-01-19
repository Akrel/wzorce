package org.example.structural.composite;

/***
 * wzorzec kompozyt (Composite pattern) to strukturalny wzorzec projektowy, który umożliwia traktowanie zarówno pojedynczych obiektów, jak i ich złożonych struktur,
 * w sposób jednolity. Pozwala klientom traktować indywidualne obiekty oraz ich grupy w jednolity sposób.
 *
 * Główne cele wzorca kompozyt:
 * 1. Jednolite traktowanie: Wzorzec kompozyt umożliwia klientom traktowanie zarówno pojedynczych obiektów, jak i ich złożonych struktur, w jednolity sposób.
 * 2. Rekurencyjna struktura: Składa się z elementów, które mogą być zarówno pojedynczymi obiektami, jak i złożonymi strukturami,
 *  które same zawierają pojedyncze obiekty lub inne złożone struktury.
 * 3. Transparentność: Klient nie musi znać różnicy między pojedynczymi obiektami a grupami obiektów. Może operować na wszystkich elementach w jednolity sposób.
 *
 * Struktura wzorca kompozyt:
 * 1. Component: Deklaruje interfejs dla wszystkich konkretnych komponentów, zarówno dla pojedynczych obiektów, jak i kompozytów.
 * 2. Leaf: Reprezentuje pojedynczy obiekt, który nie ma podkomponentów. Implementuje interfejs Component.
 * 3. Composite: Reprezentuje złożony komponent, który może mieć podkomponenty (zarówno pojedyncze obiekty, jak i inne kompozyty). Implementuje interfejs Component.
 *
 */
public class Main {
    public static void main(String[] args) {
        IndividualEmployee emp1 = new IndividualEmployee("John Doe");
        IndividualEmployee emp2 = new IndividualEmployee("Jane Doe");

        Department department = new Department("IT Department");
        department.addEmployee(emp1);
        department.addEmployee(emp2);

        IndividualEmployee emp3 = new IndividualEmployee("Alice Smith");
        IndividualEmployee emp4 = new IndividualEmployee("Bob Johnson");

        Department salesDepartment = new Department("Sales Department");
        salesDepartment.addEmployee(emp3);
        salesDepartment.addEmployee(emp4);

        Department company = new Department("Our Company");
        company.addEmployee(department);
        company.addEmployee(salesDepartment);

        // Wyświetlenie wszystkich szczegółów
        company.showDetails();
    }
}
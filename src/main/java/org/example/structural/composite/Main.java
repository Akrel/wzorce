package org.example.structural.composity;

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
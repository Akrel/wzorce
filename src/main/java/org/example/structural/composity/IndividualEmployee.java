package org.example.structural.composity;

public class IndividualEmployee implements Employee {
    private String name;

    public IndividualEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name);
    }

}

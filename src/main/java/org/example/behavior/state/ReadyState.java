package org.example.behavior.state;

public class ReadyState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Please select a drink.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected. No drink selected.");
    }

    @Override
    public void dispenseDrink() {
        System.out.println("No drink selected.");
    }
}

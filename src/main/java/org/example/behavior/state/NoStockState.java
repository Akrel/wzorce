package org.example.behavior.state;

public class NoStockState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("No drinks available. Please come back later.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No drinks available. Coin returned.");
    }

    @Override
    public void dispenseDrink() {
        System.out.println("No drinks available.");
    }
}

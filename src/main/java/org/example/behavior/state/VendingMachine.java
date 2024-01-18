package org.example.behavior.state;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        // Początkowy stan - gotowa do sprzedaży
        currentState = new ReadyState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void dispenseDrink() {
        currentState.dispenseDrink();
    }
}

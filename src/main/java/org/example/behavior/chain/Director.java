package org.example.behavior.chain;

public class Director implements PurchaseHandler {
    private static final double MAX_PURCHASE_AMOUNT = 5000;
    private PurchaseHandler nextHandler;

    public Director(PurchaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= MAX_PURCHASE_AMOUNT) {
            System.out.println("Director approves purchase request #" + request.getNumber());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        } else {
            System.out.println("Purchase request #" + request.getNumber() + " cannot be approved.");
        }
    }
}

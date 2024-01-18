package org.example.behavior.chain;

public class Main {
    public static void main(String[] args) {
        PurchaseHandler manager = new Manager(new Director(null));

        PurchaseRequest request1 = new PurchaseRequest(1, 500);
        manager.processRequest(request1);

        PurchaseRequest request2 = new PurchaseRequest(2, 1500);
        manager.processRequest(request2);

        PurchaseRequest request3 = new PurchaseRequest(3, 7000);
        manager.processRequest(request3);
    }
}
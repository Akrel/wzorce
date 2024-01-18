package org.example.behavior.mediator;

public class ChatMediatorImpl implements ChatMediator {
    @Override
    public void sendMessage(User sender, String message) {
        // Przesyłanie wiadomości do pozostałych uczestników czatu
        System.out.println(sender.getName() + " sends message: " + message);
    }
}

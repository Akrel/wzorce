package org.example.behavior.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User user1 = new User("User1", chatMediator);
        User user2 = new User("User2", chatMediator);
        User user3 = new User("User3", chatMediator);

        // Uczestnicy czatu wysyłają wiadomości za pośrednictwem mediatora
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi!");
        user3.sendMessage("Hey there!");

        /*
        Wyjście:
        User1 sends message: Hello, everyone!
        User2 sends message: Hi!
        User3 sends message: Hey there!
        */
    }
}
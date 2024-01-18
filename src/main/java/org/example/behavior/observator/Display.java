package org.example.behavior.observator;

public class Display implements Observer {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Temperature display: " + temperature + " degrees Celsius");
    }
}

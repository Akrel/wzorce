package org.example.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // Prosty interfejs do uruchamiania komputera
    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started successfully");
    }
}

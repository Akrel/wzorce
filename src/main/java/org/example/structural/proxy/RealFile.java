package org.example.structural.proxy;

public class RealFile implements File {
    private String filename;

    public RealFile(String filename) {
        this.filename = filename;
        loadFileFromDisk();
    }

    private void loadFileFromDisk() {
        System.out.println("Loading file: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying file: " + filename);
    }
}
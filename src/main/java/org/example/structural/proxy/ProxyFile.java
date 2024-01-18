package org.example.structural.proxy;

public class ProxyFile implements File {
    private RealFile realFile;
    private String filename;

    public ProxyFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realFile == null) {
            realFile = new RealFile(filename);
        }
        realFile.display();
    }
}

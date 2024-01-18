package org.example.creational.prototype;

public class PaperBook implements BookPrototype {
    private String title;

    @Override
    public BookPrototype clone() {
        PaperBook copy = new PaperBook();
        copy.setTitle(this.title);
        return copy;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return "Paper Book: " + title;
    }
}

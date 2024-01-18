package org.example.creational.prototype;

public class EBook implements BookPrototype {
    private String title;

    @Override
    public BookPrototype clone() {
        EBook copy = new EBook();
        copy.setTitle(this.title);
        return copy;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return "E-Book: " + title;
    }
}


package org.example.creational.prototype;

public interface BookPrototype {
    BookPrototype clone();

    void setTitle(String title);

    String getTitle();
}

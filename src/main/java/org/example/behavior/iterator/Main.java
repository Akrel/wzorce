package org.example.behavior.iterator;

public class Main {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        numberList.addNumber(1);
        numberList.addNumber(2);
        numberList.addNumber(3);

        Iterator iterator = numberList.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
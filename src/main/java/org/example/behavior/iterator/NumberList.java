package org.example.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class NumberList implements Aggregate {
    private List<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(numbers);
    }
}

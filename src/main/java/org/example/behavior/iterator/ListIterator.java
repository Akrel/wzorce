package org.example.behavior.iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private List<Integer> list;
    private int position = 0;

    public ListIterator(List<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(position++);
        }
        return null;
    }
}

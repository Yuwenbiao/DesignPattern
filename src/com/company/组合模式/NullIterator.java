package com.company.组合模式;

import java.util.Iterator;

public class NullIterator implements Iterator {
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

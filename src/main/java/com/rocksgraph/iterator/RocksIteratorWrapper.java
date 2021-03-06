package com.rocksgraph.iterator;

import org.apache.tinkerpop.gremlin.structure.Element;
import org.rocksdb.RocksIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by ashishn on 8/4/15.
 */
public class RocksIteratorWrapper<E extends Element> implements Iterator<E> {

    RocksIterator iterator;


    public RocksIteratorWrapper(RocksIterator iterator) {
        this.iterator = iterator;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return iterator.isValid();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() {
        Object[] values = new Object[2];
        values[0] = iterator.key();
        values[1] = iterator.value();
        iterator.next();
        return values;
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.  The behavior of an iterator
     * is unspecified if the underlying collection is modified while the
     * iteration is in progress in any way other than by calling this
     * method.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *                                       operation is not supported by this iterator
     * @throws IllegalStateException         if the {@code next} method has not
     *                                       yet been called, or the {@code remove} method has already
     *                                       been called after the last call to the {@code next}
     *                                       method
     * @implSpec The default implementation throws an instance of
     * {@link UnsupportedOperationException} and performs no other action.
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("not a valid operation");
    }
}

package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.Element;
import org.apache.tinkerpop.gremlin.structure.Property;

import java.util.NoSuchElementException;

/**
 * Created by ashishn on 8/4/15.
 */
public class RocksProperty<V> implements Property<V> {

    protected final RocksElement element;
    protected final String key;
    protected V value;
    protected final RocksGraph graph;


    public RocksProperty(RocksElement rocksElement, String key, V value) {
        this.element = rocksElement;
        this.key = key;
        this.value = value;
        this.graph = this.element.graph;
    }

    @Override
    public String key() {
        return this.key;
    }

    @Override
    public V value() throws NoSuchElementException {
        return this.value;
    }

    @Override
    public boolean isPresent() {
        return null != this.value;
    }

    @Override
    public Element element() {
        return this.element;
    }

    @Override
    public void remove() {
        element.removeProperty(this);
    }
}

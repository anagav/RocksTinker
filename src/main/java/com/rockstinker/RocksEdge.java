package com.rockstinker;

import org.apache.tinkerpop.gremlin.structure.*;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Created by ashishn on 7/28/15.
 */
public class RocksEdge extends RocksTinkerElement implements Edge {

    protected Map<String, Property> properties;
    protected final Vertex inVertex;
    protected final Vertex outVertex;


    public RocksEdge(Object id, String label, Vertex inVertex, Vertex outVertex) {
        super(id, label);
        this.inVertex = inVertex;
        this.outVertex = outVertex;
    }

    public Iterator<Vertex> vertices(Direction direction) {
        return null;
    }

    public Vertex outVertex() {
        return null;
    }

    public Vertex inVertex() {
        return null;
    }

    public Iterator<Vertex> bothVertices() {
        return null;
    }

    public Graph graph() {
        return null;
    }

    public Set<String> keys() {
        return null;
    }

    public <V> Property<V> property(String key) {
        return null;
    }

    public <V> Property<V> property(String s, V v) {
        return null;
    }

    public <V> V value(String key) throws NoSuchElementException {
        return null;
    }

    public void remove() {

    }

    public <V> Iterator<V> values(String... propertyKeys) {
        return null;
    }

    public <V> Iterator<? extends Property<V>> properties(String... strings) {
        return null;
    }
}

package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.*;

import java.util.Iterator;

/**
 * Created by ashishn on 8/4/15.
 */
public class RocksVertex extends RocksElement implements Vertex {

    public RocksVertex(Object id, String label, RocksGraph graph, Object[] keyValues) {
        super(id, label, graph, keyValues);
    }

    @Override
    protected void innerRemoveProperty(Property property) {

    }

    @Override
    protected Property createProperty(String key, Object value) {
        return null;
    }

    @Override
    protected void checkRemoved() {

    }

    @Override
    protected void innerRemove() {

    }

    @Override
    public Edge addEdge(String s, Vertex vertex, Object... objects) {
        return null;
    }

    @Override
    public <V> VertexProperty<V> property(String s, V v, Object... objects) {
        return null;
    }

    @Override
    public <V> VertexProperty<V> property(VertexProperty.Cardinality cardinality, String s, V v, Object... objects) {
        return null;
    }

    @Override
    public Iterator<Edge> edges(Direction direction, String... strings) {
        return null;
    }

    @Override
    public Iterator<Vertex> vertices(Direction direction, String... strings) {
        return null;
    }

    @Override
    public <V> Iterator<? extends Property<V>> properties(String... strings) {
        return null;
    }
}

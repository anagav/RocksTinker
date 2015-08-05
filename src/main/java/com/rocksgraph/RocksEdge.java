package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.util.ElementHelper;

import java.util.Iterator;

/**
 * Created by ashishn on 8/4/15.
 */
public class RocksEdge extends RocksElement implements Edge {

    protected Vertex inVertex;
    protected Vertex outVertex;

    public RocksEdge(final Object id, final String label, Object[] keyValues,
                     Vertex outVertex, Vertex inVertex, final RocksGraph graph) {
        super(id, label, graph, keyValues);
        this.outVertex = outVertex;
        this.inVertex = inVertex;
        ElementHelper.validateLabel(label);
    }


    @Override
    public Iterator<Vertex> vertices(Direction direction) {
        return null;
    }

    @Override
    protected void innerRemoveProperty(Property property) {

    }

    @Override
    protected Property createProperty(String key, Object value) {
        return          new RocksProperty<>(this, key, value);
        ;
    }

    @Override
    protected void checkRemoved() {

    }

    @Override
    protected void innerRemove() {

    }

    @Override
    public <V> Property<V> property(String s, V v) {
        return null;
    }

    @Override
    public <V> Iterator<? extends Property<V>> properties(String... strings) {
        return null;
    }
}

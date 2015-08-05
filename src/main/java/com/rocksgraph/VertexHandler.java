package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;

import java.util.Iterator;

/**
 * Created by ashishn on 8/4/15.
 */
public interface VertexHandler {
    Iterator<? extends Vertex> vertices();

    Iterator<? extends Vertex> vertices(Object[] vertexIds);

    Iterator<? extends Vertex> vertices(Predicates predicates);

    RocksVertex vertex(Object vertexId, String vertexLabel, Edge edge, Direction direction);

    RocksVertex addVertex(Object id, String label, Object[] properties);
}

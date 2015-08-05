package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ashishn on 8/4/15.
 */
public interface EdgeHandler {
    Iterator<Edge> edges();

    Iterator<Edge> edges(Object[] edgeIds);

    Iterator<Edge> edges(Predicates predicates);

    Map<Object, List<Edge>> edges(Iterator<RocksVertex> vertices, Direction direction, String[] edgeLabels, Predicates predicates);

    Edge addEdge(Object edgeId, String label, Vertex outV, Vertex inV, Object[] properties);
}

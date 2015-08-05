package com.rocksgraph;

import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
import org.rocksdb.RocksIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ashishn on 8/4/15.
 */
public class StorageHandler implements VertexHandler, EdgeHandler {
    RocksDB vertexDB;
    RocksDB edgeDB;

    public StorageHandler() throws RocksDBException {
        vertexDB = RocksDB.open("/tmp/vertices");
        edgeDB = RocksDB.open("/tmp/edges");
    }


    @Override
    public Iterator<Edge> edges() {
        RocksIterator iterator = edgeDB.newIterator();
        iterator.seekToFirst();
        return new Iterator<Edge>() {
            @Override
            public boolean hasNext() {
                return iterator.isValid();
            }

            @Override
            public Edge next() {
                Edge edge = new Rocks
                 iterator.next();
                return
            }
        };
    }

    @Override
    public Iterator<Edge> edges(Object[] edgeIds) {
        return null;
    }

    @Override
    public Iterator<Edge> edges(Predicates predicates) {
        return null;
    }

    @Override
    public Map<Object, List<Edge>> edges(Iterator<RocksVertex> vertices, Direction direction, String[] edgeLabels, Predicates predicates) {
        return null;
    }

    @Override
    public Edge addEdge(Object edgeId, String label, Vertex outV, Vertex inV, Object[] properties) {
        return null;
    }

    @Override
    public Iterator<? extends Vertex> vertices() {
        return null;
    }

    @Override
    public Iterator<? extends Vertex> vertices(Object[] vertexIds) {
        return null;
    }

    @Override
    public Iterator<? extends Vertex> vertices(Predicates predicates) {
        return null;
    }

    @Override
    public RocksVertex vertex(Object vertexId, String vertexLabel, Edge edge, Direction direction) {
        return null;
    }

    @Override
    public RocksVertex addVertex(Object id, String label, Object[] properties) {
        return null;
    }
}

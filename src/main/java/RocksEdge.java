import org.apache.tinkerpop.gremlin.structure.*;
import org.apache.tinkerpop.gremlin.structure.util.ElementHelper;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by ashishn on 8/4/15.
 */
public class RocksEdge extends RocksElement implements Edge {
    protected Map<String, Property> properties;
    protected final Vertex inVertex;
    protected final Vertex outVertex;

    protected RocksEdge(final Object id, final Vertex outVertex, final String label, final Vertex inVertex) {
        super(id, label);
        this.outVertex = outVertex;
        this.inVertex = inVertex;
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

    public <V> Property<V> property(String key, V value) {
        ElementHelper.validateProperty(key, value);

        return null;
    }

    public void remove() {

    }

    public <V> Iterator<? extends Property<V>> properties(String... strings) {
        return null;
    }
}

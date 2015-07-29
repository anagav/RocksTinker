package com.rockstinker;

import org.apache.tinkerpop.gremlin.structure.Element;

/**
 * Created by ashishn on 7/28/15.
 */
public abstract class RocksTinkerElement implements Element {
    protected final Object id;
    protected final String label;
    protected boolean removed = false;


    public RocksTinkerElement(Object id, String label) {
        this.id = id;
        this.label = label;
    }


    public Object id() {
        return this.id;
    }

    public String label() {
        return this.label;
    }
}

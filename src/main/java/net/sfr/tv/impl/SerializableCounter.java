package net.sfr.tv.impl;

import java.io.Serializable;
import net.sfr.tv.api.Counter;

/**
 *
 * @author matthieu.chaplin@sfr.com
 */
public class SerializableCounter implements Counter, Serializable {

    private Long count = Long.valueOf(0);

    @Override
    public void reset() {
        count = Long.valueOf(0);
    }
    
    @Override
    public void increment() {
        count++;
    }

    @Override
    public Long value() {
        return count;
    }
    
    @Override
    public String toString() {
        return count.toString();
    }
}

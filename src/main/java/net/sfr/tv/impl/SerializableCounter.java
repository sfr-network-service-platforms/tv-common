package net.sfr.tv.impl;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import net.sfr.tv.api.Counter;

/**
 *
 * @author matthieu.chaplin@sfr.com
 */
public class SerializableCounter implements Counter, Serializable {

    private AtomicLong count = new AtomicLong(0);

    @Override
    public void reset() {
        count = new AtomicLong(0);
    }
    
    @Override
    public void increment() {
        count.incrementAndGet();
    }

    @Override
    public Long value() {
        return count.get();
    }
    
    @Override
    public String toString() {
        return count.toString();
    }
}

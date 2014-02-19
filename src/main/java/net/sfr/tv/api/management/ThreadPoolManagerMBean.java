package net.sfr.tv.api.management;

/**
 *
 * @author matthieu
 */
public interface ThreadPoolManagerMBean extends PoolManagerMBean {
    
    public Integer getActiveThreadCount();
    
    public Integer getQueueSize();
    
}

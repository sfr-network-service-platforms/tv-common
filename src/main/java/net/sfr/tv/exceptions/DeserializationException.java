package net.sfr.tv.exceptions;

/**
 * Thrown upon content (XML or other) deserialization error.
 * 
 * @author matthieu.chaplin@sfr.com
 */
public class DeserializationException extends Exception {

    /**
     * @see Exception#Exception() 
     */
    public DeserializationException() {};

    /**
     * @see Exception#Exception(java.lang.String) 
     */
    public DeserializationException(String error) { super(error); };

    /**
     * @see Exception#Exception(java.lang.String, java.lang.Throwable)
     */
    public DeserializationException(String error, Exception nested) { super(error, nested); };

}

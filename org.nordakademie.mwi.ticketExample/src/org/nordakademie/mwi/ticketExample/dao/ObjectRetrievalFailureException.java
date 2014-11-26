package org.nordakademie.mwi.ticketExample.dao;

import java.io.Serializable;

/**
 * Thrown if an entity identified by technical key could not be found in the database although all preconditions of the finder
 * method are fulfilled and no technical error occured.
 * 
 */
public class ObjectRetrievalFailureException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs an exception with a message that the entity was not found.
     * 
     * @param id Technical id
     * @param name Name of the entity
     */
    public ObjectRetrievalFailureException(Serializable id, String name) {
        super(name + " with id=" + id + " not found");
    }

}

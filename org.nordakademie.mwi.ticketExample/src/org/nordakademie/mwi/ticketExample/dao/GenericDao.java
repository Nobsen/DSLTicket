package org.nordakademie.mwi.ticketExample.dao;

import java.io.Serializable;
import java.util.List;

import org.nordakademie.mwi.ticketExample.domain.DomainObject;
import org.springframework.orm.ObjectRetrievalFailureException;

/**
 * Basic data access object interface. Provides methods for querying domain objects by primary key or search criteria.
 * 
 * @param <T> Domain object type that is supported by a specific implementation
 * @param <ID> Specifies the technical entity id of the supported domain object type
 * 
 * @author PPI AG Informationstechnologie
 * @version $Revision: 638 $
 */
public interface GenericDao<T extends DomainObject, ID extends Serializable> {

    /**
     * Finds an object by its technical identifier.
     * 
     * @param id Identifier obtained when the object was persisted.
     * @return Object with the given identifier.
     * @throws ObjectRetrievalFailureException No object with the specified id was found
     */
    public T findById(ID id);

    /**
     * Returns all Objects of the given type.
     * 
     * @return All Objects of the given type. Empty list, if no objects found.
     */
    public List<T> findAll();

    /**
     * Synchronizes the session with the database.
     */
    public void flush();

    /**
     * Persists an entity, i.e. adds it to the list of managed objects.
     * 
     * @param entity The entity to persist
     * @return The persisted entity
     */
    public T makePersistent(T entity);

    /**
     * Makes the object transient, i.e. removes it from the list of managed objects.
     * 
     * @param entity Object to be made transient.
     */
    public void makeTransient(T entity);

    /**
     * Finds all objects of the persitent type and removes them from the list of managed objects.
     */
    public void deleteAll();
    
    /**
     * Counts all objects of the persitent type.
     */
    public long count();

    /**
     * Gets the current timestamp from the database.
     */
    public long currentDbTimeInMillis();
}

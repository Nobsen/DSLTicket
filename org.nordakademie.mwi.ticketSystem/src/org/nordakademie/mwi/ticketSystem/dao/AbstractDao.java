package org.nordakademie.mwi.ticketSystem.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.nordakademie.mwi.ticketSystem.domain.DomainObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Abstract superclass for all Hibernate-classes in this package. Implementation uses the plain Hibernate API. Using this API
 * means we don't automatically get nice Spring DataAccessExceptions from our data access code. This is why we add the
 * {@link Repository} annotation to our class. Completing the picture is the the
 * {@link org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor} to create a little proxy that does the
 * translation.
 * 
 * @param <T> Domain object type that is supported by a specific implementation
 * @param <ID> Specifies the technical entity id of the supported domain object type
 * 
 */
@Repository
public abstract class AbstractDao<T extends DomainObject, ID extends Serializable> implements GenericDao<T, ID> {

    /**
     * Class to be persisted.
     */
    private final Class<T> persistentClass;

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    private Class<T> getPersistentClass() {
        return persistentClass;
    }

    protected final Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public final T findById(ID id) {
        return findById(id, getPersistentClass());
    }

    @SuppressWarnings("unchecked")
    protected final <D extends DomainObject> D findById(ID id, Class<D> persistentClass) {
        // Als Default-Lockmode wird READ gewählt, WRITE ist zu hart, es konnte auch ohne LockMode möglich sein.
        final D entity = (D) getSession().get(persistentClass, id, LockMode.READ);
        if (entity == null) {
            throw new ObjectRetrievalFailureException(id, persistentClass.getName());
        }

        return entity;
    }

    public final List<T> findAll() {
        final List<Criterion> criterion = Collections.emptyList();
        final List<Order> order = getFindAllSortingOrder();
        return findByCriteria(criterion, order, isFindAllCaching());
    }

    boolean isFindAllCaching() {
        return true;
    }

    /**
     * Returns the default sorting order for this entity type used in {@link #findAll()}, which is initially set to ascending by
     * id.
     * 
     * <p>
     * Subtypes must override this method to get a different sorting order.
     * 
     * @return sorting order
     */
    protected List<Order> getFindAllSortingOrder() {
        return Arrays.asList(Order.asc("id"));
    }

    public final void flush() {
        getSession().flush();
    }

    /**
     * Finds objects by given criteria and order the result.
     * 
     * @param criterion criterion
     * @param order result order
     * @return Found objects
     */
    @SuppressWarnings("unchecked")
    protected final List<T> findByCriteria(final List<Criterion> criterion, final List<Order> order, boolean cacheable) {
        final Criteria crit = getSession().createCriteria(getPersistentClass());
        crit.setCacheable(cacheable);
        for (final Criterion c : criterion) {
            crit.add(c);
        }
        for (final Order o : order) {
            crit.addOrder(o);
        }
        return crit.list();
    }

    @Override
    public T makePersistent(T entity) {
        getSession().save(entity);
        return entity;
    }

    @Override
    public void makeTransient(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteAll() {
        final Collection<T> list = findAll();
        for (final T entity : list) {
            makeTransient(entity);
        }
    }

    public long count() {
        Query query = getSession().createQuery("select count(*) from " + getPersistentClass().getName());
        return (Long) query.uniqueResult();
    }
    
}

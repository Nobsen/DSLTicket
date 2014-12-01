/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.Role;
import org.nordakademie.mwi.tickets.tickets.Status;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketSystem;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TicketSystemImpl extends MinimalEObjectImpl.Container implements TicketSystem
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<Status> states;

  /**
   * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlows()
   * @generated
   * @ordered
   */
  protected EList<Flow> flows;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategories()
   * @generated
   * @ordered
   */
  protected EList<TicketCategory> categories;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TicketSystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TicketsPackage.Literals.TICKET_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Status> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<Status>(Status.class, this, TicketsPackage.TICKET_SYSTEM__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Flow> getFlows()
  {
    if (flows == null)
    {
      flows = new EObjectContainmentEList<Flow>(Flow.class, this, TicketsPackage.TICKET_SYSTEM__FLOWS);
    }
    return flows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, TicketsPackage.TICKET_SYSTEM__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TicketCategory> getCategories()
  {
    if (categories == null)
    {
      categories = new EObjectContainmentEList<TicketCategory>(TicketCategory.class, this, TicketsPackage.TICKET_SYSTEM__CATEGORIES);
    }
    return categories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, TicketsPackage.TICKET_SYSTEM__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TicketsPackage.TICKET_SYSTEM__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case TicketsPackage.TICKET_SYSTEM__FLOWS:
        return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
      case TicketsPackage.TICKET_SYSTEM__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case TicketsPackage.TICKET_SYSTEM__CATEGORIES:
        return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
      case TicketsPackage.TICKET_SYSTEM__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TicketsPackage.TICKET_SYSTEM__STATES:
        return getStates();
      case TicketsPackage.TICKET_SYSTEM__FLOWS:
        return getFlows();
      case TicketsPackage.TICKET_SYSTEM__FIELDS:
        return getFields();
      case TicketsPackage.TICKET_SYSTEM__CATEGORIES:
        return getCategories();
      case TicketsPackage.TICKET_SYSTEM__ROLES:
        return getRoles();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TicketsPackage.TICKET_SYSTEM__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends Status>)newValue);
        return;
      case TicketsPackage.TICKET_SYSTEM__FLOWS:
        getFlows().clear();
        getFlows().addAll((Collection<? extends Flow>)newValue);
        return;
      case TicketsPackage.TICKET_SYSTEM__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case TicketsPackage.TICKET_SYSTEM__CATEGORIES:
        getCategories().clear();
        getCategories().addAll((Collection<? extends TicketCategory>)newValue);
        return;
      case TicketsPackage.TICKET_SYSTEM__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TicketsPackage.TICKET_SYSTEM__STATES:
        getStates().clear();
        return;
      case TicketsPackage.TICKET_SYSTEM__FLOWS:
        getFlows().clear();
        return;
      case TicketsPackage.TICKET_SYSTEM__FIELDS:
        getFields().clear();
        return;
      case TicketsPackage.TICKET_SYSTEM__CATEGORIES:
        getCategories().clear();
        return;
      case TicketsPackage.TICKET_SYSTEM__ROLES:
        getRoles().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TicketsPackage.TICKET_SYSTEM__STATES:
        return states != null && !states.isEmpty();
      case TicketsPackage.TICKET_SYSTEM__FLOWS:
        return flows != null && !flows.isEmpty();
      case TicketsPackage.TICKET_SYSTEM__FIELDS:
        return fields != null && !fields.isEmpty();
      case TicketsPackage.TICKET_SYSTEM__CATEGORIES:
        return categories != null && !categories.isEmpty();
      case TicketsPackage.TICKET_SYSTEM__ROLES:
        return roles != null && !roles.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TicketSystemImpl

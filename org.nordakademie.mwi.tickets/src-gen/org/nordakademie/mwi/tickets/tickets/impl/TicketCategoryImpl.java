/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl#getTicketFields <em>Ticket Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TicketCategoryImpl extends MinimalEObjectImpl.Container implements TicketCategory
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFlow() <em>Flow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlow()
   * @generated
   * @ordered
   */
  protected Flow flow;

  /**
   * The cached value of the '{@link #getTicketFields() <em>Ticket Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTicketFields()
   * @generated
   * @ordered
   */
  protected EList<TicketField> ticketFields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TicketCategoryImpl()
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
    return TicketsPackage.Literals.TICKET_CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.TICKET_CATEGORY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.TICKET_CATEGORY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow getFlow()
  {
    if (flow != null && flow.eIsProxy())
    {
      InternalEObject oldFlow = (InternalEObject)flow;
      flow = (Flow)eResolveProxy(oldFlow);
      if (flow != oldFlow)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TicketsPackage.TICKET_CATEGORY__FLOW, oldFlow, flow));
      }
    }
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow basicGetFlow()
  {
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlow(Flow newFlow)
  {
    Flow oldFlow = flow;
    flow = newFlow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.TICKET_CATEGORY__FLOW, oldFlow, flow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TicketField> getTicketFields()
  {
    if (ticketFields == null)
    {
      ticketFields = new EObjectContainmentEList<TicketField>(TicketField.class, this, TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS);
    }
    return ticketFields;
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
      case TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS:
        return ((InternalEList<?>)getTicketFields()).basicRemove(otherEnd, msgs);
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
      case TicketsPackage.TICKET_CATEGORY__NAME:
        return getName();
      case TicketsPackage.TICKET_CATEGORY__DESCRIPTION:
        return getDescription();
      case TicketsPackage.TICKET_CATEGORY__FLOW:
        if (resolve) return getFlow();
        return basicGetFlow();
      case TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS:
        return getTicketFields();
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
      case TicketsPackage.TICKET_CATEGORY__NAME:
        setName((String)newValue);
        return;
      case TicketsPackage.TICKET_CATEGORY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TicketsPackage.TICKET_CATEGORY__FLOW:
        setFlow((Flow)newValue);
        return;
      case TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS:
        getTicketFields().clear();
        getTicketFields().addAll((Collection<? extends TicketField>)newValue);
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
      case TicketsPackage.TICKET_CATEGORY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TicketsPackage.TICKET_CATEGORY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TicketsPackage.TICKET_CATEGORY__FLOW:
        setFlow((Flow)null);
        return;
      case TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS:
        getTicketFields().clear();
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
      case TicketsPackage.TICKET_CATEGORY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TicketsPackage.TICKET_CATEGORY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TicketsPackage.TICKET_CATEGORY__FLOW:
        return flow != null;
      case TicketsPackage.TICKET_CATEGORY__TICKET_FIELDS:
        return ticketFields != null && !ticketFields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //TicketCategoryImpl

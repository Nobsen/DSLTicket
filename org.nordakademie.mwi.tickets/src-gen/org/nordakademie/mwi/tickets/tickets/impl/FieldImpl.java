/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.FieldType;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl#getFieldEnum <em>Field Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected static final FieldType FIELD_TYPE_EDEFAULT = FieldType.USER;

  /**
   * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected FieldType fieldType = FIELD_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFieldEnum() <em>Field Enum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldEnum()
   * @generated
   * @ordered
   */
  protected org.nordakademie.mwi.tickets.tickets.Enum fieldEnum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return TicketsPackage.Literals.FIELD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.FIELD__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType getFieldType()
  {
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldType(FieldType newFieldType)
  {
    FieldType oldFieldType = fieldType;
    fieldType = newFieldType == null ? FIELD_TYPE_EDEFAULT : newFieldType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.FIELD__FIELD_TYPE, oldFieldType, fieldType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.nordakademie.mwi.tickets.tickets.Enum getFieldEnum()
  {
    return fieldEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldEnum(org.nordakademie.mwi.tickets.tickets.Enum newFieldEnum, NotificationChain msgs)
  {
    org.nordakademie.mwi.tickets.tickets.Enum oldFieldEnum = fieldEnum;
    fieldEnum = newFieldEnum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TicketsPackage.FIELD__FIELD_ENUM, oldFieldEnum, newFieldEnum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldEnum(org.nordakademie.mwi.tickets.tickets.Enum newFieldEnum)
  {
    if (newFieldEnum != fieldEnum)
    {
      NotificationChain msgs = null;
      if (fieldEnum != null)
        msgs = ((InternalEObject)fieldEnum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TicketsPackage.FIELD__FIELD_ENUM, null, msgs);
      if (newFieldEnum != null)
        msgs = ((InternalEObject)newFieldEnum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TicketsPackage.FIELD__FIELD_ENUM, null, msgs);
      msgs = basicSetFieldEnum(newFieldEnum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.FIELD__FIELD_ENUM, newFieldEnum, newFieldEnum));
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
      case TicketsPackage.FIELD__FIELD_ENUM:
        return basicSetFieldEnum(null, msgs);
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
      case TicketsPackage.FIELD__NAME:
        return getName();
      case TicketsPackage.FIELD__LABEL:
        return getLabel();
      case TicketsPackage.FIELD__FIELD_TYPE:
        return getFieldType();
      case TicketsPackage.FIELD__FIELD_ENUM:
        return getFieldEnum();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TicketsPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case TicketsPackage.FIELD__LABEL:
        setLabel((String)newValue);
        return;
      case TicketsPackage.FIELD__FIELD_TYPE:
        setFieldType((FieldType)newValue);
        return;
      case TicketsPackage.FIELD__FIELD_ENUM:
        setFieldEnum((org.nordakademie.mwi.tickets.tickets.Enum)newValue);
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
      case TicketsPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TicketsPackage.FIELD__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TicketsPackage.FIELD__FIELD_TYPE:
        setFieldType(FIELD_TYPE_EDEFAULT);
        return;
      case TicketsPackage.FIELD__FIELD_ENUM:
        setFieldEnum((org.nordakademie.mwi.tickets.tickets.Enum)null);
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
      case TicketsPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TicketsPackage.FIELD__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TicketsPackage.FIELD__FIELD_TYPE:
        return fieldType != FIELD_TYPE_EDEFAULT;
      case TicketsPackage.FIELD__FIELD_ENUM:
        return fieldEnum != null;
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
    result.append(", label: ");
    result.append(label);
    result.append(", fieldType: ");
    result.append(fieldType);
    result.append(')');
    return result.toString();
  }

} //FieldImpl

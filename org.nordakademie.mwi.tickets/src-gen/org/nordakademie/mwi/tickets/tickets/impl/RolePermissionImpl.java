/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.Permission;
import org.nordakademie.mwi.tickets.tickets.RolePermission;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.RolePermissionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.impl.RolePermissionImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RolePermissionImpl extends MinimalEObjectImpl.Container implements RolePermission
{
  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected Field field;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<Permission> permissions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RolePermissionImpl()
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
    return TicketsPackage.Literals.ROLE_PERMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getField()
  {
    if (field != null && field.eIsProxy())
    {
      InternalEObject oldField = (InternalEObject)field;
      field = (Field)eResolveProxy(oldField);
      if (field != oldField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TicketsPackage.ROLE_PERMISSION__FIELD, oldField, field));
      }
    }
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field basicGetField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(Field newField)
  {
    Field oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TicketsPackage.ROLE_PERMISSION__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Permission> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EDataTypeEList<Permission>(Permission.class, this, TicketsPackage.ROLE_PERMISSION__PERMISSIONS);
    }
    return permissions;
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
      case TicketsPackage.ROLE_PERMISSION__FIELD:
        if (resolve) return getField();
        return basicGetField();
      case TicketsPackage.ROLE_PERMISSION__PERMISSIONS:
        return getPermissions();
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
      case TicketsPackage.ROLE_PERMISSION__FIELD:
        setField((Field)newValue);
        return;
      case TicketsPackage.ROLE_PERMISSION__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends Permission>)newValue);
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
      case TicketsPackage.ROLE_PERMISSION__FIELD:
        setField((Field)null);
        return;
      case TicketsPackage.ROLE_PERMISSION__PERMISSIONS:
        getPermissions().clear();
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
      case TicketsPackage.ROLE_PERMISSION__FIELD:
        return field != null;
      case TicketsPackage.ROLE_PERMISSION__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
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
    result.append(" (permissions: ");
    result.append(permissions);
    result.append(')');
    return result.toString();
  }

} //RolePermissionImpl

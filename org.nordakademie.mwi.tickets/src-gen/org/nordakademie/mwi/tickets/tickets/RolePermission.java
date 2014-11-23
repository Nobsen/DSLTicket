/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.RolePermission#getField <em>Field</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.RolePermission#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRolePermission()
 * @model
 * @generated
 */
public interface RolePermission extends EObject
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRolePermission_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.RolePermission#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>Permissions</b></em>' attribute list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Permission}.
   * The literals are from the enumeration {@link org.nordakademie.mwi.tickets.tickets.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' attribute list.
   * @see org.nordakademie.mwi.tickets.tickets.Permission
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRolePermission_Permissions()
   * @model unique="false"
   * @generated
   */
  EList<Permission> getPermissions();

} // RolePermission

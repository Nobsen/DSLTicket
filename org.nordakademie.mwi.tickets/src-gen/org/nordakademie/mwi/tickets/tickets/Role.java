/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Role#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Role#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Role#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Role#getPermission <em>Permission</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRole_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Role#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRole_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Role#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRole_Fields()
   * @model
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Permission</b></em>' attribute list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Permission}.
   * The literals are from the enumeration {@link org.nordakademie.mwi.tickets.tickets.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permission</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' attribute list.
   * @see org.nordakademie.mwi.tickets.tickets.Permission
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getRole_Permission()
   * @model unique="false"
   * @generated
   */
  EList<Permission> getPermission();

} // Role

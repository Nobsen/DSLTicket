/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Status#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Status#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends EObject
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getStatus_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Status#getName <em>Name</em>}' attribute.
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getStatus_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Status#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Status

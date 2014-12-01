/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Flow#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Flow#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getFlow_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Flow#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Status}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getFlow_States()
   * @model
   * @generated
   */
  EList<Status> getStates();

} // Flow

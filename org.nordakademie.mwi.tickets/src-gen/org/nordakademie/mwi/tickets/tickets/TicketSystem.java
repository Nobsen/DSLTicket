/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getStates <em>States</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem()
 * @model
 * @generated
 */
public interface TicketSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Flow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flows</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem_Flows()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getFlows();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.TicketCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem_Categories()
   * @model containment="true"
   * @generated
   */
  EList<TicketCategory> getCategories();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketSystem_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

} // TicketSystem

/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getTicketFields <em>Ticket Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketCategory()
 * @model
 * @generated
 */
public interface TicketCategory extends EObject
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketCategory_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getName <em>Name</em>}' attribute.
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketCategory_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Flow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow</em>' reference.
   * @see #setFlow(Flow)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketCategory_Flow()
   * @model
   * @generated
   */
  Flow getFlow();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getFlow <em>Flow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow</em>' reference.
   * @see #getFlow()
   * @generated
   */
  void setFlow(Flow value);

  /**
   * Returns the value of the '<em><b>Ticket Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.nordakademie.mwi.tickets.tickets.TicketField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ticket Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ticket Fields</em>' containment reference list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketCategory_TicketFields()
   * @model containment="true"
   * @generated
   */
  EList<TicketField> getTicketFields();

} // TicketCategory

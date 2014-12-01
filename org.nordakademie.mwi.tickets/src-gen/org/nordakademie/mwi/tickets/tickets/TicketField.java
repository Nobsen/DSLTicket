/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketField#getField <em>Field</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketField#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.TicketField#isNotOnList <em>Not On List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketField()
 * @model
 * @generated
 */
public interface TicketField extends EObject
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketField_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketField#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(boolean)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketField_Mandatory()
   * @model
   * @generated
   */
  boolean isMandatory();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketField#isMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #isMandatory()
   * @generated
   */
  void setMandatory(boolean value);

  /**
   * Returns the value of the '<em><b>Not On List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not On List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not On List</em>' attribute.
   * @see #setNotOnList(boolean)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getTicketField_NotOnList()
   * @model
   * @generated
   */
  boolean isNotOnList();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.TicketField#isNotOnList <em>Not On List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not On List</em>' attribute.
   * @see #isNotOnList()
   * @generated
   */
  void setNotOnList(boolean value);

} // TicketField

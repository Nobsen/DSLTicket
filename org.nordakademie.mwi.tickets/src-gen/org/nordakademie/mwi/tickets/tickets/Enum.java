/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Enum#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EObject
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute list.
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getEnum_Option()
   * @model unique="false"
   * @generated
   */
  EList<String> getOption();

} // Enum

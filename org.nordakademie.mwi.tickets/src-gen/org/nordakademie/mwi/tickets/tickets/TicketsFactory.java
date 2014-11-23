/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage
 * @generated
 */
public interface TicketsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TicketsFactory eINSTANCE = org.nordakademie.mwi.tickets.tickets.impl.TicketsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ticket System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ticket System</em>'.
   * @generated
   */
  TicketSystem createTicketSystem();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow</em>'.
   * @generated
   */
  Flow createFlow();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Ticket Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ticket Category</em>'.
   * @generated
   */
  TicketCategory createTicketCategory();

  /**
   * Returns a new object of class '<em>Ticket Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ticket Field</em>'.
   * @generated
   */
  TicketField createTicketField();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Role Permission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Permission</em>'.
   * @generated
   */
  RolePermission createRolePermission();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TicketsPackage getTicketsPackage();

} //TicketsFactory

/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Field#getName <em>Name</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Field#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldEnum <em>Field Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
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
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getField_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Field#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Field Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.nordakademie.mwi.tickets.tickets.FieldType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Type</em>' attribute.
   * @see org.nordakademie.mwi.tickets.tickets.FieldType
   * @see #setFieldType(FieldType)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getField_FieldType()
   * @model
   * @generated
   */
  FieldType getFieldType();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldType <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Type</em>' attribute.
   * @see org.nordakademie.mwi.tickets.tickets.FieldType
   * @see #getFieldType()
   * @generated
   */
  void setFieldType(FieldType value);

  /**
   * Returns the value of the '<em><b>Field Enum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Enum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Enum</em>' containment reference.
   * @see #setFieldEnum(org.nordakademie.mwi.tickets.tickets.Enum)
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#getField_FieldEnum()
   * @model containment="true"
   * @generated
   */
  org.nordakademie.mwi.tickets.tickets.Enum getFieldEnum();

  /**
   * Sets the value of the '{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldEnum <em>Field Enum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Enum</em>' containment reference.
   * @see #getFieldEnum()
   * @generated
   */
  void setFieldEnum(org.nordakademie.mwi.tickets.tickets.Enum value);

} // Field

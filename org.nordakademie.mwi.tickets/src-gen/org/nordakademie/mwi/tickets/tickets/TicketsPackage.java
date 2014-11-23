/**
 */
package org.nordakademie.mwi.tickets.tickets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nordakademie.mwi.tickets.tickets.TicketsFactory
 * @model kind="package"
 * @generated
 */
public interface TicketsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tickets";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nordakademie.org/mwi/tickets/Tickets";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tickets";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TicketsPackage eINSTANCE = org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl <em>Ticket System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getTicketSystem()
   * @generated
   */
  int TICKET_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM__STATES = 0;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM__FLOWS = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM__FIELDS = 2;

  /**
   * The feature id for the '<em><b>Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM__CATEGORIES = 3;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM__ROLES = 4;

  /**
   * The number of structural features of the '<em>Ticket System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_SYSTEM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.StateImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.FlowImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__STATES = 1;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.FieldImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getField()
   * @generated
   */
  int FIELD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LABEL = 1;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIELD_TYPE = 2;

  /**
   * The feature id for the '<em><b>Field Enum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FIELD_ENUM = 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.EnumImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 4;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__OPTION = 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl <em>Ticket Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getTicketCategory()
   * @generated
   */
  int TICKET_CATEGORY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_CATEGORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_CATEGORY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Flow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_CATEGORY__FLOW = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_CATEGORY__FIELDS = 3;

  /**
   * The number of structural features of the '<em>Ticket Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TICKET_CATEGORY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.impl.RoleImpl
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getRole()
   * @generated
   */
  int ROLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__FIELDS = 2;

  /**
   * The feature id for the '<em><b>Permission</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__PERMISSION = 3;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.Permission <em>Permission</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.Permission
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getPermission()
   * @generated
   */
  int PERMISSION = 7;

  /**
   * The meta object id for the '{@link org.nordakademie.mwi.tickets.tickets.FieldType <em>Field Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nordakademie.mwi.tickets.tickets.FieldType
   * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 8;


  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem <em>Ticket System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ticket System</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem
   * @generated
   */
  EClass getTicketSystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem#getStates()
   * @see #getTicketSystem()
   * @generated
   */
  EReference getTicketSystem_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem#getFlows()
   * @see #getTicketSystem()
   * @generated
   */
  EReference getTicketSystem_Flows();

  /**
   * Returns the meta object for the containment reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem#getFields()
   * @see #getTicketSystem()
   * @generated
   */
  EReference getTicketSystem_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getCategories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Categories</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem#getCategories()
   * @see #getTicketSystem()
   * @generated
   */
  EReference getTicketSystem_Categories();

  /**
   * Returns the meta object for the containment reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketSystem#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketSystem#getRoles()
   * @see #getTicketSystem()
   * @generated
   */
  EReference getTicketSystem_Roles();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.State#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.State#getDescription()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Description();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Flow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Flow#getName()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_Name();

  /**
   * Returns the meta object for the reference list '{@link org.nordakademie.mwi.tickets.tickets.Flow#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>States</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Flow#getStates()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_States();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Field#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Field#getLabel()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Label();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Field#getFieldType()
   * @see #getField()
   * @generated
   */
  EAttribute getField_FieldType();

  /**
   * Returns the meta object for the containment reference '{@link org.nordakademie.mwi.tickets.tickets.Field#getFieldEnum <em>Field Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Enum</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Field#getFieldEnum()
   * @see #getField()
   * @generated
   */
  EReference getField_FieldEnum();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link org.nordakademie.mwi.tickets.tickets.Enum#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Option</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Enum#getOption()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Option();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory <em>Ticket Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ticket Category</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketCategory
   * @generated
   */
  EClass getTicketCategory();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketCategory#getName()
   * @see #getTicketCategory()
   * @generated
   */
  EAttribute getTicketCategory_Name();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketCategory#getDescription()
   * @see #getTicketCategory()
   * @generated
   */
  EAttribute getTicketCategory_Description();

  /**
   * Returns the meta object for the reference '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Flow</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketCategory#getFlow()
   * @see #getTicketCategory()
   * @generated
   */
  EReference getTicketCategory_Flow();

  /**
   * Returns the meta object for the reference list '{@link org.nordakademie.mwi.tickets.tickets.TicketCategory#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.TicketCategory#getFields()
   * @see #getTicketCategory()
   * @generated
   */
  EReference getTicketCategory_Fields();

  /**
   * Returns the meta object for class '{@link org.nordakademie.mwi.tickets.tickets.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for the attribute '{@link org.nordakademie.mwi.tickets.tickets.Role#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Role#getDescription()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Description();

  /**
   * Returns the meta object for the reference list '{@link org.nordakademie.mwi.tickets.tickets.Role#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Role#getFields()
   * @see #getRole()
   * @generated
   */
  EReference getRole_Fields();

  /**
   * Returns the meta object for the attribute list '{@link org.nordakademie.mwi.tickets.tickets.Role#getPermission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Permission</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Role#getPermission()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Permission();

  /**
   * Returns the meta object for enum '{@link org.nordakademie.mwi.tickets.tickets.Permission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Permission</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.Permission
   * @generated
   */
  EEnum getPermission();

  /**
   * Returns the meta object for enum '{@link org.nordakademie.mwi.tickets.tickets.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Field Type</em>'.
   * @see org.nordakademie.mwi.tickets.tickets.FieldType
   * @generated
   */
  EEnum getFieldType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TicketsFactory getTicketsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl <em>Ticket System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketSystemImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getTicketSystem()
     * @generated
     */
    EClass TICKET_SYSTEM = eINSTANCE.getTicketSystem();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_SYSTEM__STATES = eINSTANCE.getTicketSystem_States();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_SYSTEM__FLOWS = eINSTANCE.getTicketSystem_Flows();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_SYSTEM__FIELDS = eINSTANCE.getTicketSystem_Fields();

    /**
     * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_SYSTEM__CATEGORIES = eINSTANCE.getTicketSystem_Categories();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_SYSTEM__ROLES = eINSTANCE.getTicketSystem_Roles();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.StateImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__DESCRIPTION = eINSTANCE.getState_Description();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.FlowImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__NAME = eINSTANCE.getFlow_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__STATES = eINSTANCE.getFlow_States();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.FieldImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__LABEL = eINSTANCE.getField_Label();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__FIELD_TYPE = eINSTANCE.getField_FieldType();

    /**
     * The meta object literal for the '<em><b>Field Enum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__FIELD_ENUM = eINSTANCE.getField_FieldEnum();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.EnumImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__OPTION = eINSTANCE.getEnum_Option();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl <em>Ticket Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketCategoryImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getTicketCategory()
     * @generated
     */
    EClass TICKET_CATEGORY = eINSTANCE.getTicketCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TICKET_CATEGORY__NAME = eINSTANCE.getTicketCategory_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TICKET_CATEGORY__DESCRIPTION = eINSTANCE.getTicketCategory_Description();

    /**
     * The meta object literal for the '<em><b>Flow</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_CATEGORY__FLOW = eINSTANCE.getTicketCategory_Flow();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TICKET_CATEGORY__FIELDS = eINSTANCE.getTicketCategory_Fields();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.impl.RoleImpl
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE__FIELDS = eINSTANCE.getRole_Fields();

    /**
     * The meta object literal for the '<em><b>Permission</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__PERMISSION = eINSTANCE.getRole_Permission();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.Permission <em>Permission</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.Permission
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getPermission()
     * @generated
     */
    EEnum PERMISSION = eINSTANCE.getPermission();

    /**
     * The meta object literal for the '{@link org.nordakademie.mwi.tickets.tickets.FieldType <em>Field Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nordakademie.mwi.tickets.tickets.FieldType
     * @see org.nordakademie.mwi.tickets.tickets.impl.TicketsPackageImpl#getFieldType()
     * @generated
     */
    EEnum FIELD_TYPE = eINSTANCE.getFieldType();

  }

} //TicketsPackage

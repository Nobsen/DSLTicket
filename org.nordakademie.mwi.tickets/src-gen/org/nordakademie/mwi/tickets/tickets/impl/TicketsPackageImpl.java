/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.FieldType;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.Permission;
import org.nordakademie.mwi.tickets.tickets.Role;
import org.nordakademie.mwi.tickets.tickets.RolePermission;
import org.nordakademie.mwi.tickets.tickets.Status;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;
import org.nordakademie.mwi.tickets.tickets.TicketSystem;
import org.nordakademie.mwi.tickets.tickets.TicketsFactory;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TicketsPackageImpl extends EPackageImpl implements TicketsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ticketSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ticketCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ticketFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rolePermissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum permissionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fieldTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.nordakademie.mwi.tickets.tickets.TicketsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TicketsPackageImpl()
  {
    super(eNS_URI, TicketsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TicketsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TicketsPackage init()
  {
    if (isInited) return (TicketsPackage)EPackage.Registry.INSTANCE.getEPackage(TicketsPackage.eNS_URI);

    // Obtain or create and register package
    TicketsPackageImpl theTicketsPackage = (TicketsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TicketsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TicketsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTicketsPackage.createPackageContents();

    // Initialize created meta-data
    theTicketsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTicketsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TicketsPackage.eNS_URI, theTicketsPackage);
    return theTicketsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTicketSystem()
  {
    return ticketSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketSystem_States()
  {
    return (EReference)ticketSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketSystem_Flows()
  {
    return (EReference)ticketSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketSystem_Fields()
  {
    return (EReference)ticketSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketSystem_Categories()
  {
    return (EReference)ticketSystemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketSystem_Roles()
  {
    return (EReference)ticketSystemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatus()
  {
    return statusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatus_Name()
  {
    return (EAttribute)statusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatus_Description()
  {
    return (EAttribute)statusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlow()
  {
    return flowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlow_Name()
  {
    return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlow_States()
  {
    return (EReference)flowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Label()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_FieldType()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_FieldEnum()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnum_Option()
  {
    return (EAttribute)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTicketCategory()
  {
    return ticketCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTicketCategory_Name()
  {
    return (EAttribute)ticketCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTicketCategory_Description()
  {
    return (EAttribute)ticketCategoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketCategory_Flow()
  {
    return (EReference)ticketCategoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketCategory_TicketFields()
  {
    return (EReference)ticketCategoryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTicketField()
  {
    return ticketFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTicketField_Field()
  {
    return (EReference)ticketFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTicketField_Mandatory()
  {
    return (EAttribute)ticketFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTicketField_NotOnList()
  {
    return (EAttribute)ticketFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Description()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRole_Rolepermissions()
  {
    return (EReference)roleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRolePermission()
  {
    return rolePermissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolePermission_Field()
  {
    return (EReference)rolePermissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRolePermission_Permissions()
  {
    return (EAttribute)rolePermissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPermission()
  {
    return permissionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFieldType()
  {
    return fieldTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketsFactory getTicketsFactory()
  {
    return (TicketsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ticketSystemEClass = createEClass(TICKET_SYSTEM);
    createEReference(ticketSystemEClass, TICKET_SYSTEM__STATES);
    createEReference(ticketSystemEClass, TICKET_SYSTEM__FLOWS);
    createEReference(ticketSystemEClass, TICKET_SYSTEM__FIELDS);
    createEReference(ticketSystemEClass, TICKET_SYSTEM__CATEGORIES);
    createEReference(ticketSystemEClass, TICKET_SYSTEM__ROLES);

    statusEClass = createEClass(STATUS);
    createEAttribute(statusEClass, STATUS__NAME);
    createEAttribute(statusEClass, STATUS__DESCRIPTION);

    flowEClass = createEClass(FLOW);
    createEAttribute(flowEClass, FLOW__NAME);
    createEReference(flowEClass, FLOW__STATES);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__NAME);
    createEAttribute(fieldEClass, FIELD__LABEL);
    createEAttribute(fieldEClass, FIELD__FIELD_TYPE);
    createEReference(fieldEClass, FIELD__FIELD_ENUM);

    enumEClass = createEClass(ENUM);
    createEAttribute(enumEClass, ENUM__OPTION);

    ticketCategoryEClass = createEClass(TICKET_CATEGORY);
    createEAttribute(ticketCategoryEClass, TICKET_CATEGORY__NAME);
    createEAttribute(ticketCategoryEClass, TICKET_CATEGORY__DESCRIPTION);
    createEReference(ticketCategoryEClass, TICKET_CATEGORY__FLOW);
    createEReference(ticketCategoryEClass, TICKET_CATEGORY__TICKET_FIELDS);

    ticketFieldEClass = createEClass(TICKET_FIELD);
    createEReference(ticketFieldEClass, TICKET_FIELD__FIELD);
    createEAttribute(ticketFieldEClass, TICKET_FIELD__MANDATORY);
    createEAttribute(ticketFieldEClass, TICKET_FIELD__NOT_ON_LIST);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);
    createEAttribute(roleEClass, ROLE__DESCRIPTION);
    createEReference(roleEClass, ROLE__ROLEPERMISSIONS);

    rolePermissionEClass = createEClass(ROLE_PERMISSION);
    createEReference(rolePermissionEClass, ROLE_PERMISSION__FIELD);
    createEAttribute(rolePermissionEClass, ROLE_PERMISSION__PERMISSIONS);

    // Create enums
    permissionEEnum = createEEnum(PERMISSION);
    fieldTypeEEnum = createEEnum(FIELD_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(ticketSystemEClass, TicketSystem.class, "TicketSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTicketSystem_States(), this.getStatus(), null, "states", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketSystem_Flows(), this.getFlow(), null, "flows", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketSystem_Fields(), this.getField(), null, "fields", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketSystem_Categories(), this.getTicketCategory(), null, "categories", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketSystem_Roles(), this.getRole(), null, "roles", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatus_Name(), ecorePackage.getEString(), "name", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatus_Description(), ecorePackage.getEString(), "description", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlow_States(), this.getStatus(), null, "states", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Label(), ecorePackage.getEString(), "label", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_FieldType(), this.getFieldType(), "fieldType", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_FieldEnum(), this.getEnum(), null, "fieldEnum", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, org.nordakademie.mwi.tickets.tickets.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnum_Option(), ecorePackage.getEString(), "option", null, 0, -1, org.nordakademie.mwi.tickets.tickets.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ticketCategoryEClass, TicketCategory.class, "TicketCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTicketCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, TicketCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTicketCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, TicketCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketCategory_Flow(), this.getFlow(), null, "flow", null, 0, 1, TicketCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTicketCategory_TicketFields(), this.getTicketField(), null, "ticketFields", null, 0, -1, TicketCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ticketFieldEClass, TicketField.class, "TicketField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTicketField_Field(), this.getField(), null, "field", null, 0, 1, TicketField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTicketField_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, TicketField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTicketField_NotOnList(), ecorePackage.getEBoolean(), "notOnList", null, 0, 1, TicketField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRole_Rolepermissions(), this.getRolePermission(), null, "rolepermissions", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rolePermissionEClass, RolePermission.class, "RolePermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRolePermission_Field(), this.getField(), null, "field", null, 0, 1, RolePermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRolePermission_Permissions(), this.getPermission(), "permissions", null, 0, -1, RolePermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(permissionEEnum, Permission.class, "Permission");
    addEEnumLiteral(permissionEEnum, Permission.CREATE);
    addEEnumLiteral(permissionEEnum, Permission.READ);
    addEEnumLiteral(permissionEEnum, Permission.MODIFY);
    addEEnumLiteral(permissionEEnum, Permission.DELETE);

    initEEnum(fieldTypeEEnum, FieldType.class, "FieldType");
    addEEnumLiteral(fieldTypeEEnum, FieldType.USER);
    addEEnumLiteral(fieldTypeEEnum, FieldType.STRING);
    addEEnumLiteral(fieldTypeEEnum, FieldType.DATE);
    addEEnumLiteral(fieldTypeEEnum, FieldType.DATE_TIME);
    addEEnumLiteral(fieldTypeEEnum, FieldType.INT);
    addEEnumLiteral(fieldTypeEEnum, FieldType.DECIMAL);

    // Create resource
    createResource(eNS_URI);
  }

} //TicketsPackageImpl

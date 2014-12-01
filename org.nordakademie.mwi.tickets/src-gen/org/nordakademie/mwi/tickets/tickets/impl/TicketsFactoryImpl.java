/**
 */
package org.nordakademie.mwi.tickets.tickets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TicketsFactoryImpl extends EFactoryImpl implements TicketsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TicketsFactory init()
  {
    try
    {
      TicketsFactory theTicketsFactory = (TicketsFactory)EPackage.Registry.INSTANCE.getEFactory(TicketsPackage.eNS_URI);
      if (theTicketsFactory != null)
      {
        return theTicketsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TicketsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TicketsPackage.TICKET_SYSTEM: return createTicketSystem();
      case TicketsPackage.STATUS: return createStatus();
      case TicketsPackage.FLOW: return createFlow();
      case TicketsPackage.FIELD: return createField();
      case TicketsPackage.ENUM: return createEnum();
      case TicketsPackage.TICKET_CATEGORY: return createTicketCategory();
      case TicketsPackage.TICKET_FIELD: return createTicketField();
      case TicketsPackage.ROLE: return createRole();
      case TicketsPackage.ROLE_PERMISSION: return createRolePermission();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TicketsPackage.PERMISSION:
        return createPermissionFromString(eDataType, initialValue);
      case TicketsPackage.FIELD_TYPE:
        return createFieldTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case TicketsPackage.PERMISSION:
        return convertPermissionToString(eDataType, instanceValue);
      case TicketsPackage.FIELD_TYPE:
        return convertFieldTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketSystem createTicketSystem()
  {
    TicketSystemImpl ticketSystem = new TicketSystemImpl();
    return ticketSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Status createStatus()
  {
    StatusImpl status = new StatusImpl();
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.nordakademie.mwi.tickets.tickets.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketCategory createTicketCategory()
  {
    TicketCategoryImpl ticketCategory = new TicketCategoryImpl();
    return ticketCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketField createTicketField()
  {
    TicketFieldImpl ticketField = new TicketFieldImpl();
    return ticketField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RolePermission createRolePermission()
  {
    RolePermissionImpl rolePermission = new RolePermissionImpl();
    return rolePermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Permission createPermissionFromString(EDataType eDataType, String initialValue)
  {
    Permission result = Permission.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPermissionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldTypeFromString(EDataType eDataType, String initialValue)
  {
    FieldType result = FieldType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFieldTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TicketsPackage getTicketsPackage()
  {
    return (TicketsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TicketsPackage getPackage()
  {
    return TicketsPackage.eINSTANCE;
  }

} //TicketsFactoryImpl

package org.nordakademie.mwi.tickets.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.nordakademie.mwi.tickets.services.TicketsGrammarAccess;
import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.Role;
import org.nordakademie.mwi.tickets.tickets.RolePermission;
import org.nordakademie.mwi.tickets.tickets.Status;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;
import org.nordakademie.mwi.tickets.tickets.TicketSystem;
import org.nordakademie.mwi.tickets.tickets.TicketsPackage;

@SuppressWarnings("all")
public class TicketsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TicketsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TicketsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TicketsPackage.ENUM:
				if(context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (org.nordakademie.mwi.tickets.tickets.Enum) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.FLOW:
				if(context == grammarAccess.getFlowRule()) {
					sequence_Flow(context, (Flow) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.ROLE_PERMISSION:
				if(context == grammarAccess.getRolePermissionRule()) {
					sequence_RolePermission(context, (RolePermission) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.STATUS:
				if(context == grammarAccess.getStatusRule()) {
					sequence_Status(context, (Status) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.TICKET_CATEGORY:
				if(context == grammarAccess.getTicketCategoryRule()) {
					sequence_TicketCategory(context, (TicketCategory) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.TICKET_FIELD:
				if(context == grammarAccess.getTicketFieldRule()) {
					sequence_TicketField(context, (TicketField) semanticObject); 
					return; 
				}
				else break;
			case TicketsPackage.TICKET_SYSTEM:
				if(context == grammarAccess.getTicketSystemRule()) {
					sequence_TicketSystem(context, (TicketSystem) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (option+=STRING option+=STRING*)
	 */
	protected void sequence_Enum(EObject context, org.nordakademie.mwi.tickets.tickets.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName label=STRING (fieldType=FieldType | fieldEnum=Enum))
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName states+=[Status|QualifiedName]*)
	 */
	protected void sequence_Flow(EObject context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=[Field|QualifiedName] permissions+=Permission permissions+=Permission*)
	 */
	protected void sequence_RolePermission(EObject context, RolePermission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName description=STRING rolepermissions+=RolePermission*)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName description=STRING)
	 */
	protected void sequence_Status(EObject context, Status semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TicketsPackage.Literals.STATUS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TicketsPackage.Literals.STATUS__NAME));
			if(transientValues.isValueTransient(semanticObject, TicketsPackage.Literals.STATUS__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TicketsPackage.Literals.STATUS__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName description=STRING flow=[Flow|QualifiedName]? ticketFields+=TicketField*)
	 */
	protected void sequence_TicketCategory(EObject context, TicketCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=[Field|QualifiedName] mandatory?='mandatory'? notOnList?='notOnList'?)
	 */
	protected void sequence_TicketField(EObject context, TicketField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (states+=Status | flows+=Flow | fields+=Field | categories+=TicketCategory | roles+=Role)*
	 */
	protected void sequence_TicketSystem(EObject context, TicketSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

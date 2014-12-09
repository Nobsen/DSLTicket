/*
* generated by Xtext
*/
package org.nordakademie.mwi.tickets.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.nordakademie.mwi.tickets.services.TicketsGrammarAccess;

public class TicketsParser extends AbstractContentAssistParser {
	
	@Inject
	private TicketsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal.InternalTicketsParser createParser() {
		org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal.InternalTicketsParser result = new org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal.InternalTicketsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTicketSystemAccess().getAlternatives(), "rule__TicketSystem__Alternatives");
					put(grammarAccess.getFieldAccess().getAlternatives_3(), "rule__Field__Alternatives_3");
					put(grammarAccess.getPermissionAccess().getAlternatives(), "rule__Permission__Alternatives");
					put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
					put(grammarAccess.getStatusAccess().getGroup(), "rule__Status__Group__0");
					put(grammarAccess.getFlowAccess().getGroup(), "rule__Flow__Group__0");
					put(grammarAccess.getFlowAccess().getGroup_3(), "rule__Flow__Group_3__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumAccess().getGroup_2(), "rule__Enum__Group_2__0");
					put(grammarAccess.getTicketCategoryAccess().getGroup(), "rule__TicketCategory__Group__0");
					put(grammarAccess.getTicketCategoryAccess().getGroup_4(), "rule__TicketCategory__Group_4__0");
					put(grammarAccess.getTicketCategoryAccess().getGroup_6(), "rule__TicketCategory__Group_6__0");
					put(grammarAccess.getTicketFieldAccess().getGroup(), "rule__TicketField__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_4(), "rule__Role__Group_4__0");
					put(grammarAccess.getRolePermissionAccess().getGroup(), "rule__RolePermission__Group__0");
					put(grammarAccess.getRolePermissionAccess().getGroup_2(), "rule__RolePermission__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getTicketSystemAccess().getStatesAssignment_0(), "rule__TicketSystem__StatesAssignment_0");
					put(grammarAccess.getTicketSystemAccess().getFlowsAssignment_1(), "rule__TicketSystem__FlowsAssignment_1");
					put(grammarAccess.getTicketSystemAccess().getFieldsAssignment_2(), "rule__TicketSystem__FieldsAssignment_2");
					put(grammarAccess.getTicketSystemAccess().getCategoriesAssignment_3(), "rule__TicketSystem__CategoriesAssignment_3");
					put(grammarAccess.getTicketSystemAccess().getRolesAssignment_4(), "rule__TicketSystem__RolesAssignment_4");
					put(grammarAccess.getStatusAccess().getNameAssignment_1(), "rule__Status__NameAssignment_1");
					put(grammarAccess.getStatusAccess().getDescriptionAssignment_2(), "rule__Status__DescriptionAssignment_2");
					put(grammarAccess.getFlowAccess().getNameAssignment_1(), "rule__Flow__NameAssignment_1");
					put(grammarAccess.getFlowAccess().getStatesAssignment_3_0(), "rule__Flow__StatesAssignment_3_0");
					put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
					put(grammarAccess.getFieldAccess().getLabelAssignment_2(), "rule__Field__LabelAssignment_2");
					put(grammarAccess.getFieldAccess().getFieldTypeAssignment_3_0(), "rule__Field__FieldTypeAssignment_3_0");
					put(grammarAccess.getFieldAccess().getFieldEnumAssignment_3_1(), "rule__Field__FieldEnumAssignment_3_1");
					put(grammarAccess.getEnumAccess().getOptionAssignment_1(), "rule__Enum__OptionAssignment_1");
					put(grammarAccess.getEnumAccess().getOptionAssignment_2_1(), "rule__Enum__OptionAssignment_2_1");
					put(grammarAccess.getTicketCategoryAccess().getNameAssignment_1(), "rule__TicketCategory__NameAssignment_1");
					put(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2(), "rule__TicketCategory__DescriptionAssignment_2");
					put(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4_1(), "rule__TicketCategory__FlowAssignment_4_1");
					put(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0(), "rule__TicketCategory__TicketFieldsAssignment_6_0");
					put(grammarAccess.getTicketFieldAccess().getFieldAssignment_0(), "rule__TicketField__FieldAssignment_0");
					put(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1(), "rule__TicketField__MandatoryAssignment_1");
					put(grammarAccess.getTicketFieldAccess().getNotOnListAssignment_2(), "rule__TicketField__NotOnListAssignment_2");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getDescriptionAssignment_2(), "rule__Role__DescriptionAssignment_2");
					put(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0(), "rule__Role__RolepermissionsAssignment_4_0");
					put(grammarAccess.getRolePermissionAccess().getFieldAssignment_0(), "rule__RolePermission__FieldAssignment_0");
					put(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1(), "rule__RolePermission__PermissionsAssignment_1");
					put(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1(), "rule__RolePermission__PermissionsAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal.InternalTicketsParser typedParser = (org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal.InternalTicketsParser) parser;
			typedParser.entryRuleTicketSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TicketsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TicketsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

/*
* generated by Xtext
*/
grammar InternalTickets;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.nordakademie.mwi.tickets.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.nordakademie.mwi.tickets.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.nordakademie.mwi.tickets.services.TicketsGrammarAccess;

}

@parser::members {

 	private TicketsGrammarAccess grammarAccess;
 	
    public InternalTicketsParser(TokenStream input, TicketsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "TicketSystem";	
   	}
   	
   	@Override
   	protected TicketsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleTicketSystem
entryRuleTicketSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTicketSystemRule()); }
	 iv_ruleTicketSystem=ruleTicketSystem 
	 { $current=$iv_ruleTicketSystem.current; } 
	 EOF 
;

// Rule TicketSystem
ruleTicketSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTicketSystemAccess().getStatesStateParserRuleCall_0_0()); 
	    }
		lv_states_0_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketSystemRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_0_0, 
        		"State");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
	    }
		lv_flows_1_0=ruleFlow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketSystemRule());
	        }
       		add(
       			$current, 
       			"flows",
        		lv_flows_1_0, 
        		"Flow");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
	    }
		lv_fields_2_0=ruleField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketSystemRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_2_0, 
        		"Field");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
	    }
		lv_categories_3_0=ruleTicketCategory		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketSystemRule());
	        }
       		add(
       			$current, 
       			"categories",
        		lv_categories_3_0, 
        		"TicketCategory");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
	    }
		lv_roles_4_0=ruleRole		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketSystemRule());
	        }
       		add(
       			$current, 
       			"roles",
        		lv_roles_4_0, 
        		"Role");
	        afterParserOrEnumRuleCall();
	    }

)
))*
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='state' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_description_2_0=RULE_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleFlow
entryRuleFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFlowRule()); }
	 iv_ruleFlow=ruleFlow 
	 { $current=$iv_ruleFlow.current; } 
	 EOF 
;

// Rule Flow
ruleFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlowKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlowRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFlowRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getFlowAccess().getStatesStateCrossReference_3_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFlowAccess().getCommaKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFlowRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getFlowAccess().getStatesStateCrossReference_4_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFlowAccess().getSemicolonKeyword_5());
    }
	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleField
entryRuleField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	 iv_ruleField=ruleField 
	 { $current=$iv_ruleField.current; } 
	 EOF 
;

// Rule Field
ruleField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='field' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
	    }
		lv_fieldType_3_0=ruleFieldType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"fieldType",
        		lv_fieldType_3_0, 
        		"FieldType");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
	    }
		lv_fieldEnum_4_0=ruleEnum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"fieldEnum",
        		lv_fieldEnum_4_0, 
        		"Enum");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	 iv_ruleEnum=ruleEnum 
	 { $current=$iv_ruleEnum.current; } 
	 EOF 
;

// Rule Enum
ruleEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_option_0_0=RULE_STRING
		{
			newLeafNode(lv_option_0_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"option",
        		lv_option_0_0, 
        		"STRING");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getCommaKeyword_1_0());
    }
(
(
		lv_option_2_0=RULE_STRING
		{
			newLeafNode(lv_option_2_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"option",
        		lv_option_2_0, 
        		"STRING");
	    }

)
))*)
;





// Entry rule entryRuleTicketCategory
entryRuleTicketCategory returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTicketCategoryRule()); }
	 iv_ruleTicketCategory=ruleTicketCategory 
	 { $current=$iv_ruleTicketCategory.current; } 
	 EOF 
;

// Rule TicketCategory
ruleTicketCategory returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ticketCategory' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketCategoryRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_description_2_0=RULE_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTicketCategoryRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTicketCategoryRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
	    }
		lv_ticketFields_6_0=ruleTicketField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTicketCategoryRule());
	        }
       		add(
       			$current, 
       			"ticketFields",
        		lv_ticketFields_6_0, 
        		"TicketField");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1());
    }
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleTicketField
entryRuleTicketField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTicketFieldRule()); }
	 iv_ruleTicketField=ruleTicketField 
	 { $current=$iv_ruleTicketField.current; } 
	 EOF 
;

// Rule TicketField
ruleTicketField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTicketFieldRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_mandatory_1_0=	'mandatory' 
    {
        newLeafNode(lv_mandatory_1_0, grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTicketFieldRule());
	        }
       		setWithLastConsumed($current, "mandatory", true, "mandatory");
	    }

)
)?)
;





// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	 iv_ruleRole=ruleRole 
	 { $current=$iv_ruleRole.current; } 
	 EOF 
;

// Rule Role
ruleRole returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='role' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRoleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_description_2_0=RULE_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRoleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"STRING");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
	    }
		lv_rolepermissions_4_0=ruleRolePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRoleRule());
	        }
       		add(
       			$current, 
       			"rolepermissions",
        		lv_rolepermissions_4_0, 
        		"RolePermission");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSemicolonKeyword_4_1());
    }
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleRolePermission
entryRuleRolePermission returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRolePermissionRule()); }
	 iv_ruleRolePermission=ruleRolePermission 
	 { $current=$iv_ruleRolePermission.current; } 
	 EOF 
;

// Rule RolePermission
ruleRolePermission returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRolePermissionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
	    }
		lv_permissions_1_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRolePermissionRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_1_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
	    }
		lv_permissions_3_0=rulePermission		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRolePermissionRule());
	        }
       		add(
       			$current, 
       			"permissions",
        		lv_permissions_3_0, 
        		"Permission");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule Permission
rulePermission returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='create' 
	{
        $current = grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='read' 
	{
        $current = grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='modify' 
	{
        $current = grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='delete' 
	{
        $current = grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3()); 
    }
));



// Rule FieldType
ruleFieldType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='user' 
	{
        $current = grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='string' 
	{
        $current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='date' 
	{
        $current = grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='dateTime' 
	{
        $current = grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='int' 
	{
        $current = grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='decimal' 
	{
        $current = grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



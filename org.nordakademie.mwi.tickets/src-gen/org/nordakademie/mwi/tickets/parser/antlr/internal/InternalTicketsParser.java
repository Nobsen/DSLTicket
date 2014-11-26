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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTicketsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "';'", "'flow'", "'{'", "','", "'}'", "'field'", "'ticketCategory'", "'fields {'", "'mandatory'", "'role'", "'.'", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'String'", "'Date'", "'dateTime'", "'int'", "'decimal'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTicketsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTicketsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTicketsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g"; }



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



    // $ANTLR start "entryRuleTicketSystem"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:68:1: entryRuleTicketSystem returns [EObject current=null] : iv_ruleTicketSystem= ruleTicketSystem EOF ;
    public final EObject entryRuleTicketSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicketSystem = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:69:2: (iv_ruleTicketSystem= ruleTicketSystem EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:70:2: iv_ruleTicketSystem= ruleTicketSystem EOF
            {
             newCompositeNode(grammarAccess.getTicketSystemRule()); 
            pushFollow(FOLLOW_ruleTicketSystem_in_entryRuleTicketSystem75);
            iv_ruleTicketSystem=ruleTicketSystem();

            state._fsp--;

             current =iv_ruleTicketSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTicketSystem"


    // $ANTLR start "ruleTicketSystem"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:77:1: ruleTicketSystem returns [EObject current=null] : ( ( (lv_states_0_0= ruleState ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )* ;
    public final EObject ruleTicketSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;

        EObject lv_flows_1_0 = null;

        EObject lv_fields_2_0 = null;

        EObject lv_categories_3_0 = null;

        EObject lv_roles_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:80:28: ( ( ( (lv_states_0_0= ruleState ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:1: ( ( (lv_states_0_0= ruleState ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )*
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:1: ( ( (lv_states_0_0= ruleState ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 17:
                    {
                    alt1=3;
                    }
                    break;
                case 18:
                    {
                    alt1=4;
                    }
                    break;
                case 21:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:2: ( (lv_states_0_0= ruleState ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:2: ( (lv_states_0_0= ruleState ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:82:1: (lv_states_0_0= ruleState )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:82:1: (lv_states_0_0= ruleState )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:83:3: lv_states_0_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getStatesStateParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleTicketSystem131);
            	    lv_states_0_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_0_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:100:6: ( (lv_flows_1_0= ruleFlow ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:100:6: ( (lv_flows_1_0= ruleFlow ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:101:1: (lv_flows_1_0= ruleFlow )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:101:1: (lv_flows_1_0= ruleFlow )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:102:3: lv_flows_1_0= ruleFlow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlow_in_ruleTicketSystem158);
            	    lv_flows_1_0=ruleFlow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"flows",
            	            		lv_flows_1_0, 
            	            		"Flow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:119:6: ( (lv_fields_2_0= ruleField ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:119:6: ( (lv_fields_2_0= ruleField ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:120:1: (lv_fields_2_0= ruleField )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:120:1: (lv_fields_2_0= ruleField )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:121:3: lv_fields_2_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleTicketSystem185);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_2_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:138:6: ( (lv_categories_3_0= ruleTicketCategory ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:138:6: ( (lv_categories_3_0= ruleTicketCategory ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:139:1: (lv_categories_3_0= ruleTicketCategory )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:139:1: (lv_categories_3_0= ruleTicketCategory )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:140:3: lv_categories_3_0= ruleTicketCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTicketCategory_in_ruleTicketSystem212);
            	    lv_categories_3_0=ruleTicketCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_3_0, 
            	            		"TicketCategory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:157:6: ( (lv_roles_4_0= ruleRole ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:157:6: ( (lv_roles_4_0= ruleRole ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:158:1: (lv_roles_4_0= ruleRole )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:158:1: (lv_roles_4_0= ruleRole )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:159:3: lv_roles_4_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_ruleTicketSystem239);
            	    lv_roles_4_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_4_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTicketSystem"


    // $ANTLR start "entryRuleState"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:183:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:184:2: (iv_ruleState= ruleState EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:185:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState276);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState286); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:192:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:195:28: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:1: (otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:3: otherlv_0= 'state' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleState323); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:200:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:201:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:201:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:202:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleState344);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:218:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:219:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:219:1: (lv_description_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:220:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState361); 

            			newLeafNode(lv_description_2_0, grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleState378); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFlow"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:248:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:249:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:250:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow414);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:257:1: ruleFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:260:28: ( (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' otherlv_7= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' otherlv_7= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' otherlv_7= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:3: otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFlow461); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlowKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:265:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:266:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:266:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:267:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFlow482);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFlow494); 

                	newLeafNode(otherlv_2, grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:287:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:288:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:288:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:289:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFlowRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFlowAccess().getStatesStateCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFlow517);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:302:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:302:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFlow530); 

            	        	newLeafNode(otherlv_4, grammarAccess.getFlowAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:306:1: ( ( ruleQualifiedName ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:307:1: ( ruleQualifiedName )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:307:1: ( ruleQualifiedName )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:308:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFlowRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getStatesStateCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFlow553);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleFlow567); 

                	newLeafNode(otherlv_6, grammarAccess.getFlowAccess().getSemicolonKeyword_5());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleFlow579); 

                	newLeafNode(otherlv_7, grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleField"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:337:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:338:2: (iv_ruleField= ruleField EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:339:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField615);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:346:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_fieldType_3_0 = null;

        EObject lv_fieldEnum_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:349:28: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:350:1: (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:350:1: (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:350:3: otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleField662); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:354:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:355:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:355:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:356:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleField683);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:372:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:373:1: (lv_label_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:373:1: (lv_label_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:374:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField700); 

            			newLeafNode(lv_label_2_0, grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:390:2: ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=27 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:390:3: ( (lv_fieldType_3_0= ruleFieldType ) )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:390:3: ( (lv_fieldType_3_0= ruleFieldType ) )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:391:1: (lv_fieldType_3_0= ruleFieldType )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:391:1: (lv_fieldType_3_0= ruleFieldType )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:392:3: lv_fieldType_3_0= ruleFieldType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldType_in_ruleField727);
                    lv_fieldType_3_0=ruleFieldType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"fieldType",
                            		lv_fieldType_3_0, 
                            		"FieldType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:409:6: ( (lv_fieldEnum_4_0= ruleEnum ) )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:409:6: ( (lv_fieldEnum_4_0= ruleEnum ) )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:410:1: (lv_fieldEnum_4_0= ruleEnum )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:410:1: (lv_fieldEnum_4_0= ruleEnum )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:411:3: lv_fieldEnum_4_0= ruleEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnum_in_ruleField754);
                    lv_fieldEnum_4_0=ruleEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"fieldEnum",
                            		lv_fieldEnum_4_0, 
                            		"Enum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleField767); 

                	newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnum"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:439:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:440:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:441:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum803);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:448:1: ruleEnum returns [EObject current=null] : ( ( (lv_option_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token otherlv_1=null;
        Token lv_option_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:451:28: ( ( ( (lv_option_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:452:1: ( ( (lv_option_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:452:1: ( ( (lv_option_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:452:2: ( (lv_option_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )*
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:452:2: ( (lv_option_0_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:453:1: (lv_option_0_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:453:1: (lv_option_0_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:454:3: lv_option_0_0= RULE_STRING
            {
            lv_option_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum855); 

            			newLeafNode(lv_option_0_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"option",
                    		lv_option_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:470:2: (otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:470:4: otherlv_1= ',' ( (lv_option_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEnum873); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:474:1: ( (lv_option_2_0= RULE_STRING ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:475:1: (lv_option_2_0= RULE_STRING )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:475:1: (lv_option_2_0= RULE_STRING )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:476:3: lv_option_2_0= RULE_STRING
            	    {
            	    lv_option_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum890); 

            	    			newLeafNode(lv_option_2_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"option",
            	            		lv_option_2_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleTicketCategory"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:500:1: entryRuleTicketCategory returns [EObject current=null] : iv_ruleTicketCategory= ruleTicketCategory EOF ;
    public final EObject entryRuleTicketCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicketCategory = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:501:2: (iv_ruleTicketCategory= ruleTicketCategory EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:502:2: iv_ruleTicketCategory= ruleTicketCategory EOF
            {
             newCompositeNode(grammarAccess.getTicketCategoryRule()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory933);
            iv_ruleTicketCategory=ruleTicketCategory();

            state._fsp--;

             current =iv_ruleTicketCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketCategory943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTicketCategory"


    // $ANTLR start "ruleTicketCategory"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:509:1: ruleTicketCategory returns [EObject current=null] : (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= ';' otherlv_6= 'fields {' ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleTicketCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ticketFields_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:512:28: ( (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= ';' otherlv_6= 'fields {' ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:513:1: (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= ';' otherlv_6= 'fields {' ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:513:1: (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= ';' otherlv_6= 'fields {' ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )* otherlv_9= '}' otherlv_10= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:513:3: otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= ';' otherlv_6= 'fields {' ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTicketCategory980); 

                	newLeafNode(otherlv_0, grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:517:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:518:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:518:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:519:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketCategory1001);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTicketCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:535:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:536:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:536:1: (lv_description_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:537:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTicketCategory1018); 

            			newLeafNode(lv_description_2_0, grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTicketCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTicketCategory1035); 

                	newLeafNode(otherlv_3, grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:557:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:558:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:558:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:559:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTicketCategoryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketCategory1058);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleTicketCategory1070); 

                	newLeafNode(otherlv_5, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTicketCategory1082); 

                	newLeafNode(otherlv_6, grammarAccess.getTicketCategoryAccess().getFieldsKeyword_6());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:580:1: ( ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:580:2: ( (lv_ticketFields_7_0= ruleTicketField ) ) otherlv_8= ';'
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:580:2: ( (lv_ticketFields_7_0= ruleTicketField ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:581:1: (lv_ticketFields_7_0= ruleTicketField )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:581:1: (lv_ticketFields_7_0= ruleTicketField )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:582:3: lv_ticketFields_7_0= ruleTicketField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTicketField_in_ruleTicketCategory1104);
            	    lv_ticketFields_7_0=ruleTicketField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ticketFields",
            	            		lv_ticketFields_7_0, 
            	            		"TicketField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleTicketCategory1116); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_7_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleTicketCategory1130); 

                	newLeafNode(otherlv_9, grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleTicketCategory1142); 

                	newLeafNode(otherlv_10, grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTicketCategory"


    // $ANTLR start "entryRuleTicketField"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:618:1: entryRuleTicketField returns [EObject current=null] : iv_ruleTicketField= ruleTicketField EOF ;
    public final EObject entryRuleTicketField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicketField = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:619:2: (iv_ruleTicketField= ruleTicketField EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:620:2: iv_ruleTicketField= ruleTicketField EOF
            {
             newCompositeNode(grammarAccess.getTicketFieldRule()); 
            pushFollow(FOLLOW_ruleTicketField_in_entryRuleTicketField1178);
            iv_ruleTicketField=ruleTicketField();

            state._fsp--;

             current =iv_ruleTicketField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketField1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTicketField"


    // $ANTLR start "ruleTicketField"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:627:1: ruleTicketField returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ) ;
    public final EObject ruleTicketField() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:630:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:631:1: ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:631:1: ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:631:2: ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )?
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:631:2: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:632:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:632:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:633:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTicketFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketField1236);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:646:2: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:647:1: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:647:1: (lv_mandatory_1_0= 'mandatory' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:648:3: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,20,FOLLOW_20_in_ruleTicketField1254); 

                            newLeafNode(lv_mandatory_1_0, grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTicketFieldRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTicketField"


    // $ANTLR start "entryRuleRole"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:669:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:670:2: (iv_ruleRole= ruleRole EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:671:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1304);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:678:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rolepermissions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:681:28: ( (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:682:1: (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:682:1: (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:682:3: otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRole1351); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:686:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:687:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:687:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:688:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRole1372);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:704:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:705:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:705:1: (lv_description_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:706:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole1389); 

            			newLeafNode(lv_description_2_0, grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRole1406); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:726:1: ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:726:2: ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';'
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:726:2: ( (lv_rolepermissions_4_0= ruleRolePermission ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:727:1: (lv_rolepermissions_4_0= ruleRolePermission )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:727:1: (lv_rolepermissions_4_0= ruleRolePermission )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:728:3: lv_rolepermissions_4_0= ruleRolePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRolePermission_in_ruleRole1428);
            	    lv_rolepermissions_4_0=ruleRolePermission();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rolepermissions",
            	            		lv_rolepermissions_4_0, 
            	            		"RolePermission");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRole1440); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleRole1454); 

                	newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRolePermission"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:760:1: entryRuleRolePermission returns [EObject current=null] : iv_ruleRolePermission= ruleRolePermission EOF ;
    public final EObject entryRuleRolePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolePermission = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:761:2: (iv_ruleRolePermission= ruleRolePermission EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:762:2: iv_ruleRolePermission= ruleRolePermission EOF
            {
             newCompositeNode(grammarAccess.getRolePermissionRule()); 
            pushFollow(FOLLOW_ruleRolePermission_in_entryRuleRolePermission1490);
            iv_ruleRolePermission=ruleRolePermission();

            state._fsp--;

             current =iv_ruleRolePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermission1500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRolePermission"


    // $ANTLR start "ruleRolePermission"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:769:1: ruleRolePermission returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) ;
    public final EObject ruleRolePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_permissions_1_0 = null;

        Enumerator lv_permissions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:772:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:773:1: ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:773:1: ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:773:2: ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:773:2: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:774:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:774:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:775:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRolePermissionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRolePermission1548);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:788:2: ( (lv_permissions_1_0= rulePermission ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:789:1: (lv_permissions_1_0= rulePermission )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:789:1: (lv_permissions_1_0= rulePermission )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:790:3: lv_permissions_1_0= rulePermission
            {
             
            	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePermission_in_ruleRolePermission1569);
            lv_permissions_1_0=rulePermission();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRolePermissionRule());
            	        }
                   		add(
                   			current, 
                   			"permissions",
                    		lv_permissions_1_0, 
                    		"Permission");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:806:2: (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:806:4: otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRolePermission1582); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:810:1: ( (lv_permissions_3_0= rulePermission ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:811:1: (lv_permissions_3_0= rulePermission )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:811:1: (lv_permissions_3_0= rulePermission )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:812:3: lv_permissions_3_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleRolePermission1603);
            	    lv_permissions_3_0=rulePermission();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRolePermissionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"permissions",
            	            		lv_permissions_3_0, 
            	            		"Permission");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRolePermission"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:836:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:837:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:838:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1642);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:845:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:848:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:849:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:849:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:849:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1693); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:856:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:857:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1712); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1727); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rulePermission"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:877:1: rulePermission returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator rulePermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:879:28: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:880:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:880:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:880:2: (enumLiteral_0= 'create' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:880:2: (enumLiteral_0= 'create' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:880:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_rulePermission1788); 

                            current = grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:886:6: (enumLiteral_1= 'read' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:886:6: (enumLiteral_1= 'read' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:886:8: enumLiteral_1= 'read'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_rulePermission1805); 

                            current = grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:892:6: (enumLiteral_2= 'modify' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:892:6: (enumLiteral_2= 'modify' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:892:8: enumLiteral_2= 'modify'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_rulePermission1822); 

                            current = grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:898:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:898:6: (enumLiteral_3= 'delete' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:898:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_rulePermission1839); 

                            current = grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "ruleFieldType"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:908:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:910:28: ( ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:911:1: ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:911:1: ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 32:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:911:2: (enumLiteral_0= 'user' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:911:2: (enumLiteral_0= 'user' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:911:4: enumLiteral_0= 'user'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleFieldType1884); 

                            current = grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:917:6: (enumLiteral_1= 'String' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:917:6: (enumLiteral_1= 'String' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:917:8: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleFieldType1901); 

                            current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:923:6: (enumLiteral_2= 'Date' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:923:6: (enumLiteral_2= 'Date' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:923:8: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleFieldType1918); 

                            current = grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:929:6: (enumLiteral_3= 'dateTime' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:929:6: (enumLiteral_3= 'dateTime' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:929:8: enumLiteral_3= 'dateTime'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_30_in_ruleFieldType1935); 

                            current = grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:935:6: (enumLiteral_4= 'int' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:935:6: (enumLiteral_4= 'int' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:935:8: enumLiteral_4= 'int'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_31_in_ruleFieldType1952); 

                            current = grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:941:6: (enumLiteral_5= 'decimal' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:941:6: (enumLiteral_5= 'decimal' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:941:8: enumLiteral_5= 'decimal'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_32_in_ruleFieldType1969); 

                            current = grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTicketSystem_in_entryRuleTicketSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleTicketSystem131 = new BitSet(new long[]{0x0000000000262802L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleTicketSystem158 = new BitSet(new long[]{0x0000000000262802L});
    public static final BitSet FOLLOW_ruleField_in_ruleTicketSystem185 = new BitSet(new long[]{0x0000000000262802L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_ruleTicketSystem212 = new BitSet(new long[]{0x0000000000262802L});
    public static final BitSet FOLLOW_ruleRole_in_ruleTicketSystem239 = new BitSet(new long[]{0x0000000000262802L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleState344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFlow461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFlow482 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFlow494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFlow517 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleFlow530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFlow553 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleFlow567 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFlow579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleField662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleField683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField700 = new BitSet(new long[]{0x00000001F8000010L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleField754 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum855 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEnum873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum890 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketCategory943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTicketCategory980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketCategory1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTicketCategory1018 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTicketCategory1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketCategory1058 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTicketCategory1070 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTicketCategory1082 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleTicketField_in_ruleTicketCategory1104 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTicketCategory1116 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleTicketCategory1130 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTicketCategory1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_entryRuleTicketField1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketField1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketField1236 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleTicketField1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRole1351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRole1372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole1389 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRole1406 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleRolePermission_in_ruleRole1428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole1440 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleRole1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_entryRuleRolePermission1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermission1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRolePermission1548 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleRolePermission1569 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleRolePermission1582 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleRolePermission1603 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1693 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1727 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_23_in_rulePermission1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePermission1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePermission1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePermission1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFieldType1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFieldType1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldType1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldType1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldType1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFieldType1969 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'status'", "';'", "'flow'", "'{'", "'}'", "'field'", "'enum'", "','", "'ticketCategory'", "'fields {'", "'mandatory'", "'notOnList'", "'role'", "'.'", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'String'", "'Date'", "'dateTime'", "'int'", "'decimal'", "'boolean'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:77:1: ruleTicketSystem returns [EObject current=null] : ( ( (lv_states_0_0= ruleStatus ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )* ;
    public final EObject ruleTicketSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;

        EObject lv_flows_1_0 = null;

        EObject lv_fields_2_0 = null;

        EObject lv_categories_3_0 = null;

        EObject lv_roles_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:80:28: ( ( ( (lv_states_0_0= ruleStatus ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:1: ( ( (lv_states_0_0= ruleStatus ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )*
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:1: ( ( (lv_states_0_0= ruleStatus ) ) | ( (lv_flows_1_0= ruleFlow ) ) | ( (lv_fields_2_0= ruleField ) ) | ( (lv_categories_3_0= ruleTicketCategory ) ) | ( (lv_roles_4_0= ruleRole ) ) )*
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
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 19:
                    {
                    alt1=4;
                    }
                    break;
                case 23:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:2: ( (lv_states_0_0= ruleStatus ) )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:81:2: ( (lv_states_0_0= ruleStatus ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:82:1: (lv_states_0_0= ruleStatus )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:82:1: (lv_states_0_0= ruleStatus )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:83:3: lv_states_0_0= ruleStatus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketSystemAccess().getStatesStatusParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatus_in_ruleTicketSystem131);
            	    lv_states_0_0=ruleStatus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_0_0, 
            	            		"Status");
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


    // $ANTLR start "entryRuleStatus"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:183:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:184:2: (iv_ruleStatus= ruleStatus EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:185:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus276);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus286); 

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
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:192:1: ruleStatus returns [EObject current=null] : (otherlv_0= 'status' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:195:28: ( (otherlv_0= 'status' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:1: (otherlv_0= 'status' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:1: (otherlv_0= 'status' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:196:3: otherlv_0= 'status' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStatus323); 

                	newLeafNode(otherlv_0, grammarAccess.getStatusAccess().getStatusKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:200:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:201:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:201:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:202:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStatus344);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatusRule());
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
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatus361); 

            			newLeafNode(lv_description_2_0, grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatusRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatus378); 

                	newLeafNode(otherlv_3, grammarAccess.getStatusAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleStatus"


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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:257:1: ruleFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:260:28: ( (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:1: (otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:261:3: otherlv_0= 'flow' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )* otherlv_5= '}'
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
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:287:1: ( ( ( ruleQualifiedName ) ) otherlv_4= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:287:2: ( ( ruleQualifiedName ) ) otherlv_4= ';'
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:287:2: ( ( ruleQualifiedName ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:288:1: ( ruleQualifiedName )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:288:1: ( ruleQualifiedName )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:289:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFlowRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getStatesStatusCrossReference_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFlow518);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFlow530); 

            	        	newLeafNode(otherlv_4, grammarAccess.getFlowAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFlow544); 

                	newLeafNode(otherlv_5, grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:318:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:319:2: (iv_ruleField= ruleField EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:320:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField580);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField590); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:327:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' ) ;
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
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:330:28: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:331:1: (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:331:1: (otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:331:3: otherlv_0= 'field' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleField627); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:335:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:336:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:336:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:337:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleField648);
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

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:353:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:354:1: (lv_label_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:354:1: (lv_label_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:355:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField665); 

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

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:371:2: ( ( (lv_fieldType_3_0= ruleFieldType ) ) | ( (lv_fieldEnum_4_0= ruleEnum ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:371:3: ( (lv_fieldType_3_0= ruleFieldType ) )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:371:3: ( (lv_fieldType_3_0= ruleFieldType ) )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:372:1: (lv_fieldType_3_0= ruleFieldType )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:372:1: (lv_fieldType_3_0= ruleFieldType )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:373:3: lv_fieldType_3_0= ruleFieldType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFieldType_in_ruleField692);
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
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:390:6: ( (lv_fieldEnum_4_0= ruleEnum ) )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:390:6: ( (lv_fieldEnum_4_0= ruleEnum ) )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:391:1: (lv_fieldEnum_4_0= ruleEnum )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:391:1: (lv_fieldEnum_4_0= ruleEnum )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:392:3: lv_fieldEnum_4_0= ruleEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnum_in_ruleField719);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleField732); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:420:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:421:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:422:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum768);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum778); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:429:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_option_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_0=null;
        Token otherlv_2=null;
        Token lv_option_3_0=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:432:28: ( (otherlv_0= 'enum' ( (lv_option_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:433:1: (otherlv_0= 'enum' ( (lv_option_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:433:1: (otherlv_0= 'enum' ( (lv_option_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:433:3: otherlv_0= 'enum' ( (lv_option_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnum815); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:437:1: ( (lv_option_1_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:438:1: (lv_option_1_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:438:1: (lv_option_1_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:439:3: lv_option_1_0= RULE_STRING
            {
            lv_option_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum832); 

            			newLeafNode(lv_option_1_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"option",
                    		lv_option_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:455:2: (otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:455:4: otherlv_2= ',' ( (lv_option_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEnum850); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:459:1: ( (lv_option_3_0= RULE_STRING ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:460:1: (lv_option_3_0= RULE_STRING )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:460:1: (lv_option_3_0= RULE_STRING )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:461:3: lv_option_3_0= RULE_STRING
            	    {
            	    lv_option_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnum867); 

            	    			newLeafNode(lv_option_3_0, grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"option",
            	            		lv_option_3_0, 
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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:485:1: entryRuleTicketCategory returns [EObject current=null] : iv_ruleTicketCategory= ruleTicketCategory EOF ;
    public final EObject entryRuleTicketCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicketCategory = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:486:2: (iv_ruleTicketCategory= ruleTicketCategory EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:487:2: iv_ruleTicketCategory= ruleTicketCategory EOF
            {
             newCompositeNode(grammarAccess.getTicketCategoryRule()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory910);
            iv_ruleTicketCategory=ruleTicketCategory();

            state._fsp--;

             current =iv_ruleTicketCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketCategory920); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:494:1: ruleTicketCategory returns [EObject current=null] : (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )? otherlv_7= 'fields {' ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleTicketCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ticketFields_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:497:28: ( (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )? otherlv_7= 'fields {' ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:498:1: (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )? otherlv_7= 'fields {' ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:498:1: (otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )? otherlv_7= 'fields {' ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:498:3: otherlv_0= 'ticketCategory' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )? otherlv_7= 'fields {' ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTicketCategory957); 

                	newLeafNode(otherlv_0, grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:502:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:503:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:503:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:504:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketCategory978);
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

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:520:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:521:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:521:1: (lv_description_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:522:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTicketCategory995); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTicketCategory1012); 

                	newLeafNode(otherlv_3, grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:542:1: (otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:542:3: otherlv_4= 'flow' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTicketCategory1025); 

                        	newLeafNode(otherlv_4, grammarAccess.getTicketCategoryAccess().getFlowKeyword_4_0());
                        
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:546:1: ( ( ruleQualifiedName ) )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:547:1: ( ruleQualifiedName )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:547:1: ( ruleQualifiedName )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:548:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTicketCategoryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketCategory1048);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleTicketCategory1060); 

                        	newLeafNode(otherlv_6, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleTicketCategory1074); 

                	newLeafNode(otherlv_7, grammarAccess.getTicketCategoryAccess().getFieldsKeyword_5());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:569:1: ( ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:569:2: ( (lv_ticketFields_8_0= ruleTicketField ) ) otherlv_9= ';'
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:569:2: ( (lv_ticketFields_8_0= ruleTicketField ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:570:1: (lv_ticketFields_8_0= ruleTicketField )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:570:1: (lv_ticketFields_8_0= ruleTicketField )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:571:3: lv_ticketFields_8_0= ruleTicketField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTicketField_in_ruleTicketCategory1096);
            	    lv_ticketFields_8_0=ruleTicketField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTicketCategoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ticketFields",
            	            		lv_ticketFields_8_0, 
            	            		"TicketField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,12,FOLLOW_12_in_ruleTicketCategory1108); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleTicketCategory1122); 

                	newLeafNode(otherlv_10, grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleTicketCategory1134); 

                	newLeafNode(otherlv_11, grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:607:1: entryRuleTicketField returns [EObject current=null] : iv_ruleTicketField= ruleTicketField EOF ;
    public final EObject entryRuleTicketField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTicketField = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:608:2: (iv_ruleTicketField= ruleTicketField EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:609:2: iv_ruleTicketField= ruleTicketField EOF
            {
             newCompositeNode(grammarAccess.getTicketFieldRule()); 
            pushFollow(FOLLOW_ruleTicketField_in_entryRuleTicketField1170);
            iv_ruleTicketField=ruleTicketField();

            state._fsp--;

             current =iv_ruleTicketField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketField1180); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:616:1: ruleTicketField returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_notOnList_2_0= 'notOnList' ) )? ) ;
    public final EObject ruleTicketField() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_notOnList_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:619:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_notOnList_2_0= 'notOnList' ) )? ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:620:1: ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_notOnList_2_0= 'notOnList' ) )? )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:620:1: ( ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_notOnList_2_0= 'notOnList' ) )? )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:620:2: ( ( ruleQualifiedName ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_notOnList_2_0= 'notOnList' ) )?
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:620:2: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:621:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:621:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:622:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTicketFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTicketField1228);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:635:2: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:636:1: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:636:1: (lv_mandatory_1_0= 'mandatory' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:637:3: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_21_in_ruleTicketField1246); 

                            newLeafNode(lv_mandatory_1_0, grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTicketFieldRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:650:3: ( (lv_notOnList_2_0= 'notOnList' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:651:1: (lv_notOnList_2_0= 'notOnList' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:651:1: (lv_notOnList_2_0= 'notOnList' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:652:3: lv_notOnList_2_0= 'notOnList'
                    {
                    lv_notOnList_2_0=(Token)match(input,22,FOLLOW_22_in_ruleTicketField1278); 

                            newLeafNode(lv_notOnList_2_0, grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTicketFieldRule());
                    	        }
                           		setWithLastConsumed(current, "notOnList", true, "notOnList");
                    	    

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:673:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:674:2: (iv_ruleRole= ruleRole EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:675:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1328);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1338); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:682:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:685:28: ( (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:686:1: (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:686:1: (otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:686:3: otherlv_0= 'role' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRole1375); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:690:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:691:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:691:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:692:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRole1396);
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

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:708:2: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:709:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:709:1: (lv_description_2_0= RULE_STRING )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:710:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole1413); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleRole1430); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:730:1: ( ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:730:2: ( (lv_rolepermissions_4_0= ruleRolePermission ) ) otherlv_5= ';'
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:730:2: ( (lv_rolepermissions_4_0= ruleRolePermission ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:731:1: (lv_rolepermissions_4_0= ruleRolePermission )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:731:1: (lv_rolepermissions_4_0= ruleRolePermission )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:732:3: lv_rolepermissions_4_0= ruleRolePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRolePermission_in_ruleRole1452);
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

            	    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRole1464); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleRole1478); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:764:1: entryRuleRolePermission returns [EObject current=null] : iv_ruleRolePermission= ruleRolePermission EOF ;
    public final EObject entryRuleRolePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolePermission = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:765:2: (iv_ruleRolePermission= ruleRolePermission EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:766:2: iv_ruleRolePermission= ruleRolePermission EOF
            {
             newCompositeNode(grammarAccess.getRolePermissionRule()); 
            pushFollow(FOLLOW_ruleRolePermission_in_entryRuleRolePermission1514);
            iv_ruleRolePermission=ruleRolePermission();

            state._fsp--;

             current =iv_ruleRolePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermission1524); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:773:1: ruleRolePermission returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) ;
    public final EObject ruleRolePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_permissions_1_0 = null;

        Enumerator lv_permissions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:776:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:777:1: ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:777:1: ( ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:777:2: ( ( ruleQualifiedName ) ) ( (lv_permissions_1_0= rulePermission ) ) (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:777:2: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:778:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:778:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:779:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRolePermissionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRolePermission1572);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:792:2: ( (lv_permissions_1_0= rulePermission ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:793:1: (lv_permissions_1_0= rulePermission )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:793:1: (lv_permissions_1_0= rulePermission )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:794:3: lv_permissions_1_0= rulePermission
            {
             
            	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePermission_in_ruleRolePermission1593);
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

            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:810:2: (otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:810:4: otherlv_2= ',' ( (lv_permissions_3_0= rulePermission ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRolePermission1606); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:814:1: ( (lv_permissions_3_0= rulePermission ) )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:815:1: (lv_permissions_3_0= rulePermission )
            	    {
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:815:1: (lv_permissions_3_0= rulePermission )
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:816:3: lv_permissions_3_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_ruleRolePermission1627);
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
            	    break loop10;
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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:840:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:841:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:842:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1666);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1677); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:849:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:852:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:853:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:853:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:853:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1717); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:860:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:861:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleQualifiedName1736); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1751); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:881:1: rulePermission returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator rulePermission() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:883:28: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:884:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:884:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'read' ) | (enumLiteral_2= 'modify' ) | (enumLiteral_3= 'delete' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:884:2: (enumLiteral_0= 'create' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:884:2: (enumLiteral_0= 'create' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:884:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_rulePermission1812); 

                            current = grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:890:6: (enumLiteral_1= 'read' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:890:6: (enumLiteral_1= 'read' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:890:8: enumLiteral_1= 'read'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_rulePermission1829); 

                            current = grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:896:6: (enumLiteral_2= 'modify' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:896:6: (enumLiteral_2= 'modify' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:896:8: enumLiteral_2= 'modify'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_rulePermission1846); 

                            current = grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:902:6: (enumLiteral_3= 'delete' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:902:6: (enumLiteral_3= 'delete' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:902:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_rulePermission1863); 

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
    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:912:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) | (enumLiteral_6= 'boolean' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:914:28: ( ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) | (enumLiteral_6= 'boolean' ) ) )
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:915:1: ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) | (enumLiteral_6= 'boolean' ) )
            {
            // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:915:1: ( (enumLiteral_0= 'user' ) | (enumLiteral_1= 'String' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'dateTime' ) | (enumLiteral_4= 'int' ) | (enumLiteral_5= 'decimal' ) | (enumLiteral_6= 'boolean' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            case 32:
                {
                alt13=4;
                }
                break;
            case 33:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            case 35:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:915:2: (enumLiteral_0= 'user' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:915:2: (enumLiteral_0= 'user' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:915:4: enumLiteral_0= 'user'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleFieldType1908); 

                            current = grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:921:6: (enumLiteral_1= 'String' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:921:6: (enumLiteral_1= 'String' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:921:8: enumLiteral_1= 'String'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleFieldType1925); 

                            current = grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:927:6: (enumLiteral_2= 'Date' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:927:6: (enumLiteral_2= 'Date' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:927:8: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleFieldType1942); 

                            current = grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:933:6: (enumLiteral_3= 'dateTime' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:933:6: (enumLiteral_3= 'dateTime' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:933:8: enumLiteral_3= 'dateTime'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleFieldType1959); 

                            current = grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:939:6: (enumLiteral_4= 'int' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:939:6: (enumLiteral_4= 'int' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:939:8: enumLiteral_4= 'int'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_33_in_ruleFieldType1976); 

                            current = grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:945:6: (enumLiteral_5= 'decimal' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:945:6: (enumLiteral_5= 'decimal' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:945:8: enumLiteral_5= 'decimal'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_34_in_ruleFieldType1993); 

                            current = grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:951:6: (enumLiteral_6= 'boolean' )
                    {
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:951:6: (enumLiteral_6= 'boolean' )
                    // ../org.nordakademie.mwi.tickets/src-gen/org/nordakademie/mwi/tickets/parser/antlr/internal/InternalTickets.g:951:8: enumLiteral_6= 'boolean'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_35_in_ruleFieldType2010); 

                            current = grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

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
    public static final BitSet FOLLOW_ruleStatus_in_ruleTicketSystem131 = new BitSet(new long[]{0x0000000000892802L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleTicketSystem158 = new BitSet(new long[]{0x0000000000892802L});
    public static final BitSet FOLLOW_ruleField_in_ruleTicketSystem185 = new BitSet(new long[]{0x0000000000892802L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_ruleTicketSystem212 = new BitSet(new long[]{0x0000000000892802L});
    public static final BitSet FOLLOW_ruleRole_in_ruleTicketSystem239 = new BitSet(new long[]{0x0000000000892802L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatus323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStatus344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatus361 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatus378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFlow461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFlow482 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFlow494 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFlow518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFlow530 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleFlow544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleField627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleField648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField665 = new BitSet(new long[]{0x0000000FE0020000L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField692 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleField719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEnum815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum832 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleEnum850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnum867 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketCategory920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTicketCategory957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketCategory978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTicketCategory995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTicketCategory1012 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleTicketCategory1025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketCategory1048 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTicketCategory1060 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTicketCategory1074 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleTicketField_in_ruleTicketCategory1096 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTicketCategory1108 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleTicketCategory1122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTicketCategory1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_entryRuleTicketField1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketField1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTicketField1228 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleTicketField1246 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTicketField1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRole1375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRole1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole1413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRole1430 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleRolePermission_in_ruleRole1452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRole1464 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleRole1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_entryRuleRolePermission1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermission1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRolePermission1572 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleRolePermission1593 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleRolePermission1606 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_rulePermission_in_ruleRolePermission1627 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1717 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleQualifiedName1736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1751 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_rulePermission1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePermission1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePermission1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePermission1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFieldType1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFieldType1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFieldType1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFieldType1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFieldType1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFieldType1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFieldType2010 = new BitSet(new long[]{0x0000000000000002L});

}
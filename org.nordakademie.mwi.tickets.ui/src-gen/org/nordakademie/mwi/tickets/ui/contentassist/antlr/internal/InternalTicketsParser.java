package org.nordakademie.mwi.tickets.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.nordakademie.mwi.tickets.services.TicketsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTicketsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'String'", "'Date'", "'dateTime'", "'int'", "'decimal'", "'boolean'", "'status'", "';'", "'flow'", "'{'", "'}'", "'field'", "'enum'", "','", "'ticketCategory'", "'fields {'", "'role'", "'.'", "'mandatory'", "'notOnList'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTicketsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTicketsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTicketsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g"; }


     
     	private TicketsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TicketsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTicketSystem"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:60:1: entryRuleTicketSystem : ruleTicketSystem EOF ;
    public final void entryRuleTicketSystem() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:61:1: ( ruleTicketSystem EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:62:1: ruleTicketSystem EOF
            {
             before(grammarAccess.getTicketSystemRule()); 
            pushFollow(FOLLOW_ruleTicketSystem_in_entryRuleTicketSystem61);
            ruleTicketSystem();

            state._fsp--;

             after(grammarAccess.getTicketSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTicketSystem"


    // $ANTLR start "ruleTicketSystem"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:69:1: ruleTicketSystem : ( ( rule__TicketSystem__Alternatives )* ) ;
    public final void ruleTicketSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:73:2: ( ( ( rule__TicketSystem__Alternatives )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:74:1: ( ( rule__TicketSystem__Alternatives )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:74:1: ( ( rule__TicketSystem__Alternatives )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:75:1: ( rule__TicketSystem__Alternatives )*
            {
             before(grammarAccess.getTicketSystemAccess().getAlternatives()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:76:1: ( rule__TicketSystem__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==24||LA1_0==27||LA1_0==30||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:76:2: rule__TicketSystem__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__TicketSystem__Alternatives_in_ruleTicketSystem94);
            	    rule__TicketSystem__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTicketSystemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTicketSystem"


    // $ANTLR start "entryRuleStatus"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:88:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:89:1: ( ruleStatus EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:90:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus122);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:97:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:101:2: ( ( ( rule__Status__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:102:1: ( ( rule__Status__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:102:1: ( ( rule__Status__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:103:1: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:104:1: ( rule__Status__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:104:2: rule__Status__Group__0
            {
            pushFollow(FOLLOW_rule__Status__Group__0_in_ruleStatus155);
            rule__Status__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleFlow"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:116:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:117:1: ( ruleFlow EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:118:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow182);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:125:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:129:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:130:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:130:1: ( ( rule__Flow__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:131:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:132:1: ( rule__Flow__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:132:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow215);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleField"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:144:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:145:1: ( ruleField EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:146:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField242);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:153:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:157:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:158:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:158:1: ( ( rule__Field__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:159:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:160:1: ( rule__Field__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:160:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField275);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleEnum"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:172:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:173:1: ( ruleEnum EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:174:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum302);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:181:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:185:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:186:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:186:1: ( ( rule__Enum__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:187:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:188:1: ( rule__Enum__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:188:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum335);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleTicketCategory"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:200:1: entryRuleTicketCategory : ruleTicketCategory EOF ;
    public final void entryRuleTicketCategory() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:201:1: ( ruleTicketCategory EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:202:1: ruleTicketCategory EOF
            {
             before(grammarAccess.getTicketCategoryRule()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory362);
            ruleTicketCategory();

            state._fsp--;

             after(grammarAccess.getTicketCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketCategory369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTicketCategory"


    // $ANTLR start "ruleTicketCategory"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:209:1: ruleTicketCategory : ( ( rule__TicketCategory__Group__0 ) ) ;
    public final void ruleTicketCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:213:2: ( ( ( rule__TicketCategory__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:214:1: ( ( rule__TicketCategory__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:214:1: ( ( rule__TicketCategory__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:215:1: ( rule__TicketCategory__Group__0 )
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:216:1: ( rule__TicketCategory__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:216:2: rule__TicketCategory__Group__0
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__0_in_ruleTicketCategory395);
            rule__TicketCategory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTicketCategory"


    // $ANTLR start "entryRuleTicketField"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:228:1: entryRuleTicketField : ruleTicketField EOF ;
    public final void entryRuleTicketField() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:229:1: ( ruleTicketField EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:230:1: ruleTicketField EOF
            {
             before(grammarAccess.getTicketFieldRule()); 
            pushFollow(FOLLOW_ruleTicketField_in_entryRuleTicketField422);
            ruleTicketField();

            state._fsp--;

             after(grammarAccess.getTicketFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTicketField429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTicketField"


    // $ANTLR start "ruleTicketField"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:237:1: ruleTicketField : ( ( rule__TicketField__Group__0 ) ) ;
    public final void ruleTicketField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:241:2: ( ( ( rule__TicketField__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:242:1: ( ( rule__TicketField__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:242:1: ( ( rule__TicketField__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:243:1: ( rule__TicketField__Group__0 )
            {
             before(grammarAccess.getTicketFieldAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:244:1: ( rule__TicketField__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:244:2: rule__TicketField__Group__0
            {
            pushFollow(FOLLOW_rule__TicketField__Group__0_in_ruleTicketField455);
            rule__TicketField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTicketFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTicketField"


    // $ANTLR start "entryRuleRole"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:256:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:257:1: ( ruleRole EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:258:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole482);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:265:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:269:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:270:1: ( ( rule__Role__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:270:1: ( ( rule__Role__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:271:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:272:1: ( rule__Role__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:272:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole515);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleRolePermission"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:284:1: entryRuleRolePermission : ruleRolePermission EOF ;
    public final void entryRuleRolePermission() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:285:1: ( ruleRolePermission EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:286:1: ruleRolePermission EOF
            {
             before(grammarAccess.getRolePermissionRule()); 
            pushFollow(FOLLOW_ruleRolePermission_in_entryRuleRolePermission542);
            ruleRolePermission();

            state._fsp--;

             after(grammarAccess.getRolePermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRolePermission549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolePermission"


    // $ANTLR start "ruleRolePermission"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:293:1: ruleRolePermission : ( ( rule__RolePermission__Group__0 ) ) ;
    public final void ruleRolePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:297:2: ( ( ( rule__RolePermission__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:298:1: ( ( rule__RolePermission__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:298:1: ( ( rule__RolePermission__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:299:1: ( rule__RolePermission__Group__0 )
            {
             before(grammarAccess.getRolePermissionAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:300:1: ( rule__RolePermission__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:300:2: rule__RolePermission__Group__0
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__0_in_ruleRolePermission575);
            rule__RolePermission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRolePermissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolePermission"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:312:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:313:1: ( ruleQualifiedName EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:314:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName602);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:321:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:325:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:326:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:327:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:328:1: ( rule__QualifiedName__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:328:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName635);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rulePermission"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:341:1: rulePermission : ( ( rule__Permission__Alternatives ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:345:1: ( ( ( rule__Permission__Alternatives ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:346:1: ( ( rule__Permission__Alternatives ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:346:1: ( ( rule__Permission__Alternatives ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:347:1: ( rule__Permission__Alternatives )
            {
             before(grammarAccess.getPermissionAccess().getAlternatives()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:348:1: ( rule__Permission__Alternatives )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:348:2: rule__Permission__Alternatives
            {
            pushFollow(FOLLOW_rule__Permission__Alternatives_in_rulePermission672);
            rule__Permission__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "ruleFieldType"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:360:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:364:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:365:1: ( ( rule__FieldType__Alternatives ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:365:1: ( ( rule__FieldType__Alternatives ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:366:1: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:367:1: ( rule__FieldType__Alternatives )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:367:2: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType708);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__TicketSystem__Alternatives"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:378:1: rule__TicketSystem__Alternatives : ( ( ( rule__TicketSystem__StatesAssignment_0 ) ) | ( ( rule__TicketSystem__FlowsAssignment_1 ) ) | ( ( rule__TicketSystem__FieldsAssignment_2 ) ) | ( ( rule__TicketSystem__CategoriesAssignment_3 ) ) | ( ( rule__TicketSystem__RolesAssignment_4 ) ) );
    public final void rule__TicketSystem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:382:1: ( ( ( rule__TicketSystem__StatesAssignment_0 ) ) | ( ( rule__TicketSystem__FlowsAssignment_1 ) ) | ( ( rule__TicketSystem__FieldsAssignment_2 ) ) | ( ( rule__TicketSystem__CategoriesAssignment_3 ) ) | ( ( rule__TicketSystem__RolesAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 32:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:383:1: ( ( rule__TicketSystem__StatesAssignment_0 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:383:1: ( ( rule__TicketSystem__StatesAssignment_0 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:384:1: ( rule__TicketSystem__StatesAssignment_0 )
                    {
                     before(grammarAccess.getTicketSystemAccess().getStatesAssignment_0()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:385:1: ( rule__TicketSystem__StatesAssignment_0 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:385:2: rule__TicketSystem__StatesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TicketSystem__StatesAssignment_0_in_rule__TicketSystem__Alternatives743);
                    rule__TicketSystem__StatesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTicketSystemAccess().getStatesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:389:6: ( ( rule__TicketSystem__FlowsAssignment_1 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:389:6: ( ( rule__TicketSystem__FlowsAssignment_1 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:390:1: ( rule__TicketSystem__FlowsAssignment_1 )
                    {
                     before(grammarAccess.getTicketSystemAccess().getFlowsAssignment_1()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:391:1: ( rule__TicketSystem__FlowsAssignment_1 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:391:2: rule__TicketSystem__FlowsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TicketSystem__FlowsAssignment_1_in_rule__TicketSystem__Alternatives761);
                    rule__TicketSystem__FlowsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTicketSystemAccess().getFlowsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:395:6: ( ( rule__TicketSystem__FieldsAssignment_2 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:395:6: ( ( rule__TicketSystem__FieldsAssignment_2 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:396:1: ( rule__TicketSystem__FieldsAssignment_2 )
                    {
                     before(grammarAccess.getTicketSystemAccess().getFieldsAssignment_2()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:397:1: ( rule__TicketSystem__FieldsAssignment_2 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:397:2: rule__TicketSystem__FieldsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TicketSystem__FieldsAssignment_2_in_rule__TicketSystem__Alternatives779);
                    rule__TicketSystem__FieldsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTicketSystemAccess().getFieldsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:401:6: ( ( rule__TicketSystem__CategoriesAssignment_3 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:401:6: ( ( rule__TicketSystem__CategoriesAssignment_3 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:402:1: ( rule__TicketSystem__CategoriesAssignment_3 )
                    {
                     before(grammarAccess.getTicketSystemAccess().getCategoriesAssignment_3()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:403:1: ( rule__TicketSystem__CategoriesAssignment_3 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:403:2: rule__TicketSystem__CategoriesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TicketSystem__CategoriesAssignment_3_in_rule__TicketSystem__Alternatives797);
                    rule__TicketSystem__CategoriesAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTicketSystemAccess().getCategoriesAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:407:6: ( ( rule__TicketSystem__RolesAssignment_4 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:407:6: ( ( rule__TicketSystem__RolesAssignment_4 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:408:1: ( rule__TicketSystem__RolesAssignment_4 )
                    {
                     before(grammarAccess.getTicketSystemAccess().getRolesAssignment_4()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:409:1: ( rule__TicketSystem__RolesAssignment_4 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:409:2: rule__TicketSystem__RolesAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TicketSystem__RolesAssignment_4_in_rule__TicketSystem__Alternatives815);
                    rule__TicketSystem__RolesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTicketSystemAccess().getRolesAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__Alternatives"


    // $ANTLR start "rule__Field__Alternatives_3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:418:1: rule__Field__Alternatives_3 : ( ( ( rule__Field__FieldTypeAssignment_3_0 ) ) | ( ( rule__Field__FieldEnumAssignment_3_1 ) ) );
    public final void rule__Field__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:422:1: ( ( ( rule__Field__FieldTypeAssignment_3_0 ) ) | ( ( rule__Field__FieldEnumAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=21)) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:423:1: ( ( rule__Field__FieldTypeAssignment_3_0 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:423:1: ( ( rule__Field__FieldTypeAssignment_3_0 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:424:1: ( rule__Field__FieldTypeAssignment_3_0 )
                    {
                     before(grammarAccess.getFieldAccess().getFieldTypeAssignment_3_0()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:425:1: ( rule__Field__FieldTypeAssignment_3_0 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:425:2: rule__Field__FieldTypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Field__FieldTypeAssignment_3_0_in_rule__Field__Alternatives_3848);
                    rule__Field__FieldTypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFieldTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:429:6: ( ( rule__Field__FieldEnumAssignment_3_1 ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:429:6: ( ( rule__Field__FieldEnumAssignment_3_1 ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:430:1: ( rule__Field__FieldEnumAssignment_3_1 )
                    {
                     before(grammarAccess.getFieldAccess().getFieldEnumAssignment_3_1()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:431:1: ( rule__Field__FieldEnumAssignment_3_1 )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:431:2: rule__Field__FieldEnumAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Field__FieldEnumAssignment_3_1_in_rule__Field__Alternatives_3866);
                    rule__Field__FieldEnumAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getFieldEnumAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_3"


    // $ANTLR start "rule__Permission__Alternatives"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:440:1: rule__Permission__Alternatives : ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'modify' ) ) | ( ( 'delete' ) ) );
    public final void rule__Permission__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:444:1: ( ( ( 'create' ) ) | ( ( 'read' ) ) | ( ( 'modify' ) ) | ( ( 'delete' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:445:1: ( ( 'create' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:445:1: ( ( 'create' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:446:1: ( 'create' )
                    {
                     before(grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:447:1: ( 'create' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:447:3: 'create'
                    {
                    match(input,11,FOLLOW_11_in_rule__Permission__Alternatives900); 

                    }

                     after(grammarAccess.getPermissionAccess().getCreateEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:452:6: ( ( 'read' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:452:6: ( ( 'read' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:453:1: ( 'read' )
                    {
                     before(grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:454:1: ( 'read' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:454:3: 'read'
                    {
                    match(input,12,FOLLOW_12_in_rule__Permission__Alternatives921); 

                    }

                     after(grammarAccess.getPermissionAccess().getReadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:459:6: ( ( 'modify' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:459:6: ( ( 'modify' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:460:1: ( 'modify' )
                    {
                     before(grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:461:1: ( 'modify' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:461:3: 'modify'
                    {
                    match(input,13,FOLLOW_13_in_rule__Permission__Alternatives942); 

                    }

                     after(grammarAccess.getPermissionAccess().getModifyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:466:6: ( ( 'delete' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:466:6: ( ( 'delete' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:467:1: ( 'delete' )
                    {
                     before(grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:468:1: ( 'delete' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:468:3: 'delete'
                    {
                    match(input,14,FOLLOW_14_in_rule__Permission__Alternatives963); 

                    }

                     after(grammarAccess.getPermissionAccess().getDeleteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permission__Alternatives"


    // $ANTLR start "rule__FieldType__Alternatives"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:478:1: rule__FieldType__Alternatives : ( ( ( 'user' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) | ( ( 'boolean' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:482:1: ( ( ( 'user' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) | ( ( 'boolean' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:483:1: ( ( 'user' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:483:1: ( ( 'user' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:484:1: ( 'user' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:485:1: ( 'user' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:485:3: 'user'
                    {
                    match(input,15,FOLLOW_15_in_rule__FieldType__Alternatives999); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getUserEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:490:6: ( ( 'String' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:490:6: ( ( 'String' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:491:1: ( 'String' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:492:1: ( 'String' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:492:3: 'String'
                    {
                    match(input,16,FOLLOW_16_in_rule__FieldType__Alternatives1020); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:497:6: ( ( 'Date' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:497:6: ( ( 'Date' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:498:1: ( 'Date' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:499:1: ( 'Date' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:499:3: 'Date'
                    {
                    match(input,17,FOLLOW_17_in_rule__FieldType__Alternatives1041); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:504:6: ( ( 'dateTime' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:504:6: ( ( 'dateTime' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:505:1: ( 'dateTime' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:506:1: ( 'dateTime' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:506:3: 'dateTime'
                    {
                    match(input,18,FOLLOW_18_in_rule__FieldType__Alternatives1062); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getDateTimeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:511:6: ( ( 'int' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:511:6: ( ( 'int' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:512:1: ( 'int' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:513:1: ( 'int' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:513:3: 'int'
                    {
                    match(input,19,FOLLOW_19_in_rule__FieldType__Alternatives1083); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getIntEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:518:6: ( ( 'decimal' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:518:6: ( ( 'decimal' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:519:1: ( 'decimal' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:520:1: ( 'decimal' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:520:3: 'decimal'
                    {
                    match(input,20,FOLLOW_20_in_rule__FieldType__Alternatives1104); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getDecimalEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:525:6: ( ( 'boolean' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:525:6: ( ( 'boolean' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:526:1: ( 'boolean' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:527:1: ( 'boolean' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:527:3: 'boolean'
                    {
                    match(input,21,FOLLOW_21_in_rule__FieldType__Alternatives1125); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__Status__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:539:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:543:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:544:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01158);
            rule__Status__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01161);
            rule__Status__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0"


    // $ANTLR start "rule__Status__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:551:1: rule__Status__Group__0__Impl : ( 'status' ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:555:1: ( ( 'status' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:556:1: ( 'status' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:556:1: ( 'status' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:557:1: 'status'
            {
             before(grammarAccess.getStatusAccess().getStatusKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Status__Group__0__Impl1189); 
             after(grammarAccess.getStatusAccess().getStatusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__0__Impl"


    // $ANTLR start "rule__Status__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:570:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:574:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:575:2: rule__Status__Group__1__Impl rule__Status__Group__2
            {
            pushFollow(FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__11220);
            rule__Status__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11223);
            rule__Status__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__1"


    // $ANTLR start "rule__Status__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:582:1: rule__Status__Group__1__Impl : ( ( rule__Status__NameAssignment_1 ) ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:586:1: ( ( ( rule__Status__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:587:1: ( ( rule__Status__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:587:1: ( ( rule__Status__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:588:1: ( rule__Status__NameAssignment_1 )
            {
             before(grammarAccess.getStatusAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:589:1: ( rule__Status__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:589:2: rule__Status__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Status__NameAssignment_1_in_rule__Status__Group__1__Impl1250);
            rule__Status__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__1__Impl"


    // $ANTLR start "rule__Status__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:599:1: rule__Status__Group__2 : rule__Status__Group__2__Impl rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:603:1: ( rule__Status__Group__2__Impl rule__Status__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:604:2: rule__Status__Group__2__Impl rule__Status__Group__3
            {
            pushFollow(FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__21280);
            rule__Status__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21283);
            rule__Status__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__2"


    // $ANTLR start "rule__Status__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:611:1: rule__Status__Group__2__Impl : ( ( rule__Status__DescriptionAssignment_2 ) ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:615:1: ( ( ( rule__Status__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:616:1: ( ( rule__Status__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:616:1: ( ( rule__Status__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:617:1: ( rule__Status__DescriptionAssignment_2 )
            {
             before(grammarAccess.getStatusAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:618:1: ( rule__Status__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:618:2: rule__Status__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Status__DescriptionAssignment_2_in_rule__Status__Group__2__Impl1310);
            rule__Status__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__2__Impl"


    // $ANTLR start "rule__Status__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:628:1: rule__Status__Group__3 : rule__Status__Group__3__Impl ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:632:1: ( rule__Status__Group__3__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:633:2: rule__Status__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__31340);
            rule__Status__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__3"


    // $ANTLR start "rule__Status__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:639:1: rule__Status__Group__3__Impl : ( ';' ) ;
    public final void rule__Status__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:643:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:644:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:644:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:645:1: ';'
            {
             before(grammarAccess.getStatusAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Status__Group__3__Impl1368); 
             after(grammarAccess.getStatusAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:666:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:670:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:671:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01407);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01410);
            rule__Flow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:678:1: rule__Flow__Group__0__Impl : ( 'flow' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:682:1: ( ( 'flow' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:683:1: ( 'flow' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:683:1: ( 'flow' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:684:1: 'flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Flow__Group__0__Impl1438); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:697:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:701:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:702:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11469);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11472);
            rule__Flow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:709:1: rule__Flow__Group__1__Impl : ( ( rule__Flow__NameAssignment_1 ) ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:713:1: ( ( ( rule__Flow__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:714:1: ( ( rule__Flow__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:714:1: ( ( rule__Flow__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:715:1: ( rule__Flow__NameAssignment_1 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:716:1: ( rule__Flow__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:716:2: rule__Flow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl1499);
            rule__Flow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:726:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:730:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:731:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21529);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21532);
            rule__Flow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:738:1: rule__Flow__Group__2__Impl : ( '{' ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:742:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:743:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:743:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:744:1: '{'
            {
             before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Flow__Group__2__Impl1560); 
             after(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Flow__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:757:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:761:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:762:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31591);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31594);
            rule__Flow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__3"


    // $ANTLR start "rule__Flow__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:769:1: rule__Flow__Group__3__Impl : ( ( rule__Flow__Group_3__0 )* ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:773:1: ( ( ( rule__Flow__Group_3__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:774:1: ( ( rule__Flow__Group_3__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:774:1: ( ( rule__Flow__Group_3__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:775:1: ( rule__Flow__Group_3__0 )*
            {
             before(grammarAccess.getFlowAccess().getGroup_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:776:1: ( rule__Flow__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:776:2: rule__Flow__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__Group_3__0_in_rule__Flow__Group__3__Impl1621);
            	    rule__Flow__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:786:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:790:1: ( rule__Flow__Group__4__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:791:2: rule__Flow__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41652);
            rule__Flow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__4"


    // $ANTLR start "rule__Flow__Group__4__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:797:1: rule__Flow__Group__4__Impl : ( '}' ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:801:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:802:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:802:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:803:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Flow__Group__4__Impl1680); 
             after(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__4__Impl"


    // $ANTLR start "rule__Flow__Group_3__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:826:1: rule__Flow__Group_3__0 : rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1 ;
    public final void rule__Flow__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:830:1: ( rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:831:2: rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1
            {
            pushFollow(FOLLOW_rule__Flow__Group_3__0__Impl_in_rule__Flow__Group_3__01721);
            rule__Flow__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group_3__1_in_rule__Flow__Group_3__01724);
            rule__Flow__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_3__0"


    // $ANTLR start "rule__Flow__Group_3__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:838:1: rule__Flow__Group_3__0__Impl : ( ( rule__Flow__StatesAssignment_3_0 ) ) ;
    public final void rule__Flow__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:842:1: ( ( ( rule__Flow__StatesAssignment_3_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:843:1: ( ( rule__Flow__StatesAssignment_3_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:843:1: ( ( rule__Flow__StatesAssignment_3_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:844:1: ( rule__Flow__StatesAssignment_3_0 )
            {
             before(grammarAccess.getFlowAccess().getStatesAssignment_3_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:845:1: ( rule__Flow__StatesAssignment_3_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:845:2: rule__Flow__StatesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Flow__StatesAssignment_3_0_in_rule__Flow__Group_3__0__Impl1751);
            rule__Flow__StatesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getStatesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_3__0__Impl"


    // $ANTLR start "rule__Flow__Group_3__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:855:1: rule__Flow__Group_3__1 : rule__Flow__Group_3__1__Impl ;
    public final void rule__Flow__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:859:1: ( rule__Flow__Group_3__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:860:2: rule__Flow__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group_3__1__Impl_in_rule__Flow__Group_3__11781);
            rule__Flow__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_3__1"


    // $ANTLR start "rule__Flow__Group_3__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:866:1: rule__Flow__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Flow__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:870:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:871:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:871:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:872:1: ';'
            {
             before(grammarAccess.getFlowAccess().getSemicolonKeyword_3_1()); 
            match(input,23,FOLLOW_23_in_rule__Flow__Group_3__1__Impl1809); 
             after(grammarAccess.getFlowAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:889:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:893:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:894:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01844);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01847);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:901:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:905:1: ( ( 'field' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:906:1: ( 'field' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:906:1: ( 'field' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:907:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Field__Group__0__Impl1875); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:920:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:924:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:925:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11906);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11909);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:932:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:936:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:937:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:937:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:938:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:939:1: ( rule__Field__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:939:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl1936);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:949:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:953:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:954:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21966);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21969);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:961:1: rule__Field__Group__2__Impl : ( ( rule__Field__LabelAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:965:1: ( ( ( rule__Field__LabelAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:966:1: ( ( rule__Field__LabelAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:966:1: ( ( rule__Field__LabelAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:967:1: ( rule__Field__LabelAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:968:1: ( rule__Field__LabelAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:968:2: rule__Field__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl1996);
            rule__Field__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:978:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:982:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:983:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32026);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32029);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:990:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:994:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:995:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:995:1: ( ( rule__Field__Alternatives_3 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:996:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:997:1: ( rule__Field__Alternatives_3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:997:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2056);
            rule__Field__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1007:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1011:1: ( rule__Field__Group__4__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1012:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42086);
            rule__Field__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1018:1: rule__Field__Group__4__Impl : ( ';' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1022:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1023:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1023:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1024:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Field__Group__4__Impl2114); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1047:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1051:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1052:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02155);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02158);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1059:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1063:1: ( ( 'enum' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1064:1: ( 'enum' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1064:1: ( 'enum' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1065:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Enum__Group__0__Impl2186); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1078:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1082:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1083:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12217);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12220);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1090:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__OptionAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1094:1: ( ( ( rule__Enum__OptionAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1095:1: ( ( rule__Enum__OptionAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1095:1: ( ( rule__Enum__OptionAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1096:1: ( rule__Enum__OptionAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1097:1: ( rule__Enum__OptionAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1097:2: rule__Enum__OptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_1_in_rule__Enum__Group__1__Impl2247);
            rule__Enum__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1107:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1111:1: ( rule__Enum__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1112:2: rule__Enum__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22277);
            rule__Enum__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1118:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__Group_2__0 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1122:1: ( ( ( rule__Enum__Group_2__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1123:1: ( ( rule__Enum__Group_2__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1123:1: ( ( rule__Enum__Group_2__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1124:1: ( rule__Enum__Group_2__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1125:1: ( rule__Enum__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1125:2: rule__Enum__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl2304);
            	    rule__Enum__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group_2__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1141:1: rule__Enum__Group_2__0 : rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 ;
    public final void rule__Enum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1145:1: ( rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1146:2: rule__Enum__Group_2__0__Impl rule__Enum__Group_2__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__02341);
            rule__Enum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__02344);
            rule__Enum__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__0"


    // $ANTLR start "rule__Enum__Group_2__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1153:1: rule__Enum__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1157:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1158:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1158:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1159:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__Enum__Group_2__0__Impl2372); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__0__Impl"


    // $ANTLR start "rule__Enum__Group_2__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1172:1: rule__Enum__Group_2__1 : rule__Enum__Group_2__1__Impl ;
    public final void rule__Enum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1176:1: ( rule__Enum__Group_2__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1177:2: rule__Enum__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__12403);
            rule__Enum__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__1"


    // $ANTLR start "rule__Enum__Group_2__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1183:1: rule__Enum__Group_2__1__Impl : ( ( rule__Enum__OptionAssignment_2_1 ) ) ;
    public final void rule__Enum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1187:1: ( ( ( rule__Enum__OptionAssignment_2_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1188:1: ( ( rule__Enum__OptionAssignment_2_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1188:1: ( ( rule__Enum__OptionAssignment_2_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1189:1: ( rule__Enum__OptionAssignment_2_1 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_2_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1190:1: ( rule__Enum__OptionAssignment_2_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1190:2: rule__Enum__OptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_2_1_in_rule__Enum__Group_2__1__Impl2430);
            rule__Enum__OptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getOptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group_2__1__Impl"


    // $ANTLR start "rule__TicketCategory__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1204:1: rule__TicketCategory__Group__0 : rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 ;
    public final void rule__TicketCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1208:1: ( rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1209:2: rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02464);
            rule__TicketCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02467);
            rule__TicketCategory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__0"


    // $ANTLR start "rule__TicketCategory__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1216:1: rule__TicketCategory__Group__0__Impl : ( 'ticketCategory' ) ;
    public final void rule__TicketCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1220:1: ( ( 'ticketCategory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1221:1: ( 'ticketCategory' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1221:1: ( 'ticketCategory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1222:1: 'ticketCategory'
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__TicketCategory__Group__0__Impl2495); 
             after(grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__0__Impl"


    // $ANTLR start "rule__TicketCategory__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1235:1: rule__TicketCategory__Group__1 : rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 ;
    public final void rule__TicketCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1239:1: ( rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1240:2: rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12526);
            rule__TicketCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12529);
            rule__TicketCategory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__1"


    // $ANTLR start "rule__TicketCategory__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1247:1: rule__TicketCategory__Group__1__Impl : ( ( rule__TicketCategory__NameAssignment_1 ) ) ;
    public final void rule__TicketCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1251:1: ( ( ( rule__TicketCategory__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1252:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1252:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1253:1: ( rule__TicketCategory__NameAssignment_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1254:1: ( rule__TicketCategory__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1254:2: rule__TicketCategory__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2556);
            rule__TicketCategory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__1__Impl"


    // $ANTLR start "rule__TicketCategory__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1264:1: rule__TicketCategory__Group__2 : rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 ;
    public final void rule__TicketCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1268:1: ( rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1269:2: rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22586);
            rule__TicketCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22589);
            rule__TicketCategory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__2"


    // $ANTLR start "rule__TicketCategory__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1276:1: rule__TicketCategory__Group__2__Impl : ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) ;
    public final void rule__TicketCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1280:1: ( ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1281:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1281:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1282:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1283:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1283:2: rule__TicketCategory__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2616);
            rule__TicketCategory__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__2__Impl"


    // $ANTLR start "rule__TicketCategory__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1293:1: rule__TicketCategory__Group__3 : rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 ;
    public final void rule__TicketCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1297:1: ( rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1298:2: rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32646);
            rule__TicketCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32649);
            rule__TicketCategory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__3"


    // $ANTLR start "rule__TicketCategory__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1305:1: rule__TicketCategory__Group__3__Impl : ( '{' ) ;
    public final void rule__TicketCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1309:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1310:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1310:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1311:1: '{'
            {
             before(grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__TicketCategory__Group__3__Impl2677); 
             after(grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__3__Impl"


    // $ANTLR start "rule__TicketCategory__Group__4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1324:1: rule__TicketCategory__Group__4 : rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 ;
    public final void rule__TicketCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1328:1: ( rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1329:2: rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42708);
            rule__TicketCategory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42711);
            rule__TicketCategory__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__4"


    // $ANTLR start "rule__TicketCategory__Group__4__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1336:1: rule__TicketCategory__Group__4__Impl : ( ( rule__TicketCategory__Group_4__0 )? ) ;
    public final void rule__TicketCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1340:1: ( ( ( rule__TicketCategory__Group_4__0 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1341:1: ( ( rule__TicketCategory__Group_4__0 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1341:1: ( ( rule__TicketCategory__Group_4__0 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1342:1: ( rule__TicketCategory__Group_4__0 )?
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1343:1: ( rule__TicketCategory__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1343:2: rule__TicketCategory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2738);
                    rule__TicketCategory__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTicketCategoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__4__Impl"


    // $ANTLR start "rule__TicketCategory__Group__5"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1353:1: rule__TicketCategory__Group__5 : rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 ;
    public final void rule__TicketCategory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1357:1: ( rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1358:2: rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52769);
            rule__TicketCategory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52772);
            rule__TicketCategory__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__5"


    // $ANTLR start "rule__TicketCategory__Group__5__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1365:1: rule__TicketCategory__Group__5__Impl : ( 'fields {' ) ;
    public final void rule__TicketCategory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1369:1: ( ( 'fields {' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1370:1: ( 'fields {' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1370:1: ( 'fields {' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1371:1: 'fields {'
            {
             before(grammarAccess.getTicketCategoryAccess().getFieldsKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__TicketCategory__Group__5__Impl2800); 
             after(grammarAccess.getTicketCategoryAccess().getFieldsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__5__Impl"


    // $ANTLR start "rule__TicketCategory__Group__6"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1384:1: rule__TicketCategory__Group__6 : rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 ;
    public final void rule__TicketCategory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1388:1: ( rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1389:2: rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62831);
            rule__TicketCategory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62834);
            rule__TicketCategory__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__6"


    // $ANTLR start "rule__TicketCategory__Group__6__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1396:1: rule__TicketCategory__Group__6__Impl : ( ( rule__TicketCategory__Group_6__0 )* ) ;
    public final void rule__TicketCategory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1400:1: ( ( ( rule__TicketCategory__Group_6__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1401:1: ( ( rule__TicketCategory__Group_6__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1401:1: ( ( rule__TicketCategory__Group_6__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1402:1: ( rule__TicketCategory__Group_6__0 )*
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_6()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1403:1: ( rule__TicketCategory__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1403:2: rule__TicketCategory__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2861);
            	    rule__TicketCategory__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTicketCategoryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__6__Impl"


    // $ANTLR start "rule__TicketCategory__Group__7"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1413:1: rule__TicketCategory__Group__7 : rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 ;
    public final void rule__TicketCategory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1417:1: ( rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1418:2: rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72892);
            rule__TicketCategory__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72895);
            rule__TicketCategory__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__7"


    // $ANTLR start "rule__TicketCategory__Group__7__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1425:1: rule__TicketCategory__Group__7__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1429:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1430:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1430:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1431:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__TicketCategory__Group__7__Impl2923); 
             after(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__7__Impl"


    // $ANTLR start "rule__TicketCategory__Group__8"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1444:1: rule__TicketCategory__Group__8 : rule__TicketCategory__Group__8__Impl ;
    public final void rule__TicketCategory__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1448:1: ( rule__TicketCategory__Group__8__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1449:2: rule__TicketCategory__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82954);
            rule__TicketCategory__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__8"


    // $ANTLR start "rule__TicketCategory__Group__8__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1455:1: rule__TicketCategory__Group__8__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1459:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1460:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1460:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1461:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__TicketCategory__Group__8__Impl2982); 
             after(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group__8__Impl"


    // $ANTLR start "rule__TicketCategory__Group_4__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1492:1: rule__TicketCategory__Group_4__0 : rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 ;
    public final void rule__TicketCategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1496:1: ( rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1497:2: rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__03031);
            rule__TicketCategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__03034);
            rule__TicketCategory__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__0"


    // $ANTLR start "rule__TicketCategory__Group_4__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1504:1: rule__TicketCategory__Group_4__0__Impl : ( 'flow' ) ;
    public final void rule__TicketCategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1508:1: ( ( 'flow' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1509:1: ( 'flow' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1509:1: ( 'flow' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1510:1: 'flow'
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__TicketCategory__Group_4__0__Impl3062); 
             after(grammarAccess.getTicketCategoryAccess().getFlowKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__0__Impl"


    // $ANTLR start "rule__TicketCategory__Group_4__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1523:1: rule__TicketCategory__Group_4__1 : rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 ;
    public final void rule__TicketCategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1527:1: ( rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1528:2: rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13093);
            rule__TicketCategory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13096);
            rule__TicketCategory__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__1"


    // $ANTLR start "rule__TicketCategory__Group_4__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1535:1: rule__TicketCategory__Group_4__1__Impl : ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) ;
    public final void rule__TicketCategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1539:1: ( ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1540:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1540:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1541:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1542:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1542:2: rule__TicketCategory__FlowAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3123);
            rule__TicketCategory__FlowAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__1__Impl"


    // $ANTLR start "rule__TicketCategory__Group_4__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1552:1: rule__TicketCategory__Group_4__2 : rule__TicketCategory__Group_4__2__Impl ;
    public final void rule__TicketCategory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1556:1: ( rule__TicketCategory__Group_4__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1557:2: rule__TicketCategory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23153);
            rule__TicketCategory__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__2"


    // $ANTLR start "rule__TicketCategory__Group_4__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1563:1: rule__TicketCategory__Group_4__2__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1567:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1568:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1568:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1569:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_4_2()); 
            match(input,23,FOLLOW_23_in_rule__TicketCategory__Group_4__2__Impl3181); 
             after(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_4__2__Impl"


    // $ANTLR start "rule__TicketCategory__Group_6__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1588:1: rule__TicketCategory__Group_6__0 : rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 ;
    public final void rule__TicketCategory__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1592:1: ( rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1593:2: rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03218);
            rule__TicketCategory__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03221);
            rule__TicketCategory__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_6__0"


    // $ANTLR start "rule__TicketCategory__Group_6__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1600:1: rule__TicketCategory__Group_6__0__Impl : ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) ;
    public final void rule__TicketCategory__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1604:1: ( ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1605:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1605:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1606:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1607:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1607:2: rule__TicketCategory__TicketFieldsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3248);
            rule__TicketCategory__TicketFieldsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_6__0__Impl"


    // $ANTLR start "rule__TicketCategory__Group_6__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1617:1: rule__TicketCategory__Group_6__1 : rule__TicketCategory__Group_6__1__Impl ;
    public final void rule__TicketCategory__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1621:1: ( rule__TicketCategory__Group_6__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1622:2: rule__TicketCategory__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13278);
            rule__TicketCategory__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_6__1"


    // $ANTLR start "rule__TicketCategory__Group_6__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1628:1: rule__TicketCategory__Group_6__1__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1632:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1633:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1633:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1634:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1()); 
            match(input,23,FOLLOW_23_in_rule__TicketCategory__Group_6__1__Impl3306); 
             after(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__Group_6__1__Impl"


    // $ANTLR start "rule__TicketField__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1651:1: rule__TicketField__Group__0 : rule__TicketField__Group__0__Impl rule__TicketField__Group__1 ;
    public final void rule__TicketField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1655:1: ( rule__TicketField__Group__0__Impl rule__TicketField__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1656:2: rule__TicketField__Group__0__Impl rule__TicketField__Group__1
            {
            pushFollow(FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03341);
            rule__TicketField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03344);
            rule__TicketField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__0"


    // $ANTLR start "rule__TicketField__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1663:1: rule__TicketField__Group__0__Impl : ( ( rule__TicketField__FieldAssignment_0 ) ) ;
    public final void rule__TicketField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1667:1: ( ( ( rule__TicketField__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1668:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1668:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1669:1: ( rule__TicketField__FieldAssignment_0 )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1670:1: ( rule__TicketField__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1670:2: rule__TicketField__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3371);
            rule__TicketField__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTicketFieldAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__0__Impl"


    // $ANTLR start "rule__TicketField__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1680:1: rule__TicketField__Group__1 : rule__TicketField__Group__1__Impl rule__TicketField__Group__2 ;
    public final void rule__TicketField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1684:1: ( rule__TicketField__Group__1__Impl rule__TicketField__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1685:2: rule__TicketField__Group__1__Impl rule__TicketField__Group__2
            {
            pushFollow(FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13401);
            rule__TicketField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13404);
            rule__TicketField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__1"


    // $ANTLR start "rule__TicketField__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1692:1: rule__TicketField__Group__1__Impl : ( ( rule__TicketField__MandatoryAssignment_1 )? ) ;
    public final void rule__TicketField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1696:1: ( ( ( rule__TicketField__MandatoryAssignment_1 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1697:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1697:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1698:1: ( rule__TicketField__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1699:1: ( rule__TicketField__MandatoryAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1699:2: rule__TicketField__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3431);
                    rule__TicketField__MandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__1__Impl"


    // $ANTLR start "rule__TicketField__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1709:1: rule__TicketField__Group__2 : rule__TicketField__Group__2__Impl ;
    public final void rule__TicketField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1713:1: ( rule__TicketField__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1714:2: rule__TicketField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23462);
            rule__TicketField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__2"


    // $ANTLR start "rule__TicketField__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1720:1: rule__TicketField__Group__2__Impl : ( ( rule__TicketField__NotOnListAssignment_2 )? ) ;
    public final void rule__TicketField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1724:1: ( ( ( rule__TicketField__NotOnListAssignment_2 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1725:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1725:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1726:1: ( rule__TicketField__NotOnListAssignment_2 )?
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1727:1: ( rule__TicketField__NotOnListAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1727:2: rule__TicketField__NotOnListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3489);
                    rule__TicketField__NotOnListAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTicketFieldAccess().getNotOnListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1743:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1747:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1748:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03526);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03529);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1755:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1759:1: ( ( 'role' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1760:1: ( 'role' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1760:1: ( 'role' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1761:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Role__Group__0__Impl3557); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1774:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1778:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1779:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13588);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13591);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1786:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1790:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1791:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1791:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1792:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1793:1: ( rule__Role__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1793:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3618);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1803:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1807:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1808:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23648);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23651);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1815:1: rule__Role__Group__2__Impl : ( ( rule__Role__DescriptionAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1819:1: ( ( ( rule__Role__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1820:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1820:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1821:1: ( rule__Role__DescriptionAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1822:1: ( rule__Role__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1822:2: rule__Role__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3678);
            rule__Role__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1832:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1836:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1837:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33708);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33711);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1844:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1848:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1849:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1849:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1850:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Role__Group__3__Impl3739); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1863:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1867:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1868:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43770);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43773);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1875:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1879:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1880:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1880:1: ( ( rule__Role__Group_4__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1881:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1882:1: ( rule__Role__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1882:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3800);
            	    rule__Role__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1892:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1896:1: ( rule__Role__Group__5__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1897:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53831);
            rule__Role__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1903:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1907:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1908:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1908:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1909:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Role__Group__5__Impl3859); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1934:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1938:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1939:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03902);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03905);
            rule__Role__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1946:1: rule__Role__Group_4__0__Impl : ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1950:1: ( ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1951:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1951:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1952:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1953:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1953:2: rule__Role__RolepermissionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3932);
            rule__Role__RolepermissionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1963:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1967:1: ( rule__Role__Group_4__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1968:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13962);
            rule__Role__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1974:1: rule__Role__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1978:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1979:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1979:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1980:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_4_1()); 
            match(input,23,FOLLOW_23_in_rule__Role__Group_4__1__Impl3990); 
             after(grammarAccess.getRoleAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__RolePermission__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1997:1: rule__RolePermission__Group__0 : rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 ;
    public final void rule__RolePermission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2001:1: ( rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2002:2: rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__04025);
            rule__RolePermission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__04028);
            rule__RolePermission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__0"


    // $ANTLR start "rule__RolePermission__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2009:1: rule__RolePermission__Group__0__Impl : ( ( rule__RolePermission__FieldAssignment_0 ) ) ;
    public final void rule__RolePermission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2013:1: ( ( ( rule__RolePermission__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2014:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2014:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2015:1: ( rule__RolePermission__FieldAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2016:1: ( rule__RolePermission__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2016:2: rule__RolePermission__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl4055);
            rule__RolePermission__FieldAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRolePermissionAccess().getFieldAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__0__Impl"


    // $ANTLR start "rule__RolePermission__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2026:1: rule__RolePermission__Group__1 : rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 ;
    public final void rule__RolePermission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2030:1: ( rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2031:2: rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14085);
            rule__RolePermission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14088);
            rule__RolePermission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__1"


    // $ANTLR start "rule__RolePermission__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2038:1: rule__RolePermission__Group__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_1 ) ) ;
    public final void rule__RolePermission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2042:1: ( ( ( rule__RolePermission__PermissionsAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2043:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2043:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2044:1: ( rule__RolePermission__PermissionsAssignment_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2045:1: ( rule__RolePermission__PermissionsAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2045:2: rule__RolePermission__PermissionsAssignment_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4115);
            rule__RolePermission__PermissionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__1__Impl"


    // $ANTLR start "rule__RolePermission__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2055:1: rule__RolePermission__Group__2 : rule__RolePermission__Group__2__Impl ;
    public final void rule__RolePermission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2059:1: ( rule__RolePermission__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2060:2: rule__RolePermission__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24145);
            rule__RolePermission__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__2"


    // $ANTLR start "rule__RolePermission__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2066:1: rule__RolePermission__Group__2__Impl : ( ( rule__RolePermission__Group_2__0 )* ) ;
    public final void rule__RolePermission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2070:1: ( ( ( rule__RolePermission__Group_2__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2071:1: ( ( rule__RolePermission__Group_2__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2071:1: ( ( rule__RolePermission__Group_2__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2072:1: ( rule__RolePermission__Group_2__0 )*
            {
             before(grammarAccess.getRolePermissionAccess().getGroup_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2073:1: ( rule__RolePermission__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2073:2: rule__RolePermission__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4172);
            	    rule__RolePermission__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRolePermissionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group__2__Impl"


    // $ANTLR start "rule__RolePermission__Group_2__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2089:1: rule__RolePermission__Group_2__0 : rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 ;
    public final void rule__RolePermission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2093:1: ( rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2094:2: rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04209);
            rule__RolePermission__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04212);
            rule__RolePermission__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group_2__0"


    // $ANTLR start "rule__RolePermission__Group_2__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2101:1: rule__RolePermission__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RolePermission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2105:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2106:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2106:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2107:1: ','
            {
             before(grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__RolePermission__Group_2__0__Impl4240); 
             after(grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group_2__0__Impl"


    // $ANTLR start "rule__RolePermission__Group_2__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2120:1: rule__RolePermission__Group_2__1 : rule__RolePermission__Group_2__1__Impl ;
    public final void rule__RolePermission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2124:1: ( rule__RolePermission__Group_2__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2125:2: rule__RolePermission__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14271);
            rule__RolePermission__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group_2__1"


    // $ANTLR start "rule__RolePermission__Group_2__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2131:1: rule__RolePermission__Group_2__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) ;
    public final void rule__RolePermission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2135:1: ( ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2136:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2136:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2137:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2138:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2138:2: rule__RolePermission__PermissionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4298);
            rule__RolePermission__PermissionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2152:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2156:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2157:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04332);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04335);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2164:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2168:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2169:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2169:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2170:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4362); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2181:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2185:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2186:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14391);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2192:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2196:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2197:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2197:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2198:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2199:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2199:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4418);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2213:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2217:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2218:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04453);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04456);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2225:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2229:1: ( ( '.' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2230:1: ( '.' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2230:1: ( '.' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2231:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl4484); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2244:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2248:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2249:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14515);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2255:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2259:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2260:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2260:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2261:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4542); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__TicketSystem__StatesAssignment_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2277:1: rule__TicketSystem__StatesAssignment_0 : ( ruleStatus ) ;
    public final void rule__TicketSystem__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2281:1: ( ( ruleStatus ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2282:1: ( ruleStatus )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2282:1: ( ruleStatus )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2283:1: ruleStatus
            {
             before(grammarAccess.getTicketSystemAccess().getStatesStatusParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04580);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getStatesStatusParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__StatesAssignment_0"


    // $ANTLR start "rule__TicketSystem__FlowsAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2292:1: rule__TicketSystem__FlowsAssignment_1 : ( ruleFlow ) ;
    public final void rule__TicketSystem__FlowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2296:1: ( ( ruleFlow ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2297:1: ( ruleFlow )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2297:1: ( ruleFlow )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2298:1: ruleFlow
            {
             before(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14611);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__FlowsAssignment_1"


    // $ANTLR start "rule__TicketSystem__FieldsAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2307:1: rule__TicketSystem__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__TicketSystem__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2311:1: ( ( ruleField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2312:1: ( ruleField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2312:1: ( ruleField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2313:1: ruleField
            {
             before(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24642);
            ruleField();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__FieldsAssignment_2"


    // $ANTLR start "rule__TicketSystem__CategoriesAssignment_3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2322:1: rule__TicketSystem__CategoriesAssignment_3 : ( ruleTicketCategory ) ;
    public final void rule__TicketSystem__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2326:1: ( ( ruleTicketCategory ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2327:1: ( ruleTicketCategory )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2327:1: ( ruleTicketCategory )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2328:1: ruleTicketCategory
            {
             before(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34673);
            ruleTicketCategory();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__CategoriesAssignment_3"


    // $ANTLR start "rule__TicketSystem__RolesAssignment_4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2337:1: rule__TicketSystem__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__TicketSystem__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2341:1: ( ( ruleRole ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2342:1: ( ruleRole )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2342:1: ( ruleRole )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2343:1: ruleRole
            {
             before(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44704);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketSystem__RolesAssignment_4"


    // $ANTLR start "rule__Status__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2352:1: rule__Status__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Status__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2356:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2357:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2357:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2358:1: ruleQualifiedName
            {
             before(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14735);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__NameAssignment_1"


    // $ANTLR start "rule__Status__DescriptionAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2367:1: rule__Status__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Status__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2371:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2372:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2372:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2373:1: RULE_STRING
            {
             before(grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24766); 
             after(grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__DescriptionAssignment_2"


    // $ANTLR start "rule__Flow__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2382:1: rule__Flow__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2386:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2387:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2387:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2388:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14797);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__NameAssignment_1"


    // $ANTLR start "rule__Flow__StatesAssignment_3_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2397:1: rule__Flow__StatesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Flow__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2401:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2402:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2402:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2403:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFlowAccess().getStatesStatusCrossReference_3_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2404:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2405:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getStatesStatusQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04832);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStatesStatusQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getFlowAccess().getStatesStatusCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StatesAssignment_3_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2416:1: rule__Field__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2420:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2421:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2421:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2422:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14867);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__LabelAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2431:1: rule__Field__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2435:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2436:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2436:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2437:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24898); 
             after(grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__LabelAssignment_2"


    // $ANTLR start "rule__Field__FieldTypeAssignment_3_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2446:1: rule__Field__FieldTypeAssignment_3_0 : ( ruleFieldType ) ;
    public final void rule__Field__FieldTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2450:1: ( ( ruleFieldType ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2451:1: ( ruleFieldType )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2451:1: ( ruleFieldType )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2452:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04929);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldTypeAssignment_3_0"


    // $ANTLR start "rule__Field__FieldEnumAssignment_3_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2461:1: rule__Field__FieldEnumAssignment_3_1 : ( ruleEnum ) ;
    public final void rule__Field__FieldEnumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2465:1: ( ( ruleEnum ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2466:1: ( ruleEnum )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2466:1: ( ruleEnum )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2467:1: ruleEnum
            {
             before(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14960);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldEnumAssignment_3_1"


    // $ANTLR start "rule__Enum__OptionAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2476:1: rule__Enum__OptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2480:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2481:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2481:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2482:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_14991); 
             after(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__OptionAssignment_1"


    // $ANTLR start "rule__Enum__OptionAssignment_2_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2491:1: rule__Enum__OptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2495:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2496:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2496:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2497:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_2_15022); 
             after(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__OptionAssignment_2_1"


    // $ANTLR start "rule__TicketCategory__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2506:1: rule__TicketCategory__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TicketCategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2510:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2511:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2511:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2512:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_15053);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__NameAssignment_1"


    // $ANTLR start "rule__TicketCategory__DescriptionAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2521:1: rule__TicketCategory__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TicketCategory__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2525:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2526:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2526:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2527:1: RULE_STRING
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_25084); 
             after(grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__DescriptionAssignment_2"


    // $ANTLR start "rule__TicketCategory__FlowAssignment_4_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2536:1: rule__TicketCategory__FlowAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketCategory__FlowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2540:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2541:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2541:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2542:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2543:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2544:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15119);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__FlowAssignment_4_1"


    // $ANTLR start "rule__TicketCategory__TicketFieldsAssignment_6_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2555:1: rule__TicketCategory__TicketFieldsAssignment_6_0 : ( ruleTicketField ) ;
    public final void rule__TicketCategory__TicketFieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2559:1: ( ( ruleTicketField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2560:1: ( ruleTicketField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2560:1: ( ruleTicketField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2561:1: ruleTicketField
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05154);
            ruleTicketField();

            state._fsp--;

             after(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__TicketFieldsAssignment_6_0"


    // $ANTLR start "rule__TicketField__FieldAssignment_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2570:1: rule__TicketField__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketField__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2574:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2575:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2575:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2576:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2577:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2578:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05189);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTicketFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__FieldAssignment_0"


    // $ANTLR start "rule__TicketField__MandatoryAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2589:1: rule__TicketField__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__TicketField__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2593:1: ( ( ( 'mandatory' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2594:1: ( ( 'mandatory' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2594:1: ( ( 'mandatory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2595:1: ( 'mandatory' )
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2596:1: ( 'mandatory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2597:1: 'mandatory'
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TicketField__MandatoryAssignment_15229); 
             after(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__MandatoryAssignment_1"


    // $ANTLR start "rule__TicketField__NotOnListAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2612:1: rule__TicketField__NotOnListAssignment_2 : ( ( 'notOnList' ) ) ;
    public final void rule__TicketField__NotOnListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2616:1: ( ( ( 'notOnList' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2617:1: ( ( 'notOnList' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2617:1: ( ( 'notOnList' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2618:1: ( 'notOnList' )
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2619:1: ( 'notOnList' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2620:1: 'notOnList'
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__TicketField__NotOnListAssignment_25273); 
             after(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 

            }

             after(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketField__NotOnListAssignment_2"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2635:1: rule__Role__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2639:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2640:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2640:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2641:1: ruleQualifiedName
            {
             before(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15312);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__DescriptionAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2650:1: rule__Role__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Role__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2654:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2655:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2655:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2656:1: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25343); 
             after(grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__DescriptionAssignment_2"


    // $ANTLR start "rule__Role__RolepermissionsAssignment_4_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2665:1: rule__Role__RolepermissionsAssignment_4_0 : ( ruleRolePermission ) ;
    public final void rule__Role__RolepermissionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2669:1: ( ( ruleRolePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2670:1: ( ruleRolePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2670:1: ( ruleRolePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2671:1: ruleRolePermission
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05374);
            ruleRolePermission();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__RolepermissionsAssignment_4_0"


    // $ANTLR start "rule__RolePermission__FieldAssignment_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2680:1: rule__RolePermission__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RolePermission__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2684:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2685:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2685:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2686:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2687:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2688:1: ruleQualifiedName
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05409);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRolePermissionAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__FieldAssignment_0"


    // $ANTLR start "rule__RolePermission__PermissionsAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2699:1: rule__RolePermission__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2703:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2704:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2704:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2705:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15444);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__PermissionsAssignment_1"


    // $ANTLR start "rule__RolePermission__PermissionsAssignment_2_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2714:1: rule__RolePermission__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2718:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2719:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2719:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2720:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15475);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RolePermission__PermissionsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTicketSystem_in_entryRuleTicketSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__Alternatives_in_ruleTicketSystem94 = new BitSet(new long[]{0x0000000149400002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__0_in_ruleStatus155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_entryRuleTicketCategory362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketCategory369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__0_in_ruleTicketCategory395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_entryRuleTicketField422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTicketField429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__0_in_ruleTicketField455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_entryRuleRolePermission542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRolePermission549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__0_in_ruleRolePermission575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Alternatives_in_rulePermission672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__Alternatives_in_ruleFieldType708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__StatesAssignment_0_in_rule__TicketSystem__Alternatives743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__FlowsAssignment_1_in_rule__TicketSystem__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__FieldsAssignment_2_in_rule__TicketSystem__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__CategoriesAssignment_3_in_rule__TicketSystem__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketSystem__RolesAssignment_4_in_rule__TicketSystem__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldTypeAssignment_3_0_in_rule__Field__Alternatives_3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldEnumAssignment_3_1_in_rule__Field__Alternatives_3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Permission__Alternatives900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Permission__Alternatives921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Permission__Alternatives942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Permission__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FieldType__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldType__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FieldType__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FieldType__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FieldType__Alternatives1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FieldType__Alternatives1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FieldType__Alternatives1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Status__Group__0__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__11220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__NameAssignment_1_in_rule__Status__Group__1__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__21280 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__DescriptionAssignment_2_in_rule__Status__Group__2__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__31340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Status__Group__3__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Flow__Group__0__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11469 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21529 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Flow__Group__2__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31591 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__0_in_rule__Flow__Group__3__Impl1621 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Flow__Group__4__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__0__Impl_in_rule__Flow__Group_3__01721 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__1_in_rule__Flow__Group_3__01724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StatesAssignment_3_0_in_rule__Flow__Group_3__0__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__1__Impl_in_rule__Flow__Group_3__11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Flow__Group_3__1__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Field__Group__0__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21966 = new BitSet(new long[]{0x00000000103F8000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32026 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__4__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02155 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Enum__Group__0__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12217 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_1_in_rule__Enum__Group__1__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__22277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0_in_rule__Enum__Group__2__Impl2304 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__0__Impl_in_rule__Enum__Group_2__02341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1_in_rule__Enum__Group_2__02344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Enum__Group_2__0__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_2__1__Impl_in_rule__Enum__Group_2__12403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_2_1_in_rule__Enum__Group_2__1__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TicketCategory__Group__0__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22586 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32646 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TicketCategory__Group__3__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42708 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52769 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TicketCategory__Group__5__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62831 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2861 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72892 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TicketCategory__Group__7__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TicketCategory__Group__8__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__03031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__03034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TicketCategory__Group_4__0__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13093 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TicketCategory__Group_4__2__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TicketCategory__Group_6__1__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03341 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13401 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Role__Group__0__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23648 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33708 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Role__Group__3__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43770 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3800 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Role__Group__5__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03902 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Role__Group_4__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__04025 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__04028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14085 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4172 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04209 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RolePermission__Group_2__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04332 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4418 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_2_15022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_15053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_25084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TicketField__MandatoryAssignment_15229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TicketField__NotOnListAssignment_25273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15475 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'String'", "'Date'", "'dateTime'", "'int'", "'decimal'", "'boolean'", "'status'", "';'", "'flow'", "'{'", "'}'", "'field'", "','", "'ticketCategory'", "'fields {'", "'role'", "'.'", "'mandatory'", "'notOnList'"
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

                if ( (LA1_0==22||LA1_0==24||LA1_0==27||LA1_0==29||LA1_0==31) ) {
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
            case 29:
                {
                alt2=4;
                }
                break;
            case 31:
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1059:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__OptionAssignment_0 ) ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1063:1: ( ( ( rule__Enum__OptionAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1064:1: ( ( rule__Enum__OptionAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1064:1: ( ( rule__Enum__OptionAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1065:1: ( rule__Enum__OptionAssignment_0 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1066:1: ( rule__Enum__OptionAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1066:2: rule__Enum__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2185);
            rule__Enum__OptionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getOptionAssignment_0()); 

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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1076:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1080:1: ( rule__Enum__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1081:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12215);
            rule__Enum__Group__1__Impl();

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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1087:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__Group_1__0 )* ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1091:1: ( ( ( rule__Enum__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1092:1: ( ( rule__Enum__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1092:1: ( ( rule__Enum__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1093:1: ( rule__Enum__Group_1__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1094:1: ( rule__Enum__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1094:2: rule__Enum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2242);
            	    rule__Enum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Enum__Group_1__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1108:1: rule__Enum__Group_1__0 : rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 ;
    public final void rule__Enum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1112:1: ( rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1113:2: rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02277);
            rule__Enum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02280);
            rule__Enum__Group_1__1();

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
    // $ANTLR end "rule__Enum__Group_1__0"


    // $ANTLR start "rule__Enum__Group_1__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1120:1: rule__Enum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1124:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1125:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1125:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1126:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Enum__Group_1__0__Impl2308); 
             after(grammarAccess.getEnumAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Enum__Group_1__0__Impl"


    // $ANTLR start "rule__Enum__Group_1__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1139:1: rule__Enum__Group_1__1 : rule__Enum__Group_1__1__Impl ;
    public final void rule__Enum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1143:1: ( rule__Enum__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1144:2: rule__Enum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12339);
            rule__Enum__Group_1__1__Impl();

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
    // $ANTLR end "rule__Enum__Group_1__1"


    // $ANTLR start "rule__Enum__Group_1__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1150:1: rule__Enum__Group_1__1__Impl : ( ( rule__Enum__OptionAssignment_1_1 ) ) ;
    public final void rule__Enum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1154:1: ( ( ( rule__Enum__OptionAssignment_1_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1155:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1155:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1156:1: ( rule__Enum__OptionAssignment_1_1 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_1_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1157:1: ( rule__Enum__OptionAssignment_1_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1157:2: rule__Enum__OptionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2366);
            rule__Enum__OptionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getOptionAssignment_1_1()); 

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
    // $ANTLR end "rule__Enum__Group_1__1__Impl"


    // $ANTLR start "rule__TicketCategory__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1171:1: rule__TicketCategory__Group__0 : rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 ;
    public final void rule__TicketCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1175:1: ( rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1176:2: rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02400);
            rule__TicketCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02403);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1183:1: rule__TicketCategory__Group__0__Impl : ( 'ticketCategory' ) ;
    public final void rule__TicketCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1187:1: ( ( 'ticketCategory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1188:1: ( 'ticketCategory' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1188:1: ( 'ticketCategory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1189:1: 'ticketCategory'
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__TicketCategory__Group__0__Impl2431); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1202:1: rule__TicketCategory__Group__1 : rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 ;
    public final void rule__TicketCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1206:1: ( rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1207:2: rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12462);
            rule__TicketCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12465);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1214:1: rule__TicketCategory__Group__1__Impl : ( ( rule__TicketCategory__NameAssignment_1 ) ) ;
    public final void rule__TicketCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1218:1: ( ( ( rule__TicketCategory__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1219:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1219:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1220:1: ( rule__TicketCategory__NameAssignment_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1221:1: ( rule__TicketCategory__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1221:2: rule__TicketCategory__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2492);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1231:1: rule__TicketCategory__Group__2 : rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 ;
    public final void rule__TicketCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1235:1: ( rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1236:2: rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22522);
            rule__TicketCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22525);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1243:1: rule__TicketCategory__Group__2__Impl : ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) ;
    public final void rule__TicketCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1247:1: ( ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1248:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1248:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1249:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1250:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1250:2: rule__TicketCategory__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2552);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1260:1: rule__TicketCategory__Group__3 : rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 ;
    public final void rule__TicketCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1264:1: ( rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1265:2: rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32582);
            rule__TicketCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32585);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1272:1: rule__TicketCategory__Group__3__Impl : ( '{' ) ;
    public final void rule__TicketCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1276:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1277:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1277:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1278:1: '{'
            {
             before(grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__TicketCategory__Group__3__Impl2613); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1291:1: rule__TicketCategory__Group__4 : rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 ;
    public final void rule__TicketCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1295:1: ( rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1296:2: rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42644);
            rule__TicketCategory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42647);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1303:1: rule__TicketCategory__Group__4__Impl : ( ( rule__TicketCategory__Group_4__0 )? ) ;
    public final void rule__TicketCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1307:1: ( ( ( rule__TicketCategory__Group_4__0 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1308:1: ( ( rule__TicketCategory__Group_4__0 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1308:1: ( ( rule__TicketCategory__Group_4__0 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1309:1: ( rule__TicketCategory__Group_4__0 )?
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1310:1: ( rule__TicketCategory__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1310:2: rule__TicketCategory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2674);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1320:1: rule__TicketCategory__Group__5 : rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 ;
    public final void rule__TicketCategory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1324:1: ( rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1325:2: rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52705);
            rule__TicketCategory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52708);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1332:1: rule__TicketCategory__Group__5__Impl : ( 'fields {' ) ;
    public final void rule__TicketCategory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1336:1: ( ( 'fields {' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1337:1: ( 'fields {' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1337:1: ( 'fields {' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1338:1: 'fields {'
            {
             before(grammarAccess.getTicketCategoryAccess().getFieldsKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__TicketCategory__Group__5__Impl2736); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1351:1: rule__TicketCategory__Group__6 : rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 ;
    public final void rule__TicketCategory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1355:1: ( rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1356:2: rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62767);
            rule__TicketCategory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62770);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1363:1: rule__TicketCategory__Group__6__Impl : ( ( rule__TicketCategory__Group_6__0 )* ) ;
    public final void rule__TicketCategory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1367:1: ( ( ( rule__TicketCategory__Group_6__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1368:1: ( ( rule__TicketCategory__Group_6__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1368:1: ( ( rule__TicketCategory__Group_6__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1369:1: ( rule__TicketCategory__Group_6__0 )*
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_6()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1370:1: ( rule__TicketCategory__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1370:2: rule__TicketCategory__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2797);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1380:1: rule__TicketCategory__Group__7 : rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 ;
    public final void rule__TicketCategory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1384:1: ( rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1385:2: rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72828);
            rule__TicketCategory__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72831);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1392:1: rule__TicketCategory__Group__7__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1396:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1397:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1397:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1398:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__TicketCategory__Group__7__Impl2859); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1411:1: rule__TicketCategory__Group__8 : rule__TicketCategory__Group__8__Impl ;
    public final void rule__TicketCategory__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1415:1: ( rule__TicketCategory__Group__8__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1416:2: rule__TicketCategory__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82890);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1422:1: rule__TicketCategory__Group__8__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1426:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1427:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1427:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1428:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__TicketCategory__Group__8__Impl2918); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1459:1: rule__TicketCategory__Group_4__0 : rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 ;
    public final void rule__TicketCategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1463:1: ( rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1464:2: rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__02967);
            rule__TicketCategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__02970);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1471:1: rule__TicketCategory__Group_4__0__Impl : ( 'flow' ) ;
    public final void rule__TicketCategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1475:1: ( ( 'flow' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1476:1: ( 'flow' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1476:1: ( 'flow' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1477:1: 'flow'
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__TicketCategory__Group_4__0__Impl2998); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1490:1: rule__TicketCategory__Group_4__1 : rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 ;
    public final void rule__TicketCategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1494:1: ( rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1495:2: rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13029);
            rule__TicketCategory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13032);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1502:1: rule__TicketCategory__Group_4__1__Impl : ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) ;
    public final void rule__TicketCategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1506:1: ( ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1507:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1507:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1508:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1509:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1509:2: rule__TicketCategory__FlowAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3059);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1519:1: rule__TicketCategory__Group_4__2 : rule__TicketCategory__Group_4__2__Impl ;
    public final void rule__TicketCategory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1523:1: ( rule__TicketCategory__Group_4__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1524:2: rule__TicketCategory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23089);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1530:1: rule__TicketCategory__Group_4__2__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1534:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1535:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1535:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1536:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_4_2()); 
            match(input,23,FOLLOW_23_in_rule__TicketCategory__Group_4__2__Impl3117); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1555:1: rule__TicketCategory__Group_6__0 : rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 ;
    public final void rule__TicketCategory__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1559:1: ( rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1560:2: rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03154);
            rule__TicketCategory__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03157);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1567:1: rule__TicketCategory__Group_6__0__Impl : ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) ;
    public final void rule__TicketCategory__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1571:1: ( ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1572:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1572:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1573:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1574:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1574:2: rule__TicketCategory__TicketFieldsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3184);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1584:1: rule__TicketCategory__Group_6__1 : rule__TicketCategory__Group_6__1__Impl ;
    public final void rule__TicketCategory__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1588:1: ( rule__TicketCategory__Group_6__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1589:2: rule__TicketCategory__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13214);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1595:1: rule__TicketCategory__Group_6__1__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1599:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1600:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1600:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1601:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1()); 
            match(input,23,FOLLOW_23_in_rule__TicketCategory__Group_6__1__Impl3242); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1618:1: rule__TicketField__Group__0 : rule__TicketField__Group__0__Impl rule__TicketField__Group__1 ;
    public final void rule__TicketField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1622:1: ( rule__TicketField__Group__0__Impl rule__TicketField__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1623:2: rule__TicketField__Group__0__Impl rule__TicketField__Group__1
            {
            pushFollow(FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03277);
            rule__TicketField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03280);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1630:1: rule__TicketField__Group__0__Impl : ( ( rule__TicketField__FieldAssignment_0 ) ) ;
    public final void rule__TicketField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1634:1: ( ( ( rule__TicketField__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1635:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1635:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1636:1: ( rule__TicketField__FieldAssignment_0 )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1637:1: ( rule__TicketField__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1637:2: rule__TicketField__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3307);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1647:1: rule__TicketField__Group__1 : rule__TicketField__Group__1__Impl rule__TicketField__Group__2 ;
    public final void rule__TicketField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1651:1: ( rule__TicketField__Group__1__Impl rule__TicketField__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1652:2: rule__TicketField__Group__1__Impl rule__TicketField__Group__2
            {
            pushFollow(FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13337);
            rule__TicketField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13340);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1659:1: rule__TicketField__Group__1__Impl : ( ( rule__TicketField__MandatoryAssignment_1 )? ) ;
    public final void rule__TicketField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1663:1: ( ( ( rule__TicketField__MandatoryAssignment_1 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1664:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1664:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1665:1: ( rule__TicketField__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1666:1: ( rule__TicketField__MandatoryAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1666:2: rule__TicketField__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3367);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1676:1: rule__TicketField__Group__2 : rule__TicketField__Group__2__Impl ;
    public final void rule__TicketField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1680:1: ( rule__TicketField__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1681:2: rule__TicketField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23398);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1687:1: rule__TicketField__Group__2__Impl : ( ( rule__TicketField__NotOnListAssignment_2 )? ) ;
    public final void rule__TicketField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1691:1: ( ( ( rule__TicketField__NotOnListAssignment_2 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1692:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1692:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1693:1: ( rule__TicketField__NotOnListAssignment_2 )?
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1694:1: ( rule__TicketField__NotOnListAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1694:2: rule__TicketField__NotOnListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3425);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1710:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1714:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1715:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03462);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03465);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1722:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1726:1: ( ( 'role' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1727:1: ( 'role' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1727:1: ( 'role' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1728:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Role__Group__0__Impl3493); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1741:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1745:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1746:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13524);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13527);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1753:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1757:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1758:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1758:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1759:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1760:1: ( rule__Role__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1760:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3554);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1770:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1774:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1775:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23584);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23587);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1782:1: rule__Role__Group__2__Impl : ( ( rule__Role__DescriptionAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1786:1: ( ( ( rule__Role__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1787:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1787:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1788:1: ( rule__Role__DescriptionAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1789:1: ( rule__Role__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1789:2: rule__Role__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3614);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1799:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1803:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1804:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33644);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33647);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1811:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1815:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1816:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1816:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1817:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Role__Group__3__Impl3675); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1830:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1834:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1835:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43706);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43709);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1842:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1846:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1847:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1847:1: ( ( rule__Role__Group_4__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1848:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1849:1: ( rule__Role__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1849:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3736);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1859:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1863:1: ( rule__Role__Group__5__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1864:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53767);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1870:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1874:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1875:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1875:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1876:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Role__Group__5__Impl3795); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1901:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1905:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1906:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03838);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03841);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1913:1: rule__Role__Group_4__0__Impl : ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1917:1: ( ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1918:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1918:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1919:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1920:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1920:2: rule__Role__RolepermissionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3868);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1930:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1934:1: ( rule__Role__Group_4__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1935:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13898);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1941:1: rule__Role__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1945:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1946:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1946:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1947:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_4_1()); 
            match(input,23,FOLLOW_23_in_rule__Role__Group_4__1__Impl3926); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1964:1: rule__RolePermission__Group__0 : rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 ;
    public final void rule__RolePermission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1968:1: ( rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1969:2: rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03961);
            rule__RolePermission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03964);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1976:1: rule__RolePermission__Group__0__Impl : ( ( rule__RolePermission__FieldAssignment_0 ) ) ;
    public final void rule__RolePermission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1980:1: ( ( ( rule__RolePermission__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1981:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1981:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1982:1: ( rule__RolePermission__FieldAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1983:1: ( rule__RolePermission__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1983:2: rule__RolePermission__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3991);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1993:1: rule__RolePermission__Group__1 : rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 ;
    public final void rule__RolePermission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1997:1: ( rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1998:2: rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14021);
            rule__RolePermission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14024);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2005:1: rule__RolePermission__Group__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_1 ) ) ;
    public final void rule__RolePermission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2009:1: ( ( ( rule__RolePermission__PermissionsAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2010:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2010:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2011:1: ( rule__RolePermission__PermissionsAssignment_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2012:1: ( rule__RolePermission__PermissionsAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2012:2: rule__RolePermission__PermissionsAssignment_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4051);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2022:1: rule__RolePermission__Group__2 : rule__RolePermission__Group__2__Impl ;
    public final void rule__RolePermission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2026:1: ( rule__RolePermission__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2027:2: rule__RolePermission__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24081);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2033:1: rule__RolePermission__Group__2__Impl : ( ( rule__RolePermission__Group_2__0 )* ) ;
    public final void rule__RolePermission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2037:1: ( ( ( rule__RolePermission__Group_2__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2038:1: ( ( rule__RolePermission__Group_2__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2038:1: ( ( rule__RolePermission__Group_2__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2039:1: ( rule__RolePermission__Group_2__0 )*
            {
             before(grammarAccess.getRolePermissionAccess().getGroup_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2040:1: ( rule__RolePermission__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2040:2: rule__RolePermission__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4108);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2056:1: rule__RolePermission__Group_2__0 : rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 ;
    public final void rule__RolePermission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2060:1: ( rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2061:2: rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04145);
            rule__RolePermission__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04148);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2068:1: rule__RolePermission__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RolePermission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2072:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2073:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2073:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2074:1: ','
            {
             before(grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__RolePermission__Group_2__0__Impl4176); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2087:1: rule__RolePermission__Group_2__1 : rule__RolePermission__Group_2__1__Impl ;
    public final void rule__RolePermission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2091:1: ( rule__RolePermission__Group_2__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2092:2: rule__RolePermission__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14207);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2098:1: rule__RolePermission__Group_2__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) ;
    public final void rule__RolePermission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2102:1: ( ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2103:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2103:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2104:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2105:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2105:2: rule__RolePermission__PermissionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4234);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2119:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2123:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2124:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04268);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04271);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2131:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2135:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2136:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2136:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2137:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4298); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2148:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2152:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2153:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14327);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2159:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2163:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2164:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2164:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2165:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2166:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2166:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4354);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2180:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2184:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2185:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04389);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04392);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2192:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2196:1: ( ( '.' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2197:1: ( '.' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2197:1: ( '.' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2198:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl4420); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2211:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2215:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2216:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14451);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2222:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2226:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2227:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2227:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2228:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4478); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2244:1: rule__TicketSystem__StatesAssignment_0 : ( ruleStatus ) ;
    public final void rule__TicketSystem__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2248:1: ( ( ruleStatus ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2249:1: ( ruleStatus )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2249:1: ( ruleStatus )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2250:1: ruleStatus
            {
             before(grammarAccess.getTicketSystemAccess().getStatesStatusParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04516);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2259:1: rule__TicketSystem__FlowsAssignment_1 : ( ruleFlow ) ;
    public final void rule__TicketSystem__FlowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2263:1: ( ( ruleFlow ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2264:1: ( ruleFlow )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2264:1: ( ruleFlow )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2265:1: ruleFlow
            {
             before(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14547);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2274:1: rule__TicketSystem__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__TicketSystem__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2278:1: ( ( ruleField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2279:1: ( ruleField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2279:1: ( ruleField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2280:1: ruleField
            {
             before(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24578);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2289:1: rule__TicketSystem__CategoriesAssignment_3 : ( ruleTicketCategory ) ;
    public final void rule__TicketSystem__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2293:1: ( ( ruleTicketCategory ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2294:1: ( ruleTicketCategory )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2294:1: ( ruleTicketCategory )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2295:1: ruleTicketCategory
            {
             before(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34609);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2304:1: rule__TicketSystem__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__TicketSystem__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2308:1: ( ( ruleRole ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2309:1: ( ruleRole )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2309:1: ( ruleRole )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2310:1: ruleRole
            {
             before(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44640);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2319:1: rule__Status__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Status__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2323:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2324:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2324:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2325:1: ruleQualifiedName
            {
             before(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14671);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2334:1: rule__Status__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Status__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2338:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2339:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2339:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2340:1: RULE_STRING
            {
             before(grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24702); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2349:1: rule__Flow__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2353:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2354:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2354:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2355:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14733);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2364:1: rule__Flow__StatesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Flow__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2368:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2369:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2369:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2370:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFlowAccess().getStatesStatusCrossReference_3_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2371:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2372:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getStatesStatusQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04768);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2383:1: rule__Field__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2387:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2388:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2388:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2389:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14803);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2398:1: rule__Field__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2402:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2403:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2403:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2404:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24834); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2413:1: rule__Field__FieldTypeAssignment_3_0 : ( ruleFieldType ) ;
    public final void rule__Field__FieldTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2417:1: ( ( ruleFieldType ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2418:1: ( ruleFieldType )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2418:1: ( ruleFieldType )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2419:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04865);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2428:1: rule__Field__FieldEnumAssignment_3_1 : ( ruleEnum ) ;
    public final void rule__Field__FieldEnumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2432:1: ( ( ruleEnum ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2433:1: ( ruleEnum )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2433:1: ( ruleEnum )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2434:1: ruleEnum
            {
             before(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14896);
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


    // $ANTLR start "rule__Enum__OptionAssignment_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2443:1: rule__Enum__OptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2447:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2448:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2448:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2449:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04927); 
             after(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Enum__OptionAssignment_0"


    // $ANTLR start "rule__Enum__OptionAssignment_1_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2458:1: rule__Enum__OptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2462:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2463:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2463:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2464:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14958); 
             after(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Enum__OptionAssignment_1_1"


    // $ANTLR start "rule__TicketCategory__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2473:1: rule__TicketCategory__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TicketCategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2477:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2478:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2478:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2479:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14989);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2488:1: rule__TicketCategory__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TicketCategory__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2492:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2493:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2493:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2494:1: RULE_STRING
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_25020); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2503:1: rule__TicketCategory__FlowAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketCategory__FlowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2507:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2508:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2508:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2509:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2510:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2511:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15055);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2522:1: rule__TicketCategory__TicketFieldsAssignment_6_0 : ( ruleTicketField ) ;
    public final void rule__TicketCategory__TicketFieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2526:1: ( ( ruleTicketField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2527:1: ( ruleTicketField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2527:1: ( ruleTicketField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2528:1: ruleTicketField
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05090);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2537:1: rule__TicketField__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketField__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2541:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2542:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2542:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2543:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2544:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2545:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05125);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2556:1: rule__TicketField__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__TicketField__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2560:1: ( ( ( 'mandatory' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2561:1: ( ( 'mandatory' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2561:1: ( ( 'mandatory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2562:1: ( 'mandatory' )
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2563:1: ( 'mandatory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2564:1: 'mandatory'
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__TicketField__MandatoryAssignment_15165); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2579:1: rule__TicketField__NotOnListAssignment_2 : ( ( 'notOnList' ) ) ;
    public final void rule__TicketField__NotOnListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2583:1: ( ( ( 'notOnList' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2584:1: ( ( 'notOnList' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2584:1: ( ( 'notOnList' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2585:1: ( 'notOnList' )
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2586:1: ( 'notOnList' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2587:1: 'notOnList'
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__TicketField__NotOnListAssignment_25209); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2602:1: rule__Role__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2606:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2607:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2607:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2608:1: ruleQualifiedName
            {
             before(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15248);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2617:1: rule__Role__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Role__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2621:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2622:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2622:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2623:1: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25279); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2632:1: rule__Role__RolepermissionsAssignment_4_0 : ( ruleRolePermission ) ;
    public final void rule__Role__RolepermissionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2636:1: ( ( ruleRolePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2637:1: ( ruleRolePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2637:1: ( ruleRolePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2638:1: ruleRolePermission
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05310);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2647:1: rule__RolePermission__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RolePermission__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2651:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2652:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2652:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2653:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2654:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2655:1: ruleQualifiedName
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05345);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2666:1: rule__RolePermission__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2670:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2671:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2671:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2672:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15380);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2681:1: rule__RolePermission__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2685:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2686:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2686:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2687:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15411);
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
    public static final BitSet FOLLOW_rule__TicketSystem__Alternatives_in_ruleTicketSystem94 = new BitSet(new long[]{0x00000000A9400002L});
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
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21966 = new BitSet(new long[]{0x00000000003F8020L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32026 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Field__Group__4__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02155 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2242 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Enum__Group_1__0__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TicketCategory__Group__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32582 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TicketCategory__Group__3__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42644 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52705 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TicketCategory__Group__5__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62767 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2797 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72828 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TicketCategory__Group__7__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TicketCategory__Group__8__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__02967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TicketCategory__Group_4__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13029 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TicketCategory__Group_4__2__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03154 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TicketCategory__Group_6__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03277 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13337 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Role__Group__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23584 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33644 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Role__Group__3__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43706 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3736 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Role__Group__5__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03838 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Role__Group_4__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03961 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14021 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4108 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04145 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RolePermission__Group_2__0__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04268 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4354 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_25020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TicketField__MandatoryAssignment_15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TicketField__NotOnListAssignment_25209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15411 = new BitSet(new long[]{0x0000000000000002L});

}
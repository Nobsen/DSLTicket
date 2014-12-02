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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'String'", "'Date'", "'dateTime'", "'int'", "'decimal'", "'status'", "';'", "'flow'", "'{'", "'}'", "'field'", "','", "'ticketCategory'", "'fields {'", "'role'", "'.'", "'mandatory'", "'notOnList'"
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

                if ( (LA1_0==21||LA1_0==23||LA1_0==26||LA1_0==28||LA1_0==30) ) {
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
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 30:
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

            if ( ((LA3_0>=15 && LA3_0<=20)) ) {
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:478:1: rule__FieldType__Alternatives : ( ( ( 'user' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:482:1: ( ( ( 'user' ) ) | ( ( 'String' ) ) | ( ( 'Date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) )
            int alt5=6;
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

            }
        }
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:532:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:536:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:537:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01137);
            rule__Status__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01140);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:544:1: rule__Status__Group__0__Impl : ( 'status' ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:548:1: ( ( 'status' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:549:1: ( 'status' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:549:1: ( 'status' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:550:1: 'status'
            {
             before(grammarAccess.getStatusAccess().getStatusKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Status__Group__0__Impl1168); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:563:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:567:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:568:2: rule__Status__Group__1__Impl rule__Status__Group__2
            {
            pushFollow(FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__11199);
            rule__Status__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11202);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:575:1: rule__Status__Group__1__Impl : ( ( rule__Status__NameAssignment_1 ) ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:579:1: ( ( ( rule__Status__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:580:1: ( ( rule__Status__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:580:1: ( ( rule__Status__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:581:1: ( rule__Status__NameAssignment_1 )
            {
             before(grammarAccess.getStatusAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:582:1: ( rule__Status__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:582:2: rule__Status__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Status__NameAssignment_1_in_rule__Status__Group__1__Impl1229);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:592:1: rule__Status__Group__2 : rule__Status__Group__2__Impl rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:596:1: ( rule__Status__Group__2__Impl rule__Status__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:597:2: rule__Status__Group__2__Impl rule__Status__Group__3
            {
            pushFollow(FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__21259);
            rule__Status__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21262);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:604:1: rule__Status__Group__2__Impl : ( ( rule__Status__DescriptionAssignment_2 ) ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:608:1: ( ( ( rule__Status__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:609:1: ( ( rule__Status__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:609:1: ( ( rule__Status__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:610:1: ( rule__Status__DescriptionAssignment_2 )
            {
             before(grammarAccess.getStatusAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:611:1: ( rule__Status__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:611:2: rule__Status__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Status__DescriptionAssignment_2_in_rule__Status__Group__2__Impl1289);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:621:1: rule__Status__Group__3 : rule__Status__Group__3__Impl ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:625:1: ( rule__Status__Group__3__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:626:2: rule__Status__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__31319);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:632:1: rule__Status__Group__3__Impl : ( ';' ) ;
    public final void rule__Status__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:636:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:637:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:637:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:638:1: ';'
            {
             before(grammarAccess.getStatusAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Status__Group__3__Impl1347); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:659:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:663:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:664:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01386);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01389);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:671:1: rule__Flow__Group__0__Impl : ( 'flow' ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:675:1: ( ( 'flow' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:676:1: ( 'flow' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:676:1: ( 'flow' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:677:1: 'flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Flow__Group__0__Impl1417); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:690:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:694:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:695:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11448);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11451);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:702:1: rule__Flow__Group__1__Impl : ( ( rule__Flow__NameAssignment_1 ) ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:706:1: ( ( ( rule__Flow__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:707:1: ( ( rule__Flow__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:707:1: ( ( rule__Flow__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:708:1: ( rule__Flow__NameAssignment_1 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:709:1: ( rule__Flow__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:709:2: rule__Flow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl1478);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:719:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:723:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:724:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21508);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21511);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:731:1: rule__Flow__Group__2__Impl : ( '{' ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:735:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:736:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:736:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:737:1: '{'
            {
             before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Flow__Group__2__Impl1539); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:750:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:754:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:755:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31570);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31573);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:762:1: rule__Flow__Group__3__Impl : ( ( rule__Flow__Group_3__0 )* ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:766:1: ( ( ( rule__Flow__Group_3__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:767:1: ( ( rule__Flow__Group_3__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:767:1: ( ( rule__Flow__Group_3__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:768:1: ( rule__Flow__Group_3__0 )*
            {
             before(grammarAccess.getFlowAccess().getGroup_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:769:1: ( rule__Flow__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:769:2: rule__Flow__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__Group_3__0_in_rule__Flow__Group__3__Impl1600);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:779:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:783:1: ( rule__Flow__Group__4__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:784:2: rule__Flow__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41631);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:790:1: rule__Flow__Group__4__Impl : ( '}' ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:794:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:795:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:795:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:796:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Flow__Group__4__Impl1659); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:819:1: rule__Flow__Group_3__0 : rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1 ;
    public final void rule__Flow__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:823:1: ( rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:824:2: rule__Flow__Group_3__0__Impl rule__Flow__Group_3__1
            {
            pushFollow(FOLLOW_rule__Flow__Group_3__0__Impl_in_rule__Flow__Group_3__01700);
            rule__Flow__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group_3__1_in_rule__Flow__Group_3__01703);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:831:1: rule__Flow__Group_3__0__Impl : ( ( rule__Flow__StatesAssignment_3_0 ) ) ;
    public final void rule__Flow__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:835:1: ( ( ( rule__Flow__StatesAssignment_3_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:836:1: ( ( rule__Flow__StatesAssignment_3_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:836:1: ( ( rule__Flow__StatesAssignment_3_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:837:1: ( rule__Flow__StatesAssignment_3_0 )
            {
             before(grammarAccess.getFlowAccess().getStatesAssignment_3_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:838:1: ( rule__Flow__StatesAssignment_3_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:838:2: rule__Flow__StatesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Flow__StatesAssignment_3_0_in_rule__Flow__Group_3__0__Impl1730);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:848:1: rule__Flow__Group_3__1 : rule__Flow__Group_3__1__Impl ;
    public final void rule__Flow__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:852:1: ( rule__Flow__Group_3__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:853:2: rule__Flow__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group_3__1__Impl_in_rule__Flow__Group_3__11760);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:859:1: rule__Flow__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Flow__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:863:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:864:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:864:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:865:1: ';'
            {
             before(grammarAccess.getFlowAccess().getSemicolonKeyword_3_1()); 
            match(input,22,FOLLOW_22_in_rule__Flow__Group_3__1__Impl1788); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:882:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:886:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:887:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01823);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01826);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:894:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:898:1: ( ( 'field' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:899:1: ( 'field' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:899:1: ( 'field' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:900:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Field__Group__0__Impl1854); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:913:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:917:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:918:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11885);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11888);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:925:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:929:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:930:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:930:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:931:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:932:1: ( rule__Field__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:932:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl1915);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:942:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:946:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:947:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21945);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21948);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:954:1: rule__Field__Group__2__Impl : ( ( rule__Field__LabelAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:958:1: ( ( ( rule__Field__LabelAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:959:1: ( ( rule__Field__LabelAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:959:1: ( ( rule__Field__LabelAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:960:1: ( rule__Field__LabelAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:961:1: ( rule__Field__LabelAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:961:2: rule__Field__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl1975);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:971:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:975:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:976:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32005);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32008);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:983:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:987:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:988:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:988:1: ( ( rule__Field__Alternatives_3 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:989:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:990:1: ( rule__Field__Alternatives_3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:990:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2035);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1000:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1004:1: ( rule__Field__Group__4__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1005:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42065);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1011:1: rule__Field__Group__4__Impl : ( ';' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1015:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1016:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1016:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1017:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__4__Impl2093); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1040:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1044:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1045:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02134);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02137);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1052:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__OptionAssignment_0 ) ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1056:1: ( ( ( rule__Enum__OptionAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1057:1: ( ( rule__Enum__OptionAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1057:1: ( ( rule__Enum__OptionAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1058:1: ( rule__Enum__OptionAssignment_0 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1059:1: ( rule__Enum__OptionAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1059:2: rule__Enum__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2164);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1069:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1073:1: ( rule__Enum__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1074:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12194);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1080:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__Group_1__0 )* ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1084:1: ( ( ( rule__Enum__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1085:1: ( ( rule__Enum__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1085:1: ( ( rule__Enum__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1086:1: ( rule__Enum__Group_1__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1087:1: ( rule__Enum__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1087:2: rule__Enum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2221);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1101:1: rule__Enum__Group_1__0 : rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 ;
    public final void rule__Enum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1105:1: ( rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1106:2: rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02256);
            rule__Enum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02259);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1113:1: rule__Enum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1117:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1118:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1118:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1119:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Enum__Group_1__0__Impl2287); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1132:1: rule__Enum__Group_1__1 : rule__Enum__Group_1__1__Impl ;
    public final void rule__Enum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1136:1: ( rule__Enum__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1137:2: rule__Enum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12318);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1143:1: rule__Enum__Group_1__1__Impl : ( ( rule__Enum__OptionAssignment_1_1 ) ) ;
    public final void rule__Enum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1147:1: ( ( ( rule__Enum__OptionAssignment_1_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1148:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1148:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1149:1: ( rule__Enum__OptionAssignment_1_1 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_1_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1150:1: ( rule__Enum__OptionAssignment_1_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1150:2: rule__Enum__OptionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2345);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1164:1: rule__TicketCategory__Group__0 : rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 ;
    public final void rule__TicketCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1168:1: ( rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1169:2: rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02379);
            rule__TicketCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02382);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1176:1: rule__TicketCategory__Group__0__Impl : ( 'ticketCategory' ) ;
    public final void rule__TicketCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1180:1: ( ( 'ticketCategory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1181:1: ( 'ticketCategory' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1181:1: ( 'ticketCategory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1182:1: 'ticketCategory'
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TicketCategory__Group__0__Impl2410); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1195:1: rule__TicketCategory__Group__1 : rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 ;
    public final void rule__TicketCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1199:1: ( rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1200:2: rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12441);
            rule__TicketCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12444);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1207:1: rule__TicketCategory__Group__1__Impl : ( ( rule__TicketCategory__NameAssignment_1 ) ) ;
    public final void rule__TicketCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1211:1: ( ( ( rule__TicketCategory__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1212:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1212:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1213:1: ( rule__TicketCategory__NameAssignment_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1214:1: ( rule__TicketCategory__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1214:2: rule__TicketCategory__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2471);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1224:1: rule__TicketCategory__Group__2 : rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 ;
    public final void rule__TicketCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1228:1: ( rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1229:2: rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22501);
            rule__TicketCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22504);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1236:1: rule__TicketCategory__Group__2__Impl : ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) ;
    public final void rule__TicketCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1240:1: ( ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1241:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1241:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1242:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1243:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1243:2: rule__TicketCategory__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2531);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1253:1: rule__TicketCategory__Group__3 : rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 ;
    public final void rule__TicketCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1257:1: ( rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1258:2: rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32561);
            rule__TicketCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32564);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1265:1: rule__TicketCategory__Group__3__Impl : ( '{' ) ;
    public final void rule__TicketCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1269:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1270:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1270:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1271:1: '{'
            {
             before(grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__TicketCategory__Group__3__Impl2592); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1284:1: rule__TicketCategory__Group__4 : rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 ;
    public final void rule__TicketCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1288:1: ( rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1289:2: rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42623);
            rule__TicketCategory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42626);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1296:1: rule__TicketCategory__Group__4__Impl : ( ( rule__TicketCategory__Group_4__0 )? ) ;
    public final void rule__TicketCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1300:1: ( ( ( rule__TicketCategory__Group_4__0 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1301:1: ( ( rule__TicketCategory__Group_4__0 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1301:1: ( ( rule__TicketCategory__Group_4__0 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1302:1: ( rule__TicketCategory__Group_4__0 )?
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1303:1: ( rule__TicketCategory__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1303:2: rule__TicketCategory__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2653);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1313:1: rule__TicketCategory__Group__5 : rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 ;
    public final void rule__TicketCategory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1317:1: ( rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1318:2: rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52684);
            rule__TicketCategory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52687);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1325:1: rule__TicketCategory__Group__5__Impl : ( 'fields {' ) ;
    public final void rule__TicketCategory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1329:1: ( ( 'fields {' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1330:1: ( 'fields {' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1330:1: ( 'fields {' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1331:1: 'fields {'
            {
             before(grammarAccess.getTicketCategoryAccess().getFieldsKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__TicketCategory__Group__5__Impl2715); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1344:1: rule__TicketCategory__Group__6 : rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 ;
    public final void rule__TicketCategory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1348:1: ( rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1349:2: rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62746);
            rule__TicketCategory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62749);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1356:1: rule__TicketCategory__Group__6__Impl : ( ( rule__TicketCategory__Group_6__0 )* ) ;
    public final void rule__TicketCategory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1360:1: ( ( ( rule__TicketCategory__Group_6__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1361:1: ( ( rule__TicketCategory__Group_6__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1361:1: ( ( rule__TicketCategory__Group_6__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1362:1: ( rule__TicketCategory__Group_6__0 )*
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_6()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1363:1: ( rule__TicketCategory__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1363:2: rule__TicketCategory__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2776);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1373:1: rule__TicketCategory__Group__7 : rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 ;
    public final void rule__TicketCategory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1377:1: ( rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1378:2: rule__TicketCategory__Group__7__Impl rule__TicketCategory__Group__8
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72807);
            rule__TicketCategory__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72810);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1385:1: rule__TicketCategory__Group__7__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1389:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1390:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1390:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1391:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__TicketCategory__Group__7__Impl2838); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1404:1: rule__TicketCategory__Group__8 : rule__TicketCategory__Group__8__Impl ;
    public final void rule__TicketCategory__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1408:1: ( rule__TicketCategory__Group__8__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1409:2: rule__TicketCategory__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82869);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1415:1: rule__TicketCategory__Group__8__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1419:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1420:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1420:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1421:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__TicketCategory__Group__8__Impl2897); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1452:1: rule__TicketCategory__Group_4__0 : rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 ;
    public final void rule__TicketCategory__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1456:1: ( rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1457:2: rule__TicketCategory__Group_4__0__Impl rule__TicketCategory__Group_4__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__02946);
            rule__TicketCategory__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__02949);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1464:1: rule__TicketCategory__Group_4__0__Impl : ( 'flow' ) ;
    public final void rule__TicketCategory__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1468:1: ( ( 'flow' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1469:1: ( 'flow' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1469:1: ( 'flow' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1470:1: 'flow'
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__TicketCategory__Group_4__0__Impl2977); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1483:1: rule__TicketCategory__Group_4__1 : rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 ;
    public final void rule__TicketCategory__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1487:1: ( rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1488:2: rule__TicketCategory__Group_4__1__Impl rule__TicketCategory__Group_4__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13008);
            rule__TicketCategory__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13011);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1495:1: rule__TicketCategory__Group_4__1__Impl : ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) ;
    public final void rule__TicketCategory__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1499:1: ( ( ( rule__TicketCategory__FlowAssignment_4_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1500:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1500:1: ( ( rule__TicketCategory__FlowAssignment_4_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1501:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1502:1: ( rule__TicketCategory__FlowAssignment_4_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1502:2: rule__TicketCategory__FlowAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3038);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1512:1: rule__TicketCategory__Group_4__2 : rule__TicketCategory__Group_4__2__Impl ;
    public final void rule__TicketCategory__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1516:1: ( rule__TicketCategory__Group_4__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1517:2: rule__TicketCategory__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23068);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1523:1: rule__TicketCategory__Group_4__2__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1527:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1528:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1528:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1529:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_4_2()); 
            match(input,22,FOLLOW_22_in_rule__TicketCategory__Group_4__2__Impl3096); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1548:1: rule__TicketCategory__Group_6__0 : rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 ;
    public final void rule__TicketCategory__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1552:1: ( rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1553:2: rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03133);
            rule__TicketCategory__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03136);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1560:1: rule__TicketCategory__Group_6__0__Impl : ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) ;
    public final void rule__TicketCategory__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1564:1: ( ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1565:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1565:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1566:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1567:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1567:2: rule__TicketCategory__TicketFieldsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3163);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1577:1: rule__TicketCategory__Group_6__1 : rule__TicketCategory__Group_6__1__Impl ;
    public final void rule__TicketCategory__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1581:1: ( rule__TicketCategory__Group_6__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1582:2: rule__TicketCategory__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13193);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1588:1: rule__TicketCategory__Group_6__1__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1592:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1593:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1593:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1594:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1()); 
            match(input,22,FOLLOW_22_in_rule__TicketCategory__Group_6__1__Impl3221); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1611:1: rule__TicketField__Group__0 : rule__TicketField__Group__0__Impl rule__TicketField__Group__1 ;
    public final void rule__TicketField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1615:1: ( rule__TicketField__Group__0__Impl rule__TicketField__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1616:2: rule__TicketField__Group__0__Impl rule__TicketField__Group__1
            {
            pushFollow(FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03256);
            rule__TicketField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03259);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1623:1: rule__TicketField__Group__0__Impl : ( ( rule__TicketField__FieldAssignment_0 ) ) ;
    public final void rule__TicketField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1627:1: ( ( ( rule__TicketField__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1628:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1628:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1629:1: ( rule__TicketField__FieldAssignment_0 )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1630:1: ( rule__TicketField__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1630:2: rule__TicketField__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3286);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1640:1: rule__TicketField__Group__1 : rule__TicketField__Group__1__Impl rule__TicketField__Group__2 ;
    public final void rule__TicketField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1644:1: ( rule__TicketField__Group__1__Impl rule__TicketField__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1645:2: rule__TicketField__Group__1__Impl rule__TicketField__Group__2
            {
            pushFollow(FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13316);
            rule__TicketField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13319);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1652:1: rule__TicketField__Group__1__Impl : ( ( rule__TicketField__MandatoryAssignment_1 )? ) ;
    public final void rule__TicketField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1656:1: ( ( ( rule__TicketField__MandatoryAssignment_1 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1657:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1657:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1658:1: ( rule__TicketField__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1659:1: ( rule__TicketField__MandatoryAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1659:2: rule__TicketField__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3346);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1669:1: rule__TicketField__Group__2 : rule__TicketField__Group__2__Impl ;
    public final void rule__TicketField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1673:1: ( rule__TicketField__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1674:2: rule__TicketField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23377);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1680:1: rule__TicketField__Group__2__Impl : ( ( rule__TicketField__NotOnListAssignment_2 )? ) ;
    public final void rule__TicketField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1684:1: ( ( ( rule__TicketField__NotOnListAssignment_2 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1685:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1685:1: ( ( rule__TicketField__NotOnListAssignment_2 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1686:1: ( rule__TicketField__NotOnListAssignment_2 )?
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1687:1: ( rule__TicketField__NotOnListAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1687:2: rule__TicketField__NotOnListAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3404);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1703:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1707:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1708:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03441);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03444);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1715:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1719:1: ( ( 'role' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1720:1: ( 'role' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1720:1: ( 'role' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1721:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Role__Group__0__Impl3472); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1734:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1738:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1739:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13503);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13506);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1746:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1750:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1751:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1751:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1752:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1753:1: ( rule__Role__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1753:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3533);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1763:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1767:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1768:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23563);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23566);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1775:1: rule__Role__Group__2__Impl : ( ( rule__Role__DescriptionAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1779:1: ( ( ( rule__Role__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1780:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1780:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1781:1: ( rule__Role__DescriptionAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1782:1: ( rule__Role__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1782:2: rule__Role__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3593);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1792:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1796:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1797:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33623);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33626);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1804:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1808:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1809:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1809:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1810:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Role__Group__3__Impl3654); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1823:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1827:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1828:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43685);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43688);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1835:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1839:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1840:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1840:1: ( ( rule__Role__Group_4__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1841:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1842:1: ( rule__Role__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1842:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3715);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1852:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1856:1: ( rule__Role__Group__5__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1857:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53746);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1863:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1867:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1868:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1868:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1869:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Role__Group__5__Impl3774); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1894:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1898:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1899:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03817);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03820);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1906:1: rule__Role__Group_4__0__Impl : ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1910:1: ( ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1911:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1911:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1912:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1913:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1913:2: rule__Role__RolepermissionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3847);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1923:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1927:1: ( rule__Role__Group_4__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1928:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13877);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1934:1: rule__Role__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1938:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1939:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1939:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1940:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_4_1()); 
            match(input,22,FOLLOW_22_in_rule__Role__Group_4__1__Impl3905); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1957:1: rule__RolePermission__Group__0 : rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 ;
    public final void rule__RolePermission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1961:1: ( rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1962:2: rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03940);
            rule__RolePermission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03943);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1969:1: rule__RolePermission__Group__0__Impl : ( ( rule__RolePermission__FieldAssignment_0 ) ) ;
    public final void rule__RolePermission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1973:1: ( ( ( rule__RolePermission__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1974:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1974:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1975:1: ( rule__RolePermission__FieldAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1976:1: ( rule__RolePermission__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1976:2: rule__RolePermission__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3970);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1986:1: rule__RolePermission__Group__1 : rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 ;
    public final void rule__RolePermission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1990:1: ( rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1991:2: rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14000);
            rule__RolePermission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14003);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1998:1: rule__RolePermission__Group__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_1 ) ) ;
    public final void rule__RolePermission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2002:1: ( ( ( rule__RolePermission__PermissionsAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2003:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2003:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2004:1: ( rule__RolePermission__PermissionsAssignment_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2005:1: ( rule__RolePermission__PermissionsAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2005:2: rule__RolePermission__PermissionsAssignment_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4030);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2015:1: rule__RolePermission__Group__2 : rule__RolePermission__Group__2__Impl ;
    public final void rule__RolePermission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2019:1: ( rule__RolePermission__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2020:2: rule__RolePermission__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24060);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2026:1: rule__RolePermission__Group__2__Impl : ( ( rule__RolePermission__Group_2__0 )* ) ;
    public final void rule__RolePermission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2030:1: ( ( ( rule__RolePermission__Group_2__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2031:1: ( ( rule__RolePermission__Group_2__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2031:1: ( ( rule__RolePermission__Group_2__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2032:1: ( rule__RolePermission__Group_2__0 )*
            {
             before(grammarAccess.getRolePermissionAccess().getGroup_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2033:1: ( rule__RolePermission__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2033:2: rule__RolePermission__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4087);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2049:1: rule__RolePermission__Group_2__0 : rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 ;
    public final void rule__RolePermission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2053:1: ( rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2054:2: rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04124);
            rule__RolePermission__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04127);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2061:1: rule__RolePermission__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RolePermission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2065:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2066:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2066:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2067:1: ','
            {
             before(grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__RolePermission__Group_2__0__Impl4155); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2080:1: rule__RolePermission__Group_2__1 : rule__RolePermission__Group_2__1__Impl ;
    public final void rule__RolePermission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2084:1: ( rule__RolePermission__Group_2__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2085:2: rule__RolePermission__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14186);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2091:1: rule__RolePermission__Group_2__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) ;
    public final void rule__RolePermission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2095:1: ( ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2096:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2096:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2097:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2098:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2098:2: rule__RolePermission__PermissionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4213);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2112:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2116:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2117:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04247);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04250);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2124:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2128:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2129:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2129:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2130:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4277); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2141:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2145:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2146:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14306);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2152:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2156:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2157:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2157:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2158:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2159:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2159:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4333);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2173:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2177:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2178:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04368);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04371);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2185:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2189:1: ( ( '.' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2190:1: ( '.' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2190:1: ( '.' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2191:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl4399); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2204:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2208:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2209:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14430);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2215:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2219:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2220:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2220:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2221:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4457); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2237:1: rule__TicketSystem__StatesAssignment_0 : ( ruleStatus ) ;
    public final void rule__TicketSystem__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2241:1: ( ( ruleStatus ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2242:1: ( ruleStatus )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2242:1: ( ruleStatus )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2243:1: ruleStatus
            {
             before(grammarAccess.getTicketSystemAccess().getStatesStatusParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04495);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2252:1: rule__TicketSystem__FlowsAssignment_1 : ( ruleFlow ) ;
    public final void rule__TicketSystem__FlowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2256:1: ( ( ruleFlow ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2257:1: ( ruleFlow )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2257:1: ( ruleFlow )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2258:1: ruleFlow
            {
             before(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14526);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2267:1: rule__TicketSystem__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__TicketSystem__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2271:1: ( ( ruleField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2272:1: ( ruleField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2272:1: ( ruleField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2273:1: ruleField
            {
             before(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24557);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2282:1: rule__TicketSystem__CategoriesAssignment_3 : ( ruleTicketCategory ) ;
    public final void rule__TicketSystem__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2286:1: ( ( ruleTicketCategory ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2287:1: ( ruleTicketCategory )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2287:1: ( ruleTicketCategory )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2288:1: ruleTicketCategory
            {
             before(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34588);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2297:1: rule__TicketSystem__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__TicketSystem__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2301:1: ( ( ruleRole ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2302:1: ( ruleRole )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2302:1: ( ruleRole )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2303:1: ruleRole
            {
             before(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44619);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2312:1: rule__Status__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Status__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2316:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2317:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2317:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2318:1: ruleQualifiedName
            {
             before(grammarAccess.getStatusAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14650);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2327:1: rule__Status__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Status__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2331:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2332:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2332:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2333:1: RULE_STRING
            {
             before(grammarAccess.getStatusAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24681); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2342:1: rule__Flow__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2346:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2347:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2347:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2348:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14712);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2357:1: rule__Flow__StatesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Flow__StatesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2361:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2362:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2362:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2363:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFlowAccess().getStatesStatusCrossReference_3_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2364:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2365:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getStatesStatusQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04747);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2376:1: rule__Field__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2380:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2381:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2381:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2382:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14782);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2391:1: rule__Field__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2395:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2396:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2396:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2397:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24813); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2406:1: rule__Field__FieldTypeAssignment_3_0 : ( ruleFieldType ) ;
    public final void rule__Field__FieldTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2410:1: ( ( ruleFieldType ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2411:1: ( ruleFieldType )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2411:1: ( ruleFieldType )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2412:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04844);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2421:1: rule__Field__FieldEnumAssignment_3_1 : ( ruleEnum ) ;
    public final void rule__Field__FieldEnumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2425:1: ( ( ruleEnum ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2426:1: ( ruleEnum )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2426:1: ( ruleEnum )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2427:1: ruleEnum
            {
             before(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14875);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2436:1: rule__Enum__OptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2440:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2441:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2441:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2442:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04906); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2451:1: rule__Enum__OptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2455:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2456:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2456:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2457:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14937); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2466:1: rule__TicketCategory__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TicketCategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2470:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2471:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2471:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2472:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14968);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2481:1: rule__TicketCategory__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TicketCategory__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2485:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2486:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2486:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2487:1: RULE_STRING
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_24999); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2496:1: rule__TicketCategory__FlowAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketCategory__FlowAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2500:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2501:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2501:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2502:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2503:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2504:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15034);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2515:1: rule__TicketCategory__TicketFieldsAssignment_6_0 : ( ruleTicketField ) ;
    public final void rule__TicketCategory__TicketFieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2519:1: ( ( ruleTicketField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2520:1: ( ruleTicketField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2520:1: ( ruleTicketField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2521:1: ruleTicketField
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05069);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2530:1: rule__TicketField__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketField__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2534:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2535:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2535:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2536:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2537:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2538:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05104);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2549:1: rule__TicketField__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__TicketField__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2553:1: ( ( ( 'mandatory' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2554:1: ( ( 'mandatory' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2554:1: ( ( 'mandatory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2555:1: ( 'mandatory' )
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2556:1: ( 'mandatory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2557:1: 'mandatory'
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__TicketField__MandatoryAssignment_15144); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2572:1: rule__TicketField__NotOnListAssignment_2 : ( ( 'notOnList' ) ) ;
    public final void rule__TicketField__NotOnListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2576:1: ( ( ( 'notOnList' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2577:1: ( ( 'notOnList' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2577:1: ( ( 'notOnList' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2578:1: ( 'notOnList' )
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2579:1: ( 'notOnList' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2580:1: 'notOnList'
            {
             before(grammarAccess.getTicketFieldAccess().getNotOnListNotOnListKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__TicketField__NotOnListAssignment_25188); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2595:1: rule__Role__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2599:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2600:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2600:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2601:1: ruleQualifiedName
            {
             before(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15227);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2610:1: rule__Role__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Role__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2614:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2615:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2615:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2616:1: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25258); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2625:1: rule__Role__RolepermissionsAssignment_4_0 : ( ruleRolePermission ) ;
    public final void rule__Role__RolepermissionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2629:1: ( ( ruleRolePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2630:1: ( ruleRolePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2630:1: ( ruleRolePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2631:1: ruleRolePermission
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05289);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2640:1: rule__RolePermission__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RolePermission__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2644:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2645:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2645:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2646:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2647:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2648:1: ruleQualifiedName
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05324);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2659:1: rule__RolePermission__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2663:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2664:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2664:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2665:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15359);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2674:1: rule__RolePermission__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2678:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2679:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2679:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2680:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15390);
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
    public static final BitSet FOLLOW_rule__TicketSystem__Alternatives_in_ruleTicketSystem94 = new BitSet(new long[]{0x0000000054A00002L});
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
    public static final BitSet FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Status__Group__0__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__11199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__NameAssignment_1_in_rule__Status__Group__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__21259 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__DescriptionAssignment_2_in_rule__Status__Group__2__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__31319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Status__Group__3__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Flow__Group__0__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21508 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Flow__Group__2__Impl1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31570 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__0_in_rule__Flow__Group__3__Impl1600 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Flow__Group__4__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__0__Impl_in_rule__Flow__Group_3__01700 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__1_in_rule__Flow__Group_3__01703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StatesAssignment_3_0_in_rule__Flow__Group_3__0__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_3__1__Impl_in_rule__Flow__Group_3__11760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Flow__Group_3__1__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Field__Group__0__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21945 = new BitSet(new long[]{0x00000000001F8020L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32005 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__4__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02134 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2221 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Enum__Group_1__0__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TicketCategory__Group__0__Impl2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22501 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32561 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TicketCategory__Group__3__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42623 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0_in_rule__TicketCategory__Group__4__Impl2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52684 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TicketCategory__Group__5__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62746 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2776 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72807 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8_in_rule__TicketCategory__Group__72810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TicketCategory__Group__7__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__8__Impl_in_rule__TicketCategory__Group__82869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TicketCategory__Group__8__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__0__Impl_in_rule__TicketCategory__Group_4__02946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1_in_rule__TicketCategory__Group_4__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TicketCategory__Group_4__0__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__1__Impl_in_rule__TicketCategory__Group_4__13008 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2_in_rule__TicketCategory__Group_4__13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__FlowAssignment_4_1_in_rule__TicketCategory__Group_4__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_4__2__Impl_in_rule__TicketCategory__Group_4__23068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TicketCategory__Group_4__2__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TicketCategory__Group_6__1__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03256 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13316 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2_in_rule__TicketField__Group__13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__2__Impl_in_rule__TicketField__Group__23377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__NotOnListAssignment_2_in_rule__TicketField__Group__2__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Role__Group__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23563 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33623 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Role__Group__3__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43685 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3715 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Role__Group__5__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03817 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Role__Group_4__1__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03940 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__14000 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__14003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__24060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl4087 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__04124 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RolePermission__Group_2__0__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04247 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4333 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__TicketSystem__StatesAssignment_04495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Status__NameAssignment_14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Status__DescriptionAssignment_24681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_3_04747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_24999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_4_15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_05069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_05104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TicketField__MandatoryAssignment_15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TicketField__NotOnListAssignment_25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15390 = new BitSet(new long[]{0x0000000000000002L});

}
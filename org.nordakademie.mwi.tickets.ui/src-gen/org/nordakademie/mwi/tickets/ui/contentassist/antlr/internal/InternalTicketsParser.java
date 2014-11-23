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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'read'", "'modify'", "'delete'", "'user'", "'string'", "'date'", "'dateTime'", "'int'", "'decimal'", "'state'", "';'", "'flow'", "'{'", "'}'", "','", "'field'", "'ticketCategory'", "'role'", "'.'", "'mandatory'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

                if ( (LA1_0==21||LA1_0==23||(LA1_0>=27 && LA1_0<=29)) ) {
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


    // $ANTLR start "entryRuleState"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:89:1: ( ruleState EOF )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState122);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState129); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:97:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:101:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:102:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:102:1: ( ( rule__State__Group__0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:103:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:104:1: ( rule__State__Group__0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:104:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState155);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


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
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 29:
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:478:1: rule__FieldType__Alternatives : ( ( ( 'user' ) ) | ( ( 'string' ) ) | ( ( 'date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:482:1: ( ( ( 'user' ) ) | ( ( 'string' ) ) | ( ( 'date' ) ) | ( ( 'dateTime' ) ) | ( ( 'int' ) ) | ( ( 'decimal' ) ) )
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
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:490:6: ( ( 'string' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:490:6: ( ( 'string' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:491:1: ( 'string' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:492:1: ( 'string' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:492:3: 'string'
                    {
                    match(input,16,FOLLOW_16_in_rule__FieldType__Alternatives1020); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getStringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:497:6: ( ( 'date' ) )
                    {
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:497:6: ( ( 'date' ) )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:498:1: ( 'date' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getDateEnumLiteralDeclaration_2()); 
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:499:1: ( 'date' )
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:499:3: 'date'
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


    // $ANTLR start "rule__State__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:532:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:536:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:537:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01137);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01140);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:544:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:548:1: ( ( 'state' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:549:1: ( 'state' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:549:1: ( 'state' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:550:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__State__Group__0__Impl1168); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:563:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:567:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:568:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11199);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11202);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:575:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:579:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:580:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:580:1: ( ( rule__State__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:581:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:582:1: ( rule__State__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:582:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1229);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:592:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:596:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:597:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21259);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21262);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:604:1: rule__State__Group__2__Impl : ( ( rule__State__DescriptionAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:608:1: ( ( ( rule__State__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:609:1: ( ( rule__State__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:609:1: ( ( rule__State__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:610:1: ( rule__State__DescriptionAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:611:1: ( rule__State__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:611:2: rule__State__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__State__DescriptionAssignment_2_in_rule__State__Group__2__Impl1289);
            rule__State__DescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:621:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:625:1: ( rule__State__Group__3__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:626:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31319);
            rule__State__Group__3__Impl();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:632:1: rule__State__Group__3__Impl : ( ';' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:636:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:637:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:637:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:638:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__State__Group__3__Impl1347); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:762:1: rule__Flow__Group__3__Impl : ( ( rule__Flow__StatesAssignment_3 ) ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:766:1: ( ( ( rule__Flow__StatesAssignment_3 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:767:1: ( ( rule__Flow__StatesAssignment_3 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:767:1: ( ( rule__Flow__StatesAssignment_3 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:768:1: ( rule__Flow__StatesAssignment_3 )
            {
             before(grammarAccess.getFlowAccess().getStatesAssignment_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:769:1: ( rule__Flow__StatesAssignment_3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:769:2: rule__Flow__StatesAssignment_3
            {
            pushFollow(FOLLOW_rule__Flow__StatesAssignment_3_in_rule__Flow__Group__3__Impl1600);
            rule__Flow__StatesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getStatesAssignment_3()); 

            }


            }

        }
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:779:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:783:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:784:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41630);
            rule__Flow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__41633);
            rule__Flow__Group__5();

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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:791:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__Group_4__0 )* ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:795:1: ( ( ( rule__Flow__Group_4__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:796:1: ( ( rule__Flow__Group_4__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:796:1: ( ( rule__Flow__Group_4__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:797:1: ( rule__Flow__Group_4__0 )*
            {
             before(grammarAccess.getFlowAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:798:1: ( rule__Flow__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:798:2: rule__Flow__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__Group_4__0_in_rule__Flow__Group__4__Impl1660);
            	    rule__Flow__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Flow__Group__5"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:808:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl rule__Flow__Group__6 ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:812:1: ( rule__Flow__Group__5__Impl rule__Flow__Group__6 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:813:2: rule__Flow__Group__5__Impl rule__Flow__Group__6
            {
            pushFollow(FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__51691);
            rule__Flow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__6_in_rule__Flow__Group__51694);
            rule__Flow__Group__6();

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
    // $ANTLR end "rule__Flow__Group__5"


    // $ANTLR start "rule__Flow__Group__5__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:820:1: rule__Flow__Group__5__Impl : ( ';' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:824:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:825:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:825:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:826:1: ';'
            {
             before(grammarAccess.getFlowAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Flow__Group__5__Impl1722); 
             after(grammarAccess.getFlowAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__5__Impl"


    // $ANTLR start "rule__Flow__Group__6"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:839:1: rule__Flow__Group__6 : rule__Flow__Group__6__Impl ;
    public final void rule__Flow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:843:1: ( rule__Flow__Group__6__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:844:2: rule__Flow__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__6__Impl_in_rule__Flow__Group__61753);
            rule__Flow__Group__6__Impl();

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
    // $ANTLR end "rule__Flow__Group__6"


    // $ANTLR start "rule__Flow__Group__6__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:850:1: rule__Flow__Group__6__Impl : ( '}' ) ;
    public final void rule__Flow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:854:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:855:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:855:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:856:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Flow__Group__6__Impl1781); 
             after(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group__6__Impl"


    // $ANTLR start "rule__Flow__Group_4__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:883:1: rule__Flow__Group_4__0 : rule__Flow__Group_4__0__Impl rule__Flow__Group_4__1 ;
    public final void rule__Flow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:887:1: ( rule__Flow__Group_4__0__Impl rule__Flow__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:888:2: rule__Flow__Group_4__0__Impl rule__Flow__Group_4__1
            {
            pushFollow(FOLLOW_rule__Flow__Group_4__0__Impl_in_rule__Flow__Group_4__01826);
            rule__Flow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group_4__1_in_rule__Flow__Group_4__01829);
            rule__Flow__Group_4__1();

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
    // $ANTLR end "rule__Flow__Group_4__0"


    // $ANTLR start "rule__Flow__Group_4__0__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:895:1: rule__Flow__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Flow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:899:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:900:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:900:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:901:1: ','
            {
             before(grammarAccess.getFlowAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Flow__Group_4__0__Impl1857); 
             after(grammarAccess.getFlowAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_4__0__Impl"


    // $ANTLR start "rule__Flow__Group_4__1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:914:1: rule__Flow__Group_4__1 : rule__Flow__Group_4__1__Impl ;
    public final void rule__Flow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:918:1: ( rule__Flow__Group_4__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:919:2: rule__Flow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group_4__1__Impl_in_rule__Flow__Group_4__11888);
            rule__Flow__Group_4__1__Impl();

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
    // $ANTLR end "rule__Flow__Group_4__1"


    // $ANTLR start "rule__Flow__Group_4__1__Impl"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:925:1: rule__Flow__Group_4__1__Impl : ( ( rule__Flow__StatesAssignment_4_1 ) ) ;
    public final void rule__Flow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:929:1: ( ( ( rule__Flow__StatesAssignment_4_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:930:1: ( ( rule__Flow__StatesAssignment_4_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:930:1: ( ( rule__Flow__StatesAssignment_4_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:931:1: ( rule__Flow__StatesAssignment_4_1 )
            {
             before(grammarAccess.getFlowAccess().getStatesAssignment_4_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:932:1: ( rule__Flow__StatesAssignment_4_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:932:2: rule__Flow__StatesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Flow__StatesAssignment_4_1_in_rule__Flow__Group_4__1__Impl1915);
            rule__Flow__StatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getStatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:946:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:950:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:951:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01949);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01952);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:958:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:962:1: ( ( 'field' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:963:1: ( 'field' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:963:1: ( 'field' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:964:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Field__Group__0__Impl1980); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:977:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:981:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:982:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12011);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12014);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:989:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:993:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:994:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:994:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:995:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:996:1: ( rule__Field__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:996:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2041);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1006:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1010:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1011:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22071);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22074);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1018:1: rule__Field__Group__2__Impl : ( ( rule__Field__LabelAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1022:1: ( ( ( rule__Field__LabelAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1023:1: ( ( rule__Field__LabelAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1023:1: ( ( rule__Field__LabelAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1024:1: ( rule__Field__LabelAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1025:1: ( rule__Field__LabelAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1025:2: rule__Field__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl2101);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1035:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1039:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1040:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32131);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32134);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1047:1: rule__Field__Group__3__Impl : ( ( rule__Field__Alternatives_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1051:1: ( ( ( rule__Field__Alternatives_3 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1052:1: ( ( rule__Field__Alternatives_3 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1052:1: ( ( rule__Field__Alternatives_3 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1053:1: ( rule__Field__Alternatives_3 )
            {
             before(grammarAccess.getFieldAccess().getAlternatives_3()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1054:1: ( rule__Field__Alternatives_3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1054:2: rule__Field__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2161);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1064:1: rule__Field__Group__4 : rule__Field__Group__4__Impl ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1068:1: ( rule__Field__Group__4__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1069:2: rule__Field__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42191);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1075:1: rule__Field__Group__4__Impl : ( ';' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1079:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1080:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1080:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1081:1: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Field__Group__4__Impl2219); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1104:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1108:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1109:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02260);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02263);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1116:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__OptionAssignment_0 ) ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1120:1: ( ( ( rule__Enum__OptionAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1121:1: ( ( rule__Enum__OptionAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1121:1: ( ( rule__Enum__OptionAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1122:1: ( rule__Enum__OptionAssignment_0 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1123:1: ( rule__Enum__OptionAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1123:2: rule__Enum__OptionAssignment_0
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2290);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1133:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1137:1: ( rule__Enum__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1138:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12320);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1144:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__Group_1__0 )* ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1148:1: ( ( ( rule__Enum__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1149:1: ( ( rule__Enum__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1149:1: ( ( rule__Enum__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1150:1: ( rule__Enum__Group_1__0 )*
            {
             before(grammarAccess.getEnumAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1151:1: ( rule__Enum__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1151:2: rule__Enum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2347);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1165:1: rule__Enum__Group_1__0 : rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 ;
    public final void rule__Enum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1169:1: ( rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1170:2: rule__Enum__Group_1__0__Impl rule__Enum__Group_1__1
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02382);
            rule__Enum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02385);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1177:1: rule__Enum__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1181:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1182:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1182:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1183:1: ','
            {
             before(grammarAccess.getEnumAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Enum__Group_1__0__Impl2413); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1196:1: rule__Enum__Group_1__1 : rule__Enum__Group_1__1__Impl ;
    public final void rule__Enum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1200:1: ( rule__Enum__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1201:2: rule__Enum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12444);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1207:1: rule__Enum__Group_1__1__Impl : ( ( rule__Enum__OptionAssignment_1_1 ) ) ;
    public final void rule__Enum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1211:1: ( ( ( rule__Enum__OptionAssignment_1_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1212:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1212:1: ( ( rule__Enum__OptionAssignment_1_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1213:1: ( rule__Enum__OptionAssignment_1_1 )
            {
             before(grammarAccess.getEnumAccess().getOptionAssignment_1_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1214:1: ( rule__Enum__OptionAssignment_1_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1214:2: rule__Enum__OptionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2471);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1228:1: rule__TicketCategory__Group__0 : rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 ;
    public final void rule__TicketCategory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1232:1: ( rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1233:2: rule__TicketCategory__Group__0__Impl rule__TicketCategory__Group__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02505);
            rule__TicketCategory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02508);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1240:1: rule__TicketCategory__Group__0__Impl : ( 'ticketCategory' ) ;
    public final void rule__TicketCategory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1244:1: ( ( 'ticketCategory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1245:1: ( 'ticketCategory' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1245:1: ( 'ticketCategory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1246:1: 'ticketCategory'
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketCategoryKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TicketCategory__Group__0__Impl2536); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1259:1: rule__TicketCategory__Group__1 : rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 ;
    public final void rule__TicketCategory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1263:1: ( rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1264:2: rule__TicketCategory__Group__1__Impl rule__TicketCategory__Group__2
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12567);
            rule__TicketCategory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12570);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1271:1: rule__TicketCategory__Group__1__Impl : ( ( rule__TicketCategory__NameAssignment_1 ) ) ;
    public final void rule__TicketCategory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1275:1: ( ( ( rule__TicketCategory__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1276:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1276:1: ( ( rule__TicketCategory__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1277:1: ( rule__TicketCategory__NameAssignment_1 )
            {
             before(grammarAccess.getTicketCategoryAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1278:1: ( rule__TicketCategory__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1278:2: rule__TicketCategory__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2597);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1288:1: rule__TicketCategory__Group__2 : rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 ;
    public final void rule__TicketCategory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1292:1: ( rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1293:2: rule__TicketCategory__Group__2__Impl rule__TicketCategory__Group__3
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22627);
            rule__TicketCategory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22630);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1300:1: rule__TicketCategory__Group__2__Impl : ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) ;
    public final void rule__TicketCategory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1304:1: ( ( ( rule__TicketCategory__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1305:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1305:1: ( ( rule__TicketCategory__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1306:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1307:1: ( rule__TicketCategory__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1307:2: rule__TicketCategory__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2657);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1317:1: rule__TicketCategory__Group__3 : rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 ;
    public final void rule__TicketCategory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1321:1: ( rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1322:2: rule__TicketCategory__Group__3__Impl rule__TicketCategory__Group__4
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32687);
            rule__TicketCategory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32690);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1329:1: rule__TicketCategory__Group__3__Impl : ( '{' ) ;
    public final void rule__TicketCategory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1333:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1334:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1334:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1335:1: '{'
            {
             before(grammarAccess.getTicketCategoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__TicketCategory__Group__3__Impl2718); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1348:1: rule__TicketCategory__Group__4 : rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 ;
    public final void rule__TicketCategory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1352:1: ( rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1353:2: rule__TicketCategory__Group__4__Impl rule__TicketCategory__Group__5
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42749);
            rule__TicketCategory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42752);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1360:1: rule__TicketCategory__Group__4__Impl : ( ( rule__TicketCategory__FlowAssignment_4 ) ) ;
    public final void rule__TicketCategory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1364:1: ( ( ( rule__TicketCategory__FlowAssignment_4 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1365:1: ( ( rule__TicketCategory__FlowAssignment_4 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1365:1: ( ( rule__TicketCategory__FlowAssignment_4 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1366:1: ( rule__TicketCategory__FlowAssignment_4 )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1367:1: ( rule__TicketCategory__FlowAssignment_4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1367:2: rule__TicketCategory__FlowAssignment_4
            {
            pushFollow(FOLLOW_rule__TicketCategory__FlowAssignment_4_in_rule__TicketCategory__Group__4__Impl2779);
            rule__TicketCategory__FlowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTicketCategoryAccess().getFlowAssignment_4()); 

            }


            }

        }
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1377:1: rule__TicketCategory__Group__5 : rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 ;
    public final void rule__TicketCategory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1381:1: ( rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1382:2: rule__TicketCategory__Group__5__Impl rule__TicketCategory__Group__6
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52809);
            rule__TicketCategory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52812);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1389:1: rule__TicketCategory__Group__5__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1393:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1394:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1394:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1395:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__TicketCategory__Group__5__Impl2840); 
             after(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1408:1: rule__TicketCategory__Group__6 : rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 ;
    public final void rule__TicketCategory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1412:1: ( rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1413:2: rule__TicketCategory__Group__6__Impl rule__TicketCategory__Group__7
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62871);
            rule__TicketCategory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62874);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1420:1: rule__TicketCategory__Group__6__Impl : ( ( rule__TicketCategory__Group_6__0 )* ) ;
    public final void rule__TicketCategory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1424:1: ( ( ( rule__TicketCategory__Group_6__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1425:1: ( ( rule__TicketCategory__Group_6__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1425:1: ( ( rule__TicketCategory__Group_6__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1426:1: ( rule__TicketCategory__Group_6__0 )*
            {
             before(grammarAccess.getTicketCategoryAccess().getGroup_6()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1427:1: ( rule__TicketCategory__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1427:2: rule__TicketCategory__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2901);
            	    rule__TicketCategory__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1437:1: rule__TicketCategory__Group__7 : rule__TicketCategory__Group__7__Impl ;
    public final void rule__TicketCategory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1441:1: ( rule__TicketCategory__Group__7__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1442:2: rule__TicketCategory__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72932);
            rule__TicketCategory__Group__7__Impl();

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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1448:1: rule__TicketCategory__Group__7__Impl : ( '}' ) ;
    public final void rule__TicketCategory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1452:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1453:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1453:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1454:1: '}'
            {
             before(grammarAccess.getTicketCategoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__TicketCategory__Group__7__Impl2960); 
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


    // $ANTLR start "rule__TicketCategory__Group_6__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1483:1: rule__TicketCategory__Group_6__0 : rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 ;
    public final void rule__TicketCategory__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1487:1: ( rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1488:2: rule__TicketCategory__Group_6__0__Impl rule__TicketCategory__Group_6__1
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03007);
            rule__TicketCategory__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03010);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1495:1: rule__TicketCategory__Group_6__0__Impl : ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) ;
    public final void rule__TicketCategory__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1499:1: ( ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1500:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1500:1: ( ( rule__TicketCategory__TicketFieldsAssignment_6_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1501:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsAssignment_6_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1502:1: ( rule__TicketCategory__TicketFieldsAssignment_6_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1502:2: rule__TicketCategory__TicketFieldsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3037);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1512:1: rule__TicketCategory__Group_6__1 : rule__TicketCategory__Group_6__1__Impl ;
    public final void rule__TicketCategory__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1516:1: ( rule__TicketCategory__Group_6__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1517:2: rule__TicketCategory__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13067);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1523:1: rule__TicketCategory__Group_6__1__Impl : ( ';' ) ;
    public final void rule__TicketCategory__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1527:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1528:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1528:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1529:1: ';'
            {
             before(grammarAccess.getTicketCategoryAccess().getSemicolonKeyword_6_1()); 
            match(input,22,FOLLOW_22_in_rule__TicketCategory__Group_6__1__Impl3095); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1546:1: rule__TicketField__Group__0 : rule__TicketField__Group__0__Impl rule__TicketField__Group__1 ;
    public final void rule__TicketField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1550:1: ( rule__TicketField__Group__0__Impl rule__TicketField__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1551:2: rule__TicketField__Group__0__Impl rule__TicketField__Group__1
            {
            pushFollow(FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03130);
            rule__TicketField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03133);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1558:1: rule__TicketField__Group__0__Impl : ( ( rule__TicketField__FieldAssignment_0 ) ) ;
    public final void rule__TicketField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1562:1: ( ( ( rule__TicketField__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1563:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1563:1: ( ( rule__TicketField__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1564:1: ( rule__TicketField__FieldAssignment_0 )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1565:1: ( rule__TicketField__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1565:2: rule__TicketField__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3160);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1575:1: rule__TicketField__Group__1 : rule__TicketField__Group__1__Impl ;
    public final void rule__TicketField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1579:1: ( rule__TicketField__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1580:2: rule__TicketField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13190);
            rule__TicketField__Group__1__Impl();

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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1586:1: rule__TicketField__Group__1__Impl : ( ( rule__TicketField__MandatoryAssignment_1 )? ) ;
    public final void rule__TicketField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1590:1: ( ( ( rule__TicketField__MandatoryAssignment_1 )? ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1591:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1591:1: ( ( rule__TicketField__MandatoryAssignment_1 )? )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1592:1: ( rule__TicketField__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1593:1: ( rule__TicketField__MandatoryAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1593:2: rule__TicketField__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3217);
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


    // $ANTLR start "rule__Role__Group__0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1607:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1611:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1612:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03252);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03255);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1619:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1623:1: ( ( 'role' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1624:1: ( 'role' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1624:1: ( 'role' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1625:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Role__Group__0__Impl3283); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1638:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1642:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1643:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13314);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13317);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1650:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1654:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1655:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1655:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1656:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1657:1: ( rule__Role__NameAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1657:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3344);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1667:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1671:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1672:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23374);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23377);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1679:1: rule__Role__Group__2__Impl : ( ( rule__Role__DescriptionAssignment_2 ) ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1683:1: ( ( ( rule__Role__DescriptionAssignment_2 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1684:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1684:1: ( ( rule__Role__DescriptionAssignment_2 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1685:1: ( rule__Role__DescriptionAssignment_2 )
            {
             before(grammarAccess.getRoleAccess().getDescriptionAssignment_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1686:1: ( rule__Role__DescriptionAssignment_2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1686:2: rule__Role__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3404);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1696:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1700:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1701:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33434);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33437);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1708:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1712:1: ( ( '{' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1713:1: ( '{' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1713:1: ( '{' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1714:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Role__Group__3__Impl3465); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1727:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1731:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1732:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43496);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43499);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1739:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1743:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1744:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1744:1: ( ( rule__Role__Group_4__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1745:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1746:1: ( rule__Role__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1746:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3526);
            	    rule__Role__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1756:1: rule__Role__Group__5 : rule__Role__Group__5__Impl ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1760:1: ( rule__Role__Group__5__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1761:2: rule__Role__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53557);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1767:1: rule__Role__Group__5__Impl : ( '}' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1771:1: ( ( '}' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1772:1: ( '}' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1772:1: ( '}' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1773:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Role__Group__5__Impl3585); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1798:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1802:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1803:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03628);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03631);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1810:1: rule__Role__Group_4__0__Impl : ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1814:1: ( ( ( rule__Role__RolepermissionsAssignment_4_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1815:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1815:1: ( ( rule__Role__RolepermissionsAssignment_4_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1816:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsAssignment_4_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1817:1: ( rule__Role__RolepermissionsAssignment_4_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1817:2: rule__Role__RolepermissionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3658);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1827:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1831:1: ( rule__Role__Group_4__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1832:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13688);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1838:1: rule__Role__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1842:1: ( ( ';' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1843:1: ( ';' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1843:1: ( ';' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1844:1: ';'
            {
             before(grammarAccess.getRoleAccess().getSemicolonKeyword_4_1()); 
            match(input,22,FOLLOW_22_in_rule__Role__Group_4__1__Impl3716); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1861:1: rule__RolePermission__Group__0 : rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 ;
    public final void rule__RolePermission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1865:1: ( rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1866:2: rule__RolePermission__Group__0__Impl rule__RolePermission__Group__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03751);
            rule__RolePermission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03754);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1873:1: rule__RolePermission__Group__0__Impl : ( ( rule__RolePermission__FieldAssignment_0 ) ) ;
    public final void rule__RolePermission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1877:1: ( ( ( rule__RolePermission__FieldAssignment_0 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1878:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1878:1: ( ( rule__RolePermission__FieldAssignment_0 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1879:1: ( rule__RolePermission__FieldAssignment_0 )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldAssignment_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1880:1: ( rule__RolePermission__FieldAssignment_0 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1880:2: rule__RolePermission__FieldAssignment_0
            {
            pushFollow(FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3781);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1890:1: rule__RolePermission__Group__1 : rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 ;
    public final void rule__RolePermission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1894:1: ( rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1895:2: rule__RolePermission__Group__1__Impl rule__RolePermission__Group__2
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__13811);
            rule__RolePermission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__13814);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1902:1: rule__RolePermission__Group__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_1 ) ) ;
    public final void rule__RolePermission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1906:1: ( ( ( rule__RolePermission__PermissionsAssignment_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1907:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1907:1: ( ( rule__RolePermission__PermissionsAssignment_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1908:1: ( rule__RolePermission__PermissionsAssignment_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1909:1: ( rule__RolePermission__PermissionsAssignment_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1909:2: rule__RolePermission__PermissionsAssignment_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl3841);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1919:1: rule__RolePermission__Group__2 : rule__RolePermission__Group__2__Impl ;
    public final void rule__RolePermission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1923:1: ( rule__RolePermission__Group__2__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1924:2: rule__RolePermission__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__23871);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1930:1: rule__RolePermission__Group__2__Impl : ( ( rule__RolePermission__Group_2__0 )* ) ;
    public final void rule__RolePermission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1934:1: ( ( ( rule__RolePermission__Group_2__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1935:1: ( ( rule__RolePermission__Group_2__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1935:1: ( ( rule__RolePermission__Group_2__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1936:1: ( rule__RolePermission__Group_2__0 )*
            {
             before(grammarAccess.getRolePermissionAccess().getGroup_2()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1937:1: ( rule__RolePermission__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1937:2: rule__RolePermission__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl3898);
            	    rule__RolePermission__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1953:1: rule__RolePermission__Group_2__0 : rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 ;
    public final void rule__RolePermission__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1957:1: ( rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1958:2: rule__RolePermission__Group_2__0__Impl rule__RolePermission__Group_2__1
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__03935);
            rule__RolePermission__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__03938);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1965:1: rule__RolePermission__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RolePermission__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1969:1: ( ( ',' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1970:1: ( ',' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1970:1: ( ',' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1971:1: ','
            {
             before(grammarAccess.getRolePermissionAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__RolePermission__Group_2__0__Impl3966); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1984:1: rule__RolePermission__Group_2__1 : rule__RolePermission__Group_2__1__Impl ;
    public final void rule__RolePermission__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1988:1: ( rule__RolePermission__Group_2__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1989:2: rule__RolePermission__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__13997);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1995:1: rule__RolePermission__Group_2__1__Impl : ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) ;
    public final void rule__RolePermission__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:1999:1: ( ( ( rule__RolePermission__PermissionsAssignment_2_1 ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2000:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2000:1: ( ( rule__RolePermission__PermissionsAssignment_2_1 ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2001:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsAssignment_2_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2002:1: ( rule__RolePermission__PermissionsAssignment_2_1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2002:2: rule__RolePermission__PermissionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4024);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2016:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2020:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2021:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04058);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04061);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2028:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2032:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2033:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2033:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2034:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4088); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2045:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2049:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2050:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14117);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2056:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2060:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2061:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2061:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2062:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2063:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2063:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4144);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2077:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2081:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2082:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04179);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04182);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2089:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2093:1: ( ( '.' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2094:1: ( '.' )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2094:1: ( '.' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2095:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl4210); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2108:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2112:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2113:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14241);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2119:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2123:1: ( ( RULE_ID ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2124:1: ( RULE_ID )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2124:1: ( RULE_ID )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2125:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4268); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2141:1: rule__TicketSystem__StatesAssignment_0 : ( ruleState ) ;
    public final void rule__TicketSystem__StatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2145:1: ( ( ruleState ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2146:1: ( ruleState )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2146:1: ( ruleState )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2147:1: ruleState
            {
             before(grammarAccess.getTicketSystemAccess().getStatesStateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__TicketSystem__StatesAssignment_04306);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTicketSystemAccess().getStatesStateParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2156:1: rule__TicketSystem__FlowsAssignment_1 : ( ruleFlow ) ;
    public final void rule__TicketSystem__FlowsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2160:1: ( ( ruleFlow ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2161:1: ( ruleFlow )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2161:1: ( ruleFlow )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2162:1: ruleFlow
            {
             before(grammarAccess.getTicketSystemAccess().getFlowsFlowParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14337);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2171:1: rule__TicketSystem__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__TicketSystem__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2175:1: ( ( ruleField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2176:1: ( ruleField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2176:1: ( ruleField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2177:1: ruleField
            {
             before(grammarAccess.getTicketSystemAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24368);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2186:1: rule__TicketSystem__CategoriesAssignment_3 : ( ruleTicketCategory ) ;
    public final void rule__TicketSystem__CategoriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2190:1: ( ( ruleTicketCategory ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2191:1: ( ruleTicketCategory )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2191:1: ( ruleTicketCategory )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2192:1: ruleTicketCategory
            {
             before(grammarAccess.getTicketSystemAccess().getCategoriesTicketCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34399);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2201:1: rule__TicketSystem__RolesAssignment_4 : ( ruleRole ) ;
    public final void rule__TicketSystem__RolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2205:1: ( ( ruleRole ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2206:1: ( ruleRole )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2206:1: ( ruleRole )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2207:1: ruleRole
            {
             before(grammarAccess.getTicketSystemAccess().getRolesRoleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44430);
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


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2216:1: rule__State__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2220:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2221:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2221:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2222:1: ruleQualifiedName
            {
             before(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__State__NameAssignment_14461);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__DescriptionAssignment_2"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2231:1: rule__State__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2235:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2236:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2236:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2237:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_24492); 
             after(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__DescriptionAssignment_2"


    // $ANTLR start "rule__Flow__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2246:1: rule__Flow__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Flow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2250:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2251:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2251:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2252:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14523);
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


    // $ANTLR start "rule__Flow__StatesAssignment_3"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2261:1: rule__Flow__StatesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Flow__StatesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2265:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2266:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2266:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2267:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFlowAccess().getStatesStateCrossReference_3_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2268:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2269:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getStatesStateQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_34558);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStatesStateQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFlowAccess().getStatesStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StatesAssignment_3"


    // $ANTLR start "rule__Flow__StatesAssignment_4_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2280:1: rule__Flow__StatesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Flow__StatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2284:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2285:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2285:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2286:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFlowAccess().getStatesStateCrossReference_4_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2287:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2288:1: ruleQualifiedName
            {
             before(grammarAccess.getFlowAccess().getStatesStateQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_4_14597);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getStatesStateQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFlowAccess().getStatesStateCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Flow__StatesAssignment_4_1"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2299:1: rule__Field__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2303:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2304:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2304:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2305:1: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14632);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2314:1: rule__Field__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Field__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2318:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2319:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2319:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2320:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24663); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2329:1: rule__Field__FieldTypeAssignment_3_0 : ( ruleFieldType ) ;
    public final void rule__Field__FieldTypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2333:1: ( ( ruleFieldType ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2334:1: ( ruleFieldType )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2334:1: ( ruleFieldType )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2335:1: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getFieldTypeFieldTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04694);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2344:1: rule__Field__FieldEnumAssignment_3_1 : ( ruleEnum ) ;
    public final void rule__Field__FieldEnumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2348:1: ( ( ruleEnum ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2349:1: ( ruleEnum )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2349:1: ( ruleEnum )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2350:1: ruleEnum
            {
             before(grammarAccess.getFieldAccess().getFieldEnumEnumParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14725);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2359:1: rule__Enum__OptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2363:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2364:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2364:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2365:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04756); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2374:1: rule__Enum__OptionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Enum__OptionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2378:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2379:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2379:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2380:1: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getOptionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14787); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2389:1: rule__TicketCategory__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TicketCategory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2393:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2394:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2394:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2395:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14818);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2404:1: rule__TicketCategory__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TicketCategory__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2408:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2409:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2409:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2410:1: RULE_STRING
            {
             before(grammarAccess.getTicketCategoryAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_24849); 
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


    // $ANTLR start "rule__TicketCategory__FlowAssignment_4"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2419:1: rule__TicketCategory__FlowAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketCategory__FlowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2423:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2424:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2424:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2425:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2426:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2427:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_44884);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTicketCategoryAccess().getFlowFlowQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTicketCategoryAccess().getFlowFlowCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TicketCategory__FlowAssignment_4"


    // $ANTLR start "rule__TicketCategory__TicketFieldsAssignment_6_0"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2438:1: rule__TicketCategory__TicketFieldsAssignment_6_0 : ( ruleTicketField ) ;
    public final void rule__TicketCategory__TicketFieldsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2442:1: ( ( ruleTicketField ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2443:1: ( ruleTicketField )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2443:1: ( ruleTicketField )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2444:1: ruleTicketField
            {
             before(grammarAccess.getTicketCategoryAccess().getTicketFieldsTicketFieldParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_04919);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2453:1: rule__TicketField__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TicketField__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2457:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2458:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2458:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2459:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2460:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2461:1: ruleQualifiedName
            {
             before(grammarAccess.getTicketFieldAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_04954);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2472:1: rule__TicketField__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__TicketField__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2476:1: ( ( ( 'mandatory' ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2477:1: ( ( 'mandatory' ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2477:1: ( ( 'mandatory' ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2478:1: ( 'mandatory' )
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2479:1: ( 'mandatory' )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2480:1: 'mandatory'
            {
             before(grammarAccess.getTicketFieldAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__TicketField__MandatoryAssignment_14994); 
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


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2495:1: rule__Role__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2499:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2500:1: ( ruleQualifiedName )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2500:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2501:1: ruleQualifiedName
            {
             before(grammarAccess.getRoleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15033);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2510:1: rule__Role__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Role__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2514:1: ( ( RULE_STRING ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2515:1: ( RULE_STRING )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2515:1: ( RULE_STRING )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2516:1: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25064); 
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2525:1: rule__Role__RolepermissionsAssignment_4_0 : ( ruleRolePermission ) ;
    public final void rule__Role__RolepermissionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2529:1: ( ( ruleRolePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2530:1: ( ruleRolePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2530:1: ( ruleRolePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2531:1: ruleRolePermission
            {
             before(grammarAccess.getRoleAccess().getRolepermissionsRolePermissionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05095);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2540:1: rule__RolePermission__FieldAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RolePermission__FieldAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2544:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2545:1: ( ( ruleQualifiedName ) )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2545:1: ( ( ruleQualifiedName ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2546:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldCrossReference_0_0()); 
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2547:1: ( ruleQualifiedName )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2548:1: ruleQualifiedName
            {
             before(grammarAccess.getRolePermissionAccess().getFieldFieldQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05130);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2559:1: rule__RolePermission__PermissionsAssignment_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2563:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2564:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2564:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2565:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15165);
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
    // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2574:1: rule__RolePermission__PermissionsAssignment_2_1 : ( rulePermission ) ;
    public final void rule__RolePermission__PermissionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2578:1: ( ( rulePermission ) )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2579:1: ( rulePermission )
            {
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2579:1: ( rulePermission )
            // ../org.nordakademie.mwi.tickets.ui/src-gen/org/nordakademie/mwi/tickets/ui/contentassist/antlr/internal/InternalTickets.g:2580:1: rulePermission
            {
             before(grammarAccess.getRolePermissionAccess().getPermissionsPermissionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15196);
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
    public static final BitSet FOLLOW_rule__TicketSystem__Alternatives_in_ruleTicketSystem94 = new BitSet(new long[]{0x0000000038A00002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState155 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group__0__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21259 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__DescriptionAssignment_2_in_rule__State__Group__2__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__Group__3__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__01386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__01389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Flow__Group__0__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__11448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_1_in_rule__Flow__Group__1__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__21508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__21511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Flow__Group__2__Impl1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__31570 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__31573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StatesAssignment_3_in_rule__Flow__Group__3__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__41630 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__41633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_4__0_in_rule__Flow__Group__4__Impl1660 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__51691 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Flow__Group__6_in_rule__Flow__Group__51694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Flow__Group__5__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__6__Impl_in_rule__Flow__Group__61753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Flow__Group__6__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_4__0__Impl_in_rule__Flow__Group_4__01826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group_4__1_in_rule__Flow__Group_4__01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Flow__Group_4__0__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group_4__1__Impl_in_rule__Flow__Group_4__11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__StatesAssignment_4_1_in_rule__Flow__Group_4__1__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Field__Group__0__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22071 = new BitSet(new long[]{0x00000000001F8020L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_2_in_rule__Field__Group__2__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32131 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_3_in_rule__Field__Group__3__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Field__Group__4__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__02260 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_0_in_rule__Enum__Group__0__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0_in_rule__Enum__Group__1__Impl2347 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__0__Impl_in_rule__Enum__Group_1__02382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1_in_rule__Enum__Group_1__02385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Enum__Group_1__0__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group_1__1__Impl_in_rule__Enum__Group_1__12444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__OptionAssignment_1_1_in_rule__Enum__Group_1__1__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__0__Impl_in_rule__TicketCategory__Group__02505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1_in_rule__TicketCategory__Group__02508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TicketCategory__Group__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__1__Impl_in_rule__TicketCategory__Group__12567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2_in_rule__TicketCategory__Group__12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__NameAssignment_1_in_rule__TicketCategory__Group__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__2__Impl_in_rule__TicketCategory__Group__22627 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3_in_rule__TicketCategory__Group__22630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__DescriptionAssignment_2_in_rule__TicketCategory__Group__2__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__3__Impl_in_rule__TicketCategory__Group__32687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4_in_rule__TicketCategory__Group__32690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TicketCategory__Group__3__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__4__Impl_in_rule__TicketCategory__Group__42749 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5_in_rule__TicketCategory__Group__42752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__FlowAssignment_4_in_rule__TicketCategory__Group__4__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__5__Impl_in_rule__TicketCategory__Group__52809 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6_in_rule__TicketCategory__Group__52812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TicketCategory__Group__5__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__6__Impl_in_rule__TicketCategory__Group__62871 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7_in_rule__TicketCategory__Group__62874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0_in_rule__TicketCategory__Group__6__Impl2901 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group__7__Impl_in_rule__TicketCategory__Group__72932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TicketCategory__Group__7__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__0__Impl_in_rule__TicketCategory__Group_6__03007 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1_in_rule__TicketCategory__Group_6__03010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__TicketFieldsAssignment_6_0_in_rule__TicketCategory__Group_6__0__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketCategory__Group_6__1__Impl_in_rule__TicketCategory__Group_6__13067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TicketCategory__Group_6__1__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__0__Impl_in_rule__TicketField__Group__03130 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1_in_rule__TicketField__Group__03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__FieldAssignment_0_in_rule__TicketField__Group__0__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__Group__1__Impl_in_rule__TicketField__Group__13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TicketField__MandatoryAssignment_1_in_rule__TicketField__Group__1__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__03252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Role__Group__0__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__13314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__13317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__23374 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__23377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DescriptionAssignment_2_in_rule__Role__Group__2__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__33434 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__33437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Role__Group__3__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__43496 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__43499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl3526 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__53557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Role__Group__5__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__03628 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__03631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__RolepermissionsAssignment_4_0_in_rule__Role__Group_4__0__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Role__Group_4__1__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__0__Impl_in_rule__RolePermission__Group__03751 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1_in_rule__RolePermission__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__FieldAssignment_0_in_rule__RolePermission__Group__0__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__1__Impl_in_rule__RolePermission__Group__13811 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2_in_rule__RolePermission__Group__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_1_in_rule__RolePermission__Group__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group__2__Impl_in_rule__RolePermission__Group__23871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0_in_rule__RolePermission__Group__2__Impl3898 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__0__Impl_in_rule__RolePermission__Group_2__03935 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1_in_rule__RolePermission__Group_2__03938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RolePermission__Group_2__0__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__Group_2__1__Impl_in_rule__RolePermission__Group_2__13997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RolePermission__PermissionsAssignment_2_1_in_rule__RolePermission__Group_2__1__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4144 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__TicketSystem__StatesAssignment_04306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__TicketSystem__FlowsAssignment_14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__TicketSystem__FieldsAssignment_24368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketCategory_in_rule__TicketSystem__CategoriesAssignment_34399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__TicketSystem__RolesAssignment_44430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__State__NameAssignment_14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_24492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__NameAssignment_14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_34558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Flow__StatesAssignment_4_14597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Field__NameAssignment_14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__LabelAssignment_24663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__FieldTypeAssignment_3_04694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Field__FieldEnumAssignment_3_14725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_04756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enum__OptionAssignment_1_14787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__NameAssignment_14818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TicketCategory__DescriptionAssignment_24849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketCategory__FlowAssignment_44884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTicketField_in_rule__TicketCategory__TicketFieldsAssignment_6_04919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TicketField__FieldAssignment_04954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TicketField__MandatoryAssignment_14994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Role__NameAssignment_15033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Role__DescriptionAssignment_25064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRolePermission_in_rule__Role__RolepermissionsAssignment_4_05095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RolePermission__FieldAssignment_05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__RolePermission__PermissionsAssignment_2_15196 = new BitSet(new long[]{0x0000000000000002L});

}
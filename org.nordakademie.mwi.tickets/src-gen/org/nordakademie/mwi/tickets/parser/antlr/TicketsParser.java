/*
* generated by Xtext
*/
package org.nordakademie.mwi.tickets.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.nordakademie.mwi.tickets.services.TicketsGrammarAccess;

public class TicketsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TicketsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.nordakademie.mwi.tickets.parser.antlr.internal.InternalTicketsParser createParser(XtextTokenStream stream) {
		return new org.nordakademie.mwi.tickets.parser.antlr.internal.InternalTicketsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "TicketSystem";
	}
	
	public TicketsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TicketsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

package org.nordakademie.mwi.ticketSystem.flows;

public enum BugFlow {

	CREATED("Erstellt"),
	INPROGRESS("In Bearbeitung"),
	INDEVELOPMENT("In der Entwicklung"),
	TESTING("Im Test"),
	CLOSED("Geschlossen"),
	REOPEN("Wieder geöffnet")
	;
	
	private final String label;
	
	BugFlow(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public boolean isFirst() {
		return this.ordinal() == 0;
	}
	
	public boolean isLast() {
		return this.ordinal() == values().length - 1;
	}
}

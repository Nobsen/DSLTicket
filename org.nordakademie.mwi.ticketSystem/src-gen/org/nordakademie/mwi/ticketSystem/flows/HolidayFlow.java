package org.nordakademie.mwi.ticketSystem.flows;

public enum HolidayFlow {

	CREATED("Erstellt"),
	INPROGRESS("In Bearbeitung"),
	APPROVED("Genehmigt"),
	REJECTED("Abgewiesen")
	;
	
	private final String label;
	
	HolidayFlow(String label) {
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

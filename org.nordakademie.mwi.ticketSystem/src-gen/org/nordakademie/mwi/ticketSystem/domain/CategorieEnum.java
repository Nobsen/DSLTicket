package org.nordakademie.mwi.ticketSystem.domain;

public enum CategorieEnum {

	NORMAL("Normal"),
	MITTEL("Mittel"),
	SCHWER("Schwer"),
	SYSTEMSTEHT("System steht!")
	;
	
	private final String label;
	
	CategorieEnum(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}

package org.nordakademie.mwi.ticketSystem.domain;

public enum OperatingSystemEnum {

	WINDOWS("Windows"),
	IOS("iOS"),
	LINUX("Linux"),
	ANDROID("Android")
	;
	
	private final String label;
	
	OperatingSystemEnum(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
}

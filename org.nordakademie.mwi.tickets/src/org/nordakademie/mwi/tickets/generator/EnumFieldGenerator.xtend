package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.Field

class EnumFieldGenerator {
	def static toEnum(Field field) {
		'''
			package org.nordakademie.mwi.ticketSystem.domain;
			
			public enum «field.name.toFirstUpper»Enum {
			
				«FOR option : field.fieldEnum.option SEPARATOR ','»
					«option.replaceAll("[^a-zA-Z]", "").toUpperCase»("«option»")
				«ENDFOR»
				;
				
				private final String label;
				
				«field.name.toFirstUpper»Enum(String label) {
					this.label = label;
				}
				
				public String getLabel() {
					return this.label;
				}
				
			}
		'''
	}
}

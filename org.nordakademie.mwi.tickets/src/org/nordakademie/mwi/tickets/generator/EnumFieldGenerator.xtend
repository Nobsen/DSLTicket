package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.Field

class EnumFieldGenerator {
	def static toEnum(Field field) {
		'''
			package org.nordakademie.mwi.ticketSystem.domain;
			
			public enum «field.name.toFirstUpper»Enum {
			
				«FOR option : field.fieldEnum.option SEPARATOR ','»
					«option»
				«ENDFOR»
				;
				
				public boolean isFirst() {
					return this.ordinal() == 0;
				}
				
				public boolean isLast() {
					return this.ordinal() == values().length - 1;
				}
			}
		'''
	}
}

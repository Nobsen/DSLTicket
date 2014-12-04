package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.Flow

class FlowGenerator {

	def static toFlowEnum(Flow flow) {
		'''
			package org.nordakademie.mwi.ticketSystem.flows;
			
			public enum «flow.name.toFirstUpper» {
			
				«FOR status : flow.states SEPARATOR ','»
					«status.name.toUpperCase»("«status.description»")
				«ENDFOR»
				;
				
				private final String label;
				
				«flow.name.toFirstUpper»(String label) {
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
			'''
	}
}

package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory

class DomainGenerator {
	
		def static toDomainObject(TicketCategory category) {

		'''
			package org.nordakademie.mwi.ticketExample.domain;
			
			import javax.persistence.Basic;
			import javax.persistence.Entity;
			
			@Entity
			public class «category.name.toFirstUpper» extends AbstractDomainObject {
			
				«FOR field : category.ticketFields»
					@Basic(optional = «!field.mandatory»)
					private «field.field.fieldType.toString» «field.field.name»;
				«ENDFOR»
			
			    public «category.name.toFirstUpper» () {}
			    
			    «FOR field : category.ticketFields»
			    	public «field.field.fieldType.toString» get«field.field.name.toFirstUpper»() {
			    		return «field.field.name»;
			    	}
			    	
			    	public void set«field.field.name.toFirstUpper»(«field.field.fieldType.toString» «field.field.name») {
			    	 	this.«field.field.name» = «field.field.name»;
			    	}
				«ENDFOR»
			
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
						
					«category.name.toFirstUpper» other = («category.name.toFirstUpper») obj;
					«FOR field : category.ticketFields»
						if («field.field.name» == null) {
						if (other.«field.field.name» != null)
							return false;
						} else if (!«field.field.name».equals(other.«field.field.name»))
							return false;
					«ENDFOR»
					
					return true;
				}
			
			
			}
		'''

	// TODO equals klappt nicht mit primitiven Typen, wie int
	}
}
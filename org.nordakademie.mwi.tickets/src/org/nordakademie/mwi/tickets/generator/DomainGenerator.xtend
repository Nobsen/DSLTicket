package org.nordakademie.mwi.tickets.generator

import java.util.HashSet
import org.nordakademie.mwi.tickets.tickets.TicketCategory
import org.nordakademie.mwi.tickets.tickets.FieldType

class DomainGenerator {

	def static toDomainObject(TicketCategory category) {

		var imports = new HashSet<String>();

		for (field : category.ticketFields) {
			switch (field.field.fieldType) {
				case DATE: {
					imports.add("java.util.Calendar")
					imports.add("org.springframework.format.annotation.DateTimeFormat")
					}
				case DATE_TIME: {
					imports.add("java.util.Calendar")
					imports.add("org.springframework.format.annotation.DateTimeFormat")
					}
				default: {
				}
			}
		}

		'''
			package org.nordakademie.mwi.ticketSystem.domain;
			
			«FOR toImport : imports»
				import «toImport.toString»;
			«ENDFOR»
			«IF category.flow != null»
				import org.nordakademie.mwi.ticketSystem.flows.«category.flow.name.toFirstUpper»;
			«ENDIF»
			import org.hibernate.validator.constraints.NotBlank;
			import javax.persistence.Entity;
			
			@Entity
			public class «category.name.toFirstUpper» extends AbstractDomainObject {
			
				«IF category.flow != null»
					«category.flow.name.toFirstUpper» currentFlowState;
				«ENDIF»
			
				«FOR field : category.ticketFields»
					«IF field.mandatory»
					@NotBlank
					«ENDIF»
					«IF field.field.fieldType == FieldType.DATE»
					@DateTimeFormat(pattern = "dd.MM.yyyy")
					«ENDIF»
					private «field.field.fieldType.javaTypeForFieldType» «field.field.name»;
				«ENDFOR»
			
			    public «category.name.toFirstUpper» () {}
			    
			    «FOR field : category.ticketFields»
			    	public «field.field.fieldType.javaTypeForFieldType» get«field.field.name.toFirstUpper»() {
			    		return «field.field.name»;
			    	}
			    	
			    	public void set«field.field.name.toFirstUpper»(«field.field.fieldType.javaTypeForFieldType» «field.field.name») {
			    	 	this.«field.field.name» = «field.field.name»;
			    	}
				«ENDFOR»
			
				«IF category.flow != null»
					public «category.flow.name.toFirstUpper» getCurrentFlowState() {
					  		return currentFlowState;
					}
					
					public void setCurrentFlowState(«category.flow.name.toFirstUpper» currentFlowState) {
					 	this.currentFlowState = currentFlowState;
					}
				«ENDIF»
			
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

	}

	def static getJavaTypeForFieldType(FieldType type) {
		switch (type) {
			case DATE: "Calendar"
			case DATE_TIME: "Calendar"
			case DECIMAL: "Double"
			case INT: "Integer"
			case BOOLEAN: "Boolean"
			default: "String"
		}
	}
}

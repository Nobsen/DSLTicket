/*
 * generated by Xtext
 */
package org.nordakademie.mwi.tickets.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.nordakademie.mwi.tickets.TicketsOutputConfigurationProvider
import org.nordakademie.mwi.tickets.tickets.Flow
import org.nordakademie.mwi.tickets.tickets.TicketCategory
import org.nordakademie.mwi.tickets.tickets.TicketSystem
import org.nordakademie.mwi.tickets.tickets.Field

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class TicketsGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var categories = resource.contents.filter(TicketSystem).head.categories;

		for (TicketCategory category : categories) {

			// domain objects
			fsa.generateFile('org/nordakademie/mwi/ticketSystem/domain/' + category.name.toFirstUpper + '.java',
				DomainGenerator.toDomainObject(category))

			// DAO and DAO-Impl
			fsa.generateFile('org/nordakademie/mwi/ticketSystem/dao/' + category.name.toFirstUpper + 'Dao.java',
				DaoGenerator.toDao(category))

			fsa.generateFile('org/nordakademie/mwi/ticketSystem/daoimpl/' + category.name.toFirstUpper + 'DaoImpl.java',
				DaoGenerator.toDaoImpl(category))

			// controller
			fsa.generateFile('org/nordakademie/mwi/ticketSystem/controller/' + category.name.toFirstUpper + 'Controller.java',
				ControllerGenerator.toController(category))

			// jsps
			fsa.generateFile(category.name.toLowerCase + '/create.jsp', TicketsOutputConfigurationProvider.JSP_OUTPUT,
				JspGenerator.toCreateJsp(category, true))

			fsa.generateFile(category.name.toLowerCase + '/edit.jsp', TicketsOutputConfigurationProvider.JSP_OUTPUT,
				JspGenerator.toCreateJsp(category, false))

			fsa.generateFile(category.name.toLowerCase + '/show.jsp', TicketsOutputConfigurationProvider.JSP_OUTPUT,
				JspGenerator.toShowJsp(category))

			fsa.generateFile(category.name.toLowerCase + '/list.jsp', TicketsOutputConfigurationProvider.JSP_OUTPUT,
				JspGenerator.toListJsp(category))
		}

		var flows = resource.contents.filter(TicketSystem).head.flows;

		// flows
		for (Flow flow : flows) {
			fsa.generateFile('org/nordakademie/mwi/ticketSystem/flows/' + flow.name.toFirstUpper + '.java',
				FlowGenerator.toFlowEnum(flow))
		}

		var fields = resource.contents.filter(TicketSystem).head.fields;
		
		// enums
		for (Field field : fields) {
			if (field.fieldEnum != null) {
				fsa.generateFile('org/nordakademie/mwi/ticketSystem/domain/' + field.name.toFirstUpper + 'Enum.java',
					EnumFieldGenerator.toEnum(field))
			}
		}
		
		// navigation and index
		fsa.generateFile('/navigation.jspf', TicketsOutputConfigurationProvider.JSP_OUTPUT,
			JspGenerator.toNavigation(categories))
		
		fsa.generateFile('/index.jsp', TicketsOutputConfigurationProvider.JSP_OUTPUT,
			JspGenerator.toIndex(categories))
			
		fsa.generateFile('org/nordakademie/mwi/ticketSystem/controller/IndexController.java',
				ControllerGenerator.toIndexController(categories))
	}

}

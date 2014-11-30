package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory

class DaoGenerator {
	def static toDao(TicketCategory category) {
		'''
			package org.nordakademie.mwi.ticketSystem.dao;
			
			import org.nordakademie.mwi.ticketSystem.domain.«category.name.toFirstUpper»;
			
			public interface «category.name.toFirstUpper»Dao extends GenericDao<«category.name.toFirstUpper», Long> {
			
			}
		'''
	}

	def static toDaoImpl(TicketCategory category) {
		'''
			package org.nordakademie.mwi.ticketSystem.daoimpl;
			
			import org.nordakademie.mwi.ticketSystem.dao.AbstractDao;
			import org.nordakademie.mwi.ticketSystem.dao.«category.name.toFirstUpper»Dao;
			import org.nordakademie.mwi.ticketSystem.domain.«category.name.toFirstUpper»;
			import org.springframework.stereotype.Repository;
			
			@Repository("«category.name.toFirstLower»Dao")
			public class «category.name.toFirstUpper»DaoImpl extends AbstractDao<«category.name.toFirstUpper», Long> implements «category.name.toFirstUpper»Dao {
			
			
			
			}
		'''
	}
}

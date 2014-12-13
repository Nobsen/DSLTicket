package org.nordakademie.mwi.ticketSystem.daoimpl;

import org.nordakademie.mwi.ticketSystem.dao.AbstractDao;
import org.nordakademie.mwi.ticketSystem.dao.BugDao;
import org.nordakademie.mwi.ticketSystem.domain.Bug;
import org.springframework.stereotype.Repository;

@Repository("bugDao")
public class BugDaoImpl extends AbstractDao<Bug, Long> implements BugDao {



}

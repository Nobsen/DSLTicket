package org.nordakademie.mwi.ticketExample.daoimpl;

import org.nordakademie.mwi.ticketExample.dao.AbstractDao;
import org.nordakademie.mwi.ticketExample.dao.BugDao;
import org.nordakademie.mwi.ticketExample.domain.Bug;
import org.springframework.stereotype.Repository;

@Repository("bugDao")
public class BugDaoImpl extends AbstractDao<Bug, Long> implements BugDao {



}

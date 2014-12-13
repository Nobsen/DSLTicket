package org.nordakademie.mwi.ticketSystem.daoimpl;

import org.nordakademie.mwi.ticketSystem.dao.AbstractDao;
import org.nordakademie.mwi.ticketSystem.dao.HolidayRequestDao;
import org.nordakademie.mwi.ticketSystem.domain.HolidayRequest;
import org.springframework.stereotype.Repository;

@Repository("holidayRequestDao")
public class HolidayRequestDaoImpl extends AbstractDao<HolidayRequest, Long> implements HolidayRequestDao {



}

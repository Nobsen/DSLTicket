package org.nordakademie.mwi.ticketSystem.controller;

import org.nordakademie.mwi.ticketSystem.dao.BugDao;
import org.nordakademie.mwi.ticketSystem.dao.HolidayRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
public class IndexController {

	@Autowired
	BugDao bugDao;
	@Autowired
	HolidayRequestDao holidayRequestDao;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String create(Model model) {
	
		model.addAttribute("bugCount", bugDao.count());
		model.addAttribute("holidayRequestCount", holidayRequestDao.count());
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:index";
	}

}

package org.nordakademie.mwi.ticketExample.controller;

import java.util.Collection;

import org.nordakademie.mwi.ticketExample.dao.BugDao;
import org.nordakademie.mwi.ticketExample.domain.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Transactional
public class BugController {

	@Autowired
	BugDao bugDao;
	
    @ModelAttribute
    public Bug newRequest(@RequestParam(required=false) Long id) {
        return (id != null ? bugDao.findById(id) : new Bug());
    }
	
	@RequestMapping(value = "/bug/create", method = RequestMethod.GET)
	public String create() {
		return "bug/create";
	}

	@RequestMapping(value = "/bug/create", method = RequestMethod.POST)
	public String create(Bug bug, ModelMap map) {
		Bug result = bugDao.makePersistent(bug);
		
		map.clear();
		map.put("bug", result);
		
		return "bug/show";
	}

	@RequestMapping(value = "/bug/show", method = RequestMethod.GET)
	public String show(Bug bug) {
		return "bug/show";
	}
	
	@RequestMapping(value = "/bug/list", method = RequestMethod.GET)
	public String list(ModelMap map) {
		map.put("bugs", bugDao.findAll());
		return "bug/list";
	}
	
}

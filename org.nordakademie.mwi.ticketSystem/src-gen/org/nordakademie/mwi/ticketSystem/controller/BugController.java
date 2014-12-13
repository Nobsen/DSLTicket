package org.nordakademie.mwi.ticketSystem.controller;

import javax.validation.Valid;

import org.nordakademie.mwi.ticketSystem.dao.BugDao;
import org.nordakademie.mwi.ticketSystem.domain.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.nordakademie.mwi.ticketSystem.flows.BugFlow;
import org.nordakademie.mwi.ticketSystem.domain.CategorieEnum;
import org.nordakademie.mwi.ticketSystem.domain.OperatingSystemEnum;


@Controller
@Transactional
public class BugController {

	@Autowired
	BugDao bugDao;
	
	   @ModelAttribute
	   public Bug newRequest(@RequestParam(required=false) Long id, @RequestParam(required=false) Bug bug) {
	       return (id != null ? bugDao.findById(id) : new Bug());
	   }
	
	@RequestMapping(value = "/bug/create", method = RequestMethod.GET)
	public String create(Model model) {
		
		model.addAttribute("states", BugFlow.values());
		model.addAttribute("categorieEnumValues", CategorieEnum.values());
		model.addAttribute("operatingSystemEnumValues", OperatingSystemEnum.values());
		return "bug/create";
	}

	@RequestMapping(value = "/bug/create", method = RequestMethod.POST)
	public String create(@Valid Bug bug, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("states", BugFlow.values());
			model.addAttribute("categorieEnumValues", CategorieEnum.values());
			model.addAttribute("operatingSystemEnumValues", OperatingSystemEnum.values());
			return "/bug/create";
		}
		bugDao.makePersistent(bug);
		
		model.addAttribute("id", bug.getId());
		return "redirect:show";
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
	
	@RequestMapping(value = "/bug/delete", method = RequestMethod.POST)
	public String delete(Bug bug) {
		bugDao.makeTransient(bug);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/bug/edit", method = RequestMethod.GET)
	public String edit(Bug bug, Model model) {
		model.addAttribute("states", BugFlow.values());
		model.addAttribute("categorieEnumValues", CategorieEnum.values());
		model.addAttribute("operatingSystemEnumValues", OperatingSystemEnum.values());
		return "bug/edit";
	}
	
	@RequestMapping(value = "/bug/edit", method = RequestMethod.POST)
	public String edit(@Valid Bug bug, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("states", BugFlow.values());
			model.addAttribute("categorieEnumValues", CategorieEnum.values());
			model.addAttribute("operatingSystemEnumValues", OperatingSystemEnum.values());
			return "/bug/edit";
		}
		Bug orig =  bugDao.findById(bug.getId());
		orig.setTitel(bug.getTitel());
		orig.setDescription(bug.getDescription());
		orig.setCategorie(bug.getCategorie());
		orig.setCreator(bug.getCreator());
		orig.setExpectedResolutionDate(bug.getExpectedResolutionDate());
		orig.setExpectedEffortInHours(bug.getExpectedEffortInHours());
		orig.setOperatingSystem(bug.getOperatingSystem());
		orig.setNoOfCalls(bug.getNoOfCalls());
		orig.setPhoneNo(bug.getPhoneNo());
		orig.setEMail(bug.getEMail());
		orig.setSolveDate(bug.getSolveDate());
		orig.setCurrentFlowState(bug.getCurrentFlowState());
		model.addAttribute("id",  bug.getId());
		return "redirect:show";
	}
	@RequestMapping(value = "/bug/nextState", method = RequestMethod.POST)
	public String nextState(Bug bug, Model model) {
		bug = bugDao.findById(bug.getId());
		bug.setCurrentFlowState(BugFlow.values()[bug.getCurrentFlowState().ordinal() + 1]);
		
		model.addAttribute("id", bug.getId());
		return "redirect:show";
	}
		
	@RequestMapping(value = "/bug/prevState", method = RequestMethod.POST)
	public String prevState(Bug bug, Model model) {
		bug = bugDao.findById(bug.getId());
		bug.setCurrentFlowState(BugFlow.values()[bug.getCurrentFlowState().ordinal() - 1]);
		
		model.addAttribute("id", bug.getId());
		return "redirect:show";
	}
}

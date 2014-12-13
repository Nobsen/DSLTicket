package org.nordakademie.mwi.ticketSystem.controller;

import javax.validation.Valid;

import org.nordakademie.mwi.ticketSystem.dao.HolidayRequestDao;
import org.nordakademie.mwi.ticketSystem.domain.HolidayRequest;
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
import org.nordakademie.mwi.ticketSystem.flows.HolidayFlow;


@Controller
@Transactional
public class HolidayRequestController {

	@Autowired
	HolidayRequestDao holidayRequestDao;
	
	   @ModelAttribute
	   public HolidayRequest newRequest(@RequestParam(required=false) Long id, @RequestParam(required=false) HolidayRequest holidayRequest) {
	       return (id != null ? holidayRequestDao.findById(id) : new HolidayRequest());
	   }
	
	@RequestMapping(value = "/holidayrequest/create", method = RequestMethod.GET)
	public String create(Model model) {
		
		model.addAttribute("states", HolidayFlow.values());
		return "holidayrequest/create";
	}

	@RequestMapping(value = "/holidayrequest/create", method = RequestMethod.POST)
	public String create(@Valid HolidayRequest holidayRequest, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("states", HolidayFlow.values());
			return "/holidayrequest/create";
		}
		holidayRequestDao.makePersistent(holidayRequest);
		
		model.addAttribute("id", holidayRequest.getId());
		return "redirect:show";
	}

	@RequestMapping(value = "/holidayrequest/show", method = RequestMethod.GET)
	public String show(HolidayRequest holidayRequest) {
		return "holidayrequest/show";
	}
	
	@RequestMapping(value = "/holidayrequest/list", method = RequestMethod.GET)
	public String list(ModelMap map) {
		map.put("holidayRequests", holidayRequestDao.findAll());
		return "holidayrequest/list";
	}
	
	@RequestMapping(value = "/holidayrequest/delete", method = RequestMethod.POST)
	public String delete(HolidayRequest holidayRequest) {
		holidayRequestDao.makeTransient(holidayRequest);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/holidayrequest/edit", method = RequestMethod.GET)
	public String edit(HolidayRequest holidayRequest, Model model) {
		model.addAttribute("states", HolidayFlow.values());
		return "holidayrequest/edit";
	}
	
	@RequestMapping(value = "/holidayrequest/edit", method = RequestMethod.POST)
	public String edit(@Valid HolidayRequest holidayRequest, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("states", HolidayFlow.values());
			return "/holidayrequest/edit";
		}
		HolidayRequest orig =  holidayRequestDao.findById(holidayRequest.getId());
		orig.setDescription(holidayRequest.getDescription());
		orig.setDateFrom(holidayRequest.getDateFrom());
		orig.setDateUntil(holidayRequest.getDateUntil());
		orig.setCreator(holidayRequest.getCreator());
		orig.setAccessible(holidayRequest.getAccessible());
		orig.setPhoneNo(holidayRequest.getPhoneNo());
		orig.setEMail(holidayRequest.getEMail());
		orig.setCurrentFlowState(holidayRequest.getCurrentFlowState());
		model.addAttribute("id",  holidayRequest.getId());
		return "redirect:show";
	}
	@RequestMapping(value = "/holidayrequest/nextState", method = RequestMethod.POST)
	public String nextState(HolidayRequest holidayRequest, Model model) {
		holidayRequest = holidayRequestDao.findById(holidayRequest.getId());
		holidayRequest.setCurrentFlowState(HolidayFlow.values()[holidayRequest.getCurrentFlowState().ordinal() + 1]);
		
		model.addAttribute("id", holidayRequest.getId());
		return "redirect:show";
	}
		
	@RequestMapping(value = "/holidayrequest/prevState", method = RequestMethod.POST)
	public String prevState(HolidayRequest holidayRequest, Model model) {
		holidayRequest = holidayRequestDao.findById(holidayRequest.getId());
		holidayRequest.setCurrentFlowState(HolidayFlow.values()[holidayRequest.getCurrentFlowState().ordinal() - 1]);
		
		model.addAttribute("id", holidayRequest.getId());
		return "redirect:show";
	}
}

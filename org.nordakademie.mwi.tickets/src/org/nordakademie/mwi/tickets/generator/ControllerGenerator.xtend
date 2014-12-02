package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory

class ControllerGenerator {

	def static toController(TicketCategory category) {
		'''
			package org.nordakademie.mwi.ticketSystem.controller;
			
			import javax.validation.Valid;
			
			import org.nordakademie.mwi.ticketSystem.dao.«category.name.toFirstUpper»Dao;
			import org.nordakademie.mwi.ticketSystem.domain.«category.name.toFirstUpper»;
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
			«IF category.flow != null»
				import org.nordakademie.mwi.ticketSystem.flows.«category.flow.name.toFirstUpper»;
			«ENDIF»
			
			@Controller
			@Transactional
			public class «category.name.toFirstUpper»Controller {
			
				@Autowired
				«category.name.toFirstUpper»Dao «category.name.toFirstLower»Dao;
				
				   @ModelAttribute
				   public «category.name.toFirstUpper» newRequest(@RequestParam(required=false) Long id, @RequestParam(required=false) «category.
				name.toFirstUpper» «category.name.toFirstLower») {
				       return (id != null ? «category.name.toFirstLower»Dao.findById(id) : new «category.name.toFirstUpper»());
				   }
				
				@RequestMapping(value = "/«category.name.toLowerCase»/create", method = RequestMethod.GET)
				public String create(Model model) {
					
					«IF category.flow != null»
						model.addAttribute("states", «category.flow.name.toFirstUpper».values());
					«ENDIF»
					return "«category.name.toLowerCase»/create";
				}
			
				@RequestMapping(value = "/«category.name.toLowerCase»/create", method = RequestMethod.POST)
				public String create(@Valid «category.name.toFirstUpper» «category.name.toFirstLower», BindingResult bindingResult, Model model) {
					if (bindingResult.hasErrors()) {
						«IF category.flow != null»
							model.addAttribute("states", «category.flow.name.toFirstUpper».values());
						«ENDIF»
						return "/«category.name.toLowerCase»/create";
					}
					«category.name.toFirstLower»Dao.makePersistent(«category.name.toFirstLower»);
					
					model.addAttribute("id", «category.name.toFirstLower».getId());
					return "redirect:show";
				}
			
				@RequestMapping(value = "/«category.name.toLowerCase»/show", method = RequestMethod.GET)
				public String show(«category.name.toFirstUpper» «category.name.toFirstLower») {
					return "«category.name.toLowerCase»/show";
				}
				
				@RequestMapping(value = "/«category.name.toLowerCase»/list", method = RequestMethod.GET)
				public String list(ModelMap map) {
					map.put("«category.name.toFirstLower»s", «category.name.toFirstLower»Dao.findAll());
					return "«category.name.toLowerCase»/list";
				}
				
				@RequestMapping(value = "/«category.name.toLowerCase»/delete", method = RequestMethod.POST)
				public String delete(«category.name.toFirstUpper» «category.name.toFirstLower») {
					«category.name.toFirstLower»Dao.makeTransient(«category.name.toFirstLower»);
					
					return "redirect:list";
				}
			}
		'''
	}

}

package org.nordakademie.mwi.tickets.generator

import org.nordakademie.mwi.tickets.tickets.TicketCategory
import java.util.Collection

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
			«getEnumImports(category)»
			
			
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
					
					«getEnumValuesToInject(category)»
					return "«category.name.toLowerCase»/create";
				}
			
				@RequestMapping(value = "/«category.name.toLowerCase»/create", method = RequestMethod.POST)
				public String create(@Valid «category.name.toFirstUpper» «category.name.toFirstLower», BindingResult bindingResult, Model model) {
					if (bindingResult.hasErrors()) {
						«getEnumValuesToInject(category)»
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
				
				@RequestMapping(value = "/«category.name.toLowerCase»/edit", method = RequestMethod.GET)
				public String edit(«category.name.toFirstUpper» «category.name.toFirstLower», Model model) {
					«getEnumValuesToInject(category)»
					return "«category.name.toLowerCase»/edit";
				}
				
				@RequestMapping(value = "/«category.name.toLowerCase»/edit", method = RequestMethod.POST)
				public String edit(@Valid «category.name.toFirstUpper» «category.name.toFirstLower», BindingResult bindingResult, Model model) {
					if (bindingResult.hasErrors()) {
						«getEnumValuesToInject(category)»
						return "/«category.name.toLowerCase»/edit";
					}
					«category.name.toFirstUpper» orig =  «category.name.toFirstLower»Dao.findById(«category.name.toFirstLower».getId());
					«FOR field : category.ticketFields»
						orig.set«field.field.name.toFirstUpper»(«category.name.toFirstLower».get«field.field.name.toFirstUpper»());
					«ENDFOR»
					«IF category.flow != null»
						orig.setCurrentFlowState(«category.name.toFirstLower».getCurrentFlowState());
					«ENDIF»				
					model.addAttribute("id",  «category.name.toFirstLower».getId());
					return "redirect:show";
				}
				«IF category.flow != null»
					@RequestMapping(value = "/«category.name.toLowerCase»/nextState", method = RequestMethod.POST)
					public String nextState(«category.name.toFirstUpper» «category.name.toFirstLower», Model model) {
						«category.name.toFirstLower» = «category.name.toFirstLower»Dao.findById(«category.name.toFirstLower».getId());
						«category.name.toFirstLower».setCurrentFlowState(«category.flow.name.toFirstUpper».values()[«category.name.toFirstLower».getCurrentFlowState().ordinal() + 1]);
						
						model.addAttribute("id", «category.name.toFirstLower».getId());
						return "redirect:show";
					}
						
					@RequestMapping(value = "/«category.name.toLowerCase»/prevState", method = RequestMethod.POST)
					public String prevState(«category.name.toFirstUpper» «category.name.toFirstLower», Model model) {
						«category.name.toFirstLower» = «category.name.toFirstLower»Dao.findById(«category.name.toFirstLower».getId());
						«category.name.toFirstLower».setCurrentFlowState(«category.flow.name.toFirstUpper».values()[«category.name.toFirstLower».getCurrentFlowState().ordinal() - 1]);
						
						model.addAttribute("id", «category.name.toFirstLower».getId());
						return "redirect:show";
					}
				«ENDIF»
			}
		'''
	}

	def static toIndexController(Collection<TicketCategory> categories) {
		'''
			package org.nordakademie.mwi.ticketSystem.controller;

			«FOR category : categories»
			import org.nordakademie.mwi.ticketSystem.dao.«category.name.toFirstUpper»Dao;
			«ENDFOR»
			import org.springframework.beans.factory.annotation.Autowired;
			import org.springframework.stereotype.Controller;
			import org.springframework.transaction.annotation.Transactional;
			import org.springframework.ui.Model;
			import org.springframework.web.bind.annotation.RequestMapping;
			import org.springframework.web.bind.annotation.RequestMethod;
			
			@Controller
			@Transactional
			public class IndexController {
			
				«FOR category : categories»
					@Autowired
					«category.name.toFirstUpper»Dao «category.name.toFirstLower»Dao;
				«ENDFOR»
				
				@RequestMapping(value = "/index", method = RequestMethod.GET)
				public String create(Model model) {
				
					«FOR category : categories»
						model.addAttribute("«category.name.toFirstLower»Count", «category.name.toFirstLower»Dao.count());
					«ENDFOR»	
					return "index";
				}
			
				@RequestMapping(value = "/", method = RequestMethod.GET)
				public String home() {
					return "redirect:index";
				}
			
			}
		'''
	}

	def static getEnumValuesToInject(TicketCategory category) {
		'''
		«IF category.flow != null»
			model.addAttribute("states", «category.flow.name.toFirstUpper».values());
		«ENDIF»
		«FOR field : category.ticketFields»
			«IF field.field.fieldEnum != null»
				model.addAttribute("«field.field.name.toFirstLower»EnumValues", «field.field.name.toFirstUpper»Enum.values());
			«ENDIF»
		«ENDFOR»
		'''
	}

	def static getEnumImports(TicketCategory category) {
		'''
		«FOR field : category.ticketFields»
			«IF field.field.fieldEnum != null»
				import org.nordakademie.mwi.ticketSystem.domain.«field.field.name.toFirstUpper»Enum;
			«ENDIF»
		«ENDFOR»
		'''
	}
}

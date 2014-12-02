package org.nordakademie.mwi.tickets.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;

@SuppressWarnings("all")
public class ControllerGenerator {
  public static CharSequence toController(final TicketCategory category) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.nordakademie.mwi.ticketSystem.controller;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.validation.Valid;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.nordakademie.mwi.ticketSystem.dao.");
    String _name = category.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Dao;");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.nordakademie.mwi.ticketSystem.domain.");
    String _name_1 = category.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Controller;");
    _builder.newLine();
    _builder.append("import org.springframework.transaction.annotation.Transactional;");
    _builder.newLine();
    _builder.append("import org.springframework.ui.Model;");
    _builder.newLine();
    _builder.append("import org.springframework.ui.ModelMap;");
    _builder.newLine();
    _builder.append("import org.springframework.validation.BindingResult;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.ModelAttribute;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMapping;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestMethod;");
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.RequestParam;");
    _builder.newLine();
    {
      Flow _flow = category.getFlow();
      boolean _notEquals = (!Objects.equal(_flow, null));
      if (_notEquals) {
        _builder.append("import org.nordakademie.mwi.ticketSystem.flows.");
        Flow _flow_1 = category.getFlow();
        String _name_2 = _flow_1.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_2, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("@Controller");
    _builder.newLine();
    _builder.append("@Transactional");
    _builder.newLine();
    _builder.append("public class ");
    String _name_3 = category.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_3, "");
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("\t");
    String _name_4 = category.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_4, "\t");
    _builder.append("Dao ");
    String _name_5 = category.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_5);
    _builder.append(_firstLower, "\t");
    _builder.append("Dao;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("@ModelAttribute");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("public ");
    String _name_6 = category.getName();
    String _firstUpper_5 = StringExtensions.toFirstUpper(_name_6);
    _builder.append(_firstUpper_5, "\t   ");
    _builder.append(" newRequest(@RequestParam(required=false) Long id, @RequestParam(required=false) ");
    String _name_7 = category.getName();
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_7);
    _builder.append(_firstUpper_6, "\t   ");
    _builder.append(" ");
    String _name_8 = category.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_8);
    _builder.append(_firstLower_1, "\t   ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t       ");
    _builder.append("return (id != null ? ");
    String _name_9 = category.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_9);
    _builder.append(_firstLower_2, "\t       ");
    _builder.append("Dao.findById(id) : new ");
    String _name_10 = category.getName();
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_10);
    _builder.append(_firstUpper_7, "\t       ");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t   ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@RequestMapping(value = \"/");
    String _name_11 = category.getName();
    String _lowerCase = _name_11.toLowerCase();
    _builder.append(_lowerCase, "\t");
    _builder.append("/create\", method = RequestMethod.GET)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String create(Model model) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Flow _flow_2 = category.getFlow();
      boolean _notEquals_1 = (!Objects.equal(_flow_2, null));
      if (_notEquals_1) {
        _builder.append("\t\t");
        _builder.append("model.addAttribute(\"states\", ");
        Flow _flow_3 = category.getFlow();
        String _name_12 = _flow_3.getName();
        String _firstUpper_8 = StringExtensions.toFirstUpper(_name_12);
        _builder.append(_firstUpper_8, "\t\t");
        _builder.append(".values());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return \"");
    String _name_13 = category.getName();
    String _lowerCase_1 = _name_13.toLowerCase();
    _builder.append(_lowerCase_1, "\t\t");
    _builder.append("/create\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@RequestMapping(value = \"/");
    String _name_14 = category.getName();
    String _lowerCase_2 = _name_14.toLowerCase();
    _builder.append(_lowerCase_2, "\t");
    _builder.append("/create\", method = RequestMethod.POST)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String create(@Valid ");
    String _name_15 = category.getName();
    String _firstUpper_9 = StringExtensions.toFirstUpper(_name_15);
    _builder.append(_firstUpper_9, "\t");
    _builder.append(" ");
    String _name_16 = category.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_16);
    _builder.append(_firstLower_3, "\t");
    _builder.append(", BindingResult bindingResult, Model model) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (bindingResult.hasErrors()) {");
    _builder.newLine();
    {
      Flow _flow_4 = category.getFlow();
      boolean _notEquals_2 = (!Objects.equal(_flow_4, null));
      if (_notEquals_2) {
        _builder.append("\t\t\t");
        _builder.append("model.addAttribute(\"states\", ");
        Flow _flow_5 = category.getFlow();
        String _name_17 = _flow_5.getName();
        String _firstUpper_10 = StringExtensions.toFirstUpper(_name_17);
        _builder.append(_firstUpper_10, "\t\t\t");
        _builder.append(".values());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("return \"/");
    String _name_18 = category.getName();
    String _lowerCase_3 = _name_18.toLowerCase();
    _builder.append(_lowerCase_3, "\t\t\t");
    _builder.append("/create\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_19 = category.getName();
    String _firstLower_4 = StringExtensions.toFirstLower(_name_19);
    _builder.append(_firstLower_4, "\t\t");
    _builder.append("Dao.makePersistent(");
    String _name_20 = category.getName();
    String _firstLower_5 = StringExtensions.toFirstLower(_name_20);
    _builder.append(_firstLower_5, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("model.addAttribute(\"id\", ");
    String _name_21 = category.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_21);
    _builder.append(_firstLower_6, "\t\t");
    _builder.append(".getId());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return \"redirect:show\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@RequestMapping(value = \"/");
    String _name_22 = category.getName();
    String _lowerCase_4 = _name_22.toLowerCase();
    _builder.append(_lowerCase_4, "\t");
    _builder.append("/show\", method = RequestMethod.GET)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String show(");
    String _name_23 = category.getName();
    String _firstUpper_11 = StringExtensions.toFirstUpper(_name_23);
    _builder.append(_firstUpper_11, "\t");
    _builder.append(" ");
    String _name_24 = category.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_24);
    _builder.append(_firstLower_7, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return \"");
    String _name_25 = category.getName();
    String _lowerCase_5 = _name_25.toLowerCase();
    _builder.append(_lowerCase_5, "\t\t");
    _builder.append("/show\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@RequestMapping(value = \"/");
    String _name_26 = category.getName();
    String _lowerCase_6 = _name_26.toLowerCase();
    _builder.append(_lowerCase_6, "\t");
    _builder.append("/list\", method = RequestMethod.GET)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String list(ModelMap map) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("map.put(\"");
    String _name_27 = category.getName();
    String _firstLower_8 = StringExtensions.toFirstLower(_name_27);
    _builder.append(_firstLower_8, "\t\t");
    _builder.append("s\", ");
    String _name_28 = category.getName();
    String _firstLower_9 = StringExtensions.toFirstLower(_name_28);
    _builder.append(_firstLower_9, "\t\t");
    _builder.append("Dao.findAll());");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return \"");
    String _name_29 = category.getName();
    String _lowerCase_7 = _name_29.toLowerCase();
    _builder.append(_lowerCase_7, "\t\t");
    _builder.append("/list\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@RequestMapping(value = \"/");
    String _name_30 = category.getName();
    String _lowerCase_8 = _name_30.toLowerCase();
    _builder.append(_lowerCase_8, "\t");
    _builder.append("/delete\", method = RequestMethod.POST)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public String delete(");
    String _name_31 = category.getName();
    String _firstUpper_12 = StringExtensions.toFirstUpper(_name_31);
    _builder.append(_firstUpper_12, "\t");
    _builder.append(" ");
    String _name_32 = category.getName();
    String _firstLower_10 = StringExtensions.toFirstLower(_name_32);
    _builder.append(_firstLower_10, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_33 = category.getName();
    String _firstLower_11 = StringExtensions.toFirstLower(_name_33);
    _builder.append(_firstLower_11, "\t\t");
    _builder.append("Dao.makeTransient(");
    String _name_34 = category.getName();
    String _firstLower_12 = StringExtensions.toFirstLower(_name_34);
    _builder.append(_firstLower_12, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"redirect:list\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
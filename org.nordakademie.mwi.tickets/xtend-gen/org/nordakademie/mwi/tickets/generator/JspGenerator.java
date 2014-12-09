package org.nordakademie.mwi.tickets.generator;

import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.FieldType;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;

@SuppressWarnings("all")
public class JspGenerator {
  public static CharSequence toCreateJsp(final TicketCategory category, final boolean isCreate) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"form\" uri=\"http://www.springframework.org/tags/form\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<%@include file=\"../navigation.jspf\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>");
    String _description = category.getDescription();
    _builder.append(_description, "\t");
    _builder.append(" ");
    {
      if (isCreate) {
        _builder.append("anlegen");
      } else {
        _builder.append("bearbeiten");
      }
    }
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<c:url var=\"url\" value=\"/");
    String _name = category.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "\t");
    _builder.append("/");
    {
      if (isCreate) {
        _builder.append("create");
      } else {
        _builder.append("edit");
      }
    }
    _builder.append("\" /> ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<form:form action=\"${url}\" commandName=\"");
    String _name_1 = category.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "\t");
    _builder.append("\" class=\"form-horizontal\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("<form:hidden path=\"id\"/>");
    _builder.newLine();
    {
      EList<TicketField> _ticketFields = category.getTicketFields();
      for(final TicketField field : _ticketFields) {
        _builder.append("\t   ");
        _builder.append("<form:errors path=\"");
        Field _field = field.getField();
        String _name_2 = _field.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower_1, "\t   ");
        _builder.append("\" class=\"col-sm-offset-2 text-danger\" element=\"div\"></form:errors>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("<div class=\"form-group\">");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("<label for=\"title\" class=\"control-label col-sm-2\">");
        Field _field_1 = field.getField();
        String _label = _field_1.getLabel();
        _builder.append(_label, "\t       ");
        _builder.append(":</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("<div class=\"col-sm-6\">");
        _builder.newLine();
        {
          Field _field_2 = field.getField();
          FieldType _fieldType = _field_2.getFieldType();
          boolean _equals = Objects.equal(_fieldType, FieldType.DATE);
          if (_equals) {
            _builder.append("\t   ");
            _builder.append("    \t");
            _builder.append("<form:input class=\"form-control datepicker\" path=\"");
            Field _field_3 = field.getField();
            String _name_3 = _field_3.getName();
            String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
            _builder.append(_firstLower_2, "\t       \t");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
          } else {
            Field _field_4 = field.getField();
            FieldType _fieldType_1 = _field_4.getFieldType();
            boolean _equals_1 = Objects.equal(_fieldType_1, FieldType.DATE_TIME);
            if (_equals_1) {
              _builder.append("\t   ");
              _builder.append("    \t");
              _builder.append("<form:input class=\"form-control datetimepicker\" path=\"");
              Field _field_5 = field.getField();
              String _name_4 = _field_5.getName();
              String _firstLower_3 = StringExtensions.toFirstLower(_name_4);
              _builder.append(_firstLower_3, "\t       \t");
              _builder.append("\" />");
              _builder.newLineIfNotEmpty();
            } else {
              Field _field_6 = field.getField();
              FieldType _fieldType_2 = _field_6.getFieldType();
              boolean _equals_2 = Objects.equal(_fieldType_2, FieldType.BOOLEAN);
              if (_equals_2) {
                _builder.append("\t   ");
                _builder.append("    \t");
                _builder.append("<form:checkbox path=\"");
                Field _field_7 = field.getField();
                String _name_5 = _field_7.getName();
                String _firstLower_4 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_4, "\t       \t");
                _builder.append("\" />");
                _builder.newLineIfNotEmpty();
              } else {
                Field _field_8 = field.getField();
                org.nordakademie.mwi.tickets.tickets.Enum _fieldEnum = _field_8.getFieldEnum();
                boolean _notEquals = (!Objects.equal(_fieldEnum, null));
                if (_notEquals) {
                  _builder.append("\t   ");
                  _builder.append("    \t");
                  _builder.append("<form:select class=\"form-control\" path=\"categorie\" items=\"${");
                  Field _field_9 = field.getField();
                  String _name_6 = _field_9.getName();
                  String _firstLower_5 = StringExtensions.toFirstLower(_name_6);
                  _builder.append(_firstLower_5, "\t       \t");
                  _builder.append("EnumValues}\" />");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t   ");
                  _builder.append("    \t");
                  _builder.append("<form:input class=\"form-control\" path=\"");
                  Field _field_10 = field.getField();
                  String _name_7 = _field_10.getName();
                  String _firstLower_6 = StringExtensions.toFirstLower(_name_7);
                  _builder.append(_firstLower_6, "\t       \t");
                  _builder.append("\" />");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    {
      Flow _flow = category.getFlow();
      boolean _notEquals_1 = (!Objects.equal(_flow, null));
      if (_notEquals_1) {
        _builder.append("\t   ");
        _builder.append("<div class=\"form-group\"> ");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("<label for=\"title\" class=\"control-label col-sm-2\">Aktueller Status:</label>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("<div class=\"col-sm-6\">");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t \t");
        _builder.append("<form:select class=\"form-control\" path=\"currentFlowState\" items=\"${states}\" itemLabel=\"label\" />");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t    ");
    _builder.append("<div class=\"form-group\"> ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<div class=\"col-sm-offset-2 col-sm-10\">");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<button type=\"submit\" class=\"btn btn-default\">Speichern</button>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</form:form>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toShowJsp(final TicketCategory category) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"form\" uri=\"http://www.springframework.org/tags/form\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<%@include file=\"../navigation.jspf\"%>");
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>");
    String _description = category.getDescription();
    _builder.append(_description, "\t");
    _builder.append(" anzeigen</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"form-horizontal\">");
    _builder.newLine();
    {
      EList<TicketField> _ticketFields = category.getTicketFields();
      for(final TicketField field : _ticketFields) {
        _builder.append("\t   ");
        _builder.append("<div class=\"form-group\">");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("<label for=\"title\" class=\"control-label col-sm-2\">");
        Field _field = field.getField();
        String _label = _field.getLabel();
        _builder.append(_label, "\t       ");
        _builder.append(":</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("<div class=\"col-sm-6\">");
        _builder.newLine();
        {
          Field _field_1 = field.getField();
          FieldType _fieldType = _field_1.getFieldType();
          boolean _equals = Objects.equal(_fieldType, FieldType.DATE);
          if (_equals) {
            _builder.append("\t   ");
            _builder.append("    \t");
            _builder.append("<span class=\"form-control\" disabled=\"true\"><fmt:formatDate pattern=\"dd.MM.yyyy\" value=\"${");
            String _name = category.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            _builder.append(_firstLower, "\t       \t");
            _builder.append(".get");
            Field _field_2 = field.getField();
            String _name_1 = _field_2.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
            _builder.append(_firstUpper, "\t       \t");
            _builder.append("().time}\"/></span>");
            _builder.newLineIfNotEmpty();
          } else {
            Field _field_3 = field.getField();
            FieldType _fieldType_1 = _field_3.getFieldType();
            boolean _equals_1 = Objects.equal(_fieldType_1, FieldType.DATE_TIME);
            if (_equals_1) {
              _builder.append("\t   ");
              _builder.append("    \t");
              _builder.append("<span class=\"form-control\" disabled=\"true\"><fmt:formatDate pattern=\"dd.MM.yyyy HH:mm\" value=\"${");
              String _name_2 = category.getName();
              String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
              _builder.append(_firstLower_1, "\t       \t");
              _builder.append(".get");
              Field _field_4 = field.getField();
              String _name_3 = _field_4.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
              _builder.append(_firstUpper_1, "\t       \t");
              _builder.append("().time}\"/></span>");
              _builder.newLineIfNotEmpty();
            } else {
              Field _field_5 = field.getField();
              FieldType _fieldType_2 = _field_5.getFieldType();
              boolean _equals_2 = Objects.equal(_fieldType_2, FieldType.BOOLEAN);
              if (_equals_2) {
                _builder.append("\t   ");
                _builder.append("    \t");
                _builder.append("<input type=\"checkbox\" <c:if test=\"${");
                String _name_4 = category.getName();
                String _firstLower_2 = StringExtensions.toFirstLower(_name_4);
                _builder.append(_firstLower_2, "\t       \t");
                _builder.append(".");
                Field _field_6 = field.getField();
                String _name_5 = _field_6.getName();
                String _firstLower_3 = StringExtensions.toFirstLower(_name_5);
                _builder.append(_firstLower_3, "\t       \t");
                _builder.append("}\">checked=\"checked\"</c:if> disabled=\"true\"/>");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t   ");
                _builder.append("    \t");
                _builder.append("<span class=\"form-control\" disabled=\"true\">${");
                String _name_6 = category.getName();
                String _firstLower_4 = StringExtensions.toFirstLower(_name_6);
                _builder.append(_firstLower_4, "\t       \t");
                _builder.append(".get");
                Field _field_7 = field.getField();
                String _name_7 = _field_7.getName();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_name_7);
                _builder.append(_firstUpper_2, "\t       \t");
                _builder.append("()}</span>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t   ");
        _builder.append("    ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    {
      Flow _flow = category.getFlow();
      boolean _notEquals = (!Objects.equal(_flow, null));
      if (_notEquals) {
        _builder.append("\t   ");
        _builder.append("<div class=\"form-group\"> ");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("<label for=\"title\" class=\"control-label col-sm-2\">Aktueller Status:</label>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("<div class=\"col-sm-6\">");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t\t");
        _builder.append("<span class=\"form-control\" disabled=\"true\">${");
        String _name_8 = category.getName();
        String _firstLower_5 = StringExtensions.toFirstLower(_name_8);
        _builder.append(_firstLower_5, "\t   \t\t");
        _builder.append(".currentFlowState.label}</span>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t   ");
        _builder.append("\t");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t   ");
    _builder.append("<div class=\"btn-group col-sm-offset-2\"> ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<c:url var=\"editUrl\" value=\"/");
    String _name_9 = category.getName();
    String _lowerCase = _name_9.toLowerCase();
    _builder.append(_lowerCase, "\t        ");
    _builder.append("/edit\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t        ");
    _builder.append("<c:param name=\"id\" value=\"${");
    String _name_10 = category.getName();
    String _firstLower_6 = StringExtensions.toFirstLower(_name_10);
    _builder.append(_firstLower_6, "\t\t        ");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</c:url>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<div class=\"btn\">");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("<a class=\"btn btn-default\" href=\'<c:out value=\"${editUrl}\"/>\'>Bearbeiten</a>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<c:url var=\"deleteUrl\" value=\"/");
    String _name_11 = category.getName();
    String _lowerCase_1 = _name_11.toLowerCase();
    _builder.append(_lowerCase_1, "\t        ");
    _builder.append("/delete\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<c:param name=\"id\" value=\"${");
    String _name_12 = category.getName();
    String _firstLower_7 = StringExtensions.toFirstLower(_name_12);
    _builder.append(_firstLower_7, "\t            ");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</c:url>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<form:form action=\"${deleteUrl}\" class=\"btn\">");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("<button type=\"submit\" class=\"btn btn-default\">Löschen</button>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</form:form>");
    _builder.newLine();
    {
      Flow _flow_1 = category.getFlow();
      boolean _notEquals_1 = (!Objects.equal(_flow_1, null));
      if (_notEquals_1) {
        _builder.append("\t        ");
        _builder.append("<c:url var=\"prevStateUrl\" value=\"/");
        String _name_13 = category.getName();
        String _lowerCase_2 = _name_13.toLowerCase();
        _builder.append(_lowerCase_2, "\t        ");
        _builder.append("/prevState\" >");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("    ");
        _builder.append("<c:param name=\"id\" value=\"${");
        String _name_14 = category.getName();
        String _firstLower_8 = StringExtensions.toFirstLower(_name_14);
        _builder.append(_firstLower_8, "\t            ");
        _builder.append(".id}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("</c:url>");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("<form:form action=\"${prevStateUrl}\" class=\"btn\">");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("    ");
        _builder.append("<button type=\"submit\" class=\"btn btn-default\"<c:if test=\"${");
        String _name_15 = category.getName();
        String _firstLower_9 = StringExtensions.toFirstLower(_name_15);
        _builder.append(_firstLower_9, "\t            ");
        _builder.append(".currentFlowState.isFirst()}\" >disabled=\"true\"</c:if>>Vorheriger Status</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("</form:form>");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("<c:url var=\"nextStateUrl\" value=\"/");
        String _name_16 = category.getName();
        String _lowerCase_3 = _name_16.toLowerCase();
        _builder.append(_lowerCase_3, "\t        ");
        _builder.append("/nextState\" >");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("    ");
        _builder.append("<c:param name=\"id\" value=\"${");
        String _name_17 = category.getName();
        String _firstLower_10 = StringExtensions.toFirstLower(_name_17);
        _builder.append(_firstLower_10, "\t            ");
        _builder.append(".id}\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("</c:url>");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("<form:form action=\"${nextStateUrl}\" class=\"btn\">");
        _builder.newLine();
        _builder.append("\t        ");
        _builder.append("    ");
        _builder.append("<button type=\"submit\" class=\"btn btn-default\" <c:if test=\"${");
        String _name_18 = category.getName();
        String _firstLower_11 = StringExtensions.toFirstLower(_name_18);
        _builder.append(_firstLower_11, "\t            ");
        _builder.append(".currentFlowState.isLast()}\" >disabled=\"true\"</c:if>>Nächster Status</button>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t        ");
        _builder.append("</form:form>");
        _builder.newLine();
      }
    }
    _builder.append("\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toListJsp(final TicketCategory category) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"fmt\" uri=\"http://java.sun.com/jsp/jstl/fmt\" %>");
    _builder.newLine();
    _builder.append("<%@ taglib prefix=\"form\" uri=\"http://www.springframework.org/tags/form\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<%@include file=\"../navigation.jspf\"%>");
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>");
    String _description = category.getDescription();
    _builder.append(_description, "\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<table class=\"table table-striped\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<th>ID</th>");
    _builder.newLine();
    {
      Flow _flow = category.getFlow();
      boolean _notEquals = (!Objects.equal(_flow, null));
      if (_notEquals) {
        _builder.append("\t\t\t\t");
        _builder.append("<th>Status</th>");
        _builder.newLine();
      }
    }
    {
      EList<TicketField> _ticketFields = category.getTicketFields();
      for(final TicketField field : _ticketFields) {
        {
          boolean _isNotOnList = field.isNotOnList();
          boolean _not = (!_isNotOnList);
          if (_not) {
            _builder.append("\t\t\t\t");
            _builder.append("<th>");
            Field _field = field.getField();
            String _label = _field.getLabel();
            _builder.append(_label, "\t\t\t\t");
            _builder.append("</th>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t\t");
    _builder.append("<th />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tbody>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<c:forEach var=\"");
    String _name = category.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "\t\t\t");
    _builder.append("\" items=\"${");
    String _name_1 = category.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower_1, "\t\t\t");
    _builder.append("s}\" varStatus=\"status\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t    ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("<c:url var=\"showUrl\" value=\"/");
    String _name_2 = category.getName();
    String _lowerCase = _name_2.toLowerCase();
    _builder.append(_lowerCase, "\t\t\t        ");
    _builder.append("/show\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t            ");
    _builder.append("<c:param name=\"id\" value=\"${");
    String _name_3 = category.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "\t\t\t            ");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t        ");
    _builder.append("</c:url>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<td>${");
    String _name_4 = category.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_3, "\t\t\t\t\t");
    _builder.append(".id}</td>");
    _builder.newLineIfNotEmpty();
    {
      Flow _flow_1 = category.getFlow();
      boolean _notEquals_1 = (!Objects.equal(_flow_1, null));
      if (_notEquals_1) {
        _builder.append("\t\t\t\t\t");
        _builder.append("<td>${");
        String _name_5 = category.getName();
        String _lowerCase_1 = _name_5.toLowerCase();
        _builder.append(_lowerCase_1, "\t\t\t\t\t");
        _builder.append(".currentFlowState.label}</td>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<TicketField> _ticketFields_1 = category.getTicketFields();
      for(final TicketField field_1 : _ticketFields_1) {
        {
          boolean _isNotOnList_1 = field_1.isNotOnList();
          boolean _not_1 = (!_isNotOnList_1);
          if (_not_1) {
            {
              Field _field_1 = field_1.getField();
              FieldType _fieldType = _field_1.getFieldType();
              boolean _equals = Objects.equal(_fieldType, FieldType.DATE);
              if (_equals) {
                _builder.append("\t\t\t\t\t");
                _builder.append("<td><fmt:formatDate pattern=\"dd.MM.yyyy\" value=\"${");
                String _name_6 = category.getName();
                String _firstLower_4 = StringExtensions.toFirstLower(_name_6);
                _builder.append(_firstLower_4, "\t\t\t\t\t");
                _builder.append(".get");
                Field _field_2 = field_1.getField();
                String _name_7 = _field_2.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_7);
                _builder.append(_firstUpper, "\t\t\t\t\t");
                _builder.append("().time}\"/></td>");
                _builder.newLineIfNotEmpty();
              } else {
                Field _field_3 = field_1.getField();
                FieldType _fieldType_1 = _field_3.getFieldType();
                boolean _equals_1 = Objects.equal(_fieldType_1, FieldType.DATE_TIME);
                if (_equals_1) {
                  _builder.append("\t\t\t\t\t");
                  _builder.append("<td><fmt:formatDate pattern=\"dd.MM.yyyy HH:mm\" value=\"${");
                  String _name_8 = category.getName();
                  String _firstLower_5 = StringExtensions.toFirstLower(_name_8);
                  _builder.append(_firstLower_5, "\t\t\t\t\t");
                  _builder.append(".get");
                  Field _field_4 = field_1.getField();
                  String _name_9 = _field_4.getName();
                  String _firstUpper_1 = StringExtensions.toFirstUpper(_name_9);
                  _builder.append(_firstUpper_1, "\t\t\t\t\t");
                  _builder.append("().time}\"/></td>");
                  _builder.newLineIfNotEmpty();
                } else {
                  Field _field_5 = field_1.getField();
                  FieldType _fieldType_2 = _field_5.getFieldType();
                  boolean _equals_2 = Objects.equal(_fieldType_2, FieldType.BOOLEAN);
                  if (_equals_2) {
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<td><input type=\"checkbox\" <c:if test=\"${");
                    String _name_10 = category.getName();
                    String _firstLower_6 = StringExtensions.toFirstLower(_name_10);
                    _builder.append(_firstLower_6, "\t\t\t\t\t");
                    _builder.append(".");
                    Field _field_6 = field_1.getField();
                    String _name_11 = _field_6.getName();
                    String _firstLower_7 = StringExtensions.toFirstLower(_name_11);
                    _builder.append(_firstLower_7, "\t\t\t\t\t");
                    _builder.append("}\">checked=\"checked\"</c:if> disabled=\"true\"/></td>");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t\t\t\t");
                    _builder.append("<td>${");
                    String _name_12 = category.getName();
                    String _firstLower_8 = StringExtensions.toFirstLower(_name_12);
                    _builder.append(_firstLower_8, "\t\t\t\t\t");
                    _builder.append(".get");
                    Field _field_7 = field_1.getField();
                    String _name_13 = _field_7.getName();
                    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_13);
                    _builder.append(_firstUpper_2, "\t\t\t\t\t");
                    _builder.append("()}</td>");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("<td>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t    ");
    _builder.append("<a class=\"btn btn-default btn-xs\" href=\'<c:out value=\"${showUrl}\"/>\'>Anzeigen</a>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</c:forEach>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<c:url var=\"createUrl\" value=\"/");
    String _name_14 = category.getName();
    String _lowerCase_2 = _name_14.toLowerCase();
    _builder.append(_lowerCase_2, "\t");
    _builder.append("/create\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<a class=\"btn btn-default\" href=\'<c:out value=\"${createUrl}\"/>\'>Anlegen</a>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toNavigation(final Collection<TicketCategory> categories) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"<c:url value=\"/js/jquery.datetimepicker.js\"/>\"></script>");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"<c:url value=\"/js/jquery.datetimepicker.css\"/>\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(function() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$( \".datepicker\" ).datetimepicker({");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("timepicker:false,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("format:\'d.m.Y\'");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$( \".datetimepicker\" ).datetimepicker({");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("format:\'d.m.Y H:i\'");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<nav class=\"navbar navbar-default\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"container-fluid\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"navbar-header\">");
    _builder.newLine();
    _builder.append("     \t    ");
    _builder.append("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">");
    _builder.newLine();
    _builder.append("     \t        ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("     \t        ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("     \t        ");
    _builder.append("<span class=\"icon-bar\"></span>                        ");
    _builder.newLine();
    _builder.append("     \t    ");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("     \t    ");
    _builder.append("<c:url var=\"index\" value=\"/index\" />");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("<a class=\"navbar-brand\" href=\"<c:out value=\"${index}\"/>\">TicketSystem</a>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"collapse navbar-collapse\" id=\"myNavbar\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<ul class=\"nav navbar-nav\">");
    _builder.newLine();
    {
      for(final TicketCategory category : categories) {
        _builder.append("<c:url var=\"");
        String _name = category.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "");
        _builder.append("Url\" value=\"/");
        String _name_1 = category.getName();
        String _lowerCase = _name_1.toLowerCase();
        _builder.append(_lowerCase, "");
        _builder.append("/list\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("<li><a href=\'<c:out value=\"${");
        String _name_2 = category.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower_1, "");
        _builder.append("Url}\"/>\'>");
        String _description = category.getDescription();
        _builder.append(_description, "");
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</nav>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toIndex(final Collection<TicketCategory> categories) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<%@include file=\"navigation.jspf\"%>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h1>Übersicht</h1>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table class=\"table table-striped\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<th>Kategorie</th>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<th>Anzahl</th>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      for(final TicketCategory category : categories) {
        _builder.append("\t\t\t");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<c:url var=\"");
        String _name = category.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "\t\t\t\t");
        _builder.append("Url\" value=\"/");
        String _name_1 = category.getName();
        String _lowerCase = _name_1.toLowerCase();
        _builder.append(_lowerCase, "\t\t\t\t");
        _builder.append("/list\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<td><a href=\'<c:out value=\"${");
        String _name_2 = category.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower_1, "\t\t\t\t");
        _builder.append("Url}\"/>\'>");
        String _description = category.getDescription();
        _builder.append(_description, "\t\t\t\t");
        _builder.append("</a></td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("<td>${");
        String _name_3 = category.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
        _builder.append(_firstLower_2, "\t\t\t\t");
        _builder.append("Count}</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
}

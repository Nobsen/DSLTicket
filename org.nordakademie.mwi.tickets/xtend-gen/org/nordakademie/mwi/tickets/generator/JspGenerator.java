package org.nordakademie.mwi.tickets.generator;

import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;

@SuppressWarnings("all")
public class JspGenerator {
  public static CharSequence toCreateJsp(final TicketCategory category) {
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
    _builder.append(" create</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<c:url var=\"url\" value=\"/");
    String _name = category.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "\t");
    _builder.append("/create\" /> ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<form:form action=\"${url}\" commandName=\"");
    String _name_1 = category.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower, "\t");
    _builder.append("\" class=\"form-horizontal\" role=\"form\">");
    _builder.newLineIfNotEmpty();
    {
      EList<TicketField> _ticketFields = category.getTicketFields();
      for(final TicketField field : _ticketFields) {
        _builder.append("\t   ");
        _builder.append("<form:errors path=\"");
        Field _field = field.getField();
        String _name_2 = _field.getName();
        _builder.append(_name_2, "\t   ");
        _builder.append("\" class=\"col-sm-offset-2\" element=\"div\"></form:errors>");
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
        _builder.append("\t   ");
        _builder.append("        ");
        _builder.append("<form:input class=\"form-control\" path=\"");
        Field _field_2 = field.getField();
        String _name_3 = _field_2.getName();
        _builder.append(_name_3, "\t           ");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
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
        _builder.append("\t   ");
        _builder.append("<div class=\"col-sm-6\">");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t \t");
        _builder.append("<form:select class=\"form-control\" path=\"currentFlowState\" items=\"${states}\" itemLabel=\"label\" />");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("\t ");
        _builder.append("</div");
        _builder.newLine();
        _builder.append("\t   ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t   ");
    _builder.append("<div class=\"form-group\"> ");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("<div class=\"col-sm-offset-2 col-sm-10\">");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("<button type=\"submit\" class=\"btn btn-default\">Submit</button>");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t   ");
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
    _builder.append(" show</h1>");
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
        _builder.append("\t   ");
        _builder.append("        ");
        _builder.append("<span class=\"form-control\" disabled=\"true\">${");
        String _name = category.getName();
        _builder.append(_name, "\t           ");
        _builder.append(".");
        Field _field_1 = field.getField();
        String _name_1 = _field_1.getName();
        _builder.append(_name_1, "\t           ");
        _builder.append("}</span>");
        _builder.newLineIfNotEmpty();
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
        String _name_2 = category.getName();
        _builder.append(_name_2, "\t   \t\t");
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
    _builder.append("<div class=\"form-group\"> ");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("<div class=\"col-sm-offset-2 col-sm-10\">");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("<button type=\"submit\" class=\"btn btn-default\">Edit</button>");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("<c:url var=\"deleteUrl\" value=\"/");
    String _name_3 = category.getName();
    _builder.append(_name_3, "\t       ");
    _builder.append("/delete\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t           ");
    _builder.append("<c:param name=\"id\" value=\"${");
    String _name_4 = category.getName();
    _builder.append(_name_4, "\t           ");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t       ");
    _builder.append("</c:url>");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("<form:form action=\"${deleteUrl}\" class=\"col-sm-offset-2 col-sm-10\">");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("<button type=\"submit\" class=\"btn btn-default\">Delete</button>");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("</form:form>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t   ");
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
    _builder.append("\t");
    _builder.append("<c:forEach var=\"");
    String _name = category.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "\t");
    _builder.append("\" items=\"${");
    String _name_1 = category.getName();
    String _lowerCase_1 = _name_1.toLowerCase();
    _builder.append(_lowerCase_1, "\t");
    _builder.append("s}\" varStatus=\"status\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<c:url var=\"showUrl\" value=\"/");
    String _name_2 = category.getName();
    String _lowerCase_2 = _name_2.toLowerCase();
    _builder.append(_lowerCase_2, "\t        ");
    _builder.append("/show\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<c:param name=\"id\" value=\"${");
    String _name_3 = category.getName();
    String _lowerCase_3 = _name_3.toLowerCase();
    _builder.append(_lowerCase_3, "\t            ");
    _builder.append(".id}\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</c:url>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<td>${");
    String _name_4 = category.getName();
    String _lowerCase_4 = _name_4.toLowerCase();
    _builder.append(_lowerCase_4, "\t\t\t");
    _builder.append(".id}</td>");
    _builder.newLineIfNotEmpty();
    {
      Flow _flow_1 = category.getFlow();
      boolean _notEquals_1 = (!Objects.equal(_flow_1, null));
      if (_notEquals_1) {
        _builder.append("\t\t\t");
        _builder.append("<td>${");
        String _name_5 = category.getName();
        String _lowerCase_5 = _name_5.toLowerCase();
        _builder.append(_lowerCase_5, "\t\t\t");
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
            _builder.append("\t\t\t");
            _builder.append("<td>${");
            String _name_6 = category.getName();
            String _lowerCase_6 = _name_6.toLowerCase();
            _builder.append(_lowerCase_6, "\t\t\t");
            _builder.append(".");
            Field _field_1 = field_1.getField();
            String _name_7 = _field_1.getName();
            _builder.append(_name_7, "\t\t\t");
            _builder.append("}</td>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.append("<td>");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("<a href=\'<c:out value=\"${showUrl}\"/>\'>Show</a>");
    _builder.newLine();
    _builder.append("\t\t\t   ");
    _builder.append("</td>");
    _builder.newLine();
    _builder.append("\t\t\t  ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</c:forEach>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<c:url var=\"createUrl\" value=\"/");
    String _name_8 = category.getName();
    String _lowerCase_7 = _name_8.toLowerCase();
    _builder.append(_lowerCase_7, "\t");
    _builder.append("/create\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<a href=\'<c:out value=\"${createUrl}\"/>\'>Create</a>");
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
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
    _builder.newLine();
    _builder.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("<nav class=\"navbar navbar-default\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<div class=\"container-fluid\">");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<div class=\"navbar-header\">");
    _builder.newLine();
    _builder.append("     \t ");
    _builder.append("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">");
    _builder.newLine();
    _builder.append("     \t   ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("     \t   ");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("     \t   ");
    _builder.append("<span class=\"icon-bar\"></span>                        ");
    _builder.newLine();
    _builder.append("     \t ");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("     \t ");
    _builder.append("<a class=\"navbar-brand\" href=\"#\">TicketSystem</a>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("<div class=\"collapse navbar-collapse\" id=\"myNavbar\">");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("<ul class=\"nav navbar-nav\">");
    _builder.newLine();
    {
      for(final TicketCategory category : categories) {
        _builder.append("      ");
        _builder.append("<c:url var=\"");
        String _name = category.getName();
        String _lowerCase = _name.toLowerCase();
        _builder.append(_lowerCase, "      ");
        _builder.append("Url\" value=\"/");
        String _name_1 = category.getName();
        String _lowerCase_1 = _name_1.toLowerCase();
        _builder.append(_lowerCase_1, "      ");
        _builder.append("/list\" />");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
        _builder.append("    ");
        _builder.append("<li><a href=\'<c:out value=\"${");
        String _name_2 = category.getName();
        String _lowerCase_2 = _name_2.toLowerCase();
        _builder.append(_lowerCase_2, "          ");
        _builder.append("Url}\"/>\'>");
        String _description = category.getDescription();
        _builder.append(_description, "          ");
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("      ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</nav>");
    _builder.newLine();
    return _builder;
  }
}

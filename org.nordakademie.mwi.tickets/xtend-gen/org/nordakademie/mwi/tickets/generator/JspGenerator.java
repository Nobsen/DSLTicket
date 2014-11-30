package org.nordakademie.mwi.tickets.generator;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.nordakademie.mwi.tickets.tickets.Field;
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
    _builder.newLine();
    _builder.append("<h1>");
    String _description = category.getDescription();
    _builder.append(_description, "");
    _builder.append(" create</h1>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<c:url var=\"url\" value=\"/");
    String _name = category.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("/create\" /> ");
    _builder.newLineIfNotEmpty();
    _builder.append("<form:form action=\"${url}\" commandName=\"");
    String _name_1 = category.getName();
    String _lowerCase_1 = _name_1.toLowerCase();
    _builder.append(_lowerCase_1, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<form:hidden path=\"id\" />");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<fieldset>");
    _builder.newLine();
    {
      EList<TicketField> _ticketFields = category.getTicketFields();
      for(final TicketField field : _ticketFields) {
        _builder.append("<div class=\"form-row\">");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("<label for=\"title\">");
        Field _field = field.getField();
        String _label = _field.getLabel();
        _builder.append(_label, "          ");
        _builder.append(":</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
        _builder.append("<span class=\"input\"><form:input path=\"");
        Field _field_1 = field.getField();
        String _name_2 = _field_1.getName();
        _builder.append(_name_2, "          ");
        _builder.append("\" /></span>");
        _builder.newLineIfNotEmpty();
        _builder.append("</div>   ");
        _builder.newLine();
      }
    }
    _builder.append("\t    ");
    _builder.append("<div class=\"form-buttons\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"button\"><input name=\"submit\" type=\"submit\" value=\"Save\" /></div>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("</fieldset>");
    _builder.newLine();
    _builder.append("</form:form>");
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

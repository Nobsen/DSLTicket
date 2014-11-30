package org.nordakademie.mwi.tickets.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;

@SuppressWarnings("all")
public class DaoGenerator {
  public static CharSequence toDao(final TicketCategory category) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.nordakademie.mwi.ticketSystem.dao;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.nordakademie.mwi.ticketSystem.domain.");
    String _name = category.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _name_1 = category.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("Dao extends GenericDao<");
    String _name_2 = category.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "");
    _builder.append(", Long> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence toDaoImpl(final TicketCategory category) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.nordakademie.mwi.ticketSystem.daoimpl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.nordakademie.mwi.ticketSystem.dao.AbstractDao;");
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
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Repository(\"");
    String _name_2 = category.getName();
    String _firstLower = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower, "");
    _builder.append("Dao\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name_3 = category.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_2, "");
    _builder.append("DaoImpl extends AbstractDao<");
    String _name_4 = category.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_3, "");
    _builder.append(", Long> implements ");
    String _name_5 = category.getName();
    String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
    _builder.append(_firstUpper_4, "");
    _builder.append("Dao {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

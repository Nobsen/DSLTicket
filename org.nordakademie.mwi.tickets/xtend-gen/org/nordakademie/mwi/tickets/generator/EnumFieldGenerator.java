package org.nordakademie.mwi.tickets.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Field;

@SuppressWarnings("all")
public class EnumFieldGenerator {
  public static CharSequence toEnum(final Field field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.nordakademie.mwi.ticketSystem.domain;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public enum ");
    String _name = field.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Enum {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      org.nordakademie.mwi.tickets.tickets.Enum _fieldEnum = field.getFieldEnum();
      EList<String> _option = _fieldEnum.getOption();
      boolean _hasElements = false;
      for(final String option : _option) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        String _replaceAll = option.replaceAll("[^a-zA-Z]", "");
        String _upperCase = _replaceAll.toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append("(\"");
        _builder.append(option, "\t");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append(";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String label;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _name_1 = field.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("Enum(String label) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.label = label;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getLabel() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.label;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

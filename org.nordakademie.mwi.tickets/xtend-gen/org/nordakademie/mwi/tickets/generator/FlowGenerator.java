package org.nordakademie.mwi.tickets.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.Status;

@SuppressWarnings("all")
public class FlowGenerator {
  public static CharSequence toFlowEnum(final Flow flow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.nordakademie.mwi.ticketSystem.flows;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public enum ");
    String _name = flow.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Status> _states = flow.getStates();
      boolean _hasElements = false;
      for(final Status status : _states) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        String _name_1 = status.getName();
        String _upperCase = _name_1.toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append("(\"");
        String _description = status.getDescription();
        _builder.append(_description, "\t");
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
    String _name_2 = flow.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(String label) {");
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

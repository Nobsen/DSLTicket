package org.nordakademie.mwi.tickets.generator;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.tickets.Field;
import org.nordakademie.mwi.tickets.tickets.FieldType;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketField;

@SuppressWarnings("all")
public class DomainGenerator {
  public static CharSequence toDomainObject(final TicketCategory category) {
    CharSequence _xblockexpression = null;
    {
      HashSet<String> imports = new HashSet<String>();
      EList<TicketField> _ticketFields = category.getTicketFields();
      for (final TicketField field : _ticketFields) {
        Field _field = field.getField();
        FieldType _fieldType = _field.getFieldType();
        if (_fieldType != null) {
          switch (_fieldType) {
            case DATE:
              imports.add("java.util.Calendar");
              imports.add("org.springframework.format.annotation.DateTimeFormat");
              break;
            case DATE_TIME:
              imports.add("java.util.Calendar");
              imports.add("org.springframework.format.annotation.DateTimeFormat");
              break;
            default:
              break;
          }
        } else {
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package org.nordakademie.mwi.ticketSystem.domain;");
      _builder.newLine();
      _builder.newLine();
      {
        for(final String toImport : imports) {
          _builder.append("import ");
          String _string = toImport.toString();
          _builder.append(_string, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        Flow _flow = category.getFlow();
        boolean _notEquals = (!Objects.equal(_flow, null));
        if (_notEquals) {
          _builder.append("import org.nordakademie.mwi.ticketSystem.flows.");
          Flow _flow_1 = category.getFlow();
          String _name = _flow_1.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          _builder.append(_firstUpper, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("import org.hibernate.validator.constraints.NotBlank;");
      _builder.newLine();
      _builder.append("import javax.validation.constraints.NotNull;");
      _builder.newLine();
      _builder.append("import javax.persistence.Entity;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@Entity");
      _builder.newLine();
      _builder.append("public class ");
      String _name_1 = category.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      _builder.append(_firstUpper_1, "");
      _builder.append(" extends AbstractDomainObject {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        Flow _flow_2 = category.getFlow();
        boolean _notEquals_1 = (!Objects.equal(_flow_2, null));
        if (_notEquals_1) {
          _builder.append("\t");
          Flow _flow_3 = category.getFlow();
          String _name_2 = _flow_3.getName();
          String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
          _builder.append(_firstUpper_2, "\t");
          _builder.append(" currentFlowState;");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<TicketField> _ticketFields_1 = category.getTicketFields();
        for(final TicketField field_1 : _ticketFields_1) {
          _builder.append("\t");
          _builder.newLine();
          {
            Field _field_1 = field_1.getField();
            FieldType _fieldType_1 = _field_1.getFieldType();
            boolean _equals = Objects.equal(_fieldType_1, FieldType.DATE);
            if (_equals) {
              _builder.append("\t");
              _builder.append("@DateTimeFormat(pattern = \"dd.MM.yyyy\")");
              _builder.newLine();
            } else {
              Field _field_2 = field_1.getField();
              FieldType _fieldType_2 = _field_2.getFieldType();
              boolean _equals_1 = Objects.equal(_fieldType_2, FieldType.DATE_TIME);
              if (_equals_1) {
                _builder.append("\t");
                _builder.append("@DateTimeFormat(pattern = \"dd.MM.yyyy HH:mm\")");
                _builder.newLine();
              }
            }
          }
          {
            Field _field_3 = field_1.getField();
            FieldType _fieldType_3 = _field_3.getFieldType();
            boolean _equals_2 = Objects.equal(_fieldType_3, FieldType.STRING);
            if (_equals_2) {
              {
                boolean _isMandatory = field_1.isMandatory();
                if (_isMandatory) {
                  _builder.append("\t");
                  _builder.append("@NotBlank");
                  _builder.newLine();
                }
              }
            } else {
              {
                boolean _isMandatory_1 = field_1.isMandatory();
                if (_isMandatory_1) {
                  _builder.append("\t");
                  _builder.append("@NotNull");
                  _builder.newLine();
                }
              }
            }
          }
          _builder.append("\t");
          _builder.append("private ");
          Field _field_4 = field_1.getField();
          String _javaTypeForField = DomainGenerator.getJavaTypeForField(_field_4);
          _builder.append(_javaTypeForField, "\t");
          _builder.append(" ");
          Field _field_5 = field_1.getField();
          String _name_3 = _field_5.getName();
          String _firstLower = StringExtensions.toFirstLower(_name_3);
          _builder.append(_firstLower, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public ");
      String _name_4 = category.getName();
      String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
      _builder.append(_firstUpper_3, "    ");
      _builder.append(" () {}");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      {
        EList<TicketField> _ticketFields_2 = category.getTicketFields();
        for(final TicketField field_2 : _ticketFields_2) {
          _builder.append("    ");
          _builder.append("public ");
          Field _field_6 = field_2.getField();
          String _javaTypeForField_1 = DomainGenerator.getJavaTypeForField(_field_6);
          _builder.append(_javaTypeForField_1, "    ");
          _builder.append(" get");
          Field _field_7 = field_2.getField();
          String _name_5 = _field_7.getName();
          String _firstUpper_4 = StringExtensions.toFirstUpper(_name_5);
          _builder.append(_firstUpper_4, "    ");
          _builder.append("() {");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("\t");
          _builder.append("return ");
          Field _field_8 = field_2.getField();
          String _name_6 = _field_8.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_6);
          _builder.append(_firstLower_1, "    \t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("public void set");
          Field _field_9 = field_2.getField();
          String _name_7 = _field_9.getName();
          String _firstUpper_5 = StringExtensions.toFirstUpper(_name_7);
          _builder.append(_firstUpper_5, "    ");
          _builder.append("(");
          Field _field_10 = field_2.getField();
          String _javaTypeForField_2 = DomainGenerator.getJavaTypeForField(_field_10);
          _builder.append(_javaTypeForField_2, "    ");
          _builder.append(" ");
          Field _field_11 = field_2.getField();
          String _name_8 = _field_11.getName();
          String _firstLower_2 = StringExtensions.toFirstLower(_name_8);
          _builder.append(_firstLower_2, "    ");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append(" \t");
          _builder.append("this.");
          Field _field_12 = field_2.getField();
          String _name_9 = _field_12.getName();
          String _firstLower_3 = StringExtensions.toFirstLower(_name_9);
          _builder.append(_firstLower_3, "     \t");
          _builder.append(" = ");
          Field _field_13 = field_2.getField();
          String _name_10 = _field_13.getName();
          String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
          _builder.append(_firstLower_4, "     \t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.newLine();
      {
        Flow _flow_4 = category.getFlow();
        boolean _notEquals_2 = (!Objects.equal(_flow_4, null));
        if (_notEquals_2) {
          _builder.append("\t");
          _builder.append("public ");
          Flow _flow_5 = category.getFlow();
          String _name_11 = _flow_5.getName();
          String _firstUpper_6 = StringExtensions.toFirstUpper(_name_11);
          _builder.append(_firstUpper_6, "\t");
          _builder.append(" getCurrentFlowState() {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("  \t\t");
          _builder.append("return currentFlowState;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void setCurrentFlowState(");
          Flow _flow_6 = category.getFlow();
          String _name_12 = _flow_6.getName();
          String _firstUpper_7 = StringExtensions.toFirstUpper(_name_12);
          _builder.append(_firstUpper_7, "\t");
          _builder.append(" currentFlowState) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append(" \t");
          _builder.append("this.currentFlowState = currentFlowState;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public boolean equals(Object obj) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (this == obj)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return true;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (obj == null)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return false;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (getClass() != obj.getClass())");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return false;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      String _name_13 = category.getName();
      String _firstUpper_8 = StringExtensions.toFirstUpper(_name_13);
      _builder.append(_firstUpper_8, "\t\t");
      _builder.append(" other = (");
      String _name_14 = category.getName();
      String _firstUpper_9 = StringExtensions.toFirstUpper(_name_14);
      _builder.append(_firstUpper_9, "\t\t");
      _builder.append(") obj;");
      _builder.newLineIfNotEmpty();
      {
        EList<TicketField> _ticketFields_3 = category.getTicketFields();
        for(final TicketField field_3 : _ticketFields_3) {
          _builder.append("\t\t");
          _builder.append("if (");
          Field _field_14 = field_3.getField();
          String _name_15 = _field_14.getName();
          String _firstLower_5 = StringExtensions.toFirstLower(_name_15);
          _builder.append(_firstLower_5, "\t\t");
          _builder.append(" == null) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("if (other.");
          Field _field_15 = field_3.getField();
          String _name_16 = _field_15.getName();
          String _firstLower_6 = StringExtensions.toFirstLower(_name_16);
          _builder.append(_firstLower_6, "\t\t");
          _builder.append(" != null)");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("return false;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("} else if (!");
          Field _field_16 = field_3.getField();
          String _name_17 = _field_16.getName();
          String _firstLower_7 = StringExtensions.toFirstLower(_name_17);
          _builder.append(_firstLower_7, "\t\t");
          _builder.append(".equals(other.");
          Field _field_17 = field_3.getField();
          String _name_18 = _field_17.getName();
          String _firstLower_8 = StringExtensions.toFirstLower(_name_18);
          _builder.append(_firstLower_8, "\t\t");
          _builder.append("))");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("return false;");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public static String getJavaTypeForField(final Field field) {
    String _xifexpression = null;
    org.nordakademie.mwi.tickets.tickets.Enum _fieldEnum = field.getFieldEnum();
    boolean _notEquals = (!Objects.equal(_fieldEnum, null));
    if (_notEquals) {
      String _name = field.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _xifexpression = (_firstUpper + "Enum");
    } else {
      String _switchResult = null;
      FieldType _fieldType = field.getFieldType();
      if (_fieldType != null) {
        switch (_fieldType) {
          case DATE:
            _switchResult = "Calendar";
            break;
          case DATE_TIME:
            _switchResult = "Calendar";
            break;
          case DECIMAL:
            _switchResult = "Double";
            break;
          case INT:
            _switchResult = "Integer";
            break;
          case BOOLEAN:
            _switchResult = "Boolean";
            break;
          default:
            _switchResult = "String";
            break;
        }
      } else {
        _switchResult = "String";
      }
      _xifexpression = _switchResult;
    }
    return _xifexpression;
  }
}

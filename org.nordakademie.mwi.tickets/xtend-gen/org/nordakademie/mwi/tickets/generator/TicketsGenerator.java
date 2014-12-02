/**
 * generated by Xtext
 */
package org.nordakademie.mwi.tickets.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.nordakademie.mwi.tickets.TicketsOutputConfigurationProvider;
import org.nordakademie.mwi.tickets.generator.ControllerGenerator;
import org.nordakademie.mwi.tickets.generator.DaoGenerator;
import org.nordakademie.mwi.tickets.generator.DomainGenerator;
import org.nordakademie.mwi.tickets.generator.FlowGenerator;
import org.nordakademie.mwi.tickets.generator.JspGenerator;
import org.nordakademie.mwi.tickets.tickets.Flow;
import org.nordakademie.mwi.tickets.tickets.TicketCategory;
import org.nordakademie.mwi.tickets.tickets.TicketSystem;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class TicketsGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    Iterable<TicketSystem> _filter = Iterables.<TicketSystem>filter(_contents, TicketSystem.class);
    TicketSystem _head = IterableExtensions.<TicketSystem>head(_filter);
    EList<TicketCategory> categories = _head.getCategories();
    for (final TicketCategory category : categories) {
      {
        String _name = category.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _plus = ("org/nordakademie/mwi/ticketSystem/domain/" + _firstUpper);
        String _plus_1 = (_plus + ".java");
        CharSequence _domainObject = DomainGenerator.toDomainObject(category);
        fsa.generateFile(_plus_1, _domainObject);
        String _name_1 = category.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String _plus_2 = ("org/nordakademie/mwi/ticketSystem/dao/" + _firstUpper_1);
        String _plus_3 = (_plus_2 + "Dao.java");
        CharSequence _dao = DaoGenerator.toDao(category);
        fsa.generateFile(_plus_3, _dao);
        String _name_2 = category.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        String _plus_4 = ("org/nordakademie/mwi/ticketSystem/daoimpl/" + _firstUpper_2);
        String _plus_5 = (_plus_4 + "DaoImpl.java");
        CharSequence _daoImpl = DaoGenerator.toDaoImpl(category);
        fsa.generateFile(_plus_5, _daoImpl);
        String _name_3 = category.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
        String _plus_6 = ("org/nordakademie/mwi/ticketSystem/controller/" + _firstUpper_3);
        String _plus_7 = (_plus_6 + "Controller.java");
        CharSequence _controller = ControllerGenerator.toController(category);
        fsa.generateFile(_plus_7, _controller);
        String _name_4 = category.getName();
        String _lowerCase = _name_4.toLowerCase();
        String _plus_8 = (_lowerCase + "/create.jsp");
        CharSequence _createJsp = JspGenerator.toCreateJsp(category);
        fsa.generateFile(_plus_8, TicketsOutputConfigurationProvider.JSP_OUTPUT, _createJsp);
        String _name_5 = category.getName();
        String _lowerCase_1 = _name_5.toLowerCase();
        String _plus_9 = (_lowerCase_1 + "/show.jsp");
        CharSequence _showJsp = JspGenerator.toShowJsp(category);
        fsa.generateFile(_plus_9, TicketsOutputConfigurationProvider.JSP_OUTPUT, _showJsp);
        String _name_6 = category.getName();
        String _lowerCase_2 = _name_6.toLowerCase();
        String _plus_10 = (_lowerCase_2 + "/list.jsp");
        CharSequence _listJsp = JspGenerator.toListJsp(category);
        fsa.generateFile(_plus_10, TicketsOutputConfigurationProvider.JSP_OUTPUT, _listJsp);
      }
    }
    EList<EObject> _contents_1 = resource.getContents();
    Iterable<TicketSystem> _filter_1 = Iterables.<TicketSystem>filter(_contents_1, TicketSystem.class);
    TicketSystem _head_1 = IterableExtensions.<TicketSystem>head(_filter_1);
    EList<Flow> flows = _head_1.getFlows();
    for (final Flow flow : flows) {
      String _name = flow.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("org/nordakademie/mwi/ticketSystem/flows/" + _firstUpper);
      String _plus_1 = (_plus + ".java");
      CharSequence _flowEnum = FlowGenerator.toFlowEnum(flow);
      fsa.generateFile(_plus_1, _flowEnum);
    }
    CharSequence _navigation = JspGenerator.toNavigation(categories);
    fsa.generateFile("/navigation.jspf", TicketsOutputConfigurationProvider.JSP_OUTPUT, _navigation);
  }
}

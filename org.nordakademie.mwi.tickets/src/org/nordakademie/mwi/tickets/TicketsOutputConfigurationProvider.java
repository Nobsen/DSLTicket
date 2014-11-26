package org.nordakademie.mwi.tickets;

import java.util.Set;
import static com.google.common.collect.Sets.newHashSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class TicketsOutputConfigurationProvider implements
		IOutputConfigurationProvider {

	public final static String JSP_OUTPUT = "JSP_OUTPUT";
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
	    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    defaultOutput.setDescription("Output Folder");
	    defaultOutput.setOutputDirectory("./src-gen");
	    defaultOutput.setOverrideExistingResources(true);
	    defaultOutput.setCreateOutputDirectory(true);
	    defaultOutput.setCleanUpDerivedResources(true);
	    defaultOutput.setSetDerivedProperty(true);

	    OutputConfiguration jspOutput = new OutputConfiguration(JSP_OUTPUT);
	    jspOutput.setDescription("jsp Output");
	    jspOutput.setOutputDirectory("./WEB-INF/jsp");
	    jspOutput.setOverrideExistingResources(true);
	    jspOutput.setCreateOutputDirectory(true);
	    jspOutput.setCleanUpDerivedResources(true);
	    jspOutput.setCanClearOutputDirectory(true);
	    jspOutput.setSetDerivedProperty(true);
	    jspOutput.setKeepLocalHistory(false);
	    return newHashSet(defaultOutput, jspOutput);
	}

}

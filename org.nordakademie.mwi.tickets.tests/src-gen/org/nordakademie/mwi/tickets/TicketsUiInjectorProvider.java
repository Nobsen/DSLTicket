/*
* generated by Xtext
*/
package org.nordakademie.mwi.tickets;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TicketsUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.nordakademie.mwi.tickets.ui.internal.TicketsActivator.getInstance().getInjector("org.nordakademie.mwi.tickets.Tickets");
	}
	
}

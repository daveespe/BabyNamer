package com.espefamily.david.babynamer.client;

import com.espefamily.david.babynamer.service.NameService;
import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BabyNamer implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
	    NameServiceAsync rpcService = GWT.create(NameService.class);
	    
	    HandlerManager eventBus = new HandlerManager(null);
	    AppController appViewer = new AppController(rpcService, eventBus);
	    appViewer.go(RootPanel.get());
	}
}

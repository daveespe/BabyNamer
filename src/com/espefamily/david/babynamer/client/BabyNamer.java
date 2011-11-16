package com.espefamily.david.babynamer.client;

import com.espefamily.david.babynamer.service.NameService;
import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BabyNamer implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final NameServiceAsync greetingService = GWT
			.create(NameService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

	}
}

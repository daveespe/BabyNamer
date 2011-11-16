package com.espefamily.david.babynamer.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("nameService")
public interface NameService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
}

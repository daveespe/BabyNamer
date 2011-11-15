package com.espefamily.david.babynamer.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface NameServiceAsync {

	void greetServer(String textToServer, AsyncCallback<String> asyncCallback);

}

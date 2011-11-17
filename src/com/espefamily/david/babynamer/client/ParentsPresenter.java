package com.espefamily.david.babynamer.client;

import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.event.shared.HandlerManager;

public class ParentsPresenter implements Presenter {

	private DisplayNames displayNames;
	private NameServiceAsync rpcService;
	private HandlerManager eventBus;

	public ParentsPresenter(NameServiceAsync rpcService,
			HandlerManager eventBus, DisplayNames displayNames) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.displayNames = displayNames;
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub

	}

}

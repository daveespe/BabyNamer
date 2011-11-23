package com.espefamily.david.babynamer.client.presenter;

import com.espefamily.david.babynamer.client.view.ParentsView;
import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootPanel;

public class ParentsPresenter implements Presenter {

	private NameServiceAsync rpcService;
	private SimpleEventBus eventBus;
	
	private ParentsView parentsView;

	public ParentsPresenter(NameServiceAsync rpcService,
			SimpleEventBus eventBus) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		
		RootPanel.get().add(getView());
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setViewVisible(boolean isVisible)
	{
		getView().setVisible(isVisible);
	}

	public ParentsView getView() {
		if (parentsView == null)
			parentsView = new ParentsView();
		return parentsView;
	}


}

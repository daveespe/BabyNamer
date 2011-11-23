package com.espefamily.david.babynamer.client;

import com.espefamily.david.babynamer.client.presenter.ParentsPresenter;
import com.espefamily.david.babynamer.client.presenter.Presenter;
import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class AppController implements ValueChangeHandler<String> {

	private RootPanel rootPanel;
	private NameServiceAsync rpcService;
	private SimpleEventBus eventBus;
	
	private ParentsPresenter parentsPresenter;
	
	public AppController(NameServiceAsync rpcService, SimpleEventBus eventBus) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		
		initPresenters(rpcService, eventBus);
	}

	private void initPresenters(NameServiceAsync rpcService, SimpleEventBus eventBus) {
		parentsPresenter = new ParentsPresenter(rpcService, eventBus);
	}
	
	public void go(RootPanel rootPanel) {
	    this.rootPanel = rootPanel;
	    bind();

	    if ("".equals(History.getToken())) {
	      History.newItem("main");
	    }
	    else {
	      History.fireCurrentHistoryState();
	    }
	  
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
	    String token = event.getValue();

	    if (token != null) {
	      Presenter presenter = null;

	      if (token.equals("main")) {
	        presenter = parentsPresenter;
	      }
	      else if (token.equals("add")) {;
//	        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
	      }
	      else if (token.equals("edit")) {;
//	        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
	      }

	      if (presenter != null) {
	        presenter.setViewVisible(true);
	      }
	    }
	}
	
	private void bind() {
	    History.addValueChangeHandler(this);
	}

}

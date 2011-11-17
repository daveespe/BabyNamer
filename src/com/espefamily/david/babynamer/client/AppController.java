package com.espefamily.david.babynamer.client;

import com.espefamily.david.babynamer.service.NameServiceAsync;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class AppController implements ValueChangeHandler {

	private RootPanel rootPanel;
	private NameServiceAsync rpcService;
	private HandlerManager eventBus;
	
	public AppController(NameServiceAsync rpcService, HandlerManager eventBus) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
	}

	public void go(RootPanel rootPanel) {
	    this.rootPanel = rootPanel;

	    if ("".equals(History.getToken())) {
	      History.newItem("main");
	    }
	    else {
	      History.fireCurrentHistoryState();
	    }
	  }
	}

	@Override
	public void onValueChange(ValueChangeEvent event) {
	    String token = (String) event.getValue();

	    if (token != null) {
	      Presenter presenter = null;

	      if (token.equals("main")) {
	        presenter = new ParentsPresenter(rpcService, eventBus, new DisplayNames());
	      }
	      else if (token.equals("add")) {
//	        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
	      }
	      else if (token.equals("edit")) {
//	        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
	      }

	      if (presenter != null) {
	        presenter.go();
	      }
	    }
	}
	
	private void bind() {
	    History.addValueChangeHandler(this);
	}

}

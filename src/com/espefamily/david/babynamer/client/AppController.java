package com.espefamily.david.babynamer.client;

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
	
	public AppController(NameServiceAsync rpcService, SimpleEventBus eventBus) {
		this.rpcService = rpcService;
		this.eventBus = eventBus;
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
//	        presenter = new ParentsPresenter(rpcService, eventBus, new DisplayNames());
	    	  DisplayNames dn = new DisplayNames();
	    	  rootPanel.add(dn);
	      }
	      else if (token.equals("add")) {;
//	        presenter = new EditContactPresenter(rpcService, eventBus, new EditContactView());
	      }
	      else if (token.equals("edit")) {;
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

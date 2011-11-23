package com.espefamily.david.babynamer.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ButtonPanelView extends Composite {

	private static ButtonPanelViewUiBinder uiBinder = GWT
			.create(ButtonPanelViewUiBinder.class);

	interface ButtonPanelViewUiBinder extends UiBinder<Widget, ButtonPanelView> {
	}

	public ButtonPanelView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button prevButton;
	
	@UiField
	Button nextButton;

	@UiHandler("nextButton")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}


}

package com.espefamily.david.babynamer.client.view;

import java.awt.Panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;

public class ParentsView extends Composite {

	private static ParentsViewUiBinder uiBinder = GWT
			.create(ParentsViewUiBinder.class);

	interface ParentsViewUiBinder extends UiBinder<Widget, ParentsView> {
	}

	public ParentsView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	TextArea parent1;
	@UiField
	TextArea parent2;
	
	@UiHandler("parent1")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public TextArea getParent1() {
		return parent1;
	}

	public void setParent1(TextArea parent1) {
		this.parent1 = parent1;
	}

	public TextArea getParent2() {
		return parent2;
	}

	public void setParent2(TextArea parent2) {
		this.parent2 = parent2;
	}
	

}

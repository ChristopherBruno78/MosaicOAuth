package com.cocoawerks.MosaicOAuth.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;

public class LoginView extends Composite {

  interface LoginViewUiBinder extends UiBinder<FlowPanel, LoginView> {}

  private static LoginViewUiBinder ourUiBinder = GWT.create(
    LoginViewUiBinder.class
  );

  public LoginView() {
    initWidget(ourUiBinder.createAndBindUi(this));
  }
}

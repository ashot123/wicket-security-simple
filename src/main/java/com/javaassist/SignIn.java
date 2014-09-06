package com.javaassist;

import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */
public class SignIn extends WebPage {

    public SignIn(final PageParameters parameters) {
        add(new SignInPanel("signInPanel"));
    }
}

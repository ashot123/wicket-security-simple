package com.javaassist;

import org.apache.wicket.Page;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */
public class CustomAuthenticatedWebApplication extends AuthenticatedWebApplication {

    @Override
    protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
        return CustomAuthenticatedWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return SignIn.class;
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
}

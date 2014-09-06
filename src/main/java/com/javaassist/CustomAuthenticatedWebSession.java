package com.javaassist;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */
public class CustomAuthenticatedWebSession extends AuthenticatedWebSession {
    /**
     * Construct.
     *
     * @param request The current request object
     */
    public CustomAuthenticatedWebSession(Request request) {
        super(request);
    }

    @Override
    public boolean authenticate(String username, String password) {
        final String WICKET = "ashot";

        return WICKET.equals(username) && WICKET.equals(password);
    }

    @Override
    public Roles getRoles() {
        if (isSignedIn()) {
            return new Roles(Roles.USER);
        }
        return null;
    }
}

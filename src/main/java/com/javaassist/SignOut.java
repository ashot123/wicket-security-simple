package com.javaassist;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */
public class SignOut extends WebPage {

    public SignOut(PageParameters parameters) {
        super(parameters);
        getSession().invalidate();
    }
}

package com.javaassist;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */

@AuthorizeInstantiation("USER")
public class HomePage extends WebPage {

    public HomePage(PageParameters parameters) {
        super(parameters);
        add(new Label("message", new Model<>("Home Page 1")));
    }
}

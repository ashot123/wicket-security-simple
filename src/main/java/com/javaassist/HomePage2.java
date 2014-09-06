package com.javaassist;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by Ashot Karakhanyan on 06-09-2014
 */

// Here it is not necessary because this has access only from authorized page
@AuthorizeInstantiation("USER")
public class HomePage2 extends WebPage {

    public HomePage2(PageParameters parameters) {
        super(parameters);
        add(new Label("message2", new Model<>("Home Page 2")));
    }
}

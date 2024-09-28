package org.example.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theSwagLabsPage(){
        return Task.where("{0} opens the Swag Labs Page",
                Open.browserOn().the(SwagLabsPage.class));
    }
}



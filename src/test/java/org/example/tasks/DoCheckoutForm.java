package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userInterfaces.CheckoutFormInterfaces;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoCheckoutForm implements Task {

    private final String firstname;
    private final String lastname;
    private final String zipcode;

    public DoCheckoutForm(String firstname, String lastname, String zipcode){
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
    }

    public static Task CheckoutForm(String firstname, String lastname, String zipcode){
        return instrumented(DoCheckoutForm.class, firstname, lastname, zipcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(CheckoutFormInterfaces.FIRST_NAME_FIELD),
                Enter.theValue(lastname).into(CheckoutFormInterfaces.LAST_NAME_FIELD),
                Enter.theValue(zipcode).into(CheckoutFormInterfaces.ZIP_CODE_FIELD),
                Click.on(CheckoutFormInterfaces.CONTINUE_BUTTON)
        );
    }
}

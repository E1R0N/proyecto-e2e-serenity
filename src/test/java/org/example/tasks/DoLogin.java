package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userInterfaces.LoginFormInterfaces;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String username;
    private final String password;

    public DoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable whithCredentials(String username, String password) {
        return instrumented(DoLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginFormInterfaces.USER_NAME_FIELD),
                Enter.theValue(password).into(LoginFormInterfaces.PASSWORD_FIELD),
                Click.on(LoginFormInterfaces.LOGIN_BUTTON)
        );
    }
}

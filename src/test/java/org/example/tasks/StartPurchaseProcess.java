package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.userInterfaces.PurchaseProductsInterfaces;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartPurchaseProcess implements Task {

    public static Task shoppingCart(){
        return instrumented(StartPurchaseProcess.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PurchaseProductsInterfaces.CHECKOUT_BUTTON)
        );
    }
}

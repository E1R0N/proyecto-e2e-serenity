package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userInterfaces.PurchaseProductsInterfaces;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task {

    public static Task addProductsToCart(){
        return instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                WaitUntil.the(PurchaseProductsInterfaces.BACKPACK_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseProductsInterfaces.BACKPACK_BUTTON),

                WaitUntil.the(PurchaseProductsInterfaces.BIKE_LIGHTS_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchaseProductsInterfaces.BIKE_LIGHTS_BUTTON),

                Click.on(PurchaseProductsInterfaces.SHOPPING_CART_CONTAINER)
        );
    }
}

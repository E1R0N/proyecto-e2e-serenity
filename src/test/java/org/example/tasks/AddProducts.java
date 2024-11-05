package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userInterfaces.PurchaseProductsInterfaces;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class AddProducts implements Task {

    private static final List<By> PRODUCT_BUTTONS = Arrays.asList(
            PurchaseProductsInterfaces.BACKPACK_BUTTON,
            PurchaseProductsInterfaces.BIKE_LIGHTS_BUTTON,
            PurchaseProductsInterfaces.FLEECE_JACKET_BUTTON,
            PurchaseProductsInterfaces.BOLT_TSHIRT_BUTTON,
            PurchaseProductsInterfaces.ONESIE_BUTTON,
            PurchaseProductsInterfaces.TSHIRT_RED_BUTTON
    );

    public static Task addProductsToCart(){
        return instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(PRODUCT_BUTTONS.size());
            By selectedProductButton = PRODUCT_BUTTONS.get(randomIndex);

            actor.attemptsTo(
                    WaitUntil.the(selectedProductButton, isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(selectedProductButton)
            );
        }

        actor.attemptsTo(
                Click.on(PurchaseProductsInterfaces.SHOPPING_CART_CONTAINER)
        );
    }
}

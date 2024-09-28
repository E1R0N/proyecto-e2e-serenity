package org.example.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.navigation.NavigateTo;
import org.example.tasks.*;

public class TestDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} navega en la página de inicio de sesión de Swag Labs")
    public void navegarPaginaInicioSesion(String nomeActor) {
        OnStage.theActorCalled(nomeActor).attemptsTo(
                NavigateTo.theSwagLabsPage()
        );
    }

    @When("ingresa las credenciales correctas {string} y {string}")
    public void ingresaLasCredencialesCorrectas(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DoLogin.whithCredentials(user, password)
        );
    }

    @Then("agrega dos productos al carrito")
    public void agregoDosProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProducts.addProductsToCart()
        );
    }

    @And("ve el carrito y continua el proceso de compra")
    public void procesoCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                StartPurchaseProcess.shoppingCart()
        );
    }
    
    @When("completa el formulario de compra con {string}, {string} y {string}")
    public void completoElFormularioDeCompra(String firstname, String lastname, String zipcode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DoCheckoutForm.CheckoutForm(firstname, lastname, zipcode)
        );
    }
    
    @Then("ve la descripción de la compra")
    public void veoLaDescripcionDeLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinishPurchaseProcess.finishPurchase()
        );
    }

    @And("finaliza la compra")
    public void finalizoLaCompra() {
    }
}

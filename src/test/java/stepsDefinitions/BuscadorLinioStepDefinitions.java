package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.seleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.linioSteps;

public class BuscadorLinioStepDefinitions {

    @Steps
    linioSteps linioSteps = new linioSteps();

    @Given("^que me encuentro en la pagina de Linio$")
    public void queMeEncuentroEnLaPaginaDeLinio() {
        seleniumWebDriver.ChromeWebDriver("https://www.linio.com.co/");
    }

    @When("^busco un producto en el buscador$")
    public void buscoUnProductoEnElBuscador() {
        linioSteps.buscarProductoEnLinio();
    }

    @Then("^podre ver si el producto existe$")
    public void podreVerSiElProductoExiste() {
        seleniumWebDriver.driver.quit();
    }
}

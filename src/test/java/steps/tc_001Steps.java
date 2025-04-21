package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    public tc_001Steps() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("^El usuario está en la página de login$")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        driver.get("http://example.com/login");
        Assert.assertTrue(loginPage.estaEnPaginaLogin());
    }

    @When("^El usuario ingresa el nombre de usuario y la contraseña válidos$")
    public void elUsuarioIngresaNombreDeUsuarioYContrasenaValidos() {
        loginPage.ingresarUsuarioYContrasena("usuarioValido", "contrasenaValida");
    }

    @Then("^El usuario es redirigido a la página principal$")
    public void elUsuarioEsRedirigidoALaPaginaPrincipal() {
        Assert.assertTrue(loginPage.estaEnPaginaPrincipal());
    }
}
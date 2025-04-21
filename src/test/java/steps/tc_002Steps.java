import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {

    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        driver = new WebDriverManager().getDriver();
        loginPage = new tc_002Page(driver);
        loginPage.openLoginPage();
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresa_el_usuario_y_la_contraseña(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("debería ver un mensaje de error que indica datos incorrectos")
    public void deberia_ver_un_mensaje_de_error_que_indica_datos_incorrectos() {
        loginPage.verifyErrorMessage();
        driver.quit();
    }
}
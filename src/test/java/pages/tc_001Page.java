package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {
    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public boolean estaEnPaginaLogin() {
        return usernameField.isDisplayed() && passwordField.isDisplayed();
    }

    public void ingresarUsuarioYContrasena(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public boolean estaEnPaginaPrincipal() {
        return driver.getCurrentUrl().equals("http://example.com/main");
    }
}
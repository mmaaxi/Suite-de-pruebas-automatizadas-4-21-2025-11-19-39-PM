import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class tc_002Page {

    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterUsername(String username) {
        WebElement userField = driver.findElement(usernameField);
        userField.clear();
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passField = driver.findElement(passwordField);
        passField.clear();
        passField.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyErrorMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        Assert.assertTrue(errorElement.isDisplayed(), "Error message is not displayed");
        Assert.assertEquals(errorElement.getText(), "Invalid username or password.");
    }
}
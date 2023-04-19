package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage{

    private final String URL = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By MESSAGE = By.id("prompt-demo");

    public AlertPage(WebDriver driver) {
        super(driver);
    }


    public void navigate() {
        driver.navigate().to(URL);
    }
    public void runJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("myPromptFunction()");
    }

    /*public void handleAlertBox(String name) {
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
        return driver.switchTo().alert().getText();
    }*/
    public void enterInputName(String name)
    {
        driver.switchTo().alert().sendKeys(name);
    }
    public void handleAlertBoxAccept()
    {
        driver.switchTo().alert().accept();
    }
    public void handleAlertBoxCancel()
    {
        driver.switchTo().alert().dismiss();
    }
    public boolean checkInputMessage(String input)
    {
        return driver.findElement(MESSAGE).getText().endsWith(input);
    }
}

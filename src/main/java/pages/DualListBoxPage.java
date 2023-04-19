package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DualListBoxPage extends BasePage{

    private final String URL = "http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";
    private final By BUTTON_ADD = By.xpath("//*[contains(@class, \"pAdd\")]");
    private final By BUTTON_ADD_ALL = By.xpath("//*[contains(@class, \"pAddAll\")]");
    private final By LEFT_LIST = By.xpath("//*[contains(@class, \"pickData\")]/option");
    private final By RIGHT_LIST = By.xpath("//*[contains(@class, \"pickListResult\")]/option");
    public DualListBoxPage(WebDriver driver) {
        super(driver);
    }


//methods for Add All
    public void navigate() {
        driver.navigate().to(URL);
    }
    public void clickAddAll() {
        driver.findElement(BUTTON_ADD_ALL).click();
    }
    public int getNumberOfItems() {
        List<WebElement> items = driver.findElements(RIGHT_LIST);
        return items.size();
    }

//methods for Add
    public void chooseName() {
        List<WebElement> names = driver.findElements(LEFT_LIST);

        for (WebElement name : names) {
            if (name.getText().equals("Julia")) {
                name.click();
            }
        }
    }
    public void clickAdd() {
        driver.findElement(BUTTON_ADD).click();
    }
    public int getNumberOfItems2() {
        List<WebElement> items = driver.findElements(LEFT_LIST);
        return items.size();
    }
    public boolean isNameInList() {
        List<WebElement> names = driver.findElements(RIGHT_LIST);

        for (WebElement name : names) {
            if (name.getText().equals("Julia")) {
                return true;
            }
        }
        return false;
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{

    private final String URL = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";

    //locators for Radio Button Demo
    private final By MALE = By.xpath("//input[@value=\"Male\" and @name=\"optradio\"]");
    private final By GET_CHECKED_BUTTON = By.id("buttoncheck");
    private final By MESSAGE = By.className("radiobutton");

    //locators for Group Radio Buttons Demo
    private final By GROUP_MALE = By.xpath("//input[@value=\"Male\" and @name=\"gender\"]");
    private final By SECOND_AGE_GROUP = By.xpath("//*[@value=\"5 - 15\"]");
    private final By GET_VALUES_BUTTON = By.xpath("//div[@class=\"panel-body\"]/button");
    private final By GROUP_MESSAGE = By.className("groupradiobutton");

    public RadioButtonPage(WebDriver driver)
    {
        super(driver);
    }

    public void navigate() {
        driver.navigate().to(URL);
    }

    //methods for Radio Button Demo
    public void checkMale()
    {
        driver.findElement(MALE).click();
    }

    public void getCheckedValue()
    {
        driver.findElement(GET_CHECKED_BUTTON).click();
    }

    public String getMessage()
    {
        return driver.findElement(MESSAGE).getText();
    }

    //methods for Group Radio Buttons Demo
    public void checkGroupMale()
    {
        driver.findElement(GROUP_MALE).click();
    }
    public void checkSecondAgeGroup()
    {
        driver.findElement(SECOND_AGE_GROUP).click();
    }
    public void getValues()
    {
        driver.findElement(GET_VALUES_BUTTON).click();
    }

    public String getGroupMessage()
    {
        return driver.findElement(GROUP_MESSAGE).getText();
    }
}

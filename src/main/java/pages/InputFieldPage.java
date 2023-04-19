package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFieldPage extends BasePage{

    private final String URL = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By INPUT_A = By.name("sum1");
    private final By INPUT_B = By.name("sum2");
    private final By BUTTON_GET_TOTAL = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By SUM = By.id("displayvalue");

    public InputFieldPage(WebDriver driver) {
        super(driver);
    }


    public void navigate()
    {
        driver.navigate().to(URL);
    }

    public void enterInputA(String data) throws InterruptedException {
        scrollToElement(INPUT_A);
        driver.findElement(INPUT_A).sendKeys(data);
    }

    public void enterInputB(String data)
    {
        driver.findElement(INPUT_B).sendKeys(data);
    }

    public void clickGetTotalButton()
    {
        driver.findElement(BUTTON_GET_TOTAL).click();
    }

    public String getTotalValue()
    {
        return driver.findElement(SUM).getText();
    }
}

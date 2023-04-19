package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

   /* public void scrollToElement(By xpath) throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(xpath);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }*/
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends BasePage{

    private final String URL = "http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html";
    private final By DOWNLOAD_BUTTON = By.id("cricle-btn");
    private final By PERCENTAGE = By.className("percenttext");


    public ProgressBarPage(WebDriver driver)
    {
        super(driver);
    }


    public void navigate() {
        driver.navigate().to(URL);
    }
    public void clickDownload()
    {
        driver.findElement(DOWNLOAD_BUTTON).click();
    }
    public String readPercentage()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.textToBe(PERCENTAGE, "100%"));
        return driver.findElement(PERCENTAGE).getText();
    }
}

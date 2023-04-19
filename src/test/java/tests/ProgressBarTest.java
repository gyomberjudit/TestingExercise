package tests;

import pages.ProgressBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class ProgressBarTest extends BaseTest {

    ProgressBarPage progressBarPage;
    @Test
    public void TestProgressBarDownload()
    {
        progressBarPage = new ProgressBarPage(driver);
        progressBarPage.navigate();

        progressBarPage.clickDownload();

        Assertions.assertTimeout(Duration.ofSeconds(100), () -> {
            progressBarPage.readPercentage();
        });
    }
}

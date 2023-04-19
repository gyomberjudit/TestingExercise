package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AlertPage;

public class AlertTest extends BaseTest {

    AlertPage alertPage;
    @Test
    public void TestSubmitValidInput() throws InterruptedException
    {
        String name = "John Wick";
        String inputMessage = "'John Wick' !";
        alertPage = new AlertPage(driver);
        alertPage.navigate();

        alertPage.runJS();
        Thread.sleep(1500);
        alertPage.enterInputName(name);
        alertPage.handleAlertBoxAccept();
        boolean actual = alertPage.checkInputMessage(inputMessage);

        Assertions.assertTrue(actual);
    }

    @Test
    public void TestInputCancel() throws InterruptedException {
        String name1 = "Luke";
        String name2 = "Leia";
        String inputMessage2 = "'Luke' !";
        alertPage = new AlertPage(driver);
        alertPage.navigate();

        alertPage.runJS();
        Thread.sleep(1500);

        alertPage.enterInputName(name1);
        alertPage.handleAlertBoxAccept();
        boolean actual = alertPage.checkInputMessage(inputMessage2);
        Assertions.assertTrue(actual);

        alertPage.runJS();
        Thread.sleep(1500);

        alertPage.enterInputName(name2);
        alertPage.handleAlertBoxCancel();
        boolean actual2 = alertPage.checkInputMessage(inputMessage2);
        Assertions.assertTrue(actual2);
    }
}

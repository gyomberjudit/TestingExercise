package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InputFieldPage;

public class InputFieldTest extends BaseTest {

    InputFieldPage inputFieldPage;
    @Test
    public void TestSumTwoNumbers() throws InterruptedException {
        int a = 5223;
        int b = 6318;
        int expected = 11541;
        inputFieldPage = new InputFieldPage(driver);
        inputFieldPage.navigate();

        inputFieldPage.enterInputA(String.valueOf(a));
        inputFieldPage.enterInputB(String.valueOf(b));
        inputFieldPage.clickGetTotalButton();
        String actual = inputFieldPage.getTotalValue();

        Assertions.assertEquals(expected, Integer.valueOf(actual));
    }

    @Test
    public void TestSumTwoInvalidInputs() throws InterruptedException {
        String a = "Bonnie";
        String b = "Clyde";
        String expected = "NaN";
        inputFieldPage = new InputFieldPage(driver);
        inputFieldPage.navigate();

        inputFieldPage.enterInputA(a);
        inputFieldPage.enterInputB(b);
        inputFieldPage.clickGetTotalButton();
        String actual = inputFieldPage.getTotalValue();

        Assertions.assertEquals(expected, actual);
    }
}

package tests;

import pages.RadioButtonPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest {
    RadioButtonPage radioButtonPage;

    @Test
    public void TestSingleCheckedButton()
    {   String expected = "Radio button 'Male' is checked";
        radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.navigate();

        radioButtonPage.checkMale();
        radioButtonPage.getCheckedValue();
        String actual = radioButtonPage.getMessage();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMultipleCheckedButton()
    {
        String expected =  "Sex : Male\n" + "Age group: 5 - 15";
        radioButtonPage = new RadioButtonPage(driver);
        radioButtonPage.navigate();

        radioButtonPage.checkGroupMale();
        radioButtonPage.checkSecondAgeGroup();
        radioButtonPage.getValues();
        String actual = radioButtonPage.getGroupMessage();

        Assertions. assertEquals(expected, actual);
    }
}

package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DualListBoxPage;

public class DualListBoxTest extends BaseTest {

    DualListBoxPage dualListBoxPage;


    @Test
    public void TestAddSingleElement() {
        int expected = 14;
        dualListBoxPage = new DualListBoxPage(driver);
        dualListBoxPage.navigate();

        dualListBoxPage.chooseName();
        dualListBoxPage.clickAdd();
        int actual = dualListBoxPage.getNumberOfItems2();

        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(dualListBoxPage.isNameInList());
    }

    @Test
    public void TestAddAllElementButton()
    {
        int expected = 15;
        dualListBoxPage = new DualListBoxPage(driver);
        dualListBoxPage.navigate();

        dualListBoxPage.clickAddAll();
        int actual = dualListBoxPage.getNumberOfItems();

        Assertions.assertEquals(expected, actual);
    }
}

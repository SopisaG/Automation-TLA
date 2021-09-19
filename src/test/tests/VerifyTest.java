package tests;

import base.BaseTest;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import data.testData.DataProviders;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class VerifyTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Verify seven bottom links", dataProviderClass = DataProviders.class, dataProvider = "websitesList", groups = "smokeTest")
    public void test01(ArrayList<String> expectLinks) {
        //create list of actual links
        List<WebElement> actualLinks = loginPage.bottomLinks;
        List<String> actualLinksForTest = new ArrayList<>();
        for (WebElement each : actualLinks) {
            actualLinksForTest.add(each.getText());
        }

        extentTest.info("captured actual links at the bottom");
        extentTest.info(MarkupHelper.createUnorderedList(actualLinksForTest));

        //comparing
        for (int i = 0; i < expectLinks.size(); i++) {
            Assert.assertEquals(actualLinks.get(i).getText(), expectLinks.get(i));
        }
    }
}

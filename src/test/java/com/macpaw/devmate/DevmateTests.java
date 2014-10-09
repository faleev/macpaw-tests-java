package com.macpaw.devmate;

import com.macpaw.common.BasicSeleniumTestCase;
import com.macpaw.pages.devmate.DevmateMainPage;
import com.macpaw.pages.devmate.DevmateSignUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DevmateTests extends BasicSeleniumTestCase {

    private DevmateMainPage devmateDevmateMainPage;

    @BeforeMethod
    public void setUp() throws Exception {
        devmateDevmateMainPage = new DevmateMainPage(driver);
        devmateDevmateMainPage.openPage("http://devmate.com");
    }

    @Test
    public void testThatSolutionFieldBecomesVisible() throws Exception {
        DevmateSignUpPage devmateSignUpPage = devmateDevmateMainPage.goToSignUpPage();
        devmateSignUpPage.selectSellingOutsideAppStore();
        assertTrue(devmateSignUpPage.isSolutionFieldDisplayed());
    }


}

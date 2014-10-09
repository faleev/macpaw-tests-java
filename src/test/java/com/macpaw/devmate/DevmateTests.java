package com.macpaw.devmate;

import com.macpaw.common.BasicSeleniumTestCase;
import com.macpaw.pages.devmate.DevmateAppManagementPage;
import com.macpaw.pages.devmate.DevmateFeaturesPage;
import com.macpaw.pages.devmate.DevmateMainPage;
import com.macpaw.pages.devmate.DevmateSignUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DevmateTests extends BasicSeleniumTestCase {

    private DevmateMainPage devmateMainPage;

    @BeforeMethod
    public void setUp() throws Exception {
        devmateMainPage = new DevmateMainPage(driver);
        devmateMainPage.openPage("http://devmate.com");
    }

    @Test //Scenario 1
    public void testThatSolutionFieldBecomesVisible() throws Exception {
        DevmateSignUpPage devmateSignUpPage = devmateMainPage.goToSignUpPage();
        devmateSignUpPage.selectSellingOutsideAppStore();
        assertTrue(devmateSignUpPage.isSolutionFieldDisplayed());
    }

    @Test // Scenario 2: could be split into two separate cases or data provider could be applied.
    public void testThatPicturesDisplayed() throws Exception {
        DevmateFeaturesPage devmateFeaturesPage = devmateMainPage.goToFeaturesPage();
        assertEquals(devmateFeaturesPage.getPageUrl(), "http://devmate.com/features/frameworks");
        assertEquals(devmateFeaturesPage.getPageTitle(), "Simplify App Development | DevMate");
        assertTrue(devmateFeaturesPage.isSparkleBasedUpdatesFrameworkPictureDisplayed());
        devmateFeaturesPage.takeScreenshot();

        DevmateAppManagementPage devmateAppManagementPage = devmateFeaturesPage.goToAppManagementPage();
        assertEquals(devmateAppManagementPage.getPageUrl(), "http://devmate.com/features/app-management");
        assertEquals(devmateAppManagementPage.getPageTitle(), "Simplify App Development | DevMate");
        assertTrue(devmateAppManagementPage.isEasyUpdatePictureDisplayed());
        devmateAppManagementPage.takeScreenshot();
    }
}

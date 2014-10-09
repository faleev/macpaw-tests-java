package com.macpaw.pages.devmate;

import com.macpaw.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevmateFeaturesPage extends Page {

    public DevmateFeaturesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "APP MANAGEMENT")
    private WebElement appManagementLink;

    @FindBy(xpath = "//*[@alt='Sparkle-based updates framework']")
    private WebElement sparkleBasedUpdatesFrameworkPicture;

    public DevmateAppManagementPage goToAppManagementPage() {
        appManagementLink.click();
        waitForAjaxCompletion();
        return new DevmateAppManagementPage(driver);
    }

    public boolean isSparkleBasedUpdatesFrameworkPictureDisplayed() {
        return sparkleBasedUpdatesFrameworkPicture.isDisplayed();
    }
}

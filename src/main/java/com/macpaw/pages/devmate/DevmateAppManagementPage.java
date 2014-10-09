package com.macpaw.pages.devmate;

import com.macpaw.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevmateAppManagementPage extends Page {

    public DevmateAppManagementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@alt='Easy Updates']")
    private WebElement easyUpdatePicture;

    public boolean isEasyUpdatePictureDisplayed() {
        return easyUpdatePicture.isDisplayed();
    }
}

package com.macpaw.pages.devmate;

import com.macpaw.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevmateSignUpPage extends Page {

    public DevmateSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "selling_outside_app_store")
    private WebElement sellingOutsideAppStoreCheckbox;

    @FindBy(name = "solution")
    private WebElement solutionFielad;

    public DevmateSignUpPage selectSellingOutsideAppStore() {
        sellingOutsideAppStoreCheckbox.click();
        waitForAjaxCompletion();
        return this;
    }

    public boolean isSolutionFieldDisplayed() {
        return solutionFielad.isDisplayed();
    }
}

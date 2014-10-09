package com.macpaw.pages.devmate;

import com.macpaw.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevmateMainPage extends Page {

    public DevmateMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn.btn-construct.btn-sign-up-now") //(xpath = "//*[contains(text(), 'Sign Up Now')]")
    private WebElement signUpNowButton;

    public DevmateSignUpPage goToSignUpPage() {
        signUpNowButton.click();
        return new DevmateSignUpPage(driver);
    }
}

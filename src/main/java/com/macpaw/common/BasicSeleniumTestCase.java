package com.macpaw.common;

import com.macpaw.utils.ProjectConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

@Listeners({TakeScreenshotOnFailureListener.class})
public class BasicSeleniumTestCase {

    protected static WebDriver driver;

    private void startFirefoxDriver() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    private void startChromeDriver() {
        System.setProperty("webdriver.chrome.driver", ProjectConfiguration.getProperty("chromedriver.path"));
        driver = new ChromeDriver();
    }

    @BeforeClass
    @Parameters({"environment"})
    public void initializeWebDriver(@Optional("firefox-local") String environment) throws Exception {
        switch (environment.toLowerCase()) {
            case "firefox-local":
                startFirefoxDriver();
                break;

            case "chrome-local":
                startChromeDriver();
                break;
        }
    }

    @AfterClass(alwaysRun=true)
    public void quitWebDriver() throws Exception {
        if (driver != null) driver.quit();
    }
}

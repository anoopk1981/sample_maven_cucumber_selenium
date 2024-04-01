package com.automatedtest.sample.infrastructure.driver;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

    public static WebDriver driver;

    /**
     * Initializes the Chrome WebDriver.
     */
    @Before
    public void initializeWebDriver() {
        // Set the property for chrome driver and initialize it
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/geckodriver.exe");
        driver = new FirefoxDriver();

        // Additional configuration can be done here (e.g., maximize window, set timeouts)
        driver.manage().window().maximize();
    }

    /**
     * Gets the WebDriver instance.
     *
     * @return The WebDriver instance.
     */
    public WebDriver getDriver() {
        return driver;
    }

    // Add any additional methods you need for your setup
}

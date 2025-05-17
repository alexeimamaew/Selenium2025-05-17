package uiTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoniGarsiaTests {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

@Test
    void openHomePageTest () {
    driver.get(BASE_URL);


    Assertions.assertEquals("Hands-On Selenium WebDriver with Java", driver.getTitle());

    }

    @AfterEach
    void tearDown () {
        driver.quit();
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FirstSeleniumTest {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    //private final By TOP_LOCATION_BLOCK = By.xpath(".//div[@class = 'tl-box']");

    private final By TOP_LOCATION_LINK = By.xpath(".//div[@class = 'tl-box']/a");
    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void openHomePageCheck() {
        String country = "Austria";

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();
        clickOnCountry(country);

        //List<WebElement> topLocations = browser.findElements(TOP_LOCATION_BLOCK);

    }

    private void clickOnCountry(String country) {
        List<WebElement> links = browser.findElements(TOP_LOCATION_LINK);

        boolean isCountryFound = false;
        //for (WebElement location : location) {
        for (WebElement link : links) {
            //if (location.findElement(By.tagName("a")).getText().equals("Latvia")) {
            if (link.getText().equals(country)) {
                isCountryFound = true;
                // wait.until(ExpectedConditions.elementToBeClickable(location.findElement(By.tagName("a"))));
                wait.until(ExpectedConditions.elementToBeClickable(link));
                //location.findElement(By.tagName("a")).click();
                link.click();
                break;


            }

        }

        Assertions.assertTrue(isCountryFound, "Country not found!");

    }
}


package homework3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class MySelenTestLatvia {

       private WebDriver browser;
       private WebDriverWait wait;

        private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
        //private final By TOP_LOCATION_GROUP = By.xpath(".//div[@class = 'tl-box']/a");
        private final By TOP_LOCATION_GROUP = By.xpath(".//div[@class = 'tl-box']/a");


    @Test
    public void openHomePageCheck() {
        String country = "Latvia";

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        clickOnCountry(country);
    }
       private void clickOnCountry(String country) {
        List<WebElement> links = browser.findElements(TOP_LOCATION_GROUP);

        boolean isCountryFound = false;
           for (WebElement link : links) {
                  if (link.getText().equals(country)) {
                   isCountryFound = true;
                   wait.until(ExpectedConditions.elementToBeClickable(link));
                   link.click();
                   break;
                }
            }
            Assertions.assertTrue(isCountryFound, "Country not found!!!");
        }

    }














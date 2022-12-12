package homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketsTests {
    private final String FROM_AIR = "RIX";
    private final String TO_AIR = "BCN";
    private final String FIRST_NAME_TXT = "Tatjana";

    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULT = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private final By GET_PRICE_BTN = By.xpath("//span[@onclick = 'setLang();']");
    private final By BOOK_BTN = By.id("book2");
    private final By SEAT_PLANE = By.xpath("//div[@class = 'seat']");
    private final By BOOK_END_BTN = By.id("book3");

    private final By FROM_TO_AIRPORT_TXT = By.xpath(".//div[@class = 'infoTxt']/span");
    private final By PRICE_BTN_TXT = By.xpath("//div[@id = 'response']//child::*");
    private final By PRICE_TXT = By.xpath(".//div[@id = 'response']");
    private final By YOUR_SEAT_IS = By.xpath("//div[@class = 'line']");
    private final By FINAL_TXT = By.xpath(".//div[@class = 'finalTxt']");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void rezervationCheck() {
        String seatRezervation = "13";

        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets//");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM, FROM_AIR);
        select(TO, TO_AIR);

        browser.findElement(GO_BTN).click();
// ----------------------- Assertion From To ------------------------------------------------

        List<WebElement> fromToInfoText = browser.findElements(FROM_TO_AIRPORT_TXT);
        Assertions.assertEquals( FROM_AIR, fromToInfoText.get(0).getText(),"From Airport error!");
        Assertions.assertEquals( TO_AIR, fromToInfoText.get(1).getText(), "To Airport error!");


        type(FIRST_NAME, FIRST_NAME_TXT);
        type(LAST_NAME, "Fad");
        type(DISCOUNT, "Discount code");
        type(ADULT, "3");
        type(CHILDREN,"2");
        type(BAG,"1");
        select(FLIGHT, "13");

        browser.findElement(GET_PRICE_BTN).click();

// ----------------------- Assertion Get Price ------------------------------------------------

        List<WebElement> afterPriceBtnText = browser.findElements(PRICE_BTN_TXT);
        Assertions.assertEquals(FIRST_NAME_TXT +"!", afterPriceBtnText.get(0).getText(),  "First Name error!");
        Assertions.assertEquals( FROM_AIR, afterPriceBtnText.get(2).getText(),"From Airport error!");
        Assertions.assertEquals( TO_AIR, afterPriceBtnText.get(3).getText(), "To Airport error!");

        String priceText = browser.findElement(PRICE_TXT).getText();

        Pattern p =Pattern.compile("\\d+");
        Matcher m = p.matcher(priceText);

        boolean priceFound = false;
        if (m.find()) {
            priceFound = true;
        }
        Assertions.assertTrue(priceFound,   "Price error!");

        browser.findElement(BOOK_BTN).click();

        seatPlaneChoise(seatRezervation);

// ----------------------- Assertion Seat ------------------------------------------------

        String yourSeat = browser.findElement(YOUR_SEAT_IS).getText();
        Assertions.assertTrue(yourSeat.contains(seatRezervation), "Wrong seat!");

        browser.findElement(BOOK_END_BTN).click();

// ----------------------- Assertion Final Text ------------------------------------------------

        wait.until(ExpectedConditions.elementToBeClickable(FINAL_TXT));
        String finalText = browser.findElement(FINAL_TXT).getText();
        Assertions.assertTrue(finalText.contains("Thank You for flying with us!"), "Final Text wrong!");

    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }

    private void seatPlaneChoise(String itemName) {

        List<WebElement> menuItems = browser.findElements(SEAT_PLANE);
        for (WebElement we : menuItems)
            if (we.getText().equals(itemName)) {
            wait.until(ExpectedConditions.visibilityOfAllElements(we));
            we.click();
                break;
            }
    }
}

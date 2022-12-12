package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver browser;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();

        wait = new WebDriverWait(browser, Duration.ofSeconds(5));

    }

    public void openUrl(String url) {
        //if (url.startsWith("http://") || url.startsWith("https://")) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        browser.get(url);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    public void type(By locator, String value) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(value);
    }

    public void findElement(By locator) {
        browser.findElement(locator);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();


    }

    // public void listfindElement(By locator) {
    //     List<browser> list = browser.findElements(locator);
    // }

    public void choiseFromList(By locator, String value) {
        List<WebElement> list = browser.findElements(locator);
        for (WebElement we : list)
            if (we.getText().equals(list)) {
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                we.click();
                break;
            }
    }


}

package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;


public class HomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");
    private final By FROM_TO_AIRPORT_TXT = By.xpath(".//div[@class = 'infoTxt']/span");
    //private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }
    public void selectAirports(String from, String to) {
        baseFunc.select(FROM,from);
        baseFunc.select(TO, to);

        baseFunc.click(GO_BTN);
        baseFunc.waitForElementsCountToBe(FROM_TO_AIRPORT_TXT, 2);

    }
    public String getFirstFromAirport() {
        return baseFunc.findElements(FROM_TO_AIRPORT_TXT).get(0).getText();
    }
    public String getFirstToAirport() {
        return  baseFunc.findElements(FROM_TO_AIRPORT_TXT).get(1).getText();
    }



}

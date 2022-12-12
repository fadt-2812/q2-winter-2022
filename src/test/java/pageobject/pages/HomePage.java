package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class HomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");
    private final By FROM_TO_AIRPORT_TXT = By.xpath(".//div[@class = 'infoTxt']/span");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {

        this.baseFunc = baseFunc;
    }
    public void selectAirports(String from, String to) {
        baseFunc.select(FROM,from);
        baseFunc.select(TO, to);
        baseFunc.click(GO_BTN);

        //baseFunc.listWebElement(FROM_TO_AIRPORT_TXT);
        // Assertions.assertEquals( from, get(0).getText(),"From Airport error!");
        // Assertions.assertEquals( to, text.get(1).getText(), "To Airport error!");



    }


}

package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import javax.naming.Name;
import java.util.List;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULT = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath("//span[@onclick = 'setLang();']");

    private BaseFunc baseFunc;

    public  PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void passengerType(String FirstName, String LastName, String DiscountCode, String Adult, String Child, String Bag) {
        baseFunc.type(FIRST_NAME, FirstName);
        baseFunc.type(LAST_NAME, LastName);
        baseFunc.type(DISCOUNT, DiscountCode);
        baseFunc.type(ADULT, Adult);
        baseFunc.type(CHILDREN, Child);
        baseFunc.type(BAG, Bag);
        baseFunc.select(FLIGHT, "13");
//------------------ Assertion ? -----------------------------------
        baseFunc.click(GET_PRICE_BTN);
//------------------ Assertion ? -----------------------------------



    }

}

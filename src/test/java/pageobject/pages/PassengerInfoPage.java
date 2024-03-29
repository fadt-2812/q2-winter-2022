package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import pageobject.BaseFunc;
import pageobject.model.Passenger;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULT = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath("//span[@onclick = 'setLang();']");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE_BLOCK = By.id("response");

    private final By BOOK_BTN = By.id("book2");
    //private final By SEAT_PLANE = By.xpath("//div[@class = 'seat']");
    //private final By SEAT_CONFIRMATION = By.xpath("//div[@class = 'line']");
    //private final By BOOK_END_BTN = By.id("book3");


    private BaseFunc baseFunc;

    public  PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void fillInPassengerInfo(Passenger passenger) {

        baseFunc.type(FIRST_NAME, passenger.getFirstName());
        baseFunc.type(LAST_NAME, passenger.getLastName());
        baseFunc.type(DISCOUNT,passenger.getDiscount());
        baseFunc.type(ADULT,passenger.getPeopleCount());
        baseFunc.type(CHILDREN,passenger.getChildCount());
        baseFunc.type(BAG,passenger.getBagCount());
        baseFunc.selectByText(FLIGHT, passenger.getDate());

        baseFunc.click(GET_PRICE_BTN);
        baseFunc.waitForElementsCountToBe(RESERVATION_INFO, 5);

    }

    public String getFirstFromAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(0).getText();

    }

    public String getFirstToAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(1).getText();
    }

    public String getSecondFromAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(3).getText();
    }

    public String getSecondToAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(4).getText();
    }

    public String getPassengerName() {
        String name = baseFunc.findElements(RESERVATION_INFO).get(2).getText(); //Tatjana!
        return name.substring(0, name.length() -1);  //do predposlednego simvola

    }
    public  String getPrice() {
        String text = baseFunc.findElement(RESPONSE_BLOCK).getText();
        return StringUtils.substringBetween(text, "for", " EUR");
    }
    public void book() {
        baseFunc.click(BOOK_BTN);
    }
}


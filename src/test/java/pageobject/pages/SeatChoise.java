package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.BaseFunc;

import java.util.List;

public class SeatChoise {
    private final By BOOK_BTN = By.id("book2");
    private final By SEAT_PLANE = By.xpath("//div[@class = 'seat']");

    private BaseFunc baseFunc;

    public SeatChoise(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void chooseSeat(String seatRezervation) {
       baseFunc.findElement(BOOK_BTN);
       //baseFunc.choiseFromList(seatRezervation);
    }


}





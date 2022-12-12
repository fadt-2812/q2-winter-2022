package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatChoise;

public class  TicketsTestOnPages {
    private final String URL = "qaguru.lv:8089/tickets//";

    private final String FROM_AIR = "RIX";
    private final String TO_AIR = "BCN";


    private final String FirstName = "Tatjana";
    private final String LastName = "Fad";
    private final String DiscountCode = "Discount code";
    private final String Adult = "3";
    private final String Child = "2";
    private final String Bag = "1";
    private final String Flight = "13";
    private final  String seatRezervation = "13";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public  void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIR, TO_AIR);
 //------------------ Assertion ? -----------------------------------

        PassengerInfoPage passengerInfo = new PassengerInfoPage(baseFunc);
        passengerInfo.passengerType(FirstName, LastName, DiscountCode, Adult, Child, Bag);
//------------------ Assertion ? -----------------------------------

        SeatChoise seatChoise = new SeatChoise(baseFunc);
        seatChoise.chooseSeat(seatRezervation);





    }
}

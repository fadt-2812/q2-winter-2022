package pageobject;


import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;

public class  TicketsTestOnPages {
    private final String URL = "qaguru.lv:8089/tickets//";

    private final String FROM_AIR = "RIX";
    private final String TO_AIR = "BCN";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public  void successfulRegistrationTest() {
        Passenger passenger = new Passenger("Tatjana", "Fad", "Discount code", 3,
                2, 1, "16-05-2018");

        int seatNr = RandomUtils.nextInt(1, 35);

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIR, TO_AIR);

        Assertions.assertEquals(FROM_AIR, homePage.getFirstFromAirport(), "From Airport error!");
        Assertions.assertEquals(TO_AIR, homePage.getFirstToAirport(), "To Airport error!");

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(),infoPage.getPassengerName(),"Wrong name!");
        Assertions.assertEquals(FROM_AIR, infoPage.getFirstFromAirport(), "Error from!");
        Assertions.assertEquals(FROM_AIR, infoPage.getSecondFromAirport(), "Error from msg!");
        Assertions.assertEquals(TO_AIR, infoPage.getFirstToAirport(), "Error to!");
        Assertions.assertEquals(TO_AIR, infoPage.getSecondToAirport(), "Error to msg!");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error msg");

        infoPage.book();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);

        int selectedSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

        seatSelectionPage.book();

        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(),
                "Wrong text successful registration page");

    }
}

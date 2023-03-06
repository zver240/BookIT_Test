package step_defs;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;

public class TestBase {



    protected  MapPage mapPage = new MapPage();

    protected LoginPage loginPage = new LoginPage();

    protected HuntPage huntPage = new HuntPage();

    protected FreeSpotsPage freeSpotsPage = new FreeSpotsPage();

    protected ConfirmationPage confirmationPage = new ConfirmationPage();

    protected BookingStatusPage bookingStatusPage = new BookingStatusPage();

    protected BookingDeletionPage bookingDeletionPage = new BookingDeletionPage();

    protected  SchedulePage schedulePage = new SchedulePage();

    protected static Response response;

    protected static String accessToken;

    protected static JsonPath jsonPath;

    protected static List<WebElement> list;



}

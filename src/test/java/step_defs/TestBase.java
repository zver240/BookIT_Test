package step_defs;

import io.restassured.response.Response;
import pages.*;

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










}

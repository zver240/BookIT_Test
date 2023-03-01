package step_defs.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import step_defs.TestBase;
import utilities.AccessTokenUtility;
import utilities.EnvironmentUtility;
import utilities.UserActionsAndNavigationUtilities;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class API_LoginTest extends TestBase {
    Logger LOG = LogManager.getLogger(API_LoginTest.class);

    @Given("user logged in to Bookit API as a teacher")
    public void user_logged_in_to_bookit_api_as_a_teacher() {
        accessToken = AccessTokenUtility.getAccessToken(EnvironmentUtility.TEACHER_EMAIL,EnvironmentUtility.TEACHER_PASSWORD);
       if(accessToken.isEmpty()||accessToken==null){
           System.out.println("No Token Received. No authorization for user");
       }

    }
    @When("user sends GET request to {string}")
    public void user_sends_get_request_to(String endPoint) {

        response = given().accept(ContentType.JSON).and().header("Authorization",accessToken).when().get(EnvironmentUtility.BASE_URL+endPoint);
        response.then().log().all();
        LOG.info("TEst001");

    }
    @Then("status code should be {int}")
    public void status_code_should_be(Integer expectedStatusCode) {
        UserActionsAndNavigationUtilities.assertEquals(expectedStatusCode, response.statusCode());
        response.then().statusCode(expectedStatusCode);

    }
    @Then("content type is {string}")
    public void content_type_is(String expectedContentType) {
        response.then().contentType(expectedContentType);

    }
    @Then("role is {string}")
    public void role_is(String expectedRole) {
        UserActionsAndNavigationUtilities.assertEquals(expectedRole, response.path("role"));

        Map<String,?> anotherWayToAssertRoleWithDeserealization = response.body().as(Map.class);
        UserActionsAndNavigationUtilities.assertEquals(expectedRole,anotherWayToAssertRoleWithDeserealization.get("role"));
    }
}

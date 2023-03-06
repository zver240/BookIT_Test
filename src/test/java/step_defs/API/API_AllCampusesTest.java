package step_defs.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import step_defs.TestBase;
import utilities.AccessTokenUtility;
import utilities.EnvironmentUtility;
import utilities.UserActionsAndNavigationUtilities;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class API_AllCampusesTest extends TestBase {

    @Given("user logged in to Bookit API as a teacher and user sends GET request to {string}")
    public void userLoggedInToBookitAPIAsATeacherAndUserSendsGETRequestTo(String endPoint) {


        accessToken = AccessTokenUtility.getAccessToken(EnvironmentUtility.TEACHER_EMAIL,EnvironmentUtility.TEACHER_PASSWORD);
        response = given().accept(ContentType.JSON).and().header("Authorization",accessToken).when().get(EnvironmentUtility.BASE_URL+endPoint);
        response.then().log().all();

    }


    @And("id is {int}")
    public void idIs(int id) {
        UserActionsAndNavigationUtilities.assertEquals(id, response.path("id"));
    }

    @And("name is {string}")
    public void nameIs(String name) {
        UserActionsAndNavigationUtilities.assertEquals(name, response.path("name"));
    }


    @And("first element of nameArray is {string}")
    public void firstElementOfNameArrayIs(String nameArray) {
        UserActionsAndNavigationUtilities.assertEquals(nameArray, response.path("rooms[0].name"));
        List<Map<String,?>> list = response.path("rooms");
        for(Map<String,?> each:list){
            System.out.println(each.entrySet());
        }



    }
}

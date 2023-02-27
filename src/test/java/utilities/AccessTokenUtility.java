package utilities;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AccessTokenUtility {
    public static String getAccessToken (String email, String password) {

        String accessToken = given().accept(ContentType.JSON).and().queryParams("email",email,"password",password).
                when().get(EnvironmentUtility.BASE_URL+"/sign").then().statusCode(200).and().extract().body().path("accessToken");
        System.out.println("AccessToken = "+accessToken);
        return "Bearer "+accessToken;
    }
}

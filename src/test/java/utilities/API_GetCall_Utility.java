package utilities;

import io.restassured.http.ContentType;
import step_defs.API.API_Interface.GetCall;
import step_defs.TestBase;

import static io.restassured.RestAssured.given;

public class API_GetCall_Utility extends TestBase implements GetCall {

    @Override
    public void get() {

        accessToken = AccessTokenUtility.getAccessToken(EnvironmentUtility.TEACHER_EMAIL,EnvironmentUtility.TEACHER_PASSWORD);
        if(accessToken.isEmpty()||accessToken==null){
            System.out.println("No Token Received. No authorization for user");
        }

    }
}

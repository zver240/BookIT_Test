package step_defs.API;

import io.cucumber.java.en.And;
import pojo.TeacherPojoTest;
import step_defs.TestBase;
import utilities.UserActionsAndNavigationUtilities;
import java.util.List;

public class AssertMyClusterNamesTest extends TestBase {

    @And("cluster name is {string}")
    public void clusterNameIs(String clusterName) {
        jsonPath=response.jsonPath();
        List<TeacherPojoTest> list = jsonPath.getList("rooms",TeacherPojoTest.class);
        for(TeacherPojoTest each:list){
            if(each.getName().equals(clusterName)){
                UserActionsAndNavigationUtilities.assertEquals(clusterName,each.getName());
                break;
            }


        }




    }
}

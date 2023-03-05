package step_defs.API.API_Interface;

import io.cucumber.java.en.Then;
import pojo.MemberPOJOTest;
import pojo.MembersPOJOTest;
import pojo.TeamsPOJOTest;
import step_defs.TestBase;

import java.util.List;

public class API_DisplayNonGraduatesTest extends TestBase {

    @Then("all graduate names are displayed")
    public void all_graduate_names_are_displayed() {

        jsonPath = response.jsonPath();

        List<TeamsPOJOTest> list001 = jsonPath.getList("",TeamsPOJOTest.class);

        List<MembersPOJOTest> listMembers = jsonPath.getList("teams[0]",MembersPOJOTest.class);

        List<MemberPOJOTest> listMember = jsonPath.getList("teams[0].members[0]",MemberPOJOTest.class);

        for(TeamsPOJOTest each : list001){
            if(!each.getIsGraduated()&&each.getNumber().equals("7")){
                for(MembersPOJOTest eachmembers: listMembers){
                    System.out.println(eachmembers.getName());

                }


            }
        }

        for(MemberPOJOTest eachMember : listMember){

            System.out.println(eachMember.getFirstName());
            System.out.println(eachMember.getLastName());

        }



    }
}

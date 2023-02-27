package utilities;

import io.cucumber.java.Scenario;

public class ScenarioInfoUtility {

    public static void scenarioInfo(Scenario scenario){
        final String id;

        System.out.println("Scenario name: "+"["+scenario.getName()+"]");
        System.out.println("Scenario status: "+scenario.getStatus());
        System.out.println("Scenario location: "+scenario.getUri());
        System.out.println("Scenario ID: "+scenario.getId());
        System.out.println("Line: "+scenario.getLine());
        System.out.println("Scenario tags: "+scenario.getSourceTagNames());
        System.out.println("Is scenario failed? ["+scenario.isFailed()+"]");

        id = scenario.getId();

    }
}

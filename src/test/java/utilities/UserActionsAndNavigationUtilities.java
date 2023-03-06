package utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserActionsAndNavigationUtilities {
    /**
     * Navigates to desired web page
     * @param
     */
    public static void navigateTo(String url){
        System.out.println("Navigating to url: "+"["+url+"]");
        DriverUtility.gD().get(url);
        System.out.println(DriverUtility.gD().getCurrentUrl());
    }

    /**
     * asserts the Title of the current web page
     * @param title
     */
    public static void titleAssert(String title){
        System.out.println("The current page title: "+"["+title+"]");
        Assert.assertEquals(title,DriverUtility.gD().getTitle());
        System.out.println("Title "+"["+title+"] verified");
    }

    /**
     * Assert Equals for expected vs actual
     * @param actual
     * @param expected
     */
    public static void assertEquals(Object expected, Object actual ){
        System.out.println("Actual value: "+"["+actual+"]");
        System.out.println("Expected value: "+"["+expected+"]");
        Assert.assertEquals(expected,actual);
        System.out.println("Assertion of "+expected+" vs "+actual+" is successful");
    }

    /**
     * Assert True
     * @param assertValue
     */
    public static void assertTrue(boolean assertValue){
        Assert.assertTrue(assertValue);
    }

    /**
     * Click method
     * @param element
     */
    public static void click(WebElement element){
        if(element.getText().equals("")){
            System.out.println("Click action performed on element with TAG: "+element.getTagName());
        }else{
            System.out.println("Click action performed on element with text: "+element.getText());
        }

        element.click();

    }

    /**
     * Get List of WebElements
     */
    public static List<WebElement> getListOFWebElements (By by){
        List<WebElement> list = DriverUtility.gD().findElements(by);
        return list;
    }





}

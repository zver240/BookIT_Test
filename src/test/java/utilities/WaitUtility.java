package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_defs.TestBase;

import java.time.Duration;

public class WaitUtility {


    /**
     * Use expected conditions:
     * "titleIs" with a string as parameter
     * @param title
     */
    public static void explicitWaitForTitle (String title){
        WebDriverWait wait = new WebDriverWait(DriverUtility.gD(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleIs(title));
    }

    /**
     * Use expected conditions:
     * "visibilityOf" with an element
     * @param element
     */
    public static void explicitWaitForVisibility (WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverUtility.gD(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Use expected conditions:
     * "invisibilityOf" with an element
     * @param element
     */
    public static void explicitWaitForInvisibility (WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverUtility.gD(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Use expected conditions:
     * "elementToBeClickable" with an element
     */
    public static void explicitWaitForElementToBeClickable (WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverUtility.gD(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Use expected conditions:
     * "presenceOfWebElementLocatedBy" with a By class API
     */
    public static void explicitWaitForPresenceOfElement (By importedSample){
        WebDriverWait wait = new WebDriverWait(DriverUtility.gD(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(importedSample));

    }
}

package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAndMouseActionsUtility {
    private final static Actions actions = new Actions(DriverUtility.gD());
    /**
     * pause for N of seconds
     * @param seconds
     */
    public static void pauseAction(int seconds){
        actions.pause(Duration.ofSeconds(seconds)).perform();
    }

    /**
     * move to specified element on DOM
     * @param element
     */
    public static void hoverOver(WebElement element){
        actions.moveToElement(element).perform();
    }

    /**
     * mouse left click action
     * @param element
     */
    public static void actionClick(WebElement element){
        actions.click().perform();
    }

    /**
     * mouse right click action
     * @param element
     */
    public static void actionContextClick(WebElement element){
        actions.contextClick(element).perform();
    }

    /**
     * open context menu
     */
    public static void contextClick(){
        actions.contextClick().perform();
    }

    /**
     * add value to context field (sendKeys)
     * @param element
     * @param value
     */
    public static void addText(WebElement element,String value){
        actions.sendKeys(value).perform();
    }


}

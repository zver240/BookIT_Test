package utilities;

import org.openqa.selenium.By;

public class ByClassUtility {
    /**
     * use XPATH in this By class API
     * @param value
     * @return
     */
    public static By useByXpath(String value){
        return new By.ByXPath(value);

    }

    /**
     * use ID in this By class API
     * @param value
     * @return
     */
    public static By useById(String value){
        return new By.ById(value);
    }

    /**
     * use NAME in this By class API
     * @param value
     * @return
     */
    public static By useByName(String value){
        return new By.ByName(value);
    }

    /**
     * use CLASSNAME in this By class API
     * @param value
     * @return
     */
    public static By useByClassName(String value){
        return new By.ByClassName(value);
    }

    /**
     * use CSS_Selector in this By class API
     * @param value
     * @return
     */
    public static By useByCSS(String value){
        return new By.ByCssSelector(value);
    }

    /**
     * use TAG_NAME in this By class API
     * @param value
     * @return
     */
    public static By useByTagName(String value){
        return new By.ByTagName(value);
    }

    /**
     * use LINKTEXT in this By class API
     * @param value
     * @return
     */
    public static By useByLinkText(String value){
        return new By.ByLinkText(value);
    }

    /**
     * use PARTIAL_LINKTEXT in this By class API
     * @param value
     * @return
     */
    public static By useByPartialLinkText(String value){
        return new By.ByPartialLinkText(value);
    }

}

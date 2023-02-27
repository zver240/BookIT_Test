package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtility;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverUtility.gD(),this);
    }




}

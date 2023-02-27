package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtility {

    public static void takeScreenshot (String scenario) throws IOException, InterruptedException {
            Thread.sleep(1000);
            File screenshot = ((TakesScreenshot) DriverUtility.gD()).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(screenshot,new File("src/test/resources/Screenshots/"+scenario+".jpeg"));


    }
}

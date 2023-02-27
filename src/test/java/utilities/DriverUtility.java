package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class DriverUtility {

    private DriverUtility(){

    }

    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static WebDriver gD(){

        if(driverPool.get() == null){

            synchronized (DriverUtility.class){
                String browserType = ConfigurationReaderUtility.getProperty("browser");

                switch (browserType){

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().deleteAllCookies();
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                        driverPool.get().manage().timeouts().getImplicitWaitTimeout();
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().deleteAllCookies();
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                        driverPool.get().manage().timeouts().getImplicitWaitTimeout();
                        break;

                }
            }
        }
        return driverPool.get();
    }

    public static void closeDriver(){
        if(driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}

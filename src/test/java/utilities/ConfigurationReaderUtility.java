package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReaderUtility {

    private static Properties mainProperties;
    private static Properties basePage;
    private static Properties bookingDeletion;
    private static Properties bookingStatus;
    private static Properties confirmationPage;
    private static Properties freeSpot;
    private static Properties huntPage;
    private static Properties loginPage;
    private static Properties mapPage;

    private static Properties schedulePage;

    static{

        try{
            String path = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\configuration.properties";
            FileInputStream inputStream = new FileInputStream(path);
            mainProperties = new Properties();
            mainProperties.load(inputStream);
            inputStream.close();

            String basePagePath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\BasePage.properties";
            FileInputStream inputStream2 = new FileInputStream(basePagePath);
            basePage = new Properties();
            basePage.load(inputStream2);
            inputStream2.close();

            String bookingDeletionPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\BookingDeletionPage.properties";
            FileInputStream fileInputStream3 = new FileInputStream(bookingDeletionPath);
            bookingDeletion = new Properties();
            bookingDeletion.load(fileInputStream3);
            fileInputStream3.close();

            String bookingStatusPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\BookingStatusPage.properties";
            FileInputStream inputStream4 = new FileInputStream(bookingStatusPath);
            bookingStatus = new Properties();
            bookingStatus.load(inputStream4);
            inputStream4.close();

            String confirmationPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\ConfirmationPage.properties";
            FileInputStream inputStream5 = new FileInputStream(confirmationPath);
            confirmationPage = new Properties();
            confirmationPage.load(inputStream5);
            inputStream5.close();

            String freeSpotPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\FreeSpotPage.properties";
            FileInputStream inputStream6 = new FileInputStream(freeSpotPath);
            freeSpot = new Properties();
            freeSpot.load(inputStream6);
            inputStream6.close();

            String huntPagePath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\HuntPage.properties";
            FileInputStream inputStream7 = new FileInputStream(huntPagePath);
            huntPage = new Properties();
            huntPage.load(inputStream7);
            inputStream7.close();

            String loginPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\LoginPage.properties";
            FileInputStream inputStream8 = new FileInputStream(loginPath);
            loginPage = new Properties();
            loginPage.load(inputStream8);
            inputStream8.close();

            String  mapPath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\MapPage.properties";
            FileInputStream inputStream9 = new FileInputStream(mapPath);
            mapPage = new Properties();
            mapPage.load(inputStream9);
            inputStream9.close();

            String schedulePath = "C:\\Users\\zver2\\IdeaProjects\\BookIT\\src\\test\\java\\pages\\propertiesLocatorValuesPerPage\\SchedulePage.properties";
            FileInputStream inputStream10 = new FileInputStream(schedulePath);
            schedulePage = new Properties();
            schedulePage.load(inputStream10);
            inputStream10.close();





        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static String getProperty (String path){
        return mainProperties.getProperty(path);
    }

    public static String getValueProperty (String basePagePath){
        return basePage.getProperty(basePagePath);
    }

    public static String getBookingDeletionValueProperty (String bookingDeletionPath) {return bookingDeletion.getProperty(bookingDeletionPath);}

    public static String getBookingStatusProperty (String bookingStatusPath){return bookingStatus.getProperty(bookingStatusPath);}

    public static String getConfirmationProperty (String confPath) {return confirmationPage.getProperty(confPath);}

    public static String getFreeSpotProperty (String freeSpotPath) {return freeSpot.getProperty(freeSpotPath);}

    public static String getHuntPageProperty (String huntPagePath) {return huntPage.getProperty(huntPagePath);}

    public static String getLoginProperty (String loginPath) {return loginPage.getProperty(loginPath);}

    public static String getMapPageProperty (String mapPath) {return mapPage.getProperty(mapPath);}

    public static String getSchedulePageProperty (String schedulePath) {return schedulePage.getProperty(schedulePath);}














}

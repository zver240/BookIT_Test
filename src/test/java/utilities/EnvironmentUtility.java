package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentUtility {
    public static final String URL;

    public static final String BASE_URL;

    public static final String DB_USERNAME;

    public static final String DB_PASSWORD;

    public static final String DB_URL;

    public static final String TEACHER_EMAIL;

    public static final String TEACHER_PASSWORD;

    public static final String MEMBER_EMAIL;

    public static final String MEMBER_PASSWORD;

    public static final String LEADER_EMAIL;

    public static final String LEADER_PASSWORD;


    static{
        Properties properties = null;
        String environment = System.getProperty("env") != null ? System.getProperty("env"): ConfigurationReaderUtility.getProperty("env");

        try{
            String path = System.getProperty("user.dir")+"/src/test/resources/environments/"+environment+".properties";
                                    //C:\Users\zver2\IdeaProjects\BookIT\src\test\resources\environments\qa2.properties
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        URL = properties.getProperty("url");
        BASE_URL = properties.getProperty("base_url");
        DB_USERNAME = properties.getProperty("dbUsername");
        DB_PASSWORD = properties.getProperty("dbPassword");
        DB_URL = properties.getProperty("dbUrl");
        TEACHER_EMAIL = properties.getProperty("teacher_email");
        TEACHER_PASSWORD = properties.getProperty("teacher_password");
        MEMBER_EMAIL = properties.getProperty("team_member_email");
        MEMBER_PASSWORD = properties.getProperty("team_member_password");
        LEADER_EMAIL = properties.getProperty("team_leader_email");
        LEADER_PASSWORD = properties.getProperty("team_leader_password");
    }

}

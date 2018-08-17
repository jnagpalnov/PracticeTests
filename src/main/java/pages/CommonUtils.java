package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by nag724 on 8/16/2018.
 */
public class CommonUtils {

    public void setBaseURI(String baseUri){
        RestAssured.baseURI=baseUri;
    }

    public static String getProperty(String filePath, String propertyName){

        Properties prop = new Properties();
        InputStream input = null;
        String value=null;

        try {

            input = new FileInputStream(filePath);

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            value= prop.getProperty(propertyName);


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return value;
    }
}
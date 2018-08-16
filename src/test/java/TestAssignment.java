import org.testng.Assert;
import serializedPojos.GetResults;
import serializedPojos.Promotions;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/**
 * Created by Jatin on 8/16/2018.
 */
public class TestAssignment {

    public static void main(String args[]){

        baseURI="https://api.tmsandbox.co.nz";

        String expectedName="Carbon credits";
        boolean expectedCanRelist=true;
        String descriptionText="2x larger image";

        GetResults response=   given()
                .pathParam("version","v1")
                .pathParam("categoryId","6327")
                .queryParam("catalogue","false")
                .when()
                .get("/{version}/Categories/{categoryId}/Details.json")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(GetResults.class);

        //Verifying name is "Carbon Credits"
        verifyNameInResponse(expectedName,response.getName());
        //Verifying that CanRelist is true.
        verifyCanRelist(response.getCanRelist(), expectedCanRelist);
        //Verifying that Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
        Promotions[] promotions=response.getPromotions();
        for(Promotions promotion:promotions){
            if(promotion.getName().equals("Gallery")){
               if(promotion.getDescription().contains(descriptionText)){

                   System.out.println("Description contains '" + descriptionText+ "'" );
               }
               else{
                   Assert.fail("Description text " +promotion.getDescription() + "not contains "+ descriptionText );
               }
            }
        }
    }

    /**
     * Function to Verify name in response
     * @param actualValue:Name in response
     * @param expectedValue: Expected Name field value in response
     */

    public static void verifyNameInResponse(String actualValue, String expectedValue){
        if(actualValue.equals(expectedValue)){
            System.out.println("Value of Name field in response is '" + actualValue+ "' which is equal to the expected '"  + expectedValue + "' value" );

        } else{
            Assert.fail("Name in response is" + actualValue +" which is not equal to expected name "+ expectedValue);
        }

    }

    /**
     * Function to Verify CanRelist in response
     * @param actualValue:CanRelist actual vale in response
     * @param expectedValue: CanRelist expected value in response
     */
    public static void verifyCanRelist(boolean actualValue, boolean expectedValue){
        if(actualValue==expectedValue){
            System.out.println("Value of CanRelist field in response is '" + actualValue+ "' which is equal to the expected '"  + expectedValue + "' value" );

        } else{
            Assert.fail("Value of CanRelist field in response is " + actualValue +" which is not equal to expected '"+ expectedValue  + "' value" );
        }

    }
}

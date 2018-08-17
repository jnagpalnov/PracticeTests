package pages;
import org.testng.Assert;
import resonsePojos.GetResults;
import resonsePojos.Promotions;

/**
 * Created by nag724 on 8/16/2018.
 */
public class Validations {

    /**
     * Function to Verify name in response
     * @param actualValue:Name in response
     * @param expectedValue: Expected Name field value in response
     */

    public void verifyNameInResponse(String actualValue, String expectedValue){
        if(actualValue.equals(expectedValue)){
            System.out.println("Value of Name field in response is " + actualValue );
        } else{
            Assert.fail("Name in response is" + actualValue +" which is not equal to expected name "+ expectedValue);
        }
    }

    /**
     * Function to Verify CanRelist in response
     * @param actualValue:CanRelist actual vale in response
     * @param expectedValue: CanRelist expected value in response
     */
    public void verifyCanRelist(boolean actualValue, boolean expectedValue){
        if(actualValue==expectedValue){
            System.out.println("Value of CanRelist field in response is " + actualValue);
        } else{
            Assert.fail("Value of CanRelist field in response is " + actualValue +" which is not equal to expected '"+ expectedValue  + "' value" );
        }
    }

    /**
     * Function to Verify that Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
     * @param name:Name of promotions list element in response
     * @param expectedDescription: Description text we are expecting that the element should say "2x larger image"
     * @param response: Response of api request
     */
    public void verifyDescription(String name, String expectedDescription, GetResults response){

        Promotions[] promotions=response.getPromotions();
        for(Promotions promotion:promotions){
            if(promotion.getName().equals(name)){
                if(promotion.getDescription().contains(expectedDescription)){

                    System.out.println("Description contains '" + expectedDescription+ "'" );
                }
                else{
                    Assert.fail("Description text " +promotion.getDescription() + "not contains "+ expectedDescription );
                }
            }
        }
    }


}
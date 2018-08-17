import pages.CommonUtils;
import pages.Validations;
import resonsePojos.GetResults;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/**
 * Created by Jatin on 8/16/2018.
 */
public class TestWithoutTestNg {

    public static void main(String args[]){

        //setting base URI as https://api.tmsandbox.co.nz
        baseURI=CommonUtils.getProperty("src/test/resources/Environment.properties","BaseURI");

        //Making get request, verifying the status code is 200 and deserialize the response in a pojo class.
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

        Validations validations= new Validations();

        //Verifying name is "Carbon credits"
        validations.verifyNameInResponse(response.getName(),"Carbon credits");
        //Verifying that CanRelist is true.
        validations.verifyCanRelist(response.getCanRelist(), true);
        //Verifying that Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
        validations.verifyDescription("Gallery","2x larger image",response);
    }
}

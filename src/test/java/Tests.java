import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CommonUtils;
import pages.Validations;
import resonsePojos.GetResults;

import static io.restassured.RestAssured.given;

/**
 * Created by nag724 on 8/16/2018.
 */
public class Tests {

    public String version;

    @BeforeTest()
    public void setBaseURI(){
        CommonUtils commonUtils= new CommonUtils();
        commonUtils.setBaseURI(CommonUtils.getProperty("src/test/resources/Environment.properties","BaseURI"));
        version=CommonUtils.getProperty("src/test/resources/Environment.properties","Version");
    }

    @Test
    @Parameters({"expectedName","expectedCanRelist","promotionName","promotionDesc","categoryID","expectedResponseCode"})
    public void Test(String expectedName, boolean expectedCanRelist, String promotionName,String promotionDesc, int categoryID, int expectedResponseCode){

        //Making get request, verifying the status code is 200 and deserialize the response in a pojo class.
        GetResults response=   given()
                .pathParam("version",version)
                .pathParam("categoryId",categoryID)
                .queryParam("catalogue","false")
                .when()
                .get("/{version}/Categories/{categoryId}/Details.json")
                .then()
                .statusCode(expectedResponseCode)
                .extract()
                .response()
                .as(GetResults.class);

        Validations validations= new Validations();
        //Verifying name is "Carbon Credits"
        validations.verifyNameInResponse(expectedName, response.getName());
        //Verifying that CanRelist is true.
        validations.verifyCanRelist(response.getCanRelist(), expectedCanRelist);
        //Verifying that Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
        validations.verifyDescription(promotionName,promotionDesc,response);
    }
}
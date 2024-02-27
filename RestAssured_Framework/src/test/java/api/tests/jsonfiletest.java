package api.tests;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.Routes;
import api.endpoints.UserEndPoints;
import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;




public class jsonfiletest {


	@Test
	public void createUser() {

		File jsonData = new File("C:\\Users\\SPURGE\\Desktop\\all Files\\swagger.json");

		Response response= given().contentType(ContentType.JSON)
				          .body(jsonData).when()
				          .post(Routes.post_URL)			 
				          .then().extract().response();
		Assert.assertEquals(response.statusCode(),200);	
		
		String data=response.asPrettyString();
		System.out.println(data);
	}


}

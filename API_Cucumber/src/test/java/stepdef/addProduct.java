package stepdef;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import resources.API_Body;
import resources.utils;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.io.File;

public class addProduct extends utils{


	public static String userid="";
	public static String id="";	
	public static String token="";	

	API_Body body=new API_Body();



	RequestSpecification reqAddP,reqPlaceOrder;
	Response response;



	@Given("user adds the product using Payload")
	public void user_adds_the_product_using_payload() {

		RestAssured.baseURI="https://rahulshettyacademy.com";

		String Login=given().log().all().spec(reqSpecification()).body(body.LoginBody()).
				when().post("/api/ecom/auth/login").
				then().spec( responseSpecification()).extract().response().asPrettyString();


		JsonPath js=new JsonPath(Login);		
		userid=js.getString("userId");
		token=js.getString("token");


		reqAddP=reqSpec_CreateProduct(userid).header("Authorization",token)
				.header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>");				
	}


	@When("user calls http request method")
	public void user_calls_http_request_method() {

		response=reqAddP.when().post("/api/ecom/product/add-product").then().log().all().extract().response();

	}

	@Then("user should see response code as {int}")
	public void user_should_see_response_code_as(long int1) {

		assertEquals(response.statusCode(), int1);
	}


	@Given("user adds the product using {string}")
	public void user_adds_the_product_using(String string) {



		RestAssured.baseURI="https://rahulshettyacademy.com";

		String Login=given().log().all().spec(reqSpecification()).body(body.LoginBody()).
				when().post("/api/ecom/auth/login").
				then().spec(responseSpecification()).extract().response().asPrettyString();


		JsonPath js=new JsonPath(Login);		
		userid=js.getString("userId");
		token=js.getString("token");


		reqAddP=reqSpec_CreateProduct(userid).header("Authorization",token);


	}

	@When("user calls {string} http request method")
	public void user_calls_http_request_method(String string) {

		response=reqAddP.when().post("/api/ecom/product/add-product").then().extract().response();
	}

}	




























/*
 * @Then("delete the product") public void delete_the_product() {
 * 
 * }
 */

/*
 * @Given("user is on HomePage") public void user_is_on_home_page() {
 * 
 * 
 * RestAssured.baseURI="https://rahulshettyacademy.com";
 * 
 * String Login=given().log().all().spec(reqLogin).body(LoginBody()).
 * when().post("/api/ecom/auth/login").
 * then().spec(resLogin).extract().response().asPrettyString();
 * 
 * reqPlaceOrder=given().spec(reqLogin).header("Authorization",token).body(
 * PlaceOrder());
 * 
 * }
 * 
 * @When("user calls http request method and add payload") public void
 * user_calls_http_request_method_and_add_payload() {
 * 
 * response2=reqPlaceOrder.when().post("/api/ecom/order/create-order").then().
 * spec(resLogin).extract().response();
 * 
 * }
 * 
 * 
 * @Then("user should see msg as {string}") public void
 * user_should_see_msg_as(String Actualstring) {
 * 
 * Assert.assertEquals(Actualstring, "Order Placed Successfully");
 * 
 * } }
 */
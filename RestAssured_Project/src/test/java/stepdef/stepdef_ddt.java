package stepdef;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DDT.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;



public class stepdef_ddt  {
		
	RequestSpecification reqSpec;
	Response res2;
		
	@Given("user enters into the page with payload")
	public void user_enters_into_the_page_with_payload() {
		
		reqSpec = new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2").build();

	}
	
	
	

//	@When("user checks the {string}")
//	public void user_checks_the(String string) {
//		
//		res2= given().spec(reqSpec).header("Content-Type","application/json")
//				.when().get("/pet/findByStatus?status="+string).then().extract().response();
//		
//		JsonPath js=new JsonPath(res2.asPrettyString());
//		System.out.println(res2.asPrettyString());
//	   
//	}

	
	
	@Parameters("{status}")
	@When("user checks the status")
	public void user_checks_the(String status) {
		
		res2= given().spec(reqSpec)
				.when().get("/pet/findByStatus?status="+status+"").then().extract().response();
		
//		JsonPath js=new JsonPath(res2.asPrettyString());
		System.out.println(res2.asPrettyString());
	   
	}

	




//	@When("user checks the status")
//	public void user_checks_the_status(DataTable dataTable)   {
//				
//		List<String> li=dataTable.values();
//		System.out.println(li.size());
//		for(int i=1;i<li.size();i++)
//		{
//		res2=given().header("Content-Type","application/json")
//				.when().get("/pet/findByStatus?status="+"li.get(i)").then().extract().response();
//		System.out.println(res2.asPrettyString());
//				
//		}	    
//	}

	
	@Then("user should get the response and status code should be {int}")
	public void user_should_get_the_response_and_status_code_should_be(long int1)
	{
		System.out.println(res2.getStatusCode());
		Assert.assertEquals(res2.getStatusCode(), int1);	
	}
}

package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import resources.APIBody;
import resources.APIResources;

import resources.Utils;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import Pojo.AddProductPojo;
import Pojo.CreateOrderPojo;
import Pojo.DelOrderPojo;
import Pojo.LoginResponsePojo;


public class Step extends Utils
{
	RequestSpecification req;
	APIBody body = new APIBody();
	Response res;
	static String token;
	static String userid;
	static String productid;
	static String orderid;
	static String msg;
	
//	public void getvalues()
//	{
//		LoginResponsePojo s =  res.as(LoginResponsePojo.class);
//	    token =s.getToken() ;
//	    System.out.println(token);
//	    userid = s.getUserId();
//	}
	
	
	@Given("user loads the API with the {string}")
	public void user_loads_the_api_with_the(String string) throws IOException {
		if (string.equalsIgnoreCase("loginpayload"))
		{
			req = given().spec(reqSpec()).body(body.loginAPIBody());
		}
		else if (string.equalsIgnoreCase("Createorderpayload")) 
		{
			req = given().spec(reqSpec()).header("Authorization", token).body(body.createOrderApiBody(productid));
		}
		else if(string.equalsIgnoreCase("Delorderpayload"))
		{
			req=given().spec(reqSpec()).header("Authorization", token);
		}
	}

	
	@SuppressWarnings("deprecation")
	@Then("user should see the response as {int}")
	public void user_should_see_the_response_as(long int1)
	{
		
	    Assert.assertEquals(res.statusCode(), int1);
	}
	
	@Given("user loads the addproductAPI with the payload")
	public void user_loads_the_addproduct_api_with_the_payload() throws IOException 
	{
		
		req = reqSpecforAddproduct(userid).header("Authorization", token);
	}

	
	@When("user calls the post http method with {string}")
	public void user_calls_the_post_http_method_with(String resource) 
	{
		APIResources resources=APIResources.valueOf(resource);
		
	    res =  req.when().post(resources.getResource()).then().extract().response();

	    
	    if (resource.equals("loginAPI"))
	    {
	    	LoginResponsePojo s =  res.as(LoginResponsePojo.class);
		    token =s.getToken() ;
		    System.out.println(token);
		    userid = s.getUserId();	
		}
	    
	    else if (resource.equals("addProductAPI"))
	    {
			AddProductPojo s = res.as(AddProductPojo.class);
			productid = s.getProductId();
		}
	    
	    else if(resource.equals("createOrderAPI"))
	    {
	    	CreateOrderPojo s=res.as(CreateOrderPojo.class);
	    	orderid=s.getOrders().get(0);
	    }	    
	}
	
	

	@When("user calls the delete http method with {string}")
	public void user_calls_the_delete_http_method_with(String resource) {
		
		APIResources resources=APIResources.valueOf(resource);
		
	    res =  req.when().delete(resources.getResource()).then().extract().response();
	    DelOrderPojo s = res.as(DelOrderPojo.class);
		msg = s.getMessage();
	}
}

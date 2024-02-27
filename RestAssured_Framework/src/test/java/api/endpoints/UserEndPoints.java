package api.endpoints;

import static io.restassured.RestAssured.given;


import api.payloads.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class UserEndPoints {
	
	public static Response createUser(User payload)
	{
		Response rs=given().contentType(ContentType.JSON)
					.body(payload).when()
					.post(Routes.post_URL);		
		return rs;
	}
	
	public static Response getUser(String UserName)
	{
		Response rs=given()
				.pathParam("username",UserName)
				.when()
				.get(Routes.get_URL);		
		return rs;
	}
	
	public static Response updateUser(String UserName,User payload)
	{
		Response rs=given().contentType(ContentType.JSON)
					.body(payload)
					.pathParam("username",UserName)
					.when()
					.put(Routes.update_URL);	
		return rs;
	}
	
	public static Response deleteUser(String UserName)
	{
		Response rs=given()
				.pathParam("username",UserName)
				.when()
				.delete(Routes.delete_URL);	
		return rs;
	}
}

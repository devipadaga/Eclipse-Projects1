package resources;

import static io.restassured.RestAssured.*;

import java.io.File;

import  io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class utils {
	
	RequestSpecification reqlogin;
	
	public RequestSpecification reqSpecification()
	{
		
		 reqlogin=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
				setContentType(ContentType.JSON).build();
		 return reqlogin;
	}
	
	
		
	public RequestSpecification reqSpec_CreateProduct(String userid)
	{
		RequestSpecification addProd = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/").
				build();	
				
		RequestSpecification req=given().spec(addProd)		
		.param("productAddedBy", userid)
		.param("productName", "qwerty")
		.param("productCategory","fashion")
		.param("productSubCategory", "shirts")
		.param("productPrice", "11500")
		.param("productDescription", "Addias Originals")		
		.param("productFor","women")
	    .multiPart("productImage", new File("C:\\Users\\SPURGE\\Downloads\\carimg.jpg"));
		
		return req;
	}
	
	
	public ResponseSpecification responseSpecification()
	{
	  ResponseSpecification resLogin=new ResponseSpecBuilder().expectStatusCode(200).
			expectContentType(ContentType.JSON).build();
	return resLogin;
	}
}

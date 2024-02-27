package restAssure_rahulShetty;

import  static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;


public class CRUD_operations {
	
	public static String placeid="";
	
	public static void addplace()
	{
		//RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String str=given().header("Content-Type","application/json").queryParam("key","qaclick123").
		body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Sowmya house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "").
		when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).extract().
				response().asPrettyString();
		
		System.out.println(str);
		
		JsonPath js=new JsonPath(str);
		
		placeid=js.getString("place_id");
		System.out.println(placeid);
	}

	public static void getPlace()
	{
		
		String get=given().queryParam("key","qaclick123").queryParam("place_id",placeid).
		when().get("/maps/api/place/get/json").then().extract().
		response().asPrettyString();
		
		System.out.println(get);
	}
	
	public static void put()
	{
		String address=given().header("Content-Type","application/json").queryParam("key","qaclick123").
		body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\"Uppal,Hyderabad\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("/maps/api/place/update/json").then().extract().
		response().asPrettyString();
		
		System.out.println(address);
	}
	
	public static void deletePlace()
	{
		String del=given().header("Content-Type","application/json").queryParam("key","qaclick123").
				body("{\r\n"
						+ "    \"place_id\":\""+placeid+"\"\r\n"
						+ "}").
				when().delete("/maps/api/place/delete/json").then().extract().response().asPrettyString();
		
		System.out.println(del);
	}
	
	public static void main(String[] args)
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		
		addplace();
		System.out.println("*************************************");
		getPlace();
		System.out.println("*************************************");
		put();
		System.out.println("*************************************");
		getPlace();
		System.out.println("*************************************");
		deletePlace();
		System.out.println("*************************************");
		getPlace();
	}

}

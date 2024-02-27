package api_with_RestAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class PersonDetails {
	
	
	public static void postUserDetails()
	{
		String res=given().header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"FirstName\" : \"Arun\",\r\n"
						+ "    \"LastName\"  :   \"Padaga\",\r\n"
						+ "    \"Email\":\"arun@gmail.com\",\r\n"
						+ "    \"Phone \":\"3456789\"\r\n"
						+ "}")
				.when().post("http://localhost:3000/personDetails").then().extract().response().asPrettyString();
		
		
		System.out.println(res);
	}
	
	
	public static void DeleteUserDetails()
	{
		String res=given().header("Content-Type","application/json")
				.when().delete("http://localhost:3000/personDetails/4").then().extract().response().asPrettyString();
		
		
		System.out.println(res);
	}

	public static void main(String[] args) {

//			RestAssured.baseURI ="http://localhost:3000/personDetails";
			
//			Response res=given().when().get();
//			String s=res.jsonPath().get("FirstName[1]").toString();
			
			
			postUserDetails();
			System.out.println();
			DeleteUserDetails();
	}

}

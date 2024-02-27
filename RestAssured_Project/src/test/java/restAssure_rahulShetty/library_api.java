package restAssure_rahulShetty;

import  static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;


public class library_api 
{
	
	public static String id="";
	
	public static void post()
	{
		String s1=given().header("Content-Type","application/json").
				body("{\r\n"
						+ "\r\n"
						+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
						+ "\"isbn\":\"bcd\",\r\n"
						+ "\"aisle\":\"227\",\r\n"
						+ "\"author\":\"John foe\"\r\n"
						+ "}").when().post("Library/Addbook.php").then().extract().
				response().asPrettyString();
		
		System.out.println(s1);
		
		JsonPath js=new JsonPath(s1);
		
		id=js.getString("ID");
		System.out.println(id);
	}
	
	public static void get()
	{
		String get=given().queryParam("AuthorName","John foe").
				when().get("/Library/GetBook.php").then().extract().
				response().asPrettyString();
				
				System.out.println(get);
				
				
	}

	
	/*
	 * public static void put() { String
	 * address=given().header("Content-Type","application/json").queryParam("ID=",
	 * "338"). body(""). when().put("Library/GetBook.php").then().extract().
	 * response().asPrettyString();
	 * 
	 * System.out.println(address); }
	 */
	
	
	public static void delete()
	{
		String del=given().header("Content-Type","application/json").
				body("{\r\n"
						+ " \r\n"
						+ "\"ID\" : \""+id+"\"\r\n"
						+ " \r\n"
						+ "} ").
				when().delete("/Library/DeleteBook.php").then().extract().response().asPrettyString();
		
		System.out.println(del);
	}
	public static void main(String[] args) 
	{
		
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		
		 post();
		 System.out.println("********************************");
//		 get();
		 System.out.println("********************************");
		 
//		 delete();
		 System.out.println("********************************");
//		 get();
	}

}

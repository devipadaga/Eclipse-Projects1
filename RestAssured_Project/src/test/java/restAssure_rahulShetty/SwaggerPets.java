package restAssure_rahulShetty;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SwaggerPets {
	
	
	static RequestSpecification reqLogin=new RequestSpecBuilder().setBaseUri("https://petstore.swagger.io/v2").
			setContentType(ContentType.JSON).build();
	
	static ResponseSpecification resLogin=new ResponseSpecBuilder().expectStatusCode(200).
			expectContentType(ContentType.JSON).build();
	
	public static String Username="";
	
	
	public static String Payload1()
	{
		return "{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"username\": \"Sowmya1\",\r\n"
				+ "  \"firstName\": \"REST\",\r\n"
				+ "  \"lastName\": \"assured\",\r\n"
				+ "  \"email\": \"rest123@gmail.com\",\r\n"
				+ "  \"password\": \"string123\",\r\n"
				+ "  \"phone\": \"123456\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}" ;
	}
	
	public static String Payload2()
	{
		return "{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"username\": \"Sowmya123\",\r\n"
				+ "  \"firstName\": \"REST\",\r\n"
				+ "  \"lastName\": \"assured\",\r\n"
				+ "  \"email\": \"rest123@gmail.com\",\r\n"
				+ "  \"password\": \"string123\",\r\n"
				+ "  \"phone\": \"123456\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}" ;
	}
	
	
	public static void CreateUser()
	{
		
		String createuser=given().spec(reqLogin).body(Payload1())
				.when().post("/user").then().spec(resLogin).extract().
		response().asPrettyString();
		
		System.out.println(createuser);
		
	}
	
	
	public static void getUserDetails()
	{
		
		String getuser=given().spec(reqLogin)
				.when().get("/user/Sowmya").then().spec(resLogin).extract().
		         response().asPrettyString();
		System.out.println(getuser);
		JsonPath js=new JsonPath(getuser);
		
		Username=js.getString("username");
	}
	
	
	public static void updateUserDetails()
	{		
		String updateuser=given().spec(reqLogin).body(Payload2())
				.when().put
				("/user/"+Username+"").then().spec(resLogin).extract().
		         response().asPrettyString();
		System.out.println(updateuser);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{

		CreateUser();
		
		System.out.println("******************************");
		
		getUserDetails();
		
		System.out.println("******************************");
		
		updateUserDetails();
		
	}

}

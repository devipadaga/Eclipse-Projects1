package api_with_RestAssured;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONTokener;

import static org.hamcrest.Matchers.equalTo;

public class ReadDataInMultipleWays {
	
	public static void PassDATA_HashMap(String uri,Map<String, String> map)
	{
		RestAssured.baseURI=uri;
		
		String str=given().header("Content-Type","application/json").body(map)
				.when().post().then().header("Content-Type","application/json; charset=utf-8")
				.log().all().extract().response().asPrettyString();
		
		System.out.println(str);		
	}

	
	public static void PassDATA_JSONObject(String uri,JSONObject js)
	{
		RestAssured.baseURI=uri;
		
		String str=given().header("Content-Type","application/json").body(js.toString())
				.when().post().then().body("FirstName",equalTo("Bhavani")).header("Content-Type","application/json; charset=utf-8")
				.log().all().extract().response().asPrettyString();
		
		System.out.println(str);		
	}
	
	
	public static void PassDATA_ExternalJSONFile(String uri,File fi) throws FileNotFoundException
	{
		RestAssured.baseURI=uri;
		
		FileReader fr=new FileReader(fi);
		JSONTokener jtoken=new JSONTokener(fr);
		JSONObject j=new JSONObject(jtoken);
		String str=given().header("Content-Type","application/json").body(j.toString())
				.when().post().then().body("FirstName",equalTo("Pranuthi")).header("Content-Type","application/json; charset=utf-8")
				.log().all().extract().response().asPrettyString();
		
		System.out.println(str);		
	}
	
	public static void PassDATA_POJO(String uri,PersonPojo P) throws FileNotFoundException
	{
		RestAssured.baseURI=uri;
		
		
		String str=given().header("Content-Type","application/json").body(P)
				.when().post().then().body("FirstName",equalTo("AGP")).header("Content-Type","application/json; charset=utf-8")
				.log().all().extract().response().asPrettyString();
		
		System.out.println(str);		
	}

	
	public static void main(String[] args) throws FileNotFoundException {
		
		String uri="http://localhost:3000/personDetails";
		
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("FirstName","Tirumala");
		map.put("LastName","Kadiyam");
		map.put("Email", "Tirumala123@gmail.com");
		map.put("Phone", "1234567890");

		JSONObject js=new JSONObject();
		js.put("FirstName","Bhavani");
		js.put("LastName","Kadiyam");
		js.put("Email", "Bhavani123@gmail.com");
		js.put("Phone", "424242424242");

		File fi=new File("C:\\Users\\SPURGE\\Documents\\json files\\names.json");
		
		PersonPojo P=new PersonPojo();
		P.setFirstName("AG");
		P.setLastName("P");
		P.setEmail("AGP@gmail.com");
		P.setPhone("123456789");
		
		
//		PassDATA_HashMap(uri, map);
//		PassDATA_JSONObject(uri,js);
//		PassDATA_ExternalJSONFile(uri,fi);
		PassDATA_POJO(uri,P);
	}

}

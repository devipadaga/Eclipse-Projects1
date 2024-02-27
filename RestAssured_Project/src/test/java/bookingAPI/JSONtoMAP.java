package bookingAPI;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured.*;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class JSONtoMAP {
	
	Map<String,Object> responseBody=null;
	List<Map<String,Object>> responseBody1=null;
	
	//@Test
	public void m1()
	{
		responseBody=given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"firstname\" : \"prem\",\r\n"
						+ "    \"lastname\" : \"prem\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
				.when().post().then().extract()
				.body().as(new TypeRef<Map<String,Object>>(){});
		
		System.out.println("Booking id is :"+responseBody.get("bookingid"));
		System.out.println(responseBody);

		Map<String,Object> BookingDetails=(Map<String, Object>) responseBody.get("booking");		
		for(Object obj:BookingDetails.entrySet())
		{
			System.out.println(obj.toString());
		}
	}
	
	
	@Test
	public void m2()
	{
		responseBody1=given().baseUri("https://restful-booker.herokuapp.com/").basePath("booking")
				.contentType(ContentType.JSON).when().get().
				then().extract().body()
				.as(new TypeRef<List<Map<String,Object>>>(){});
		
		System.out.println("Total id's are :"+responseBody1.size());
		System.out.println("All id's are");
		
		
		
		for(Map<String,Object> obj1:responseBody1)
		{
			System.out.println(obj1.get("bookingid"));
		}
	}

	
	
}

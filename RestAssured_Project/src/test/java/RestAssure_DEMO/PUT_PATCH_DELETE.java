package RestAssure_DEMO;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PUT_PATCH_DELETE {
	
	
	@Test
	public void test1_PUT()
	{	
		JSONObject request=new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString())
		.when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).log().all();
		
		
	}
	
	
	@Test
	public void test2_PATCH()
	{	
		JSONObject request=new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString()).
		when().patch("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
		
		
	}
	
	
	@Test
	public void test3_DELETE()
	{		
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();;
		
		
	}

}

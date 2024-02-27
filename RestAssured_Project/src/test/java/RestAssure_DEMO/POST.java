package RestAssure_DEMO;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class POST {
	
	
	@Test
	public void test1()
	{
//		Map<String,Object>map=new HashMap<String,Object>();
//		
//		map.put("name", "Raghav");
//		map.put("job", "Teacher");
//		System.out.println(map);
		
		
		JSONObject request=new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().statusCode(201);
		
		
	}

}

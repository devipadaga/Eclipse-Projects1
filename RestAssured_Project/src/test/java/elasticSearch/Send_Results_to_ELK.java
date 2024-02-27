package elasticSearch;

import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import io.restassured.response.Response;

public class Send_Results_to_ELK {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<>();
		map.put("name","Sowmya");
		map.put("NickName","Sow");
		map.put("Series","07");
		
		Response response= given().header("Content-Type","application/json")
				.log().all().body(map) 
				.post("http://localhost:9200/regression/suite");
		
		Assert.assertEquals(response.statusCode(),201);
		
		response.prettyPrint();
	}

}

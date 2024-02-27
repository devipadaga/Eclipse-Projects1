package DDT;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import org.testng.annotations.*;

public class Get_PetbyStatus {
	
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
	}
	
	
	
	@Test(dataProvider="petStatusfromExcel")
	public void test(String status)
	{
		Response response=given().header("Content-Type","application/json")
				.when().get("/pet/findByStatus?status="+status+"")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());
		System.out.println("*******************************");
	}
	
	
//	@Test(dataProvider="petStatus_1")
//	public void test3(String Status) {
//			
//		given().header("Content-Type","application/json")
//			.queryParam("status",Status).
//		when().
//			get("/pet/findByStatus").
//		then().
//			assertThat().statusCode(200);
//	}
//	
	

	
	@DataProvider(name="petStatus_1")
	public String[][] testData()
	{
		String[][] obj=new String[][]
		{
			{"available"},
			{"sold"},
			{"pending"}
		};
		
		return obj;		
	}
	

	
	@DataProvider(name = "petStatusfromExcel")
	public String[][] petStatus() throws IOException 
	{		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\DDT\\petstatus.xlsx";

		int rownum = XLUtils.getRowCount(path, "Status");
		
		int colnum = XLUtils.getCellCount(path, "Status", 1);
		
		System.out.println(rownum+","+colnum);
		
		String status[][] = new String[rownum][colnum];
		for (int i = 0; i < rownum; i++) 
		{		
			int j=colnum-1;
			
				status[i][j] = XLUtils.getCellData(path, "Status", i+1, j);
//				System.out.println(status[i][j]);
		}		
		
		return status;
	}
	
	
	
	
	
	
	
	
	
/*	
	@Test(dataProvider = "getempdatalist")
	public void postAddNewEmployee(String ename,String esal,String eage) {

	    RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";

	    RequestSpecification httprequest=RestAssured.given();

	    JSONObject requestparams= new JSONObject();

	    requestparams.put("name", "ename");  name=ename
	    requestparams.put("salary", "esal");
	    requestparams.put("age", "eage");

	    httprequest.header("Content-Type","application/json");
	    httprequest.body(requestparams.toJSONString());  name : json

	    Response response=httprequest.request(Method.POST,"/create");

	    String responsebody=response.getBody().asString();
	    System.out.println("Respose Body is :");
	    System.out.println(responsebody);


	    int statuscode=response.statusCode();
	    int statuscode1=response.getStatusCode();
	    System.out.println(statuscode);
	    System.out.println(statuscode1);
	    
	    */
}

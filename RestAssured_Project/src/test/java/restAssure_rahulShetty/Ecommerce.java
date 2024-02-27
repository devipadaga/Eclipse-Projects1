package restAssure_rahulShetty;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import groovy.lang.Buildable;
import groovyjarjarpicocli.CommandLine.Spec;



public class Ecommerce {
	
	public static String userid="";
	public static String id="";	
	public static String token="";
	public static String Orderid="";
	
	
	static RequestSpecification reqLogin=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
			setContentType(ContentType.JSON).build();
	
	static ResponseSpecification resLogin=new ResponseSpecBuilder().expectStatusCode(200).
			expectContentType(ContentType.JSON).build();
	
	
	public static String LoginBody()
	{
		return "{\r\n"
				+ "    \"userEmail\": \"devi@gmail.com\",\r\n"
				+ "    \"userPassword\": \"Devi@123456\"\r\n"
				+ "}" ;
	}

	
	
	
	public static void login()
	{	
		String Login=given().spec(reqLogin).body(LoginBody()).
				when().post("/api/ecom/auth/login").
				then().spec(resLogin).extract().response().asPrettyString();
				
				System.out.println(Login);
				
				JsonPath js=new JsonPath(Login);
				
				userid=js.getString("userId");
				token=js.getString("token");

	}
	
	
	public static void addProduct() throws InterruptedException
	{		
		String AddProduct=given().header("Authorization",token)
				.header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>")
				.multiPart("productAddedBy", userid)
				.multiPart("productName", "qwerty")
				.multiPart("productCategory","fashion")
				.multiPart("productSubCategory", "shirts")
				.multiPart("productPrice", "11500")
				.multiPart("productDescription", "Addias Originals")
			
				.multiPart("productFor","women")
			    .multiPart("productImage", new File("C:\\Users\\SPURGE\\Downloads\\carimg.jpg")).
				when().post("/api/ecom/product/add-product").then().extract().
				response().asPrettyString();
		
		Thread.sleep(5000);
				
				System.out.println(AddProduct);
				
					JsonPath js=new JsonPath(AddProduct);
				
					id=js.getString("productId");
				System.out.println(id);
				
				
	}

	
	public static void PlaceOrder()
	{
		String P_Order=given().spec(reqLogin).header("Authorization",token).
				body("{\r\n"
						+ "    \"orders\": [\r\n"
						+ "        {\r\n"
						+ "            \"country\": \"India\",\r\n"
						+ "            \"productOrderedId\": \""+id+"\"\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}").
				when().post("/api/ecom/order/create-order").then().extract().
				response().asPrettyString();
				
				System.out.println(P_Order);
				
				JsonPath js=new JsonPath(P_Order);
				
				Orderid=js.getString("orders");
				System.out.println(Orderid+" ordre id is");
	}
	
	
	public static void DelProduct()
	{
		String D_product=given().header("Authorization",token).
				when().delete("/api/ecom/product/delete-product/"+id+"").then().extract().
				response().asPrettyString();
				
				System.out.println(D_product);
				
	}

	
	public static void DelOrder()
	{
		String D_Order=given().header("Authorization",token).
				when().delete("/api/ecom/order/delete-order/"+Orderid+"").then().extract().
				response().asPrettyString();
				
				System.out.println(D_Order);
	}

	//public static void getorderDetails()
	//{
//		String details= given().log().all().header("Authorization",token).header("Content-Type","application/json").
//		 body("{\r\n"
//		 		+ "    \"productName\": \"\",\r\n"
//		 		+ "    \"minPrice\": null,\r\n"
//		 		+ "    \"maxPrice\": null,\r\n"
//		 		+ "    \"productCategory\": [],\r\n"
//		 		+ "    \"productSubCategory\": [],\r\n"
//		 		+ "    \"productFor\": []\r\n"
//		 		+ "}").
//		when().post("/api/ecom/product/get-all-products").then().log().all().extract().
//		response().asPrettyString();
	//	
////		 System.out.println(details);
//		 JsonPath js=new JsonPath(details);
//		 
//		 List<JsonPath> l;
//		l=js.getList("data");
	//	
////		System.out.println(l.s);
	//	
//		for (int i = 0; i < l.size(); i++) {
//			
//			System.out.println(l.get(i).get("_id"));
//		}	
//		 int size=js.getInt("data.size()");
////		 System.out.println(size);
//		 
////		 for(int i=0;i<size;i++)
////		 {
////		String iid=js.getString("data["+i+"]._id");
////		System.out.println(iid);
////		 }
	//	
	//}
	public static void main(String[] args) throws InterruptedException 
	{	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		login();
		
		System.out.println("***************************");
		addProduct();
		
		System.out.println("***************************");
		PlaceOrder();
		
		System.out.println("***************************");
//		DelProduct();
		
//		getorderDetails();
		
		DelOrder();
	}

}

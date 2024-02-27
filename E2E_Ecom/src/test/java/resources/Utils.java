package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Utils
{
	static RequestSpecification request,req1;
	
	
	public RequestSpecification reqSpec() throws IOException
	{
		PrintStream stream=new PrintStream(new File("Logger.txt"));

		if(request==null)
		{
			request = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUri"))
					.addFilter(RequestLoggingFilter.logRequestTo(stream))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream))
					.setContentType(ContentType.JSON).build();
		}
		return request;
	}



	public RequestSpecification reqSpecforAddproduct(String userId) throws IOException
	{
		//RequestSpecification addProd = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/").
		//		build();


		req1 = given().spec(reqSpec()).header("Content-Type","multipart/form-data").param("productName","qwerty").
				param("productAddedBy",userId).param("productCategory","fashion").
				param("productSubCategory","shirts").param("productPrice","11500").
				param("productDescription","Addias Originals").param("productFor","women").
				multiPart("productImage",new File("C:\\Users\\SPURGE\\Downloads\\downloadteddy.jpg"));
		return req1;
	}

/*	
	public RequestSpecification reqSpec_Del(String orderid) throws IOException
	{
		PrintStream stream=new PrintStream(new File("Logger.txt"));

		if(request==null)
		{
			request = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUri"))
					.addFilter(RequestLoggingFilter.logRequestTo(stream))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream))
					.setContentType(ContentType.JSON).build();
		}
		return request;
	}
*/
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SPURGE\\eclipse-workspace\\E2E_Ecom\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);

		return prop.getProperty(key);

	}
}




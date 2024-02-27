package api.tests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.payloads.User;
import io.restassured.response.Response;

public class UserTests {
	
	Faker faker;
	User userpayload;
	public Logger logger;
	
	@BeforeClass
	public void setupdata()
	{
		faker=new Faker();
		userpayload=new User();
		
		userpayload.setId(faker.idNumber().hashCode());
		userpayload.setUsername(faker.name().username());
		userpayload.setFirstname(faker.name().firstName());
		userpayload.setLastname(faker.name().lastName());
		userpayload.setEmail(faker.internet().safeEmailAddress());
		userpayload.setPassword(faker.internet().password(5,10));
		userpayload.setPhone(faker.phoneNumber().cellPhone());

		logger=LogManager.getLogger(this.getClass());
	}
	
	@Test(priority=1)
	public void postUser()
	{
		logger.info("***************CREATING USER********************");
		Response response=UserEndPoints.createUser(userpayload);
				response.then().log().all();
				
				Assert.assertEquals(response.statusCode(),200);
		
	}
	
	@Test(priority=2)
	public void getUserbyName()
	{
		logger.info("******GETTING USER************");
		Response response=UserEndPoints.getUser(userpayload.getUsername());
				response.then().log().all();
				
				Assert.assertEquals(response.statusCode(),200);			
	}
	
	@Test(priority=3)
	public void update()
	{
		logger.info("*********UPDATING USER*********");
		Response response=UserEndPoints.updateUser(userpayload.getUsername(),userpayload);
				response.then().log().all();
				
				Assert.assertEquals(response.statusCode(),200);
		logger.info("******UPDATED USER**********");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	try{
//	     JSONArray ja = response.getJSONArray(TAG_RESULTS);
//	     for(int i=0; i < ja.length(); i++){
//
//	          JSONObject jsonObject = ja.getJSONObject(i);
//	          id = Integer.parseInt(jsonObject.getString("id").toString());
//	          name = jsonObject.getString(TAG_NAME);
//	          branch = jsonObject.getString(TAG_BRANCH);
//	          sem = jsonObject.getString("semester");
//	          photo_url=jsonObject.getString("photo");
//	          email=jsonObject.getString("email");
//	          mobile=jsonObject.getString("mobile");
//	          dob=jsonObject.getString("dob");
//	          getAllStudentModel = new GetAllStudentModel(id,name,branch,sem,photo_url,email,mobile,dob);
//	          list.add(getAllStudentModel);
//	     }
//	 }catch(JSONException e){e.printStackTrace();}
	
	

}

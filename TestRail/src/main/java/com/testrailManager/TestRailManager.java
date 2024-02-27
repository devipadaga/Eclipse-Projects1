package com.testrailManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;

public class TestRailManager {
	
	public static String TEST_RUN_ID="2";
	
	public static String TEST_RUN_USERNAME="tirumala_kadiyam@grhombus.com";
	public static String TEST_RUN_PASSWORD="Sowmya1@";
	
	public static String TEST_RUN_ENGINE_URL="https://devi19.testrail.io/";
	
	public static final int TEST_RUN_PASS_STATUS=1;
	public static final int TEST_RUN_FAIL_STATUS=5;
	
	
	public static void addResultsforTestCAse(String testCaseID,int status,String error) throws MalformedURLException, IOException, APIException
	{
		String testRunID=TEST_RUN_ID;
		APIClient client=new APIClient(TEST_RUN_ENGINE_URL);
		
		client.setUser(TEST_RUN_USERNAME);
		client.setPassword(TEST_RUN_PASSWORD);
		
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("status_id",status);
		data.put("comment","this test is exceuted via google"+error);
		
		JSONObject c = (JSONObject) client.sendGet("get_case/"+testCaseID+"");
		System.out.println(c.get("title"));
		
		client.sendPost("add_result_for_case/"+testRunID+"/"+testCaseID, data);
		
		//JSONObject j = (JSONObject) client.sendPost("add_attachment_to_result/"+testRunID+"", "C:\\Users\\SPURGE\\Pictures\\Screenshots\\OrangeHRM_TestRail.JPG");
	}
}

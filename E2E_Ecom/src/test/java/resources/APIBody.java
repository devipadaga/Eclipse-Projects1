package resources;

public class APIBody 
{
	public String loginAPIBody()
	{
		String s = "{\r\n"
				+ "    \"userEmail\": \"devi@gmail.com\",\r\n"
				+ "    \"userPassword\": \"Devi@123456\"\r\n"
				+ "}";
		return s;
	}
	
	public String createOrderApiBody(String pId)
	{
		String s= "{\"orders\":[{\"country\":\"India\",\"productOrderedId\":\""+pId+"\"}]}";
		return s;
	}
	
	
	
	
}

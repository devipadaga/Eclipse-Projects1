package resources;

public class API_Body {
	
	
	public static String LoginBody()
	{
		return "{\r\n"
				+ "    \"userEmail\": \"devi@gmail.com\",\r\n"
				+ "    \"userPassword\": \"Devi@123456\"\r\n"
				+ "}" ;
	}
	
	public static String PlaceOrder()
	{
		return "{\r\n"
				+ "    \"orders\": [\r\n"
				+ "        {\r\n"
				+ "            \"country\": \"India\",\r\n"
				+ "            \"productOrderedId\": \"6454ed91568c3e9fb1648703\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
	}

}

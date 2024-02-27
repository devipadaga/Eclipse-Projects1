package api.endpoints;


public class Routes {
		
	public static String baseURL="https://petstore.swagger.io/v2";
	
	//User
	public static String post_URL=baseURL+"/user";
	public static String get_URL=baseURL+"/user/{username}";
	public static String update_URL=baseURL+"/user/{username}";
	public static String delete_URL=baseURL+"/user/{username}";

}

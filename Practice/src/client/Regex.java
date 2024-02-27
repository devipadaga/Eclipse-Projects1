package client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {


		Pattern pattern=Pattern.compile("Sowmya",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher=pattern.matcher("sowmya");
		
		Boolean matchfound=matcher.find();
		
		if(matchfound)
		{
			System.out.println("MATCH IS FOUND");
		}
		
		else
		{
			System.out.println("NOT FOUND");
		}
		

	}

}

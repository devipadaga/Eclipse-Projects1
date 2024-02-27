package topic;

interface Saying
{
	public String say(String message);}

public class LambdaMultipleStatements {

	public static void main(String[] args) {
		
		Saying s=(message)->
		{
			String str1="Tirumala Devi";
			String str2=str1+message;
			return str2;
			};
			System.out.println(s.say(" Loves Arun Kumar"));
		}
}

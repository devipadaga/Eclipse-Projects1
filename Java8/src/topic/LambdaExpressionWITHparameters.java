package topic;

	// WITHOUT PARAMETERS

//interface Sayable
//{
//	public String say();}
//
////public class LambdaExpressionWITHparameters {
////
////	public static void main(String[] args) {
////		
//		Sayable s=()->
//		{
//			return "hello Hii Namaste Vanakkam Aadhab.......";
//		};
//		
//		System.out.println(s.say());
//
//	}
//
//}

		//  WITH SINGLE PARAMETER

//interface Sayable
//{
//	public String say(String name);}
//
//public class LambdaExpressionWITHparameters
//{
//public static void main(String args[])
//{
//	Sayable s=(name)->
//			{
//		//return name;
//		return "Hello "+name;
//			};
//			
//			System.out.println(s.say("sonooo"));
//	}
//}


		//  WITH TWO PARAMETERS
interface Addable
{
	int add(int a,int b);}

public class LambdaExpressionWITHparameters
{
	public static void main(String args[])
	{
		
		
		 // Multiple parameters in lambda expression
		Addable addition1=(a,b)->(a+b);
		System.out.println(addition1.add(100, 200)); 
	
        // Multiple parameters with data type in lambda expression  
        Addable addition2=(int a,int b)->(a+b);  
        System.out.println(addition2.add(1000,2000));  
        
        
        System.out.println();
        System.out.println("**********WITH & WITHOUT RETURN***********************");
        
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(1,2));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(10,20));  

	}
}
package topic;


	//Without Lambda Expression

//interface Drawable{  
//    public void draw();  
//}  
//public class LambdaExpressionEx {  
//    public static void main(String[] args) {  
//        int width=10;  
//  
//        //without lambda, Drawable implementation using anonymous class  
//        Drawable d=new Drawable(){  
//            public void draw(){System.out.println("Drawing "+width);}  
//        };  
//        d.draw();  
//    }  
//}  


		//With Lambda Expression

interface Drawable{
	public void draw();
}

public class LambdaExpression{
	public static void main(String args[])
	{
		int width=20;
		
		 //with lambda
		Drawable d=()->
		{
			System.out.println("Drawable "+width);
		};
		
		d.draw();
		
	}
	

}
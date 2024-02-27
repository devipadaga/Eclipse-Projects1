package BasicPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num=12345,reverse=0;
		
		while(num!=0)
		{
		int rem = num%10;
		reverse=reverse*10+rem;
		num=num/10;
		
		}
		
		System.out.println("Reverse of a num:"+reverse);
	
	
		//*******************************************************************************************
	System.out.println("USING STRINGBUFFER");
	
	StringBuffer sb=new StringBuffer();
	String.valueOf(num);
	sb.reverse();
	
	System.out.println("Reverse of a num+++++++++:"+reverse);
	
	


}
}
	
	
	
	
	
	
	



package progarmssssssssssssssss;

public class Spy_Number {

	public static void main(String[] args) {
		int num=132,product=1,sum=0, lastdigit;
		
		while(num>0)
		{
			lastdigit=num%10;		//finds the last digit of the number
			sum=sum+lastdigit;
			product=product*lastdigit;	
			num=num/10;						//removes the last digit from the given number
		}
		
		if(sum==product)
			System.out.println(" is a Spy Number");
		else
			System.out.println(" is not  a Spy Number");
	}

}

package BasicPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/*  153=   1  5  3
				 (1*1*1) + (5*5*5)+  (3*3*3)
				 1        + 125   +   27
			 =	 153
		*/
		
		int num=153;
		int r, cube=0;
		int t=num;
		
		while(num!=0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
			
		}
		System.out.println(cube);
		
		if(t==cube)
		{
			System.out.println(cube+" is armstrong");
		}
		else
		{
			System.out.println(cube+"  not an armstrong");
		}
	}

}

package aSSIGNMENTS;

public class division_without_operator {

	public static void main(String[] args) {
		
		int a=10,b=2,c,result=0;

		c=a+b;
		while(c>b)
		{
			c=c-b;
			result++;
		}
		System.out.println(result);
		
		//2nd Approach		
		int m=32,n=4,R=m,Q = 0;
		while(R>=n)
		{
		R=R-n;
		Q=Q+1;
		}
		System.out.println(Q);
		
		
	}

}

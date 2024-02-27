package progarmssssssssssssssss;

public class Fib_Series {

	//0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		
		int num=10,t1=0,t2=1;
		for(int i=0;i<=num;i++)
		{
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		

	}

}

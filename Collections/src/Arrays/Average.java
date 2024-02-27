package Arrays;

public class Average {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40, 50};
		
		int size=a.length,sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		double avg=sum/size;
		System.out.println(avg);

	}

}

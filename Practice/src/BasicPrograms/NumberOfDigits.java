package BasicPrograms;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int num=12345;
		int count=0;
		
		while(num!=0)
		{
			num=num/10;  // 123  12  1  0
			count++;    // 1 2 3 4 5
		}
		System.out.println(count);
	}

}

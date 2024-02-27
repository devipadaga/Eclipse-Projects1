package Concepts;

public class GenericMethod {
	
	public static <T> void print(T[] Input)
	{
		for(T s:Input)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Integer[] intArr = { 1, 2, 3, 4, 5 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	    String []  stringArray= {"hhh","ttt","rrr"};

	
	    print(intArr);
	    print(stringArray);
	    print(charArray);
	    print(doubleArray);
	
	
	}

}

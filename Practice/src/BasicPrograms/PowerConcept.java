package BasicPrograms;

public class PowerConcept {

	public static void main(String[] args) {
		
		// 3^4=81
		int base=3;
		int exponent=4;
		int result = 1 ;
		
		while(exponent!=0)
		{
			result*=base;  // (or)result*base
			--exponent;
		}
		System.out.print(result);
	}

}

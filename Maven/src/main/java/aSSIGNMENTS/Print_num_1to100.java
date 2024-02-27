package aSSIGNMENTS;

public class Print_num_1to100 {


	public static void main(String[] args)
	{	
		print(1);
	}


	public static void print(int number)
	{
		//int number=1;
		if(number<=100)
		{		
			//number++;
			System.out.print(number+" ");
			print(number+1);
		}

	}
}

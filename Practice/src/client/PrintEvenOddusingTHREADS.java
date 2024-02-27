package client;

public class PrintEvenOddusingTHREADS {
	
	int counter=1;
	static int N;
	
	public void PrintOdd()
	{
		synchronized (this) {
			
			while(counter<N)
			{
				while(counter%2==0){
					
					try
					{
						wait();
					}
					
					catch(Exception e)
					{
						e.printStackTrace();
					}	
				}
				System.out.println(counter);
				
				counter++;
				notify();
			}
		}
	}
	
	
	public void printEven()
	{
		synchronized(this)
		{
			while(counter<N)
			 {
				while(counter%2==1)
				{
					try
					{
						wait();
						}
					catch(Exception e)
					{
						e.printStackTrace();
						}
				}
				System.out.println(counter);
				counter++;
				notify();
			}
		}	
	}
	

	public static void main(String[] args) {
		
		N=10;
		
		PrintEvenOddusingTHREADS t=new PrintEvenOddusingTHREADS();
		
		Thread t1=new Thread(new Runnable()
				{
			public void run()
			{
				t.PrintOdd();
			}
				});
		
		Thread t2=new Thread(new Runnable()
				{
			public void run()
			{
				t.printEven();
			}
				});
		
		Thread t3=new Thread(new Runnable()
				{
			public void run()
			{
				System.out.println("0");
			}
				});
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}

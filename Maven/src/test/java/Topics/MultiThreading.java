package Topics;


// *****************EXTENDS THREAD CLASS********************************************
       /* public class MultiThreading extends Thread{

	    public void run()
	    {
	        try {
	           
	            System.out.println(  "Thread " + Thread.currentThread().getId() + " is running");
	        }
	        catch (Exception e) {
	            
	            System.out.println("Exception is caught");
	        }
	    }
	
	    public static void main(String[] args)
	    {
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            MultiThreading Thread= new MultiThreading();
	            Thread.start();
	        }
	    }
}
*/
	//********************IMPLEMENTING RUNNABLE INTERFACE********************************************8

 public class MultiThreading implements Runnable {
    public void run()
    {
        try {
            
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	/*MultiThreading thread=new MultiThreading();
            Thread t1 = new Thread(thread);
            */
        	   //(or)
        	   Thread t1=new Thread(new MultiThreading());
            t1.start();
        }
    }
}
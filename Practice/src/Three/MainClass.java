package Three;

//
//	public class MainClass
//	{
//	    public MainClass(int i, int j)
//	    {
//	        System.out.println(method(i, j));
//	    }
//	 
//	    int method(int i, int j)
//	    {
//	        return i++ + ++j;
//	    }
//	   
//	 
//	    public static void main(String[] args)
//	    {
//	        MainClass main = new MainClass(10, 20);
//	    }
//	}

class Display {
	 
	   //Private nested or inner class 
	   private class InnerDisplay {
	      public void display() {
	         System.out.println("Private inner class method called");
	      }
	   }
	 
	   void display() {
	      System.out.println("Outer class (Display) method called");
	      // Access the private inner class
	      InnerDisplay innerDisplay = new InnerDisplay();
	      innerDisplay.display();
	   }
	}
	 
	public class MainClass {
	 
	   public static void main(String args[]) {
	      // Create object of the outer class (Display)
	      Display object = new Display();
	 
	      // method invocation
	      object.display();
	   }
	}

	

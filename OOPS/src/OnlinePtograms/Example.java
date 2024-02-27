package OnlinePtograms;

//	
//	class Super 
//	{
//	    public int index = 1;
//	}
//
//	class App extends Super
//	{
//
//	    public App(int index) 
//	    {
//	        index = index;
//	    }
//	    
//	    public class Example 
//	    {
//
//	    public static void main(String args[]) 
//	    {
//	        App a=new App(10);
//	        System.out.println(a.index);
//	      
//	    }
//	}
//	}
//
//

//
//public class Example 
//{
//	
//String args[]= {"1","2"};
//
//public static void main(String args[])
//{
//	
//if(args.length>0)
//{
//	
//System.out.println(args.length);
//
//}
//
//}

public class Example
{
public static void main(String[] args) {
    class Name {
        public String name;

        public Name(String s) {
            name = s;
        }
    }

    Object obj = new Name("Java Quiz");
    Name n = (Name) obj;
    System.out.println(n.name);
}
}




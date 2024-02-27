package ppt;

public class OverloadArg {
	
		  void record(String studentName,char grade)
		  {
		    System.out.println("Student name is "+studentName);
		    System.out.println("Student grade is "+grade);
		  }
		  void record(int id,String studentName,char grade)
		  {
		    System.out.println("Student ID is "+id);
		    System.out.println("Student name is "+studentName);
		    System.out.println("Student grade is "+grade);
		  }
		  
		  public static void main(String[]args)
		  {
			  OverloadArg Obj=new OverloadArg();
			  Obj.record("Sowmya",'B');
			  Obj.record(8, "Devi", 'A');
		  }
}
	
	
//	static int add(int a,int b)
//	{
//		return a+b;
//	}
//	
//	static int add(int a,int b,int c)
//	{
//		return a+b+c;
//	}
//	public static void main(String[] args) {
//		
//		System.out.println(add(20, 20));
//		
//		System.out.println(add(20, 20, 20));
//	}
//
//}

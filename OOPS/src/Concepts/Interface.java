package Concepts;

 interface Maths{

	public void add();
	public void sub();
	
}
	interface Science extends Maths				//	Inheritence
	{
		public void PS();
		public void BS();
		
	}
	
	/* Even though this class is only implementing the
	    * interface Inf2, it has to implement all the methods 
	    * of Inf1 as well because the interface Inf2 extends Inf1
	    */
	
	// my own words::::implemented second interface thereby automatically calls 1st interface as 2nd interface is extended by 
			//2nd inteface
public class Interface implements Science {       
	
	@Override
	public void add() {
		System.out.println("IM IN ADD METHOD OF MATHS INTERFACE");
		
	}

	@Override
	public void sub() {
		System.out.println("IM IN SUB METHOD OF MATHS INTERFACE");
		
	}
	
	
	@Override
	public void PS() {
		System.out.println("IM IN PS METHOD OF SCIENCE INTERFACE");
		
	}

	@Override
	public void BS() {
		System.out.println("IM IN BS METHOD OF SCIENCE INTERFACE");
		
	}
	
	
	public static void main(String[] args) {
	
		Interface i=new Interface();
		i.add();
		i.sub();
		System.out.println("-------");
		i.BS();
		i.PS();

	}
}

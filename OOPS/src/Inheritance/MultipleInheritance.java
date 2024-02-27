package Inheritance;


interface daddy
{
	public void name();	
}

interface mummy
{
	public void Name();	
}

interface child
{
	public void peru();
}


class baby implements daddy,mummy,child
{

	@Override
	public void Name() 
	{
		System.out.println("LALITHA");
		
	}

	@Override
	public void name() 
	{
		System.out.println("SRINIVAS");
		
	}
	
	public void NName()
	{
		System.out.println("sowmya and bhavani");
	}
	
	@Override
	public void peru() 
	{
		System.out.println("AG");
		
	}
		
}
	
public class MultipleInheritance {

	public static void main(String[] args) {
		
		
		baby b=new baby();
		b.name();
		b.Name();
		b.NName();
		b.peru();
	
		

	}

}


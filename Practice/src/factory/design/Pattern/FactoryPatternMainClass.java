package factory.design.Pattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
	
		Factory f=new Factory();
		Profession name=f.getProfession("Engineer");
		name.print();
		
	}

}

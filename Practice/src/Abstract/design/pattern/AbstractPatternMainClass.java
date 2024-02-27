package Abstract.design.pattern;

public class AbstractPatternMainClass {

	public static void main(String[] args) {
		
		AbstractFactory af=AbstractFactoryProducer.getProfession(false);
		
		Profession name=af.getProfession("Teacher");
		name.print();

		

	}

}

package Codes;

public class Encapsulation {
	
	// Variables declared as private
	// These private variables can only be accessed by public methods of class
	private int age;
	private String name;
	// getter method to access private variable
	public int getAge(){
		return age;
}

		public String getName(){
			return name;
}
// setter method to access private variable
		public void setAge(int inputAge){
			age = inputAge;
		}
		public void setName(String inputName){
			name = inputName;
}

	 public static void main(String [] args){
	Encapsulation obj = new Encapsulation();
// Setting values of the variables
obj.setAge(25);
obj.setName("ArunKumar");
System.out.println("My name is "+ obj.getName());
System.out.println("My age is "+ obj.getAge());
}

}


	



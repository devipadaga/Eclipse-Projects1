package pyramidPatterns;




 interface Interface1  {
    
    // regular abstract method
    void method1(String str);
    
    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
    
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
class Interface2 implements Interface1{
public static void main(String[] args) {
	
	Interface2 pc=new Interface2();
	pc.log("Haiiiiiii");
	pc.method1("Hello");
	Interface1.isNull("salute");
	//PrintCharacters.is
}

@Override
public void method1(String str) {
	System.out.println("i am implemented.........");
	
}
}


package Three;
	
	/*
	 	-->Enum declaration can be done outside a Class or inside a Class but not inside a Method.
	 	--> Enum types can’t have duplicate constants.
	 	-->Enum types can’t extend a class.
	 	-->You can’t declare enum constants with any modifiers. They are public, static and final by default.
	 	--> Enum types can have public constructors. True OR False?
	 		Answer :
			False. Enum types can have only private constructors.
		-->You can’t instantiate enum types using ‘new’ operator.
			i.e Test t=new Test();
		--> enum types can implement any number of interfaces.
		-->enum can contain both concrete methods and abstract methods
		-->Enum Methods:
			values(), ordinal() and valueOf() methods:  

			These methods are present inside java.lang.Enum.
			 1.	values() method can be used to return all values present inside the enum.
			 2.	Order is important in enums.By using the ordinal() method, each enum constant index can be found, just like an array index.
			 3.	valueOf() method returns the enum constant of the specified string value if exists.
		-->
	 */


//	enum Color
//	{
//		RED,
//		WHITE,
//		BLUE;
//	}
//	
//	public class Enums {
//	
//	public static void main(String[] args)
//	{
//		Color c1=Color.RED;
//		System.out.println(c1);
//	}	
//}


//*******************working on enum in switch case 

//enum Day {
//    SUNDAY,
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY;
//}
// 
//// Driver class that contains an object of "day" and
//// main().
//public class Enums {
//    Day day;
// 
//    // Constructor
//    public Enums(Day day) { this.day = day; }
// 
//    // Prints a line about Day using switch
//    public void dayIsLike()
//    {
//        switch (day) {
//        case MONDAY:
//            System.out.println("Mondays are bad.");
//            break;
//        case FRIDAY:
//            System.out.println("Fridays are better.");
//            break;
//        case SATURDAY:
//        case SUNDAY:
//            System.out.println("Weekends are best.");
//            break;
//        default:
//            System.out.println("Midweek days are so-so.");
//            break;
//        }
//    }
// 
//    // Driver method
//    public static void main(String[] args)
//    {
//        String str = "MONDAY";
//        Enums t1 = new Enums(Day.valueOf(str));
//        t1.dayIsLike();
//    }
//}

	//*********Java program to demonstrate working of values(),ordinal() and valueOf()

//enum Color {
// RED,
// GREEN,
// BLUE;
//}
//
//public class Enums {
// public static void main(String[] args)
// {
//     // Calling values()
//     Color arr[] = Color.values();
//
//     // enum with loop
//     for (Color col : arr) {
//         // Calling ordinal() to find index
//         // of color.
//         System.out.println(col + " at index "
//                            + col.ordinal());
//     }
//
//     // Using valueOf(). Returns an object of
//     // Color with given constant.
//     // Uncommenting second line causes exception
//     // IllegalArgumentException
//     System.out.println(Color.valueOf("RED"));
//     // System.out.println(Color.valueOf("WHITE"));
// }
//}


	//*********************888Java program to demonstrate that enums can have constructor and concrete methods.

//An enum (Note enum keyword inplace of class keyword)
enum Color {
 RED,
 GREEN,
 BLUE;

 // enum constructor called separately for each
 // constant
 private Color()
 {
     System.out.println("Constructor called for : "
                        + this.toString());
 }

 public void colorInfo()
 {
     System.out.println("Universal Color");
 }
}

public class Enums {
 // Driver method
 public static void main(String[] args)
 {
     Color c1 = Color.RED;
     System.out.println(c1);
     //c1.colorInfo();
 }
}
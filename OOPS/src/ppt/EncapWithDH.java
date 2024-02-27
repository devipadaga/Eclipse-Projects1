package ppt;

class User {
	 
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;

    public User(String username, String password, String firstname, 
    				String lastname, String email) {
         this.username = username;
         this.password = password;
         this.firstname = firstname;
         this.lastname = lastname;
         this.email = email;
    }

  
    public String getUsername() {
         return username;
    }

    public void setUsername(String username) {
         this.username = username;
    }

    public String getPassword() {
         return password;
    }

    public void setPassword(String password) {
         this.password = password;
    }

    public String getFirstname() {
         return firstname;
    }

    public void setFirstname(String firstname) {
         this.firstname = firstname;
    }

    public String getLastname() {
         return lastname;
    }

    public void setLastname(String lastname) {
         this.lastname = lastname;
    }

    public String getEmail() {
         return email;
    }

    public void setEmail(String email) {
         this.email = email;
    }

   
    public String print() {
         return  username + ", " + password +  ", "+ firstname + ", " + lastname +","+email;
    }
}

	public class EncapWithDH {
	 
		public static void main(String[] args) {
					
        User user1 = new User("muUname", "mypwd", "Sowmya","Devi","myemail");
        
        System.out.println("User: " + user1.print() + "\n");
 
        user1.setUsername("Devi");
        System.out.println("My new username is: " + user1.getUsername() + "\n");
 
        System.out.println("My password is: " + user1.getPassword());
        System.out.println("I am about to change my password...\n");
 
        user1.setPassword("ArunKumar!");
        System.out.println("My new password is: " + user1.getPassword());
    }
}
	
	
	
	
//********************************************************************8
//	//A Account class which is a fully encapsulated class.  
//	//It has a private data member and getter and setter methods.  
//	class Account {  
//		//private data members  
//		private long acc_no;  
//		private String name,email;  
//		private float amount;  
//		
//		//public getter and setter methods  
//		public long getAcc_no() {  
//			return acc_no;  
//		}  
//		public void setAcc_no(long acc_no) {  
//			this.acc_no = acc_no;  
//		}  
//		public String getName() {  
//			return name;  
//		}  
//		public void setName(String name) {  
//			this.name = name;  
//		}  
//		public String getEmail() {  
//			return email;  
//		}  
//		public void setEmail(String email) {  
//			this.email = email;  
//		}  
//		public float getAmount() {  
//			return amount;  
//		}  
//		public void setAmount(float amount) {  
//			this.amount = amount;  
//		}  
//	}
//	public class EncapWithDH {  
//		public static void main(String[] args) {  
//			 
//			Account acc=new Account();  
//			  
//			acc.setAcc_no(7560504000L);  
//			acc.setName("Tirumala Devi");  
//			acc.setEmail("devi123456.com");  
//			acc.setAmount(500000f);  
//			  
//			System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
//		}  
//	}  
//












	

package ppt;

public class All {

	public static void main(String[] args) {
		
        try {
            String welcomeMessage = welcomeMessage(null);
            System.out.println("The returned welcome message : "
                    + welcomeMessage);
           //System.exit(0);
            
        }
        catch (NullPointerException npe){
            System.out.println("Exception handled : "+ npe); 
        }
        
        
        finally {
            System.out.println("im in finally block");
        }
    }


	public static String welcomeMessage(String name)
            throws NullPointerException {
 
        if(name == null) {
          throw new NullPointerException("Invoke method with VALID name");
        }
        return name;
    }
}
//erjbbuiybfueqfj jhfweyhy iam sowmya my name is tirumla evi

	



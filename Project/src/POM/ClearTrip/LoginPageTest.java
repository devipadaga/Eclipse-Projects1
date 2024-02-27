package POM.ClearTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
	
	
	@Test(priority=0)
	public void LoginApp() throws Exception 
	{
		LoginPageClass  Lp=PageFactory.initElements(driver,LoginPageClass.class);
			Lp.Login_Btn();
			Lp.Login__Sign_UP();
			Lp.continue_Email();
			Lp.email("Chandamamakajal@gmail.com");
			Lp.password("Chandamama1@");
			Lp.Login();
	}
	
	@Test(priority=1)
	public void HomePage()
	{
		HomePageClass hp=PageFactory.initElements(driver,HomePageClass.class);
		hp.text("Fly anywhere. Fly everywhere");
		hp.adults();
	}
	

}

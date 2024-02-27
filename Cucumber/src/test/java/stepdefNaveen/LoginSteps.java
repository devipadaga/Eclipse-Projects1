package stepdefNaveen;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import n.factory.DriverFactory;
import n.pages.LoginPage;

public class LoginSteps {
	
	private static String Title;
	private LoginPage lp=new LoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("https://demo.guru99.com/test/newtours/index.php");
	
	}

	@When("user gets the title of the Page")
	public void user_gets_the_title_of_the_page() {

		Title=lp.getLoginPageTitle();
		System.out.println("Login pAGE Title is ; "+Title);
	
	}

	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		
		Assert.assertTrue(Title.contains(expectedTitle));
	
	
	}

	@Then("link should be displayed")
	public void link_should_be_displayed() {

	   Assert.assertTrue(lp.isLinkExists());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		lp.enterUserName(username);
	
	}

	@And("user enters password {string}")
	public void user_enters_password(String password) {

	lp.enterPassword(password);
	}

	@And("user clicks on Submit Button")
	public void user_clicks_on_submit_button() {

	lp.ClickSubmitButton();
	}


	

}

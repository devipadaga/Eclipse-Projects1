package stepdefNaveen;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import n.factory.DriverFactory;
import n.pages.HomePage;
import n.pages.LoginPage;

public class HomePageSteps {
	
	private LoginPage lp=new LoginPage(DriverFactory.getDriver());
	private HomePage hp;
	public static String title,name;
	
	@Given("user has already logged into Application")
	public void user_has_already_logged_into_application(DataTable dataTable) {
	    
		List<Map<String,String>> list=dataTable.asMaps();
		String username=list.get(0).get("username");
		String password=list.get(0).get("password");
		
		DriverFactory.getDriver().get("https://demo.guru99.com/test/newtours/index.php");
		hp=lp.doLogin(username, password);
	}

	@Given("user is on Home Page")
	public void user_is_on_home_page() {

		hp.HomePageTitle();
	
	
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title=hp.HomePageTitle();
		System.out.println("Title of the Home Page : "+title);
	}

	@Then("title of the page should be {string}")
	public void title_of_the_page_should_be(String titleName) {

	Assert.assertTrue(title.contains(titleName));
	}

	@When("user click on Link Flights")
	public void user_click_on_link_flights() {

		hp.clickonLinkFlights();
	
	}

	@When("click on RadioButton")
	public void click_on_RadioButton() {

		hp.ClickRadioBtn();
		//name=hp.VerifyText();
		//Assert.assertTrue(name.contains(expname));
	
	}

	

}

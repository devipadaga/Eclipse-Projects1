package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.BaseClass;

public class RegPage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Register']")WebElement RegLink;
	@FindBy(id="customer.firstName")WebElement Firstname;
	@FindBy(id="customer.lastName")WebElement Lastname;
	@FindBy(id="customer.address.street")WebElement Address;
	@FindBy(name="customer.address.city")WebElement City;
	@FindBy(name="customer.address.state")WebElement State;
	@FindBy(name="customer.address.zipCode")WebElement Zipcode;
	@FindBy(name="customer.phoneNumber")WebElement Phone;
	@FindBy(name="customer.ssn")WebElement SSN;
	@FindBy(name="customer.username")WebElement Username;
	@FindBy(name="customer.password")WebElement Password;
	@FindBy(name="repeatedPassword")WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@value='Register']")WebElement Register;
	
	
	
	public RegPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void click_On_RegLink()
	{
		RegLink.click();
	}
	
	public void Register(String FName,String LName,String Addr,String city,String state,String zipcode,
			String phone,String ssn,String uname,String pass,String CPass)
	{
		Firstname.sendKeys(FName);
		Lastname.sendKeys(FName);
		Address.sendKeys(Addr);
		City.sendKeys(city);
		State.sendKeys(state);
		Zipcode.sendKeys(zipcode);
		Phone.sendKeys(phone);
		SSN.sendKeys(ssn);
		
		Username.sendKeys(uname);
		Password.sendKeys(pass);
		ConfirmPassword.sendKeys(CPass);
		
		
	}
	
	
	public LoginPage ClickRegister()
	{
		Register.click();
		return new LoginPage();
	}

}

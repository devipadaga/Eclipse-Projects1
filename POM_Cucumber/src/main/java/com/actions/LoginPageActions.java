package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginPage;
import com.utils.helperClass;

public class LoginPageActions {
	
	
	LoginPage lp = null; 
    
    public LoginPageActions() {
 
        this.lp = new LoginPage();
 
        PageFactory.initElements(helperClass.getDriver(),lp);
    }
  
    
    public void setUserName(String strUserName) {
        lp.userName.sendKeys(strUserName);
    }
  
    
    public void setPassword(String strPassword) {
        lp.password.sendKeys(strPassword);
    }
  
   
    public void clickLogin() {
        lp.login.click();
    }
  
     
  
    public String getMissingUsernameText() {
        return lp.missingUsernameErrorMessage.getText();
    }
       
    // Get the Error Message
//    public String getErrorMessage() {
//        return LoginPage.errorMessage.getText();
//    }
  
    public void login(String strUserName, String strPassword) {
    	
        this.setUserName(strUserName);       
        this.setPassword(strPassword);       
        this.clickLogin();

}
}

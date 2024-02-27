package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.homePage;
import com.utils.helperClass;

public class homePageActions {
	
	homePage hp = null;
    
    public homePageActions() {
           
        this.hp = new homePage();
   
        PageFactory.initElements(helperClass.getDriver(),hp);
    }
   
    
    public void click()
    {
    	hp.Admin.click();
    }
    public String getHomePageText() {
        return hp.homePageUserName.getText();
    }

}

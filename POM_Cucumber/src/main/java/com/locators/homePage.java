package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	
	
	@FindBy(xpath = "//li[1]//a[1]//span[1]")
    public  WebElement Admin;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    public  WebElement homePageUserName;

}

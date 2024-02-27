package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class Employee extends AppUtils
{

	public boolean addEmployee(String fname,String lname)
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String expempno = driver.findElement(By.id("employeeId")).getText();
		driver.findElement(By.id("btnSave")).click();
		String actempno =driver.findElement(By.id("personal_txtEmployeeId")).getText();
		if(expempno.equals(actempno))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod{
	 
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver=driver; 
	}
  

	public EditLeadPage updateCompanyName(String c_name) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(c_name);
		return this;
	}
	public EditLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return this;
		
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
	 
		public MyLeadPage(RemoteWebDriver driver) {
	        this.driver=driver; 
	    }
		
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	public FindLeadPage clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}
		public MergeLeadPage clickMergeLead() {
			driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
	}

}

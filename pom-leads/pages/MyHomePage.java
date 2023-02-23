package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	//create constructor in all pages and pass driver as argument- for parallel execution
		public MyHomePage(RemoteWebDriver driver) {
	        this.driver=driver; 
	    }
		
	public MyLeadPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver); 
	}

}

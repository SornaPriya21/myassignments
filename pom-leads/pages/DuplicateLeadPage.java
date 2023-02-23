package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	
	public DuplicateLeadPage(RemoteWebDriver driver) {
        this.driver=driver; 
    }
	 
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}

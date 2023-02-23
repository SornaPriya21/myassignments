package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	//create constructor in all pages and pass driver as argument- for parallel execution
		public ViewLeadPage(RemoteWebDriver driver) {
	        this.driver=driver; 
	    }
		
	 
	public ViewLeadPage verifyLead() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        System.out.println(text);
        if (text.contains("Sorna")) {
            System.out.println("Lead is created sucessfully");
        } else {
            System.out.println("Lead Not created");
        }
        return this;
	}
	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	public DuplicateLeadPage clickDuplicate() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	public MyLeadPage clickDeleteLead() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadPage(driver);
	}
		 public FindLeadPage clickFindLead() {
			 driver.findElement(By.linkText("Find Leads")).click();
			 return new FindLeadPage(driver);
		 }
		
	}


	 


	 


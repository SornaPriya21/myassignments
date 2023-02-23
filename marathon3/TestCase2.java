package marathon3;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends BaseClass{
	@BeforeTest
	public void setUp() {
		excelFile="opportunity";
	}
	@Test(dataProvider="fetchData")
	public void runTestCase2(String oppname,String amt) throws InterruptedException {
		
		 driver.findElement(By.xpath("//p[text()='Sales']")).click();
		 
		  
		 WebElement key = driver.findElement(By.xpath("//span[text()='Key Deals - Recent Opportunities']"));
		 Actions builder = new Actions(driver);
		 builder.scrollToElement(key).perform();
		 
		 WebElement click = driver.findElement(By.xpath("//a[@title='Key Deals Trigger']"));
		 driver.executeScript("arguments[0].click();",click);
		 driver.findElement(By.xpath("//a[text()='All Opportunities']")).click();
		 WebElement view = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		 Actions builder1 = new Actions(driver);
		 builder1.scrollToElement(view).perform();
		 WebElement click2 = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		 driver.executeScript("arguments[0].click();",click2);
		
		 WebElement opp = driver.findElement(By.xpath("//div[text()='New']"));
		 driver.executeScript("arguments[0].click();",opp);
		 
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys(oppname);
		 driver.findElement(By.xpath("(//button[@role='combobox'])[2]")).click();
		 driver.findElement(By.xpath(" //span[text()='New Customer']")).click();
		 WebElement click3 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-')])[3]"));
		 driver.executeScript("arguments[0].click();",click3);
		 driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		 driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);
		 driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='24']")).click();
		 driver.findElement(By.xpath("(//button[@role='combobox'])[1]")).click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
		 WebElement scroll = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		 Actions builder2 = new Actions(driver);
		 builder2.scrollToElement(scroll).perform();
		 WebElement click4 = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		 driver.executeScript("arguments[0].click();",click4);
		 WebElement click5 = driver.findElement(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']"));
		 driver.executeScript("arguments[0].click();",click5);
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

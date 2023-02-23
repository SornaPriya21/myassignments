package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
	@BeforeTest
	public void setUp() {
		excelFile="salesforce";
	}
@Test(dataProvider="fetchData")
	public void runTestCase1(String que,String ans) throws InterruptedException {
		 

	 driver.findElement(By.xpath(" (//input[@type='search'])[3]")).sendKeys("content");
	 driver.findElement(By.xpath(" //p[@class='slds-truncate']")).click();
	 Thread.sleep(2000);
	 WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
	 driver.executeScript("arguments[0].click();",chatter);
	 Thread.sleep(2000);
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.findElement(By.xpath("//span[text()='Question']")).click();
	 driver.findElement(By.xpath("//textarea[@placeholder='What would you like to know?']")).sendKeys(que);
	 driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank slds-')]")).sendKeys(ans);
	 driver.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
	 
	}
}

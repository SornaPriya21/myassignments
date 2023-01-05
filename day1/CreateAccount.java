package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		
        driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("Only Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//*[@id=\"groupNameLocal\"]")).sendKeys("DhiviyaPriya");
		driver.findElement(By.xpath("//*[@id=\"officeSiteName\"]")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"annualRevenue\"]")).sendKeys("900");
		
		WebElement tool=driver.findElement(By.name("industryEnumId"));
		Select drop=new Select(tool);
		drop.selectByIndex(3);
		
		WebElement tool1=driver.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(tool1);
		drop1.selectByVisibleText("S-Corporation");
		
		WebElement tool2= driver.findElement(By.id("dataSourceId"));
		Select drop2=new Select(tool2);
		drop2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement tool3=driver.findElement(By.id("marketingCampaignId"));
		Select drop3=new Select(tool3);
		drop3.selectByIndex(6);
		
		WebElement tool4= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4=new Select(tool4);
		drop4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		

	}

}

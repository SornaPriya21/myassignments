package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SORNA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PRIYA");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium with Java");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sornakssp@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
	    String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DEEKSHA");
		driver.findElement(By.name("submitButton")).click();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
		
		
		
	}

}

package week3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
 
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("963");
      
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        System.out.println(driver.findElement(By.xpath("//a[text()='12349']")).getText());
        driver.findElement(By.xpath("//a[text()='12349']")).click();
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12349");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       String verify=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
       if(verify.contains("No records to display")) {
    	   System.out.println("confirms successful deletion");
       }
       else
       {
    	   System.out.println("no confirmation of deletion");
       }
            driver.close();
	}

}

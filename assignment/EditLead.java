package week3.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		  
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        
        driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Sorna");
	    Thread.sleep(2000);
        driver.findElement(By.xpath(" //button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("11078")).click();
        
        String title = driver.getTitle();
        System.out.println(title);
        
        if(title.contains("opentaps")) {
        	System.out.println("Title is verified");
        }
        else {
        	System.out.println("it doesnt has opentaps.");
        }
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("LeafTest");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        System.out.println(driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText());
        Thread.sleep(2000);
        driver.close();
	}

}

package week3.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sorna");
		driver.findElement(By.name("lastname")).sendKeys("Priya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9677735688");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Deeksh@19");
		
		WebElement a=driver.findElement(By.name("birthday_day"));
		Select d1=new Select(a);
		d1.selectByValue("21");
		
		WebElement b=driver.findElement(By.name("birthday_month"));
		Select d2=new Select(b);
		d2.selectByIndex(0);
		
		WebElement c=driver.findElement(By.name("birthday_year"));
		Select d3=new Select(c);
		d3.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		
		
	}

}

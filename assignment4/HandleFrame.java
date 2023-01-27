package week4.assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
 
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
	//	System.out.println(driver.findElement(By.xpath("(//button[@id='Click'])[2]")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		//String text = driver.findElement(By.xpath("//button[text()='Click Me']")).getText();
		//System.out.println(text);
		
	}

}

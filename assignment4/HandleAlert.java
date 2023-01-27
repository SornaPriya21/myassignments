package week4.assignment4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println("Simple Alert: "+text);
		simple.accept();
		String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("Msg: "+text2);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("confirm alert: "+confirm.getText());
		confirm.dismiss();
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println("Msg: "+text3);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Testleaf");
		System.out.println("prompt alert: "+prompt.getText());
		prompt.accept();
		System.out.println("Msg: "+driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		 
		
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		
		driver.close();
		 
	}

}

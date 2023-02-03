package week5.assignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//visible
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		visible.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(visible));
		
		//invisible
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
		
		//wait for clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		//WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));
		//clickable.click();
		//WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait2.until(ExpectedConditions.elementToBeClickable(clickable));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		
		WebElement textchange = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		String text = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.textToBePresentInElement(textchange,text));
	}

}

package week5.assignment5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-name']"));
		driver.executeScript("arguments[0].click()",sort);
		
		WebElement customer = driver.findElement(By.xpath("(//div[@class='control-value'])[4]"));
		driver.executeScript("arguments[0].click()",customer);
		
		WebElement category = driver.findElement(By.xpath("//span[text()='Category']"));
		driver.executeScript("arguments[0].click()",category);
		WebElement hair = driver.findElement(By.xpath("//span[text()='Hair']"));
		driver.executeScript("arguments[0].click()",hair);
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		 String filter = driver.findElement(By.xpath("//div[@class='css-rtde4j']")).getText();
		 System.out.println("Filter: "+filter);
		 
		 WebElement shampoo = driver.findElement(By.xpath("//div[@class='css-xrzmfa']"));
		 driver.executeScript("arguments[0].click();",shampoo);
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> lstname=new ArrayList<String>(windowHandles);
		 driver.switchTo().window(lstname.get(1));
		 
		 
		 driver.findElement(By.xpath("//span[@class=' css-ieawrs']")).click();
		 String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		 System.out.println("MRP: "+mrp);
		 
		 driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		 
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 Thread.sleep(2000);
		 //String total = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		//String total = driver.findElement(By.xpath("//span[text()='Grand Total']")).getText();
		// System.out.println("Grand Total: "+total);
		 driver.switchTo().frame(0);
		 String Grandtotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
			System.out.println("Grand Total is  "  +Grandtotal);
		  
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		 
		 driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
		 
		 String price = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		 System.out.println("total: "+price);
		 
		 if(Grandtotal.equals(price)) {
			 System.out.println("amount is same");
		 }
		 else {
			 System.out.println("amount is different");
		 }
		 driver.quit();
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}

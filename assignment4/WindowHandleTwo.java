package week4.assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstname=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstname.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lstname1=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstname1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname1.get(0));
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> lstname2=new ArrayList<String>(windowHandles3);
		driver.switchTo().window(lstname2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname2.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname2.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname2.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> lstname3=new ArrayList<String>(windowHandles4);
		driver.switchTo().window(lstname3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname3.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lstname3.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  

	}

}

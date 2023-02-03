package week5.assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLibrary {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 
		
		List<WebElement> library = driver.findElements(By.xpath(" //div[@class='render']//tr[2]/td"));
		for(int i=0;i<library.size();i++) {
			String text =library.get(i).getText();
	System.out.println(text);
		}
		
		
		

	}

}

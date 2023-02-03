package week5.assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("Row size: "+row.size());
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("Column size: "+column.size());

	}

}

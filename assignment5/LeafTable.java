package week5.assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		System.out.println("Row: "+row.size());
		List<WebElement> column = driver.findElements(By.xpath("(//table[@role='grid'])[2]//th"));
		System.out.println("Column: "+column.size());
		
		String  data = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[4]/td[2]")).getText();
		System.out.println("data: "+data);
		
		
		for(int i=1;i<row.size();i++) {
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[2]")).getText();
			System.out.println(text);
		}

	}

}

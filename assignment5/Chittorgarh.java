package week5.assignment5;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		List<WebElement> securityname = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
		System.out.println("list size: "+securityname.size());
		for(int i=0;i<securityname.size();i++) {
			String name = securityname.get(i).getText();
			System.out.println(name);
		}
		Set<WebElement> dup=new LinkedHashSet<WebElement>(securityname);
		System.out.println("Set Size: "+dup.size());
		
		if(securityname.size()==dup.size()) {
			System.out.println("no duplicates found");
		}
	 else {
		System.out.println("duplicates found");
	}

}
}
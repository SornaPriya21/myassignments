package week5.assignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//drag	
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		System.out.println(drag.getLocation());
		
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(drag, 100, 125).perform();
		System.out.println("after"+drag.getLocation());
		
		//drop
		
		WebElement src = driver.findElement(By.id("form:drag_content"));
		WebElement des = driver.findElement(By.id("form:conpnl_content"));
		Actions builder1 =new Actions(driver);
		builder1.dragAndDrop(src, des).perform();
		
		//drag column
		WebElement col1 = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[1]"));
		WebElement col3 = driver.findElement(By.xpath("(//table[@role='grid'])[1]//th[3]"));
		Actions builder2=new Actions(driver);
		//builder2.clickAndHold(col1).moveToElement(col3).release().perform();
		builder2.dragAndDrop(col1,col3).perform();
		
	/*	//drag row
		WebElement row1 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]"));
		WebElement row4 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[4]"));
		Actions builder3=new Actions(driver);
		builder3.dragAndDrop(row1,row4).perform();
		//builder3.clickAndHold(row1).moveToElement(row4).release().perform();
		 * 
		 */
		
	//resize
		WebElement resize = driver.findElement(By.xpath("//img[@id='form:logo']"));
		Actions builder4=new Actions(driver);
		//builder4.dragAndDropBy(resize, 400,80).perform();
		builder4.clickAndHold(resize).moveByOffset(50, 10).perform(); 
	//slider
		WebElement slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Actions builder5=new Actions(driver);
		builder5.dragAndDropBy(slider,100,0).perform();
	//progress bar
		WebElement progress = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		progress.click();
		driver.close();
		
	 
		
	}

}

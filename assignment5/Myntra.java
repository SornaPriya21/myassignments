package week5.assignment5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		String totalitem = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("jacket for men total item: "+totalitem);
		
		String cat1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		System.out.println("categorgy jacket: "+cat1);
		
		String cat2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println("category Rain jacket: "+cat2);
		//System.out.println("sum of categories: "+((cat1)+(cat2)));
		 
		
		if(totalitem.equals(cat1+cat2)) {
			System.out.println("sum of categories are same as total item");
		}
		else {
			System.out.println("sum of categories are different as total item");
		}
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//input[@value='Duke']//parent::label")).click();
		
		driver.findElement(By.xpath(" //span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		List<WebElement> brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		for(int i=0;i<brand.size();i++) {
			System.out.println(brand.get(i).getText());
		}
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(sort).perform();
		
		WebElement discount = driver.findElement(By.xpath("(//label[@class='sort-label '])[4]"));
		driver.executeScript("arguments[0].click()",discount);
		
		String firstprice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("the price of 1st product: "+firstprice);
		
		//driver.findElement(By.xpath("//h3[@class='product-brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-imageSliderContainer']//img")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		File src = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./snap/myntra.png");
        FileUtils.copyFile(src, dest);
		
        driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
        
        driver.close();
        driver.switchTo().window(lst.get(0));
        driver.close();
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

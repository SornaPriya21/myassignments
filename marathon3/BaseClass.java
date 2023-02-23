package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class BaseClass {
	public  RemoteWebDriver driver;
	public String excelFile;
	@Parameters({"browser","url","userId","password"})
	@BeforeMethod
	public void preCondition(String Browser,String url,String user,String psw) throws InterruptedException {

		
		 if(Browser.equalsIgnoreCase("chrome")) {
			 ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				 driver=new ChromeDriver(option);
				
			}
			else if(Browser.equalsIgnoreCase("edge")) {
				EdgeOptions option=new EdgeOptions();
				option.addArguments("--disable-notifications");
				 driver=new EdgeDriver(option);
				 
			}
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		 driver.findElement(By.id("password")).sendKeys(psw);
		 driver.findElement(By.id("Login")).click();
		 
		 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath(" //button[text()='View All']")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		String[][] readData = ReadExcel.readData(excelFile);
		return readData;

}}

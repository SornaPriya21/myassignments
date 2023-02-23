package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import util.ReadExcelData;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	public String sheet;
	@Parameters({"browser","url"})
	@BeforeMethod
	public void launchBrowser(String Browser,String url) {
		if(Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		String[][] readData = ReadExcelData.readData(sheet);
		return readData;
	}

}
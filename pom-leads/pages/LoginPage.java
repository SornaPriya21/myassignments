package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
 
	public LoginPage(RemoteWebDriver driver) {
        this.driver=driver; 
    }
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
}
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
}
}


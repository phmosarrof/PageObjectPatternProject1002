package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.loginPage;

public class testApplication {

	
	@Test
	public void login() {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	
	loginPage obj = new loginPage(driver);
	obj.userName().sendKeys("phmosharaf");
	obj.password().sendKeys("469+95+699+");
	//obj.submit().click();
	obj.home().click();
	
	
	HomePage obj1 = new HomePage(driver);
	obj1.Serach().click();
	obj1.SerachSubmit().sendKeys("Polo shirt");
	obj1.submit().click();
	
	driver.quit();
	}
}
 
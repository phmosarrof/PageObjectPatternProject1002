package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePageFactory;
//import pageObjects.HomePage;
//import pageObjects.HomePageFactory;
//import pageObjects.loginPage;
import pageObjects.loginPageFactory;

public class testApplication {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		driver.manage().window().maximize();

		/*
		 * loginPage obj = new loginPage(driver); obj.userName().sendKeys("phmosharaf");
		 * obj.password().sendKeys("44582155"); //obj.submit().click();
		 * obj.home().click();
		 * 
		 * 
		 * HomePage obj1 = new HomePage(driver); obj1.Serach().click();
		 * obj1.SerachSubmit().sendKeys("Polo shirt"); obj1.submit().click();
		 * 
		 */
		HomePageFactory obj2 = new HomePageFactory(driver);
		obj2.Serach().click();
		obj2.SerachSubmit().sendKeys("New product");

		loginPageFactory obj3 = new loginPageFactory(driver);
		obj3.userName().sendKeys("phmosarrof");
		obj3.password().sendKeys("12668");
		obj3.submit().click();
		obj3.home().click();

		driver.quit();

	}
}

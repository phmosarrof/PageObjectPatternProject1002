package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver driver) {

		this.driver = driver;

	}

	By UserId = By.xpath("//*[@id=\'login1\']");
	By Password = By.xpath("//*[@id=\'password\']");
	By Submit = By.name("proceed");
	By Home = By.xpath("/html/body/div[1]/div[1]/div[2]/a");
	
	
	public WebElement userName() {

		return driver.findElement(UserId);
	}
	public WebElement password() {

		return driver.findElement(Password);
	}
	public WebElement submit() {

		return driver.findElement(Submit);
	}
	public WebElement home() {

		return driver.findElement(Home);
	}
}



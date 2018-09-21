package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	WebDriver driver;
	public loginPageFactory(WebDriver driver) {

		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id=\'login1\']")
	WebElement UserId;
	@FindBy(xpath="//*[@id=\'password\']")
	WebElement Password;
	@FindBy(name="proceed")
	WebElement Submit;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/a")
	WebElement Home;
	public WebElement userName() {

		return UserId;
	}
	public WebElement password() {

		return Password;
	}
	public WebElement submit() {

		return Submit;
	}
	public WebElement home() {

		return Home;
	}





}



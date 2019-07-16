package pageFactoryPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SetDriver{
	WebDriver driver;

	public HomePage(WebDriver driver) throws IOException {
		//driver = setDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//u[contains(text(),'Search')]")

	WebElement SearchButton;

	@FindBy(xpath = "//input[@id='srchword']")

	WebElement EnterText;

	@FindBy(xpath = "//input[@value='Search']")
	
	WebElement Submit;

	public WebElement searchMethod() {

		return SearchButton;
	}

	public WebElement enter() {

		return EnterText;
	}

	public WebElement submit() {

		return Submit;
	}

}
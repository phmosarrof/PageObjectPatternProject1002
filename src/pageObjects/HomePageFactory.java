package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

	WebDriver driver;

	public HomePageFactory(WebDriver driver) {

		// this.driver = driver

		PageFactory.initElements(driver, this);
	}

	// By Serach = By.xpath("//*[@id=\'srch_show_hide_btn\']");
	// By SerachSubmit = By.className("newsrchbtn");
	// By Submit = By.xpath("//*[@id=\"srchword\"]");

	@FindBy(xpath = "//u[contains(text(),'Search')]")
	WebElement Serach;

	@FindBy(className = "newsrchbtn")
	WebElement SerachSubmit;

	public WebElement Serach() {

		return Serach;
	}

	public WebElement SerachSubmit() {

		return SerachSubmit;
	}

}

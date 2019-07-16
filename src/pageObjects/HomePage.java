package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	By Serach = By.xpath("//u[contains(text(),'Search')]");
	By SerachSubmit = By.className("newsrchbtn");
	By Submit = By.xpath("//*[@id=\"srchword\"]");

	public WebElement serach() {

		return driver.findElement(Serach);
	}

	public WebElement serachSubmit() {

		return driver.findElement(SerachSubmit);
	}

	public WebElement submit() {

		return driver.findElement(Submit);
	}

}

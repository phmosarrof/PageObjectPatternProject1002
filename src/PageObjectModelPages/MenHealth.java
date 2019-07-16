package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import HelperClass.Hooks;

public class MenHealth {
	public static WebDriver driver;

	public MenHealth(WebDriver driver) {
		this.driver = driver;
	}

	public static By menMenu = By.xpath("//*[@id='menu-item-47']/a");

	public static WebElement menhealthmenu() {

		return driver.findElement(menMenu);
	}

}

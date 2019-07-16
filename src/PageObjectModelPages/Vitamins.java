package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import HelperClass.Hooks;

public class Vitamins {

	public static WebDriver driver;

	public Vitamins(WebDriver driver) {
		this.driver = driver;
	}

	static By vitaminmenu = By.xpath("//*[@id='menu-item-46']/a");

	public static WebElement vitaminMenu() {
		return driver.findElement(vitaminmenu);
	}

	static By readMoreV = By.xpath("//*[@id='main-content']/div[1]/div[3]/article/div[2]/p/a");

	public static WebElement readMore() {
		return driver.findElement(readMoreV);
	}

}

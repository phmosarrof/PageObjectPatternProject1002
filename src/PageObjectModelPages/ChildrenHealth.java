package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//import HelperClass.Hooks;

public class ChildrenHealth {

	private static WebDriver driver;

	public ChildrenHealth(WebDriver driver) {
		this.driver = driver;
	}

	public static By childmenu = By.xpath("//*[contains(text(),'Children’s Health')]");

	public static boolean isDisplayed(WebDriver driver, By childmenu) {
		System.out.println("It is boolean block");
		return driver.findElement(childmenu).isDisplayed();
	}
}

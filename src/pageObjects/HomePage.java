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
		
		
		By Serach = By.xpath("//*[@id=\'srch_show_hide_btn\']");
		By SerachSubmit = By.className("newsrchbtn");
		By Submit = By.xpath("//*[@id=\"srchword\"]");
		
		
		public WebElement Serach() {

			return driver.findElement(Serach);
		}
		public WebElement SerachSubmit() {

			return driver.findElement(SerachSubmit);
		}
		public WebElement submit() {

			return driver.findElement(Submit);
		}
		
}

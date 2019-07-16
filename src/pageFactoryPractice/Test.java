package pageFactoryPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test {

	// private static final String WebDriver = null;

	public Test() throws IOException {
		super();

	}

	// static WebDriver driver;

	// public String url;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		HomePage obj = new HomePage(driver);

		driver.manage().window().maximize();

		driver.get("http://www.rediff.com/");
		driver.get("http://spicejet.com");
		/*
		 * driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		 * driver.findElement(By.xpath(
		 * "/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input"))
		 * .click(); System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 */

		// driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();

		// driver.findElement(By.xpath("//a[@value='JAI']")).click();

		// dynamic drop down box handle by second instance as developer wrote same code
		// for two instance

		// driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

		/*
		 * System.out.println( driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		 * 
		 * System.out.println( driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		 */

		// driver.findElement(By.xpath("//div[@class='row1
		// adult-infant-child']/div[2]")).click();
		// driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		// driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		// driver.close();

		// Select objs = new
		// Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));

		// objs.selectByIndex(2);
		/*
		 * driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		 * Thread.sleep(5000); int i = 0; while (i < 4) {
		 * driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click(); i++; } //
		 * driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click(); //
		 * driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click(); //
		 * driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).isDisplayed(); //
		 * Assert.assertTrue(driver.findElement(By.xpath("//span[@id='hrefIncAdt']")));
		 * Thread.sleep(2000);
		 * System.out.println(driver.findElements(By.xpath("//span[@id='hrefIncAdt']")).
		 * size()); Thread.sleep(2000);
		 * 
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * FileUtils.copyFile(src, new
		 * File("C:\\Users\\Mosarrof Hossain\\ScreenShot\\scr.png"));
		 * 
		 * driver.findElement(By.xpath("//input[@id='btnclosepaxoptions']")).click();
		 * Thread.sleep(2000); /* driver.get("https://mail.rediff.com");
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * obj.SearchButton.click(); //WebDriverWait wait = new WebDriverWait(driver,
		 * 10); //wait.until(ExpectedConditions.); try {
		 * obj.EnterText.sendKeys("Polo shirt new",Keys.SPACE);
		 * 
		 * Thread.sleep(2000); obj.Submit.click();
		 * System.out.println("Error Message is printed below >>>");
		 * System.out.println(driver.findElement(By.xpath("//*[@width='440']")).getText(
		 * )); } catch(Exception e) { System.out.println("Exception is not occured"); }
		 * finally { driver.close();}
		 */

		driver.quit();

	}

}

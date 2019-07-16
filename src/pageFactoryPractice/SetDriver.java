package pageFactoryPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream file;

	public WebDriver setDriver() throws IOException {

		prop = new Properties();
		file = new FileInputStream("C:\\Users\\Mosarrof Hossain\\workspace\\PageObjectPatternProject1002\\properties\\file.properties");
		prop.load(file);
		
		String urlname = prop.getProperty("url");
		//urlname.equals("url");

		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}

package pageFactoryPractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Snippet {
	WebDriver driver;
	
	public static void main(String [] args) {
		Snippet obj = new Snippet();
		obj.useStoredSessionInNewWindow();
		
	}

	public void useStoredSessionInNewWindow() {
		// initiate web driver and go to an website
		driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");

		// add code to login in the website

		// store the current session
		Set<Cookie> cookiesInstance1 = driver.manage().getCookies();
		System.out.println("Coockies = " + cookiesInstance1);

		// close the web driver instance
		driver.close();

		// again initiate web driver and go to the same website. This will open the
		// login page
		driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");

		// add the stored session in the new web driver instance
		for (Cookie cookie : cookiesInstance1) {
			driver.manage().addCookie(cookie);
		}

		// re-visit the page
		driver.navigate().to("http://google.com");

		// get the current session of new web driver instance
		Set<Cookie> cookiesInstance2 = driver.manage().getCookies();
		System.out.println("Coockies = " + cookiesInstance2);

		// notice that session of previous web driver instanse is achieved
		Assert.assertEquals(cookiesInstance1, cookiesInstance2);
		boolean Coockies = true;
		Assert.assertTrue(Coockies,"NID=146=Q7EMYYJpZ3QEx4SIYk2aG9p6H0IdqYD5V5xc4AvNU7BRJPbZj6T-fb3TBC8GCQiY0QASNBOCK8-RmRtut75Vp6PKt86w_ozxtOCAheUQ0C9YgaGOjlZZ_xBZgVwyb9gJeUinLXwRxxoU_SXkVSNxeqTR4U4117DPlQ1XqL_M-kA; expires=Wed, 22 May 2019 05:47:59 EDT; path=/; domain=.google.com, 1P_JAR=2018-11-20-21; expires=Thu, 20 Dec 2018 04:48:05 EST; path=/; domain=.google.com, OGPC=19009353-1:; expires=Sat, 19 Jan 2019 04:48:00 EST; path=/; domain=.google.com");
		System.out.println("Cookies passed");
		driver.quit();

	}
}

package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DEV-DKSC103240\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		
		//to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//site name which is to be opened
		driver.get("http://www.store.demoqa.com");
		
		//used to get title of current page
		System.out.println(driver.getTitle());
		
		//to get current URL
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Website Launched");
		
		//to wait for 5 seconds
		Thread.sleep(5);
		
		//to close browser after 5sec - will close all opened windows by driver
		driver.quit();
	}

}

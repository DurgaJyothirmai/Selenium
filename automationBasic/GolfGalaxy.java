package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class GolfGalaxy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DEV-DKSC103240\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//below command is similar to driver.get()
		driver.navigate().to("https://www.golfgalaxy.com/");
		
		System.out.println("Golf Galaxy Site Launched");
		
		//to get page title
		System.out.println(driver.getTitle());
		
		//to get length of page title
		System.out.println(driver.getTitle().length());
		
		//to get Page URL
		System.out.println(driver.getCurrentUrl());
		
		//to get page source
		System.out.println(driver.getPageSource());
		
		//to get page source length
		System.out.println(driver.getPageSource().length());

		Thread.sleep(10);
		
		//Create Account Form
		
		driver.navigate().to("https://www.golfgalaxy.com/UserRegistrationForm");
		
		//to fill email id 
		WebElement emailId = driver.findElement(By.cssSelector(".create-account-info input[name= 'createAccountEmail']"));
		emailId.sendKeys("Santhosh.Kumar@tcs.com");
		System.out.println("Tag name for input field" + emailId.getTagName());
		
		//confirm email id
		WebElement confirmEmail = driver.findElement(By.cssSelector(".create-account-info input[name= 'createAccountConfEmail']"));
		confirmEmail.sendKeys("Santhosh.Kumar@tcs.com");
		
		//Password
		WebElement password = driver.findElement(By.cssSelector(".create-account-info input[name='createAccountPassword']"));
		password.sendKeys("Password@1");
		
		//Confirm Password
		WebElement confPassword = driver.findElement(By.cssSelector(".create-account-info input[name='createAccountConfPassword']"));
		confPassword.sendKeys("Password@1");
		
		//to find element using id
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Santhosh");
		
		//LastName
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Kumar");
		
		//Street Address
		WebElement streetAddr = driver.findElement(By.id("street"));
		streetAddr.sendKeys("345 Court Street");
		
		//City
		WebElement cityInfo = driver.findElement(By.id("city"));
		cityInfo.sendKeys("Coraopolis");
		
		//Country
		WebElement countryInfo = driver.findElement(By.id("state"));
		countryInfo.sendKeys("PA");
		
		//ZipCode
		WebElement zipCode = driver.findElement(By.id("zipcode"));
		zipCode.sendKeys("15108");
		
		//Phone Number
		WebElement phoneNum = driver.findElement(By.id("phone"));
		phoneNum.sendKeys("9885926141");
		
		//Terms and Conditions
		WebElement TermsnConditions = driver.findElement(By.cssSelector(".terms-conditions a:nth-child(1)"));
		TermsnConditions.click();
		
		Thread.sleep(2000);
		
		//to close the modal
		WebElement TnCPopup = driver.findElement(By.cssSelector(".modal-dialog .modal-close"));
		TnCPopup.click();
		
		//Create element
		WebElement createAcc = driver.findElement(By.cssSelector(".create-account button"));
		
		//Click button
		createAcc.submit();
		
		//Refresh the browser
		//driver.navigate().refresh();
		
		//close() will close the current opened window
		driver.close();
		
	}

}

package automationEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutAddr {

	public String filAddressDetails(WebDriver driver) throws InterruptedException {

		//checkout-address book page
		//to fill fname
		WebElement fName = driver.findElement(By.id("firstName"));
		
		fName.sendKeys("Sakshi");
		
		//to fill lname
		WebElement lName = driver.findElement(By.id("lastName"));
		
		lName.sendKeys("Singh");
		
		//to fill street address
		WebElement streetAddr = driver.findElement(By.id("street"));
		
		streetAddr.sendKeys("345 Court Street");
		
		//to fill city details
		WebElement city = driver.findElement(By.id("city"));
		
		city.sendKeys("Coraopolis");
		
		//to fill state
		WebElement state = driver.findElement(By.id("state"));
		
		state.sendKeys("PA");
		
		//to fill zipcode
		WebElement zipCode = driver.findElement(By.id("zipcode"));
		
		zipCode.sendKeys("15108");
		
		//to fill phone number
		WebElement phone = driver.findElement(By.id("phone"));
		
		phone.sendKeys("9885926141");
		
		//email id
		WebElement emailField = driver.findElement(By.id("emailAddressField"));
		
		emailField.sendKeys("roshan.kumar@tcs.com");
		
		//click on continue to proceed further
		WebElement addrCheckoutBtn = driver.findElement(By.cssSelector(".add-address-right .checkout-address-continue"));
		
		addrCheckoutBtn.click();
		
		Thread.sleep(3000);
		
		return driver.getTitle();
	}

}

package automationEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	public String NavigateToCheckout(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		//to proceed from cart page
		WebElement checkout = driver.findElement(By.cssSelector(".checkout-btn-holder button"));
				
		checkout.click();
				
		Thread.sleep(3000);
				
		//to proceed from checkout sign in page
		WebElement guestCheckout = driver.findElement(By.cssSelector(".guest-section button"));
				
		guestCheckout.click();
				
		Thread.sleep(3000);
		
		return driver.getTitle();
	}

}

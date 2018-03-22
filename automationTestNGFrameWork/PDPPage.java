package automationEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PDPPage {

	public String selectSKUDetails(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		//selecting SKU
		WebElement swatch = driver.findElement(By.xpath("//div[contains(@class,\"defining-attribute\")]//div[contains(@class,\"pdp-swatches\")]//div[1]//span[@class=\"size-swatch\"][3]"));
				
		swatch.click();
				
		//Add to cart
				
		WebElement atc = driver.findElement(By.xpath("//div[@id=\"product-add-cart-div\"]//div[contains(@class,\"div-btn\")][1]//button[1]"));
				
		atc.click();
				
		Thread.sleep(3000);
				
		//view cart
		WebElement viewCart = driver.findElement(By.cssSelector(".add-cart-tablet button"));
				
		viewCart.click();
				
		Thread.sleep(3000);
		
		return driver.getTitle();
	}

}

package automationEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public SearchPage() {
		// TODO Auto-generated constructor stub
	}

	public String performSearch(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//to locate search field
		WebElement element = driver.findElement(By.cssSelector("input[type='search']"));
				
		element.click();
				
		//passing text in search field
		element.sendKeys("shirts");
				
		//to locate search icon
		WebElement searchIcon = driver.findElement(By.cssSelector(".single-field-form .search-icon"));
				
		searchIcon.click();
				
		Thread.sleep(5000);
		
		//to click on product
		WebElement product = driver.findElement(By.xpath("//div[contains(@class,\"family-grid-view-column\")]//div[contains(@class,\"family-grid-view-item\")][1]//div[contains(@class,\"family-grid-view-item-image\")]"));
				
		//navigate to pdp
		product.click();
				
		Thread.sleep(3000);
				
		return driver.getTitle();
		
	}

}

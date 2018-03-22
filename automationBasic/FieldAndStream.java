package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FieldAndStream {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DEV-DKSC103240\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fieldandstreamshop.com");
		
		//to maximize the window
		driver.manage().window().maximize();
		
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
		
		//to proceed from cart page
		WebElement checkout = driver.findElement(By.cssSelector(".checkout-btn-holder button"));
		
		checkout.click();
		
		Thread.sleep(3000);
		
		//to proceed from checkout sign in page
		WebElement guestCheckout = driver.findElement(By.cssSelector(".guest-section button"));
		
		guestCheckout.click();
		
		Thread.sleep(3000);
		
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
		
		//to change options in delivery page
		WebElement shipMethods = driver.findElement(By.cssSelector(".shipping-method-options  .method-option-list:nth-child(2) .checkout-radio"));
		
		shipMethods.click();
		
		//to proceed to payment page
		WebElement deliveryCont = driver.findElement(By.cssSelector(".checkout-button-align button"));
		
		deliveryCont.click();
		
		//entering credit card details
		WebElement CCdetails = driver.findElement(By.name("ccNumber"));
		
		CCdetails.sendKeys("4111111111111111");
		
		WebElement expMonth = driver.findElement(By.name("expMonth"));
		
		expMonth.sendKeys("11-November");
		
		WebElement expirationYear = driver.findElement(By.name("expYear"));
		
		expirationYear.sendKeys("2020");
		
		WebElement securityPIN = driver.findElement(By.name("securityPin"));
		
		securityPIN.sendKeys("123");
		
		Thread.sleep(2000);
		
		//proceed to review page
		WebElement contPayment = driver.findElement(By.name("cybsSubmit"));
		
		contPayment.click();
				
		Thread.sleep(2000);
		
		//proceed to receipt page
		WebElement review = driver.findElement(By.xpath("//div[contains(@class,\"review-order-panel\")]//span[contains(@class,'col-xs-8')]/button"));
		
		review.click();
	}

}

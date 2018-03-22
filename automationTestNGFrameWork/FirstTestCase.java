package automationEx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FirstTestCase {
	public WebDriver driver;
  @Test(priority = 0)
  public void f() throws InterruptedException {
	  SearchPage search = new SearchPage();
	  String actualResult = search.performSearch(driver);
	  String expectedResult = "Nike Dry Lockup T-Shirt | Golf Galaxy";
	  Assert.assertEquals(actualResult, expectedResult);
  }
  @Test(priority = 1)
  public void fu() throws InterruptedException {
	  SearchPage search = new SearchPage();
	  search.performSearch(driver);
	  PDPPage pdp = new PDPPage();
	  String actualPDPResult = pdp.selectSKUDetails(driver);
	  System.out.println(actualPDPResult);
	  String expectedPDP = "Shopping Cart";
	  Assert.assertEquals(actualPDPResult, expectedPDP);
  }
  @Test(priority = 2)
  public void cart() throws InterruptedException {
	  SearchPage search = new SearchPage();
	  search.performSearch(driver);
	  PDPPage pdp = new PDPPage();
	  pdp.selectSKUDetails(driver);
	  CartPage cart = new CartPage();
	  String cartNavigation = cart.NavigateToCheckout(driver);
	  String cartExpectedNavigation = "Checkout";
	  Assert.assertEquals(cartNavigation, cartExpectedNavigation);
  }
  @Test(priority = 2)
  public void checkoutAddr() throws InterruptedException {
	  SearchPage search = new SearchPage();
	  search.performSearch(driver);
	  PDPPage pdp = new PDPPage();
	  pdp.selectSKUDetails(driver);
	  CartPage cart = new CartPage();
	  cart.NavigateToCheckout(driver);
	  checkoutAddr cAddr = new checkoutAddr();
	  String addr = cAddr.filAddressDetails(driver);
	  System.out.println(addr);
  }
  @BeforeMethod
  public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEV-DKSC103240\\Desktop\\Selenium\\drivers\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.golfgalaxy.com/");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

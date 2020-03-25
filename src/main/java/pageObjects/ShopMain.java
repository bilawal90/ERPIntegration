package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopMain {

	public WebDriver driver ;
	
	By SearchBox = By.xpath("//input[@id='PolarisSearchField1']");
	
	By Email = By.id("account_email");
	
	By NxtBtn = By.xpath("//button[text()='Next']");
	
	By Pswd = By.id("account_password");
	
	By LoginBtn = By.xpath("//button[text()='Log in']");
	
	By SearchedPrdct = By.xpath("//td[@class='name']");
	
	By SearchedPrdct1 = By.xpath("(//span[@class='_3yby5'])[1]");
	
	By Customer = By.xpath("(//span[text()='Customers'])[1]");
	
	
	
	
	By Price1 = By.xpath("//input[@name='price']");
	
	By Quantity = By.xpath("//input[@id='AdjustQuantityPopoverTextFieldActivator']");
	
	By Orders = By.xpath("//span[text()='Orders']");
	
	By COrder = By.xpath("//div[@class='_2Ijuu']");
	
	By COSearch= By.xpath("(//input[@type='search'])[2]");
	
	By COSearch1 = By.xpath("//input[@name='product_search_input']");
	
	
	By AddBtn = By.xpath("//button[@id='add-products']");
	
	By UserSearchBox= By.xpath("//input[@id='customer_search_input']");
	
	By COUser = By.xpath("//button[@class='next-list__item']");
	
	By AddShipping = By.xpath("//button[text()='Add shipping']");
	
	By Shipping = By.xpath("//input[@name='-4052830167412760274']");
	
	By ApplyBtn = By.xpath("(//button[text()='Apply'])[3]");
	
	By PaidBtn = By.xpath("//button[@id='markAsPaidModalBtn']");
	
	By PendingBtn = By.xpath("//button[@id='markAsPendingModalBtn']");
	
	By CnfrmBtn = By.xpath("(//button[@name='commit'])[2]");
	
	By OrderNum= By.xpath("//h1[@class='ui-title-bar__title']");
	
	
	
	
	
	
	
	public ShopMain(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	
	public WebElement getCustomer()
	{
		return driver.findElement(Customer);
		
	}
	
	
	public WebElement getPendingBtn()
	{
		return driver.findElement(PendingBtn);
		
	}
	
	public WebElement getOrderNum()
	{
		return driver.findElement(OrderNum);
		
	}
	
	
	public WebElement getSearchedPrdct1()
	{
		return driver.findElement(SearchedPrdct1);
		
	}
	
	
	public WebElement getCOSearch1()
	{
		return driver.findElement(COSearch1);
		
	}
	
	public WebElement getUserSearchBox()
	{
		return driver.findElement(UserSearchBox);
		
	}
	
	
	public WebElement getCnfrmBtn()
	{
		return driver.findElement(CnfrmBtn);
		
	}
	
	public WebElement getPaidBtn()
	{
		return driver.findElement(PaidBtn);
		
	}
	
	
	public WebElement getApplyBtn()
	{
		return driver.findElement(ApplyBtn);
		
	}
	
	public WebElement getShipping()
	{
		return driver.findElement(Shipping);
		
	}
	
	
	
	public WebElement getAddShipping()
	{
		return driver.findElement(AddShipping);
		
	}
	
	
	public WebElement getCOUser()
	{
		return driver.findElement(COUser);
		
	}
	
	
	public WebElement getAddBtn()
	{
		return driver.findElement(AddBtn);
		
	}
	
	public WebElement getCOSearch()
	{
		return driver.findElement(COSearch);
		
	}
	
	
	public WebElement getCOrder()
	{
		return driver.findElement(COrder);
		
	}
	
	
	
	public WebElement getOrders()
	{
		return driver.findElement(Orders);
		
	}
	
	public WebElement getQuantity()
	{
		return driver.findElement(Quantity);
		
	}
		
	public WebElement getPrice1()
	{
		return driver.findElement(Price1);
		
	}
	
	
	public WebElement getSearchedPrdct()
	{
		return driver.findElement(SearchedPrdct);
		
	}
	
	
	public WebElement getSearchBox()
	{
		return driver.findElement(SearchBox);
		
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}
	
	public WebElement getNxtBtn()
	{
		return driver.findElement(NxtBtn);
		
	}
	
	public WebElement getPswd()
	{
		return driver.findElement(Pswd);
		
	}
	
	public WebElement getLoginBtn()
	{
		return driver.findElement(LoginBtn);
		
	}
	
	
}

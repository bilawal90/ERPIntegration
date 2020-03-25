package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customer {

	public WebDriver driver ;
	
	
	
	
	By AddCust = By.xpath("(//a[text()='Add customer'])[2]");
	
	By fname1 = By.xpath("(//input[@class='glbr9'])[3]");
	
	
	By lname1 = By.xpath("(//input[@class='glbr9'])[4]");
	
	
	By email = By.xpath("(//input[@class='glbr9'])[5]");
	
	
	By phone1 = By.xpath("(//input[@class='glbr9'])[6]");
	
	

	By fname2 = By.xpath("//input[@name='customer[firstName]']");
	
	By lname2 = By.xpath("//input[@name='customer[lastName]']");
	
	
	By address = By.xpath("//input[@name='customer[address1]']");
	
	By City = By.xpath("//input[@name='customer[city]']");
	
	By Country = By.xpath("//select[@name='customer[country]']");
	
	By State = By.xpath("//select[@name='province']");
	
	By ZipCode = By.xpath("//input[@name='customer[zip]']");
	
	By Phone2 = By.xpath("(//input[@class='glbr9'])[14]");
	
	By SaveBtn = By.xpath("//span[text()='Save']");
	
	By CustName = By.xpath("//h1[@class='oaimY _1ntuX']");
	
	By SendInvite = By.xpath("//span[@class='_18a9U']");
	
	By ReviewEmail = By.xpath("//span[text()='Review Email']");
	
	By SendNotification = By.xpath("//span[text()='Send notification']");
	
	
	
	
	
	
	
	
	public Customer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	

	public WebElement getReviewEmail()
	{
		return driver.findElement(ReviewEmail);
		
	}
	
	public WebElement getSendNotification()
	{
		return driver.findElement(SendNotification);
		
	}
	
	public WebElement getSendInvite()
	{
		return driver.findElement(SendInvite);
		
	}
	
	
	public WebElement getCustName()
	{
		return driver.findElement(CustName);
		
	}
	
	public WebElement getAddCust()
	{
		return driver.findElement(AddCust);
		
	}
	
	
	public WebElement getfname1()
	{
		return driver.findElement(fname1);
		
	}
	
	public WebElement getlname1()
	{
		return driver.findElement(lname1);
		
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	public WebElement getphone1()
	{
		return driver.findElement(phone1);
		
	}
	public WebElement getfname2()
	{
		return driver.findElement(fname2);
		
	}
	public WebElement getlname2()
	{
		return driver.findElement(lname2);
		
	}
	public WebElement getaddress()
	{
		return driver.findElement(address);
		
	}
	public WebElement getCity()
	{
		return driver.findElement(City);
		
	}
	public WebElement getCountry()
	{
		return driver.findElement(Country);
		
	}
	public WebElement getState()
	{
		return driver.findElement(State);
		
	}
	public WebElement getZipCode()
	{
		return driver.findElement(ZipCode);
		
	}

	public WebElement getPhone2()
	{
		return driver.findElement(Phone2);
		
	}
	public WebElement getSaveBtn()
	{
		return driver.findElement(SaveBtn);
		
	}
	
	
}

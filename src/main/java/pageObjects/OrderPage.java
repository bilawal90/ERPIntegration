package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	
	public WebDriver driver ;
	
	
	By OrderId= By.xpath("//span[text()='#1098']");
	
	By PayStatus = By.xpath("//span[@id='order-financial-status-badge']");
	
	By InStatus = By.xpath("//*[@id=\"order-title-bar\"]/div[2]/div[1]/span[2]/div/div[2]/div/span[2]");
	
	
	
	
	
	
	
	
	
public WebElement getPayStatus()
	
	{
		return driver.findElement(PayStatus);
		
	}

public WebElement getInStatus()

{
	return driver.findElement(InStatus);
	
}

	
	
public WebElement getOrderId()
	
	{
		return driver.findElement(OrderId);
		
	}



	public OrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

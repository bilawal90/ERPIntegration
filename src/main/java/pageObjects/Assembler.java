package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assembler {
	
	public WebDriver driver ;
	
	
	By LiveFeed= By.xpath("//a[@title='Live Feed']");
	By ConnectionDrpDwn=By.id("MainContent_ddlConnection");
	
	
	
	
	
	
	
	
public WebElement getLiveFeed()
	
	{
		return driver.findElement(LiveFeed);
		
	}


public WebElement getConnectionDrpDwn()

{
	return driver.findElement(ConnectionDrpDwn);
	
}
	
	public Assembler(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

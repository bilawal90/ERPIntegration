package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SO {
	
	public WebDriver driver ;
	
	
	By SearchBox= By.xpath("//input[@name='QuickFilterControl_Input']");
	
	
	By SONum = By.xpath("//input[@name='SalesTable_SalesIdAdvanced']");
	
	By Pick = By.xpath("(//span[text()='Pick and pack'])[2]");
	
	By PostSlip = By.xpath("//span[text()='Post packing slip']");
	
	By PackOk = By.xpath("//span[text()='OK']");
	
	
	By ConfrmOk = By.xpath("(//span[text()='OK'])[2]");
	
	By CancelBtn = By.xpath("//span[text()='Cancel']");
	
	
	//By InvoiceTab = By.xpath("(//span[text()='Invoice'])[1]");
	
	//By InvoiceTab = By.xpath("(//span[text()='Invoice'])[2]");
	
	By InvoiceTab = By.xpath("/html/body/div[3]/div[1]/div[2]/div/form[3]/div[2]/div/div[9]/button/span");
	
	
	//By InvoicePage = By.xpath("(//span[text()='Invoice'])[3]");
	
	By InvoicePage = By.xpath("/html/body/div[13]/div[2]/div[1]/div[2]/button[1]/div/span[2]");
	
	By InvoiceOk = By.xpath("//Span[text()='OK']");
	
	By InCnfrmOk = By.xpath("(//Span[text()='OK'])[2]");
	
	By Header = By.xpath("//span[text()='Header']");
	
	By Edit = By.xpath("//span[text()='Edit']");
	
	By Reason = By.name("Delivery_ExportReason");
	
	By Save = By.xpath("//span[text()='Save']");
	
	By CName = By.xpath("(//input[@name='SalesTable_SalesName'])[2]");
	
	
public WebElement getCName()
	
	{
		return driver.findElement(CName);
		
	}
	
public WebElement getSave()
	
	{
		return driver.findElement(Save);
		
	}
	
	
public WebElement getCancelBtn()
	
	{
		return driver.findElement(CancelBtn);
		
	}
	
public WebElement getReason()
	
	{
		return driver.findElement(Reason);
		
	}
public WebElement getEdit()

{
	return driver.findElement(Edit);
	
}
public WebElement getHeader()

{
	return driver.findElement(Header);
	
}

	
public WebElement getSearchBox()
	
	{
		return driver.findElement(SearchBox);
		
	}

public WebElement getSONum()
	
	{
		return driver.findElement(SONum);
		
	}
	
public WebElement getPick()
	
	{
		return driver.findElement(Pick);
		
	}

public WebElement getPostSlip()

{
	return driver.findElement(PostSlip);
	
}
public WebElement getPackOk()

{
	return driver.findElement(PackOk);
	
}

public WebElement getConfrmOk()

{
	return driver.findElement(ConfrmOk);
	
}

public WebElement getInvoiceTab()

{
	return driver.findElement(InvoiceTab);
	
}
public WebElement getInvoicePage()

{
	return driver.findElement(InvoicePage);
	
}
public WebElement getInvoiceOk()

{
	return driver.findElement(InvoiceOk);
	
}
public WebElement getInCnfrmOk()

{
	return driver.findElement(InCnfrmOk);
	
}



	
	public SO(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

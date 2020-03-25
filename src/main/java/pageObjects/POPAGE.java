package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POPAGE {
	
	public WebDriver driver ;
	
	
	By NewPO= By.xpath("//div[@title='New purchase order']");
	
	By VAccArrow = By.xpath("(//div[@title='Open'])[4]");
	By VAccount = By.xpath("//input[@title='1001']");
	
	By VAccount1 = By.xpath("(//input[@name='PurchTable_OrderAccount'])[2]");
	By SiteArrow = By.xpath("(//div[@class='lookupButton'])[12]");
	By SiteId = By.xpath("//input[@title='2']");
	By SiteId1 = By.xpath("//input[@name='PurchTable_InventSiteId']");
	By WarehouseArrow = By.xpath("(//div[@class='lookupButton'])[13]");
	
	
	By WarehouseId = By.xpath("//input[@title='21']");
	
	By WarehouseId1 = By.xpath("//input[@name='PurchTable_InventLocationId']");
	
	By OkBtn = By.xpath("//button[@name='OK']");
	
	By ItemNum = By.xpath("//input[@name='PurchLine_ItemId']");
	
	By Purchase = By.xpath("//span[text()='Purchase']");
	
	By Confirmation = By.xpath("//span[text()='Confirmation']");
	
	By ConfrmOk = By.xpath("//span[text()='OK']");
	
	By ReceiveBtn = By.xpath("//span[text()='Receive']");
	
	By PrdctRcptBtn = By.xpath("(//span[text()='Product receipt'])[1]");
	
	By PrdctRcpt = By.xpath("//input[@name='PurchParmTable_Num']");
	
	By PostOk = By.xpath("//span[text()='OK']");
	
	
	By CancelBtn1 = By.xpath("(//span[text()='Cancel'])[1]");
	
	
	
public WebElement getCancelBtn1()
	
	{
		return driver.findElement(CancelBtn1);
		
	}
public WebElement getNewPO()
	
	{
		return driver.findElement(NewPO);
		
	}

public WebElement getVAccAroow()

{
	return driver.findElement(VAccArrow);
	
}
public WebElement getVAccount()

{
	return driver.findElement(VAccount);
	
}

public WebElement getVAccount1()

{
	return driver.findElement(VAccount1);
	
}

public WebElement getSiteArrow()

{
	return driver.findElement(SiteArrow);
	
}
public WebElement getSiteId()

{
	return driver.findElement(SiteId);
	
}

public WebElement getSiteId1()

{
	return driver.findElement(SiteId1);
	
}

public WebElement getWarehouseArrow()

{
	return driver.findElement(WarehouseArrow);
	
}
public WebElement getWarehouseId()

{
	return driver.findElement(WarehouseId);
	
}

public WebElement getWarehouseId1()

{
	return driver.findElement(WarehouseId1);
	
}

public WebElement getPostOk()

{
	return driver.findElement(PostOk);
	
}
public WebElement getPrdctRcpt()

{
	return driver.findElement(PrdctRcpt);
	
}
public WebElement getPrdctRcptBtn()

{
	return driver.findElement(PrdctRcptBtn);
	
}
public WebElement getReceiveBtn()

{
	return driver.findElement(ReceiveBtn);
	
}
public WebElement getConfrmOk()

{
	return driver.findElement(ConfrmOk);
	
}
public WebElement getConfirmation()

{
	return driver.findElement(Confirmation);
	
}
public WebElement getPurchase()

{
	return driver.findElement(Purchase);
	
}
public WebElement getItemNum()

{
	return driver.findElement(ItemNum);
	
}
public WebElement getOkBtn()

{
	return driver.findElement(OkBtn);
	
}
	
	
	public POPAGE(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

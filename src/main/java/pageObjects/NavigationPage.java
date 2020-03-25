package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
	
	public WebDriver driver ;
	
	By NavPanel = By.xpath("//div[@id='modulesPaneOpener']");
	
	By Fav = By.xpath("//span[@class='workspace-image StarEmpty-symbol']");
	
	By Products = By.xpath("//a[text()='Products']");
	
	//By ReleaseProd=By.xpath("(//div[@class='button-container'])[30]");
	
	By Modules = By.id("navPaneModuleID");
	
	By PIM = By.xpath("//a[text()='Product information management']");
	
	By RProduct = By.xpath("//a[text()='Released products']");
	
	
	//By ProductArrow = By.xpath("//a[@data-dyn-title='Products']");
	
	By ProductArrow = By.xpath("//*[@id=\"mainPane\"]/div[5]/div/div[2]/div/div[2]/a[2]");
	
	//By Product1 =  By.xpath("(//a[@data-dyn-title='Products'])[2]");
	
	By Product1 =  By.xpath("/html/body/div[3]/div[1]/div[5]/div/div[2]/div/div[2]/div[2]/a[1]");
	
	
	By ExpandAll = By.xpath("//button[@title='Expand all']");
	
	By CollapseAll = By.xpath("//button[@title='Collapse all']");
	
	
	By ProductsNav = By.xpath("(//a[text()='Products'])[2]");
	
	By WorkSpace = By.xpath("//div[@id='navPaneWorkSpaceGroupID']");
	
	By PO = By.xpath("//a[text()='Purchase order preparation']");
	
	By SO = By.xpath("//span[text()='Sales order processing and inquiry']");
	
	//By AllSO = By.id("SalesOrderProcessingWorkspace_3_AllSalesOrders");
	
	By AllSO = By.xpath("//div[@id='salesorderprocessingworkspace_1_AllSalesOrders']");
	
	By AccReceivable = By.xpath("//a[text()='Accounts receivable']");
	
	By AllSO1 = By.xpath("//a[text()='All sales orders']");
	
	
	
	
	

	
	
	public NavigationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
public WebElement getProduct1()
	
	{
		return driver.findElement(Product1);
		
	}

	
public WebElement getAccReceivable()
	
	{
		return driver.findElement(AccReceivable);
		
	}

public WebElement getAllSO1()

{
	return driver.findElement(AllSO1);
	
}



public WebElement getAllSO()
	
	{
		return driver.findElement(AllSO);
		
	}

public WebElement getSO()

{
	return driver.findElement(SO);
	
}
	
public WebElement getPO()
	
	{
		return driver.findElement(PO);
		
	}

	
	public WebElement getWorkSpace()
	
	{
		return driver.findElement(WorkSpace);
		
	}

public WebElement getCollapseAll()
	
	{
		return driver.findElement(CollapseAll);
		
	}

public WebElement getExpandAll()
	
	{
		return driver.findElement(ExpandAll);
		
	}

	
public WebElement getProductArrow()
	
	{
		return driver.findElement(ProductArrow);
		
	}




	
	public WebElement getProducts()
	
	{
		return driver.findElement(Products);
		
	}
	
	public WebElement getNavPanel()
	
	{
		return driver.findElement(NavPanel);
		
	}
	
public WebElement getModules()
	
	{
		return driver.findElement(Modules);
		
	}
	
	
public WebElement getPIM()

{
	return driver.findElement(PIM);
	
}

public WebElement getRProduct()

{
	return driver.findElement(RProduct);
	
}

public WebElement getProductsNav()

{
	return driver.findElement(ProductsNav);
	
}

}

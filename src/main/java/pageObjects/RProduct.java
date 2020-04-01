package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RProduct {
	
	public WebDriver driver ;
	
	
	By Searchbox = By.xpath("//*[@id=\"ecoresproductdetailsextendedgrid_11_QuickFilter_Input_input\"]");
	
	
	

	By Prod = By.xpath("(//input[@type='text' and @role='link'])[1]");
	
	By ProdTab = By.xpath("/html/body/div[3]/div[1]/div[2]/div/form[2]/div[2]/div/div[5]/button/span");
	
	By Dgrp = By.xpath("//span[text()='Dimension groups']");
	



By Sitearrow= By.xpath("/html/body/form[1]/div[4]/div[2]/div[2]/div/div[2]/div/div[2]/div");

By Site = By.xpath("(//input[@title='Site'])[1]");



By Trackarrow= By.xpath("/html/body/form/div[4]/div[2]/div[2]/div/div[3]/div/div[2]/div");


By None = By.xpath("/html/body/form[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[4]/div[3]/input");

By DgrpOk = By.xpath("//span[text()='OK']");


By ImGrpArrow = By.xpath("/html/body/div[3]/div[1]/div[2]/div/form[2]/div[4]/div/div[6]/div[2]/div[1]/div[3]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/div/div/div");
By FIFO = By.xpath("//input[@title='FIFO']");
//By SellPrice = By.xpath("(//input[@role='textbox' and @type='text'])[33]");

By SellPrice = By.xpath("//input[@name='SalesBasePrice_Price']");
//input[@name='SalesBasePrice_Price']
By ItemField = By.xpath("//input[@name='InventModelGroupItem_ModelGroupId']");



By ItemgrpArrow= By.xpath("/html/body/div[3]/div[1]/div[2]/div/form[2]/div[4]/div/div[6]/div[2]/div[1]/div[3]/div/div/div/div[2]/div[2]/div[10]/div/div[1]/div[1]/div[2]/div/div/div");
By Itemgrp= By.xpath("//input[@title='Audio']");

By ItemGrp1= By.xpath("//input[@name='CostPosting_ItemGroupId']");


By NetWeight= By.xpath("(//input[@role='textbox'])[57]");

//By REdit = By.xpath("(//div[@class='button-container'])[2]");

By REdit = By.xpath("//*[@id=\"ecoresproductdetailsextendedgrid_11_SystemDefinedViewEditButton\"]/div");


By RSave = By.xpath("(//div[@class='button-container'])[2]");

By SellLine = By.xpath("//html/body/div[3]/div[1]/div[2]/div/form[2]/div[4]/div/div[6]/div[2]/div[1]/div[3]/div/div/div/div[2]/div[2]/div[5]");








	
	public RProduct(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	
	public WebElement getSellLine()
	{
		return driver.findElement(SellLine);
		
	}
	
	
	
	public WebElement getProdTab()
	{
		return driver.findElement(ProdTab);
		
	}
	
	
	public WebElement getItemField()
	{
		return driver.findElement(ItemField);
		
	}
	
	public WebElement getRSave()
	{
		return driver.findElement(RSave);
		
	}
	
	
	public WebElement getREdit()
	{
		return driver.findElement(REdit);
		
	}
	
	public WebElement getSearchbox()
	{
		return driver.findElement(Searchbox);
		
	}
	
	public WebElement getProd()
	{
		return driver.findElement(Prod);
		
	}
	
	public WebElement getDgrp()
	{
		return driver.findElement(Dgrp);
		
	}
	
	public WebElement getSitearrow()
	{
		return driver.findElement(Sitearrow);
		
	}
	
	public WebElement getSite()
	{
		return driver.findElement(Site);
		
	}
	
	public WebElement getTrackarrow()
	{
		return driver.findElement(Trackarrow);
		
	}
	
	public WebElement getNone()
	{
		return driver.findElement(None);
		
	}
	
	public WebElement getDgrpOk()
	{
		return driver.findElement(DgrpOk);
		
	}
	
	public WebElement getImGrpArrow()
	{
		return driver.findElement(ImGrpArrow);
		
	}
	
	public WebElement getFIFO()
	{
		return driver.findElement(FIFO);
		
	}
	
	public WebElement getSellPrice()
	{
		return driver.findElement(SellPrice);
		
	}
	
	public WebElement getItemgrpArrow()
	{
		return driver.findElement(ItemgrpArrow);
		
	}
	
	public WebElement getItemgrp()
	{
		return driver.findElement(Itemgrp);
		
	}
	
	public WebElement getItemGrp1()
	{
		return driver.findElement(ItemGrp1);
		
	}
	
	public WebElement getNetWeight()
	{
		return driver.findElement(NetWeight);
		
	}
	
	
}

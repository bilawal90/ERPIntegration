package SmokeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AX;
import pageObjects.Assembler;
import pageObjects.Customer;
import pageObjects.NavigationPage;
import pageObjects.OrderPage;
import pageObjects.POPAGE;
import pageObjects.RProduct;
import pageObjects.SO;
import pageObjects.ShopMain;
import pageObjects.Store;
import pageObjects.productPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert; 
import org.testng.annotations.Test;


public class ShopifyTest extends base{
		
	
	 public String name = "Auto" + new Random().nextInt(100000);
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
public String ordernum;
	
	
	@BeforeTest()
	public void B4Test() throws InterruptedException, IOException
	{
		driver = initializedriver();
		
		log.info("driver is initialize");
			
	//paste here
		
		//Create Product
			
		driver.get(AXURL);
		WebDriverWait wt = new WebDriverWait(driver, 120);
		
		AX axu = new AX(driver);
		
		
		wt.until(ExpectedConditions.elementToBeClickable(axu.getDetailsBtn()));
		
		axu.getDetailsBtn().click();
		
		wt.until(ExpectedConditions.elementToBeClickable(axu.getProceedLink()));
		axu.getProceedLink().click();
		wt.until(ExpectedConditions.elementToBeClickable(axu.getUserName()));

		axu.getUserName().sendKeys(axuser);
		
		
		wt.until(ExpectedConditions.visibilityOf(axu.getBtn1()));
		
		axu.getBtn1().click();
		
		wt.until(ExpectedConditions.elementToBeClickable(axu.getLoginHeader()));
		wt.until(ExpectedConditions.stalenessOf(axu.getPswd()));
		
		axu.getPswd().sendKeys(axpswd+Keys.ENTER);
		
		wt.until(ExpectedConditions.elementToBeClickable(axu.getSbmtBtn()));
		axu.getSbmtBtn().click();
		
		NavigationPage np = new NavigationPage(driver);
		
		wt.until(ExpectedConditions.visibilityOf(np.getNavPanel()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getNavPanel()));
		
		Thread.sleep(2000);
		np.getNavPanel().click();
		wt.until(ExpectedConditions.visibilityOf(np.getPIM()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getPIM()));
		
			
		np.getPIM().click();
		
		
		Actions an = new Actions(driver);
		
		wt.until(ExpectedConditions.visibilityOf(np.getCollapseAll()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getCollapseAll()));
		an.moveToElement(np.getCollapseAll()).click().perform();
		
		wt.until(ExpectedConditions.visibilityOf(np.getProductArrow()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getProductArrow()));
		
		
		np.getProductArrow().click();
		
		
		wt.until(ExpectedConditions.elementToBeClickable(np.getProduct1()));
		
		wt.until(ExpectedConditions.visibilityOf(np.getProduct1()));
		
		an.moveToElement(np.getProduct1()).click().perform();
		
		
		productPage pp = new productPage(driver);
		
		Thread.sleep(3000);
		wt.until(ExpectedConditions.visibilityOf(pp.getNewBtn()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getNewBtn()));
		pp.getNewBtn().click();
		
		
		wt.until(ExpectedConditions.visibilityOf(pp.getPName()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getPName()));
		pp.getPName().sendKeys(name);
		
		
		wt.until(ExpectedConditions.visibilityOf(pp.getPNum()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getPNum()));
		pp.getPNum().sendKeys(name);
		
		wt.until(ExpectedConditions.visibilityOf(pp.getOkBtn()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getOkBtn()));
		pp.getOkBtn().click();
		
		wt.until(ExpectedConditions.visibilityOf(pp.getProdCat()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getProdCat()));
		pp.getProdCat().click();
		
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(pp.getPCatArrow()));
		pp.getPCatArrow().click();
		
		wt.until(ExpectedConditions.visibilityOf(pp.getPCategory()));
		wt.until(ExpectedConditions.elementToBeClickable(pp.getPCategory()));
		pp.getPCategory().click();
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCatArrow()));
		pp.getCatArrow().click();

		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCategory()));
		pp.getCategory().click();
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCatOk()));
		pp.getCatOk().click();
		

		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCatSave()));
		pp.getCatSave().click();
		

		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCatClose()));
		pp.getCatClose().click();

		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getRProduct()));
		pp.getRProduct().click();

		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getText()));
		pp.getText().click();
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getRNext()));
		wt.until(ExpectedConditions.visibilityOf(pp.getRNext()));
		Thread.sleep(1000);
		
		pp.getRNext().click();
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getUSMF()));
		an.moveToElement(pp.getUSMF()).click().perform();

	Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCNext()));

		
		an.moveToElement(pp.getCNext()).click().perform();
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getRFinish()));
		
		
		an.moveToElement(pp.getRFinish()).click().perform();
		
		
		// Product Creation Complete
		
		
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pp.getCancelBtn1()));
		wt.until(ExpectedConditions.visibilityOf(pp.getCancelBtn1()));
		an.moveToElement(pp.getCancelBtn1()).click().perform();
		//Release Product
		
		wt.until(ExpectedConditions.visibilityOf(np.getNavPanel()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getNavPanel()));
Thread.sleep(1000);
		
		np.getNavPanel().click();
		

		wt.until(ExpectedConditions.visibilityOf(np.getPIM()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getPIM()));
		np.getPIM().click();

		
		wt.until(ExpectedConditions.visibilityOf(np.getRProduct()));
		wt.until(ExpectedConditions.elementToBeClickable(np.getRProduct()));
		np.getRProduct().click();
		System.out.println(name);
		
		RProduct rp = new RProduct(driver);
				 
			wt.until(ExpectedConditions.elementToBeClickable(rp.getSearchbox()));
			
		an.moveToElement(rp.getSearchbox()).sendKeys(name + Keys.ENTER).perform();

		
		wt.until(ExpectedConditions.visibilityOf(rp.getProd()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getProd()));
		rp.getProd().sendKeys(Keys.ENTER);
		
		wt.until(ExpectedConditions.visibilityOf(rp.getProdTab()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getProdTab()));
		rp.getProdTab().click();
		
		wt.until(ExpectedConditions.visibilityOf(rp.getDgrp()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getDgrp()));
		rp.getDgrp().click();
		
		wt.until(ExpectedConditions.visibilityOf(rp.getSitearrow()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getSitearrow()));
		rp.getSitearrow().click();
		
		wt.until(ExpectedConditions.visibilityOf(rp.getSite()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getSite()));
		rp.getSite().click();

		
		wt.until(ExpectedConditions.visibilityOf(rp.getTrackarrow()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getTrackarrow()));
		rp.getTrackarrow().click();
		
		
		wt.until(ExpectedConditions.visibilityOf(rp.getNone()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getNone()));
		
		rp.getNone().click();
		
			
		wt.until(ExpectedConditions.visibilityOf(rp.getDgrpOk()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getDgrpOk()));
		rp.getDgrpOk().click();
		
		
		
		Thread.sleep(1000);
		wt.until(ExpectedConditions.visibilityOf(rp.getREdit()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getREdit()));
		rp.getREdit().click();
		Thread.sleep(2000);
		
		wt.until(ExpectedConditions.visibilityOf(rp.getItemField()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getItemField()));
		
		rp.getItemField().click();
		rp.getItemField().sendKeys("FIFO" + Keys.ENTER);
		try {
		wt.until(ExpectedConditions.visibilityOf(rp.getSellPrice()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getSellPrice()));
		rp.getSellPrice().click();
		rp.getSellPrice().clear();

		rp.getSellPrice().sendKeys("10");
		}
		catch(Exception e)
		{
			rp.getSellLine().click();
			wt.until(ExpectedConditions.visibilityOf(rp.getSellPrice()));
			wt.until(ExpectedConditions.elementToBeClickable(rp.getSellPrice()));
			rp.getSellPrice().click();
			rp.getSellPrice().clear();

			rp.getSellPrice().sendKeys("10");
			
		}

		wt.until(ExpectedConditions.visibilityOf(rp.getItemGrp1()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getItemGrp1()));
		rp.getItemGrp1().click();

		rp.getItemGrp1().sendKeys("Audio" + Keys.ENTER);
		
		
		wt.until(ExpectedConditions.visibilityOf(rp.getRSave()));
		wt.until(ExpectedConditions.elementToBeClickable(rp.getRSave()));
		rp.getRSave().click();
		
		//Release product Save Complete
		
		//PO Start
		

		//Creating PO
		Thread.sleep(1000);
		wt.until(ExpectedConditions.elementToBeClickable(np.getNavPanel()));
		wt.until(ExpectedConditions.visibilityOf(np.getNavPanel()));
		np.getNavPanel().click();
		
		
		wt.until(ExpectedConditions.elementToBeClickable(np.getWorkSpace()));
		np.getWorkSpace().click();
		

		
		wt.until(ExpectedConditions.elementToBeClickable(np.getPO()));
		np.getPO().click();
		
		
		
		POPAGE pop = new POPAGE(driver);
		
		wt.until(ExpectedConditions.elementToBeClickable(pop.getNewPO()));
		pop.getNewPO().click();
		


		
		wt.until(ExpectedConditions.elementToBeClickable(pop.getVAccount1()));
		pop.getVAccount1().click();
		
		
		pop.getVAccount1().sendKeys("1001");
		

		wt.until(ExpectedConditions.elementToBeClickable(pop.getSiteId1()));
		pop.getSiteId1().click();
		
		
		pop.getSiteId1().sendKeys("2");
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pop.getWarehouseId1()));
		pop.getWarehouseId1().click();
		
		pop.getWarehouseId1().sendKeys("21" + Keys.ENTER);
		
		
		wt.until(ExpectedConditions.elementToBeClickable(pop.getItemNum()));
		pop.getItemNum().click();
		
		pop.getItemNum().sendKeys(name);
		

		wt.until(ExpectedConditions.elementToBeClickable(pop.getPurchase()));
		pop.getPurchase().click();
		Thread.sleep(1000);
		
		wt.until(ExpectedConditions.elementToBeClickable(pop.getConfirmation()));
		wt.until(ExpectedConditions.visibilityOf(pop.getConfirmation()));
		pop.getConfirmation().click();

		 WebElement ConfrmOk = wt.until(ExpectedConditions.elementToBeClickable(pop.getConfrmOk()));
		 ConfrmOk.click();
		 
		// wt.until(ExpectedConditions.elementToBeClickable(pop.getCancelBtn1()));
		// wt.until(ExpectedConditions.visibilityOf(pop.getCancelBtn1()));
		// wt.until(ExpectedConditions.stalenessOf(pop.getCancelBtn1()));
		// pop.getCancelBtn1().click();
		
		
		//until(ExpectedConditions.invisibilityOf(pop.getCancelBtn1()));
		 Thread.sleep(10000);
			
		WebElement ReceiveBtn = wt.until(ExpectedConditions.elementToBeClickable(pop.getReceiveBtn()));
		// wt.until(ExpectedConditions.elementToBeClickable(pop.getReceiveBtn()));
		wt.until(ExpectedConditions.visibilityOf(pop.getReceiveBtn()));
		
		ReceiveBtn.click();
		//an.moveToElement(pop.getReceiveBtn()).click().perform();
		
		Thread.sleep(4000);
		wt.until(ExpectedConditions.elementToBeClickable(pop.getPrdctRcptBtn()));
		wt.until(ExpectedConditions.visibilityOf(pop.getPrdctRcptBtn()));
		//an.moveToElement(pop.getPrdctRcptBtn());
		pop.getPrdctRcptBtn().click();
		
				
		wt.until(ExpectedConditions.elementToBeClickable(pop.getPrdctRcpt()));
		wt.until(ExpectedConditions.visibilityOf(pop.getPrdctRcpt()));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", pop.getPrdctRcpt());
		
		//pop.getPrdctRcpt().click();
		//an.moveToElement(pop.getPrdctRcpt()).click().perform();
		
		
		pop.getPrdctRcpt().sendKeys(String.valueOf(new Random().nextInt(100000)));
		


		pop.getPrdctRcpt().sendKeys(Keys.ALT, Keys.ENTER);
		
		
		//PO End
		
		// Shopify
		
		((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    
	    
	    driver.get(ShopURL);
		WebDriverWait wait = new WebDriverWait(driver, 120); 
	    
		
		ShopMain SM = new ShopMain(driver);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getEmail()));
		wait.until(ExpectedConditions.visibilityOf(SM.getEmail()));
		SM.getEmail().click();
		
		SM.getEmail().sendKeys(Shopemail);

		wait.until(ExpectedConditions.elementToBeClickable(SM.getNxtBtn()));
		SM.getNxtBtn().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(SM.getPswd()));
		wait.until(ExpectedConditions.visibilityOf(SM.getPswd()));
		SM.getPswd().click();
		SM.getPswd().sendKeys(Shoppswd);

		wait.until(ExpectedConditions.elementToBeClickable(SM.getLoginBtn()));
		SM.getLoginBtn().click();
		wait.until(ExpectedConditions.elementToBeClickable(SM.getSearchBox()));

		
		SM.getSearchBox().sendKeys(name);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getSearchedPrdct1()));
		
		SM.getSearchBox().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getPrice1()));
		
	}
	
	
	@Test (priority = 1, enabled=true)
	public void VerifyProductSync() throws IOException, InterruptedException

	{	
	Assert.assertEquals(driver.getTitle(), "F3 New Demo ~ Products ~ "+name+" ~ Shopify", "product has not sync to shopify");
	}
	
	@Test(priority = 2, enabled=true,dependsOnMethods = { "VerifyProductSync" })
	public void VerifyProductUpdateSync() throws IOException, InterruptedException
	{
		ShopMain SM = new ShopMain(driver);
		
		
Assert.assertEquals(SM.getPrice1().getAttribute("value"), "10.00", "Product update job is not syncing the price of the product");
	
	}
	
	@Test (priority = 3, enabled=true, dependsOnMethods = { "VerifyProductSync" })
	public void VerifyProductQuantitySync() throws IOException, InterruptedException
	{
		ShopMain SM = new ShopMain(driver);
	
Assert.assertEquals(SM.getQuantity().getAttribute("value"), "1", "Inventory sync job is not syncing the inventory of the product");
	}
	
	@Test(priority = 4, enabled=true,dependsOnMethods = { "VerifyProductQuantitySync" })
	public void VerifyOrderSync() throws InterruptedException
	{
		ShopMain SM = new ShopMain(driver);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(SM.getOrders()));	
		SM.getOrders().click();


		wait.until(ExpectedConditions.stalenessOf(SM.getCOrder()));

		SM.getCOrder().click();

		wait.until(ExpectedConditions.elementToBeClickable(SM.getCOSearch()));

		SM.getCOSearch().click();

		Thread.sleep(1000);
		SM.getCOSearch().sendKeys(name);

		wait.until(ExpectedConditions.elementToBeClickable(SM.getCOSearch1()));
		SM.getCOSearch1().click();
		SM.getCOSearch1().clear();
		Thread.sleep(2000);
		SM.getCOSearch1().sendKeys(name);
		Thread.sleep(2000);
		SM.getCOSearch1().sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(SM.getAddBtn()));
		SM.getAddBtn().click();


		wait.until(ExpectedConditions.stalenessOf(SM.getUserSearchBox()));
		SM.getUserSearchBox().click();


		wait.until(ExpectedConditions.elementToBeClickable(SM.getCOUser()));
		SM.getCOUser().click();


		wait.until(ExpectedConditions.elementToBeClickable(SM.getPendingBtn()));

		SM.getPendingBtn().click();


		wait.until(ExpectedConditions.stalenessOf(SM.getCnfrmBtn()));

		SM.getCnfrmBtn().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(SM.getCnfrmBtn()));

		wait.until(ExpectedConditions.elementToBeClickable(SM.getOrderNum()));	

		ordernum = SM.getOrderNum().getText();
		System.out.println(ordernum);
		//Assembler
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tbs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tbs.get(2));// change here to 2
		driver.get(Assembler);

		Assembler ass = new Assembler(driver);


		wait.until(ExpectedConditions.elementToBeClickable(ass.getLiveFeed()));

		ass.getLiveFeed().click();


		Select se = new Select(ass.getConnectionDrpDwn());

		se.selectByValue("44");


		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//td[starts-with(text(),'Order: "+ordernum+"')]"))));
		String fullaxorder= driver.findElement(By.xpath("//td[starts-with(text(),'Order: "+ordernum+"')]")).getText();


		String axorder = fullaxorder.substring(fullaxorder.indexOf("(") + 1, fullaxorder.indexOf(")"));

		//SO Verification start
		
		
		Thread.sleep(1000);
		driver.switchTo().window(tbs.get(0));
		NavigationPage np = new NavigationPage(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(np.getModules()));

		np.getModules().click();


		wait.until(ExpectedConditions.elementToBeClickable(np.getAccReceivable()));


		np.getAccReceivable().click();


		wait.until(ExpectedConditions.elementToBeClickable(np.getAllSO1()));

		np.getAllSO1().click();
Thread.sleep(3000);

		SO SaO = new SO(driver);

		//wt.until(ExpectedConditions.elementToBeClickable(SaO.getSearchBox()));
		//30-3wait.until(ExpectedConditions.stalenessOf(SaO.getSearchBox()));
		//wt.until(ExpectedConditions.visibilityOf(SaO.getSearchBox()));
		SaO.getSearchBox().click();
		SaO.getSearchBox().sendKeys(axorder + Keys.ENTER);


		wait.until(ExpectedConditions.stalenessOf(SaO.getSONum()));

		Assert.assertEquals(SaO.getSONum().isDisplayed(), true, "SO have synced successfully");
		
		SaO.getSONum().sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getEdit()));
		SaO.getEdit().click();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getHeader()));
		SaO.getHeader().click();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getReason()));
		SaO.getReason().sendKeys("123");
Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SaO.getPick()));
		SaO.getPick().click();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getPostSlip()));
		SaO.getPostSlip().click();
Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(SaO.getPackOk()));
		SaO.getPackOk().click();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getConfrmOk()));
		SaO.getConfrmOk().click();

		wait.until(ExpectedConditions.stalenessOf(SaO.getCancelBtn()));


		SaO.getCancelBtn().click();
		
		Thread.sleep(4000);

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getReason()));
		
		SaO.getReason().click();
		Thread.sleep(2000);
		Actions an = new Actions(driver);
		
		//wt.until(ExpectedConditions.stalenessOf(SaO.getInvoiceTab()));
		
		an.moveToElement(SaO.getInvoiceTab()).perform();
		SaO.getInvoiceTab().click();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getInvoicePage()));

		an.moveToElement(SaO.getInvoicePage()).click().perform();

		wait.until(ExpectedConditions.elementToBeClickable(SaO.getInvoiceOk()));
		SaO.getInvoiceOk().click();
		wait.until(ExpectedConditions.elementToBeClickable(SaO.getInCnfrmOk()));
		SaO.getInCnfrmOk().click();
		Thread.sleep(7000);
	}


// SO Invoicing Verification
	
	@Test(priority = 5, enabled=true,dependsOnMethods = { "VerifyOrderSync" })
	public void VerifyOrderandInvoiceUpdateSync() throws InterruptedException
	{
		ShopMain SM = new ShopMain(driver);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		 ArrayList<String> tbs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tbs.get(1));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(SM.getOrders()));
		Thread.sleep(7000);
		
		SM.getOrders().click();
		
		OrderPage op = new OrderPage(driver);
		
		WebElement  orderid= driver.findElement(By.xpath("//span[text()='"+ordernum+"']"));
		
		Thread.sleep(15000);
		wait.until(ExpectedConditions.elementToBeClickable(orderid));
		
		orderid.click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(op.getPayStatus()));
		wait.until(ExpectedConditions.stalenessOf(op.getPayStatus()));
		String Act_PayStatus = op.getPayStatus().getText();
		String exp_PayStatus = "Paid";
		
		String Act_InvoiceStatus = op.getInStatus().getText();
		String exp_InvoiceStatus = "Fulfilled";
		
		Assert.assertEquals(Act_PayStatus, exp_PayStatus, "Payment Status of the Order has not been Updated by the connector");
		
		Assert.assertEquals(Act_InvoiceStatus, exp_InvoiceStatus, "Financial Status of the Order has not been Updated by the connector");
		
	}
	
	
	@Test (priority = 6, enabled=true, dependsOnMethods = { "VerifyOrderSync" })
	public void VerifyTrackingNumberSync() throws IOException, InterruptedException
	{
		OrderPage op1 = new OrderPage(driver);
	try {
		Assert.assertEquals(op1.getTNum().getText(), "123", "Tracking number on the order has not synced");
	}
catch(Exception e)
	{
	Assert.assertEquals(false, true, "tracking number is not synced by the ComAX COnnector");
	}
	}
	
}
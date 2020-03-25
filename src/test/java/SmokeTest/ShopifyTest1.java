package SmokeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import org.testng.annotations.Test;

import pageObjects.Assembler;
import pageObjects.Customer;
import pageObjects.ShopMain;
import pageObjects.Store;
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


public class ShopifyTest1 extends base{
	public String name;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@Test
	

public void CheckBrowserLaunch() throws IOException, InterruptedException
{
		
		driver = initializedriver();
		
	log.info("driver is initialize");
		

//paste here
		
	
		
	    driver.get(ShopURL);
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60); 
	    
		
		ShopMain SM = new ShopMain(driver);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getEmail()));
		SM.getEmail().click();
		
		SM.getEmail().sendKeys(Shopemail);
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getNxtBtn()));
		SM.getNxtBtn().click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getPswd()));
		SM.getPswd().sendKeys(Shoppswd);
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(SM.getLoginBtn()));
		SM.getLoginBtn().click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getSearchBox()));

		
		SM.getSearchBox().sendKeys("Auto66");
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(SM.getSearchedPrdct1()));
		
		SM.getSearchBox().sendKeys(Keys.ENTER);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(SM.getPrice1()));
		
		
		Assert.assertEquals(driver.getTitle(), "F3 New Demo ~ Products ~ Auto66 ~ Shopify", "product has not sync to shopify");
			
		log.info("first point successfully validated");
	Assert.assertEquals(SM.getPrice1().getAttribute("value"), "10.00", "Product update job is not syncing the price of the product");
		
	
	//9March-Assert.assertEquals(SM.getQuantity().getAttribute("value"), "100", "Inventory sync job is not syncing the inventory of the product");

	Thread.sleep(2000);
		
	wait.until(ExpectedConditions.elementToBeClickable(SM.getOrders()));	
	SM.getOrders().click();
	
	//Thread.sleep(5000);
	wait.until(ExpectedConditions.stalenessOf(SM.getCOrder()));
	SM.getCOrder().click();
	
	//Thread.sleep(8000);
	wait.until(ExpectedConditions.elementToBeClickable(SM.getCOSearch()));
	
	SM.getCOSearch().click();
	
	Thread.sleep(1000);
	SM.getCOSearch().sendKeys("Auto66");
	
	//Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(SM.getCOSearch1()));
	SM.getCOSearch1().click();
	SM.getCOSearch1().clear();
	Thread.sleep(2000);
	SM.getCOSearch1().sendKeys("Auto66");
	Thread.sleep(2000);
	SM.getCOSearch1().sendKeys(Keys.ENTER);
	
	//Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(SM.getAddBtn()));
	SM.getAddBtn().click();
	
	//Thread.sleep(4000);
	
	wait.until(ExpectedConditions.stalenessOf(SM.getUserSearchBox()));
	SM.getUserSearchBox().click();
	
	//Thread.sleep(1000);
	
	wait.until(ExpectedConditions.elementToBeClickable(SM.getCOUser()));
	SM.getCOUser().click();
	
	//Thread.sleep(3000);
	
	wait.until(ExpectedConditions.elementToBeClickable(SM.getPendingBtn()));
	
	SM.getPendingBtn().click();
	
	
	//Thread.sleep(4000);
	
	wait.until(ExpectedConditions.stalenessOf(SM.getCnfrmBtn()));
	
	SM.getCnfrmBtn().sendKeys(Keys.ENTER);
	wait.until(ExpectedConditions.invisibilityOf(SM.getCnfrmBtn()));
	
	
	//Thread.sleep(4000);
	wait.until(ExpectedConditions.elementToBeClickable(SM.getOrderNum()));	
	
	String ordernum = SM.getOrderNum().getText();
	System.out.println(ordernum);
	//Assembler
	((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));// change here to 2
    driver.get("http://10.164.2.212:8090/LiveFeed.aspx");
    
    Assembler ass = new Assembler(driver);
    
    
    wait.until(ExpectedConditions.elementToBeClickable(ass.getLiveFeed()));
    
    ass.getLiveFeed().click();
    
    
    Select se = new Select(ass.getConnectionDrpDwn());
    
    se.selectByValue("44");
    
    
    wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//td[starts-with(text(),'Order: "+ordernum+"')]"))));
    String fullaxorder= driver.findElement(By.xpath("//td[starts-with(text(),'Order: "+ordernum+"')]")).getText();
    
    
    String axorder = fullaxorder.substring(fullaxorder.indexOf("(") + 1, fullaxorder.indexOf(")"));
    
    
          
}
}

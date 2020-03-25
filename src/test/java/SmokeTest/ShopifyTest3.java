package SmokeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import org.testng.annotations.Test;

import pageObjects.Assembler;
import pageObjects.Customer;
import pageObjects.OrderPage;
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


public class ShopifyTest3 extends base{
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
		wait.until(ExpectedConditions.elementToBeClickable(SM.getOrders()));
		
		SM.getOrders().click();
		
		OrderPage op = new OrderPage(driver);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(op.getOrderId()));
		
		op.getOrderId().click();
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='#1098']"))));
		//driver.findElement(By.xpath("//span[text()='#1098']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(op.getPayStatus()));
		
		
		
		String Act_PayStatus = op.getPayStatus().getText();
		String exp_PayStatus = "Paid";
		
		String Act_InvoiceStatus = op.getInStatus().getText();
		String exp_InvoiceStatus = "Fulfilled";
		
		Assert.assertEquals(Act_PayStatus, exp_PayStatus, "Payment Status of the Order has not been Updated by the connector");
		
		Assert.assertEquals(Act_InvoiceStatus, exp_InvoiceStatus, "Financial Status of the Order has not been Updated by the connector");
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@id='order-financial-status-badge']"))));
		//System.out.println(driver.findElement(By.xpath("//span[@id='order-financial-status-badge']")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"order-title-bar\"]/div[2]/div[1]/span[2]/div/div[2]/div/span[2]")).getText());
		
		
		
		

		
    
          
}
}

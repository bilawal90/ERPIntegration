package SmokeTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import org.testng.annotations.Test;

import pageObjects.AX;
import pageObjects.Assembler;
import pageObjects.Customer;
import pageObjects.NavigationPage;
import pageObjects.SO;
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


public class ShopifyTest2 extends base{
	public String name;
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@Test
	

public void CheckBrowserLaunch() throws IOException, InterruptedException
{
		
		driver = initializedriver();
		
	log.info("driver is initialize");
	//AX Launch
	driver.get(AXURL);
	WebDriverWait wt = new WebDriverWait(driver, 60);
	
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

	//AX Launch Complete
	
	//SO Verification
	
NavigationPage np = new NavigationPage(driver) ;

//wt.until(ExpectedConditions.elementToBeClickable(np.getSO()));

wt.until(ExpectedConditions.elementToBeClickable(np.getModules()));
//np.getSO().click();


np.getModules().click();


wt.until(ExpectedConditions.elementToBeClickable(np.getAccReceivable()));

//np.getAllSO().click();
np.getAccReceivable().click();


wt.until(ExpectedConditions.elementToBeClickable(np.getAllSO1()));

np.getAllSO1().click();


SO SaO = new SO(driver);

//wt.until(ExpectedConditions.stalenessOf(SaO.getSearchBox()));
wt.until(ExpectedConditions.elementToBeClickable(SaO.getSearchBox()));
wt.until(ExpectedConditions.visibilityOf(SaO.getSearchBox()));
SaO.getSearchBox().click();
SaO.getSearchBox().sendKeys("001211" + Keys.ENTER);


wt.until(ExpectedConditions.stalenessOf(SaO.getSONum()));

SaO.getSONum().sendKeys(Keys.ENTER);

wt.until(ExpectedConditions.elementToBeClickable(SaO.getEdit()));
SaO.getEdit().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getHeader()));
SaO.getHeader().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getReason()));
SaO.getReason().sendKeys("123");

wt.until(ExpectedConditions.elementToBeClickable(SaO.getPick()));
SaO.getPick().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getPostSlip()));
SaO.getPostSlip().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getPackOk()));
SaO.getPackOk().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getConfrmOk()));
SaO.getConfrmOk().click();



wt.until(ExpectedConditions.stalenessOf(SaO.getCancelBtn()));


SaO.getCancelBtn().click();
Actions an = new Actions(driver);

an.moveToElement(SaO.getInvoiceTab()).perform();
SaO.getInvoiceTab().click();




wt.until(ExpectedConditions.elementToBeClickable(SaO.getInvoicePage()));

an.moveToElement(SaO.getInvoicePage()).click().perform();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getInvoiceOk()));
SaO.getInvoiceOk().click();

wt.until(ExpectedConditions.elementToBeClickable(SaO.getInCnfrmOk()));
SaO.getInCnfrmOk().click();


}
}

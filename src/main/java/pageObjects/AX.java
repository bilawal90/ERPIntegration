package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AX {
	
	public WebDriver driver ;
	
	
	By DetailsBtn= By.id("details-button");
	
	By ProceedLink = By.id("proceed-link");
	
	By UserName = By.id("i0116");
	
	By Btn1 = By.id("idSIButton9");
	
	By LoginHeader = By.id("loginHeader");
	
	By Pswd = By.id("i0118");
	
	By SignIn = By.id("idSIButton9");
	
	By SbmtBtn = By.xpath("//input[@type='submit']");
	
	
	
	
	
public WebElement getLoginHeader()
	
	{
		return driver.findElement(LoginHeader);
		
	}
	
public WebElement getSbmtBtn()
	
	{
		return driver.findElement(SbmtBtn);
		
	}
	
public WebElement getDetailsBtn()
	
	{
		return driver.findElement(DetailsBtn);
		
	}

public WebElement getProceedLink()

{
	return driver.findElement(ProceedLink);
	
}

public WebElement getUserName()

{
	return driver.findElement(UserName);
	
}

public WebElement getBtn1()

{
	return driver.findElement(Btn1);
	
}

public WebElement getPswd()

{
	return driver.findElement(Pswd);
	
}

public WebElement getSignIn()

{
	return driver.findElement(SignIn);
	
}

	
	public AX(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

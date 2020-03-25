package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Store {
	
	public WebDriver driver ;
	
	
	By Login= By.xpath("//a[@href='/account/login']");
	By Register = By.id("customer_register_link");
	
	By fname = By.id("RegisterForm-FirstName");
	
	By lname = By.id("RegisterForm-LastName");
	
	
	By email = By.id("RegisterForm-email");
	
	
	By pswd = By.id("RegisterForm-password");
	
	By CreateBtn = By.xpath("//input[@class='btn']");
	
	By Cross = By.xpath("(//button[@name='button'])[8]");
	
	//WebElement Cross1 = driver.findElement(By.xpath("(//button[@name='button'])[8]"));
	
	
	
public WebElement getCross()
	
	{
		return driver.findElement(Cross);
		
	}

public WebElement getLogin()
	
	{
		return driver.findElement(Login);
		
	}

public WebElement getfname()

{
	return driver.findElement(fname);
	
}
public WebElement getlname()

{
	return driver.findElement(lname);
	
}
public WebElement getemail()

{
	return driver.findElement(email);
	
}
public WebElement getpswd()

{
	return driver.findElement(pswd);
	
}
public WebElement getCreateBtn()

{
	return driver.findElement(CreateBtn);
	
}


public WebElement getRegister()

{
	return driver.findElement(Register);
	
}




	
	public Store(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
		
	}
	
}

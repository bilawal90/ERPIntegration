package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	
	public WebDriver driver ;
	
	By NewBtn = By.xpath("(//div[@class='button-container'])[2]");
	By PNum = By.xpath("(//input[@class='textbox field displayoption viewMarker alignmentAuto' and @type='text'])[4]");
	By PName = By.xpath("(//input[@class='textbox field displayoption viewMarker alignmentAuto' and @type='text'])[5]");
	By OkBtn = By.xpath("(//div[@class='button-container'])[43]");
	By RProduct = By.xpath("(//span[text()='Release products'])[2]");
	By RNext = By.xpath("(//span[text()='Next'])[2]");
	//By RNext = By.xpath("(//div[@class='button-container'])[56]");
	//By RNext = By.xpath("//*[@id=\"EcoResProductRelease_6_Next_label\"]");
	
	By USMF = By.xpath("(//div[@class='markContainer'])[48]");
	By CNext = By.xpath("(//span[text()='Next'])[2]");
	By RFinish=By.xpath("//button[@name='Finish']");
	 //*[@id="EcoResProductRelease_9_Next_label"]
	By Text = By.xpath("(//input[@role='combobox'])[28]");
	
	By Text2=By.xpath("(//input[@role='textbox'])[138]");
	
	By ProdCat=By.xpath("(//span[text()='Product categories'])[2]");
	
	By PCatArrow = By.xpath("(//div[@class='lookupButton'])[14]");
	
	By PCategory = By.xpath("//input[@title='TestHierarchy']");
	
	By Category = By.xpath("//span[@title='New category (New category)']");
	
	By CatArrow = By.xpath("(//div[@class='lookupButton'])[15]");
	
	By CatSave = By.xpath("(//span[@class='button-commandRing Save-symbol'])[2]");
	
	By CatClose = By.xpath("(//div[@class='button-container'])[60]");
	
	By CatOk = By.xpath("(//div[@class='button-container'])[79]");
	By CancelBtn1 = By.xpath("(//span[text()='Cancel'])[2]");
	
	
		
	
	public productPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	
	public WebElement getCancelBtn1()
	{
		return driver.findElement(CancelBtn1);
		
	}
	
	
	public WebElement getCatOk()
	{
		return driver.findElement(CatOk);
		
	}
	
	
	public WebElement getCatClose()
	{
		return driver.findElement(CatClose);
		
	}
	
	
	public WebElement getCatSave()
	{
		return driver.findElement(CatSave);
		
	}
	
	
	public WebElement getCategory()
	{
		return driver.findElement(Category);
		
	}
	
	
	public WebElement getPCategory()
	{
		return driver.findElement(PCategory);
		
	}
	
	public WebElement getCatArrow()
	{
		return driver.findElement(CatArrow);
		
	}
	
	public WebElement getPCatArrow()
	{
		return driver.findElement(PCatArrow);
		
	}
	
	public WebElement getProdCat()
	{
		return driver.findElement(ProdCat);
		
	}
	
	public WebElement getText2()
	{
		return driver.findElement(Text2);
		
	}
	
	
	public WebElement getText()
	{
		return driver.findElement(Text);
		
	}
	
	public WebElement getRNext()
	{
		return driver.findElement(RNext);
		
	}
	
	public WebElement getUSMF()
	{
		return driver.findElement(USMF);
		
	}
	
	public WebElement getCNext()
	{
		return driver.findElement(CNext);
		
	}
	

	public WebElement getRFinish()
	{
		return driver.findElement(RFinish);
		
	}
	
	
	public WebElement getRProduct()
	{
		return driver.findElement(RProduct);
		
	}
	
	public WebElement getOkBtn()
	{
		return driver.findElement(OkBtn);
		
	}
	
	
	public WebElement getPNum()

	{
		return driver.findElement(PNum);
		
	}
	
	public WebElement getPName()
	{
		return driver.findElement(PName);
		
	}
	
	public WebElement getNewBtn()
	{
		return driver.findElement(NewBtn);
		
	}
	

	

}

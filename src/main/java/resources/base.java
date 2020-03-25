package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {
public static WebDriver driver;
public String AXURL;
public String ShopURL;
public String Shopemail;
public String Shoppswd;
public String axuser;
public String axpswd;
public String Assembler;
public Properties prop;

//public DesiredCapabilities capability;

		public WebDriver initializedriver() throws IOException
		{
		 prop =new Properties();
			FileInputStream fis = new FileInputStream("C:\\Work\\ERPIntegration\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		AXURL= prop.getProperty("URL");
		ShopURL=prop.getProperty("URL1");
		Shopemail=prop.getProperty("email");
		Shoppswd=prop.getProperty("pswd");
		axuser=prop.getProperty("axuser");
		axpswd=prop.getProperty("axpswd");
		Assembler = prop.getProperty("Assembler");
		
		
		//DesiredCapabilities capability = DesiredCapabilities.chrome();
		// To Accept SSL certificate
		//capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);//**
		return driver;			
		}
		
		
		
		public void getscreenshot(String result) throws IOException
		{
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
			FileHandler.copy(src, new File("C://autotest//"+result+"screenshot.png"));

		}
		
		
		
	}


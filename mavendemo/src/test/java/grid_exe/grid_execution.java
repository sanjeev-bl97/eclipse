package grid_exe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class grid_execution {

		WebDriver driver;
		String Baseurl,nodeurl;
		@BeforeTest
		public void setup() throws MalformedURLException
		{
			Baseurl="https://www.google.com/search?client=firefox-b-d&q=github";
			nodeurl="http://192.168.1.227:5568/wd/hub/";
			DesiredCapabilities capability=DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			driver =new RemoteWebDriver(new URL(nodeurl),capability);
		}
		public void aftertest()
		{
			driver.quit();
		}
	@Test
	public void simpletest()
	{
		driver.get(Baseurl);
		List<WebElement> links = driver.findElements(By.tagName("a")); 
        
        
        
        int linkCount = links.size();     
        
        System.out.println("Total Number of link count on webpage = "  + linkCount);
	}
	}



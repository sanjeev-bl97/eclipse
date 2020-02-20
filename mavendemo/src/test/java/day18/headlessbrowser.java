package day18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessbrowser {
	
	@Test
	public void login() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
		
		
		//(panthom js,ghost drive) other methods for headlessbrowser;
		
		
		
	}
	

}

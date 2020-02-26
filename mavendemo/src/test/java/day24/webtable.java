package day24;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtable {
	@Test
	public void table()
	{

System.setProperty("webdriver.chrome.driver", "C://Users//BLTuser.BLT0206//Downloads//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.toolsqa.com/automation-practice-table/");
List  col = driver.findElements(By.xpath("//*[@id=\"content\"]/table/thead/tr/th"));
System.out.println("No of cols are : " +col.size()); 
//No.of rows 
List  rows = driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr")); 
System.out.println("No of rows are : " + rows.size());

	
	}
}
